package com.parkit.parkingsystem.service;

import com.parkit.parkingsystem.constants.Fare;
import com.parkit.parkingsystem.dao.TicketDAO;
import com.parkit.parkingsystem.model.Ticket;

public class FareCalculatorService {
    /**
     *
     * @param ticket
     *      ticket (ID, PARKING_NUMBER, VEHICLE_REG_NUMBER, PRICE, IN_TIME, OUT_TIME)
     */
    public void calculateFare(Ticket ticket){
        if( (ticket.getOutTime() == null) || (ticket.getOutTime().before(ticket.getInTime())) ){
            throw new IllegalArgumentException("Out time provided is incorrect:"+ticket.getOutTime().toString());
        }

        double inHour = (double)ticket.getInTime().getTime()/60000/60 ;
        double outHour = (double)ticket.getOutTime().getTime()/60000/60 ;
        int vehicleRegNumberCount = ticket.getVehicleRegNumberCount();
        double discount = 1;

        
        double duration = outHour - inHour;

        if(duration <= 0.5){
            duration = 0;
        }

        switch (ticket.getParkingSpot().getParkingType()){
            case CAR: {
                if( vehicleRegNumberCount >= 2){
                    discount = Fare.CAR_DISCOUNT;
                }
                ticket.setPrice(duration * Fare.CAR_RATE_PER_HOUR * discount);
                break;
            }
            case BIKE: {
                if( vehicleRegNumberCount >= 2){
                    discount = Fare.BIKE_DISCOUNT;
                }
                ticket.setPrice(duration * Fare.BIKE_RATE_PER_HOUR * discount);
                break;
            }
            default: throw new IllegalArgumentException("Unkown Parking Type");
        }
    }
}