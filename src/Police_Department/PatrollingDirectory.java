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
public class PatrollingDirectory {
    private ArrayList<PatrollingClass> patrollingDir;

    public PatrollingDirectory(ArrayList<PatrollingClass> patrollingDir) {
        this.patrollingDir = patrollingDir;
    }

    public ArrayList<PatrollingClass> getPatrollingDir() {
        return patrollingDir;
    }
    
}
