/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Department;

/**
 *
 * @author jagru
 */
public class AmbulanceClass {
    private String type;
    private int ambulanceNumber;
    private String status;

    public AmbulanceClass(String type, int ambulanceNumber, String status) {
        this.type = type;
        this.ambulanceNumber = ambulanceNumber;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmbulanceNumber() {
        return ambulanceNumber;
    }

    public void setAmbulanceNumber(int ambulanceNumber) {
        this.ambulanceNumber = ambulanceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
