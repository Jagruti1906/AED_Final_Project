/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Police_Department;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ComplaintDirectory {
     private ArrayList<ComplaintClass> complaintDir;

    public ComplaintDirectory(ArrayList<ComplaintClass> complaintDir) {
        this.complaintDir = complaintDir;
    }

    public ArrayList<ComplaintClass> getComplaintDir() {
        return complaintDir;
    }

}
