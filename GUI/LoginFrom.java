
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrom extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;

    LoginFrom(String s1) {
        super(s1);
    }

    LoginFrom() {

    }

    void setComponents() {
     
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
        Cursor c2 = new Cursor(Cursor.CROSSHAIR_CURSOR);
        Cursor c3 = new Cursor(Cursor.WAIT_CURSOR);
        Font f1 = new Font("Times New Roman", Font.BOLD,28);
        Font f2 = new Font("Callibri",Font.ITALIC, 22);

        l1 = new JLabel("Welcome to Coding Seekho");
        l1.setFont(f1);
        l1.setForeground(Color.RED);
        l2 = new JLabel("USERNAME");
        l3 = new JLabel("PASSWORD");
        l3.setFont(f2);
        l3.setForeground(Color.BLUE);
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b1.setCursor(c1);
        b1.setBackground(Color.CYAN);
        b2 = new JButton("Clear");
        b2.setCursor(c2);
        b3 = new JButton("Add");
        b3.setCursor(c3);


        setLayout(null);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);

        l1.setBounds(100, 50, 350, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 100, 30);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
        b3.setBounds(500, 550, 100, 30);

        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
        l2.addMouseListener(new MouseL());

    }

    public static void main(String[] args) {
        LoginFrom s1 = new LoginFrom("LoginForm");

        s1.setSize(700, 700);
        s1.setLayout(null);
        s1.setComponents();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s1.setVisible(true);
    }

    class Log implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if (s1.equals("coding") && s2.equals("seekho")) {
                l4.setText("Login Successful");
            } else {
                l4.setText("Login Unsuccessful");
            }
        }
    }

    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            t1.setText("");
            t2.setText("");
        }
    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;

                l4.setText("Additon is " + c);
            } catch (Exception e) {
                l4.setText("Please Enter a number only");
            }

        }
    }

    class MouseL implements MouseListener{
        public void mousePressed(MouseEvent e1){

        }
        public void mouseReleased(MouseEvent e1){

        }
        public void mouseExited(MouseEvent e1){

        }
        public void mouseClicked(MouseEvent e1){

        }
        public void mouseEntered(MouseEvent e1){
          l2.setForeground(Color.GREEN);  
        }
    }
}
