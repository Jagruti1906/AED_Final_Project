/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

/**
 *
 * @author jagru
 */
public class NewConnectionClass {
    private int connID;
    private int stateID;
    private String name;
    private String type;
    private String addressPath;
    private String idPath;
    private String status;

    public NewConnectionClass(int connID, int stateID, String name, String type, String addressPath, String idPath, String status) {
        this.connID = connID;
        this.stateID = stateID;
        this.name = name;
        this.type = type;
        this.addressPath = addressPath;
        this.idPath = idPath;
        this.status = status;
    }

    public int getConnID() {
        return connID;
    }

    public void setConnID(int connID) {
        this.connID = connID;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddressPath() {
        return addressPath;
    }

    public void setAddressPath(String addressPath) {
        this.addressPath = addressPath;
    }

    public String getIdPath() {
        return idPath;
    }

    public void setIdPath(String idPath) {
        this.idPath = idPath;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
