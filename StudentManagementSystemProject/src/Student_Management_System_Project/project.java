//#3
package Student_Management_System_Project;


import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class project extends JFrame implements ActionListener {
    project(){
        setSize(1500,850);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/PRO.jpg"));
          Image i2 = i1.getImage().getScaledInstance(1500,700,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb =new JMenuBar();
        
        //new information
        JMenu newInformation = new JMenu("new Information");
        newInformation.setForeground(Color.red);
        mb.add(newInformation);

        JMenuItem studentInfo = new JMenuItem("new student information");
        studentInfo.setBackground(Color.white);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //Details
         JMenu Details = new JMenu("view Details");
        Details.setForeground(Color.blue);
        Details.addActionListener(this);
        mb.add(Details);
        
        JMenuItem  StudentDetails = new JMenuItem("view Student details");
        StudentDetails.setBackground(Color.white);
        StudentDetails.addActionListener(this);
        Details.add(StudentDetails);
        
        
        //here you can apply for leave
        JMenu leave = new JMenu("Apply leave");
        leave.setForeground(Color.red);
        leave.addActionListener(this);
        mb.add(leave);
        
        JMenuItem Studentleave = new JMenuItem("Student leave");
        Studentleave.setBackground(Color.white);
        Studentleave.addActionListener(this);
        leave.add(Studentleave);
        
        
        //leave details
         JMenu leavedetails = new JMenu("leave Details");
        leavedetails.setForeground(Color.blue);
        leavedetails.addActionListener(this);
        mb.add(leavedetails);
        
        JMenuItem  StudentLeavedetails = new JMenuItem("view student leave Details");
        StudentLeavedetails .setBackground(Color.white);
        StudentLeavedetails.addActionListener(this);
        leavedetails.add(StudentLeavedetails);
        
        //exam
        JMenu exam = new JMenu(" Examination");
        exam.setForeground(Color.blue);
        exam.addActionListener(this);
        mb.add(exam);
        
        JMenuItem  examinationdetails = new JMenuItem("Examiation Result");
        examinationdetails .setBackground(Color.white);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem  entermarks = new JMenuItem("Enter marks");
        entermarks .setBackground(Color.white);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //Update
        JMenu updateInfo = new JMenu("Update details");
        updateInfo.setForeground(Color.red);
        updateInfo.addActionListener(this);
        mb.add(updateInfo);
        
        JMenuItem  updatestudentInfo = new JMenuItem("Update student Details");
        updatestudentInfo .setBackground(Color.white);
        updatestudentInfo.addActionListener(this);
        updateInfo.add(updatestudentInfo);
        
       
        
        //fees
        JMenu fee = new JMenu(" fee Details");
        fee.setForeground(Color.red);
        fee.addActionListener(this);
        mb.add(fee);
        
        JMenuItem feeStructure = new JMenuItem("Fees Structure");
        feeStructure .setBackground(Color.white);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);
        
        JMenuItem  feeForm = new JMenuItem("Student fee form");
        feeForm.setBackground(Color.white);
        feeForm.addActionListener(this);
        fee.add(feeForm);
        
        //utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.red);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad .setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem  calc = new JMenuItem("calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);
        
        
        //about
//        JMenu about = new JMenu("About");
//        about.setForeground(Color.red);
//        mb.add(about);
//        
//        JMenuItem ab = new JMenuItem("About");
//        ab.setBackground(Color.white);
//        ab.addActionListener(this);
//        ab.add(ab);
        
        
        //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.red);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex .setBackground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
      String msg = ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
    }
        else if (msg.equals("calculator")){
            try {
               Runtime.getRuntime().exec("calc.exe");
        }catch (IOException e){
            
        }
        }else if (msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
            }
        }else if(msg.equals("new student information")){
            new Addstudent();
        }else if(msg.equals("view Student details")){
            new StudentDetails();
        }else if(msg.equals("Student leave")){
            new StudentLeave();
        }else if(msg.equals("view student leave Details")){
            new StudentLeaveDetails();
        }else if(msg.equals("Examiation Result")){
            new ExaminationDetails();
        }else if(msg.equals("Enter marks")){
            new EnterMarks();
        }else if(msg.equals("Update student Details")){
            new UpdateStudent();  
        }else if(msg.equals("Fees Structure")){
            new FeeStructure();
        }else if(msg.equals("Student fee form")){
            new StudentFeeform();
       
        }
            
        }
    public static void main(String []args){
        new project();
}

 
}

