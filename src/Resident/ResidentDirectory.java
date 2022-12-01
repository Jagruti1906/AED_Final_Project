/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resident;

import java.util.ArrayList;

/**
 *
 * @author jagru
 */
public class ResidentDirectory {
    private ArrayList<ResidentClass> residentDir;

    public ResidentDirectory(ArrayList<ResidentClass> residentDir) {
        this.residentDir = residentDir;
    }

    public ArrayList<ResidentClass> getResidentDir() {
        return residentDir;
    }
}
