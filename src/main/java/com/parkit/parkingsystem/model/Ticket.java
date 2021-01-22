package com.parkit.parkingsystem.model;

import java.util.Calendar;
import java.util.Date;

public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private String vehicleRegNumber;
    private double price;
    private Date inTime;
    private Date outTime;
    private int vehicleRegNumberCount;

    /**
     *
     * @return
     *      return Ticket Id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     *      set Ticket Id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     *      Parking spot Number
     */
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    /**
     *
     * @param parkingSpot
     *      Parking spot Number
     */
    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    /**
     *
     * @return
     *      Current vehicle registration number
     */
    public String getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    /**
     *
     * @param vehicleRegNumber
     *      Current vehicle registration number
     */
    public void setVehicleRegNumber(String vehicleRegNumber) {
        this.vehicleRegNumber = vehicleRegNumber;
    }

    /**
     *
     * @return
     *      Current price
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     *      Current price
     */
    public void setPrice(double price) {
        this.price = Math.round(price* 100.0)/100.0;
    }

    /**
     *
     * @return
     *      Recorded in-time of vehicle
     */
    public Date getInTime() {
        return inTime = inTime == null ? null : (Date) inTime.clone();
    }

    /**
     *
     * @param inTime
     *      Recorded in-time of vehicle
     */
    public void setInTime(Date inTime) {
        this.inTime = inTime == null ? null : (Date) inTime.clone();
    }

    /**
     *
     * @return
     *      Recorded out-time of vehicle
     */
    public Date getOutTime() {
        return outTime = outTime == null ? null : (Date) outTime.clone();
    }

    /**
     *
     * @param outTime
     *      Recorded out-time of vehicle
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime == null ? null : (Date) outTime.clone();
    }

    /**
     *
     * @return
     *      count of registration numbers similar to the current vehicle
     */
    public int getVehicleRegNumberCount() {
        return vehicleRegNumberCount;
    }

    /**
     *
     * @param vehicleRegNumberCount
     *      count of registration numbers similar to the current vehicle
     */
    public void setVehicleRegNumberCount(int vehicleRegNumberCount) {
        this.vehicleRegNumberCount = vehicleRegNumberCount;
    }
}
