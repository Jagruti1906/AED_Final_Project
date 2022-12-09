/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transport_Department;

import java.util.Date;

/**
 *
 * @author jagru
 */
public class TransportClass {
    private int transportId;
    private String type;
    private String source;
    private String destination;
    private int totalSeats;
    private int availableSeats;
    private int transportNumber;
    private float cost;
    private String arrivalTime;
    private String departTime;
    private Date date;
    private String status;

    public TransportClass(int transportId, String type, String source, String destination, int totalSeats, int availableSeats, float cost, String arrivalTime, String departTime, Date date, int transportNumber, String status) {
        this.transportId = transportId;
        this.type = type;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.cost = cost;
        this.arrivalTime = arrivalTime;
        this.departTime = departTime;
        this.status = status;
        this.transportNumber = this.transportNumber;
        this.date = date;
    }

    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(int transportNumber) {
        this.transportNumber = transportNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
