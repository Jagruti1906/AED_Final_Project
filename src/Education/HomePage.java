package Education;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Font f,f1,f2;
    JPanel p1;
    
    HomePage()
    {
        super("School Management HomePage");
        setLocation(0,0);
        setSize(1550,800);
        
        f=new Font("Lucida Fax",Font.BOLD,20);
        f2=new Font("Gadugi",Font.BOLD,35);
        f1=new Font("MS UI Gothic",Font.BOLD,18);
        
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("cab_booking/Icons/school background.jpg"));
        Image img=ic.getImage().getScaledInstance(1550,800,Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);
        l1=new JLabel(ic1);
        
        JMenuBar m1=new JMenuBar();
        JMenu men1=new JMenu("Resident Profile");
        JMenuItem ment1=new JMenuItem("Add Resident Profile");
        JMenuItem ment2=new JMenuItem("View Resident Profile");
        
        JMenu men2=new JMenu("Manage Resident");
        JMenuItem ment3=new JMenuItem("Update Resident Details");
        
        JMenu men3=new JMenu("Book School Tour");
        JMenuItem ment5=new JMenuItem("Book Tour");
        JMenuItem ment6=new JMenuItem("View Booked Tour");
        
        JMenu men7=new JMenu("Delete");
        JMenuItem ment12=new JMenuItem("Delete Resident");
        
        JMenu men8=new JMenu("About");
        JMenuItem ment13=new JMenuItem("About");
        JMenuItem ment14=new JMenuItem("Exit");
        
        men1.add(ment1);
        men1.add(ment2);
        men2.add(ment3);
        men3.add(ment5);
        men3.add(ment6);
            
        men7.add(ment12);
        men8.add(ment13);
        men8.add(ment14);
        
        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
      
        m1.add(men7);
        m1.add(men8);
        
        men1.setFont(f);
        men2.setFont(f);
        men3.setFont(f);
      
        men7.setFont(f);
        men8.setFont(f);
        
        ment1.setFont(f1);
        ment2.setFont(f1);
        ment3.setFont(f1);
        ment5.setFont(f1);
        ment6.setFont(f1);
      
        ment12.setFont(f1);
        ment13.setFont(f1);
        ment14.setFont(f1);
        
        m1.setBackground(Color.BLACK);
        
        men1.setForeground(Color.GRAY);
        men2.setForeground(Color.GRAY);
        men3.setForeground(Color.GRAY);
      
        men7.setForeground(Color.GRAY);
        men8.setForeground(Color.RED);
        
        ment1.setBackground(Color.BLACK);        
        ment2.setBackground(Color.BLACK);        
        ment3.setBackground(Color.BLACK);          
        ment5.setBackground(Color.BLACK);        
        ment6.setBackground(Color.BLACK);
        ment6.setBackground(Color.BLACK);
      
        ment12.setBackground(Color.BLACK);
        ment13.setBackground(Color.BLACK);
        ment14.setBackground(Color.BLACK);

        ment1.setForeground(Color.YELLOW);        
        ment2.setForeground(Color.YELLOW);        
        ment3.setForeground(Color.YELLOW);       
        ment5.setForeground(Color.YELLOW);        
        ment6.setForeground(Color.YELLOW);        
      
        ment12.setForeground(Color.YELLOW);
        ment13.setForeground(Color.RED);
        ment14.setForeground(Color.RED);
        
        ment1.addActionListener(this);
        ment2.addActionListener(this);
        ment3.addActionListener(this);
        ment5.addActionListener(this);
        ment6.addActionListener(this);
        ment12.addActionListener(this);
        ment13.addActionListener(this);
        ment14.addActionListener(this);
        
        setJMenuBar(m1);
        add(l1);
    }
    public void actionPerformed(ActionEvent e) 
    {
        String comnd=e.getActionCommand();
        if(comnd.equals("Add Resident Profile"))
        {
            new Add_Resident();
        }
        else if(comnd.equals("View Resident Profile"))
        {
            new View_Resident().setVisible(true);
        }
        else if(comnd.equals("Update Resident Details"))
        {
            new Update_Resident().setVisible(true);
        }
        else if(comnd.equals("Book Tour"))
        {
            new Book_Tour().setVisible(true);
        }
        else if(comnd.equals("View Booked Tour"))
        {
            new View_BookedTour().setVisible(true);
        }
        else if(comnd.equals("Delete Resident"))
        {
            new Delete_Resident().setVisible(true);
        }
        else if(comnd.equals("About"))
        {
            new About().setVisible(true);
        }
        else if(comnd.equals("Exit"))
        {
            System.exit(0);
        }
    }
    public static void main(String[] args) 
    {
        new HomePage().setVisible(true);
    }
}
