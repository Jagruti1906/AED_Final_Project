package Education;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class View_BookedTour extends JFrame
{
    JTable t;
    JButton bt1;
    JTextField tf1;
    JPanel p1,p2,p3;
    String x[]={"Book ID","School Name","Guide Name","Resident Name"};
    String y[][]=new String [20][7];
    int i=0,j=0;
    Font f,f1;
    JLabel l1,l2;
    
    public View_BookedTour()
    {
        super("All Booked School Tour Records");
        setSize(1300,400);
        setLocation(0,10);
        f=new Font("MS UI Gothic",Font.BOLD,17);
        
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q="select * from tourbooked";
            ResultSet rest=obj.stm.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("bid");
                y[i][j++]=rest.getString("schoolname");
                y[i][j++]=rest.getString("guidename");
                y[i][j++]=rest.getString("residentname");
                
                i++;
                j=0;
            }
            t=new JTable(y,x);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        t.setFont(f);
        t.setBackground(Color.BLACK);
        t.setForeground(Color.WHITE);
        
        JScrollPane js=new JScrollPane(t);
        add(js);
    }
    public static void main(String args[])
    {
        new View_BookedTour().setVisible(true);
    }
}
