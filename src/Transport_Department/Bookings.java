/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transport_Department;

/**
 *
 * @author jagru
 */
public class Bookings {
    private int bookingId;
    private int stateId;
    private String name;
    private int seatCount;
    private float totalCost;
    private int transportId;
    private String status;

    public Bookings(int bookingId, int stateId, String name, int seatCount, float totalCost, int transportId, String status) {
        this.bookingId = bookingId;
        this.stateId = stateId;
        this.name = name;
        this.seatCount = seatCount;
        this.totalCost = totalCost;
        this.transportId = transportId;
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
