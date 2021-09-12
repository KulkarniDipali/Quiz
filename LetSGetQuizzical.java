package let.s.get.quizzical;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LetSGetQuizzical extends JFrame implements ActionListener {
   JButton b1, b2;
    JTextField t1;
    LetSGetQuizzical(){
        setBounds(400, 200, 1200, 600); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("let/s/get/quizzical/icons/3.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 600, 600);
        add(l1);
        
        JLabel l2 = new JLabel("LetSGetQuizzical");
        l2.setFont(new Font("Kristen ITC", Font.BOLD, 45));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(690, 80, 500, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Harrington", Font.BOLD, 35));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(760, 180, 300, 38);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(720, 260, 400, 30);
        t1.setFont(new Font("Jokerman", Font.PLAIN, 20));
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(720, 320, 150, 30);
        b1.setBackground(new Color(30, 144, 254));
        b1.setFont(new Font("Maiandra GD", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(970, 320, 150, 30);
        b2.setBackground(new Color(30, 144, 254));
        b2.setFont(new Font("Maiandra GD", Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LetSGetQuizzical();
    }
    
}
