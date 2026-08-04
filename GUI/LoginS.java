import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginS extends JFrame {

    LoginS(String s1) {
        super(s1);
    }

    LoginS() {

    }

    void setComponents() {
        JLabel l1 = new JLabel("Welcome");
        JTextField t1 = new JTextField();

        setLayout(null);

        l1.setBounds(200, 100, 100, 30);
        t1.setBounds(200, 200, 150, 30);

        add(l1);
        add(t1);
    }

    public static void main(String[] args) {
        LoginS s1 = new LoginS("Welcome to Coding Seekho");

        s1.setSize(700, 700);
        s1.setLayout(null);
        s1.setComponents();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s1.setVisible(true);
    }
}
