//#1 
package Student_Management_System_Project;

import java.awt.Image;
import javax.swing.*;
public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/GOI.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setBounds(0, 0, 30, 20);`
        add(image);
        t=new Thread(this);
        t.start();
        setVisible(true);

        int X = 1;
        for(int i = 5; i<=600; i+=4,X+=1){

            setLocation( 600 -((i +X)/2),350-(i/2));
            setSize(i+3*X, i+X/2);
            try{
                Thread.sleep(10);
            }
            catch(Exception e)  {}

        }
    }
    public void run(){
        try{
            Thread.sleep(4000);
            setVisible(false);
            
            //Next frame
            new Login();
        }
        catch(Exception e){

        }
    }
    public static void main(String []args){
        new Splash();
    }
}
   