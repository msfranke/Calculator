import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    public Calculator() {

        JFrame frame = new JFrame();
        textField = new JTextField();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        button3 = new JButton("Button3");
        button4 = new JButton("Button4");
        button5 = new JButton("Button5");

        frame.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(4, 3));
        panel2.setLayout(new GridLayout(4, 1));

        panel.add(button1);
        button1.addActionListener(this);
        panel.add(button2);
        //button2.addActionListener(actionPerformedButton2());
        panel.add(button3);
        //button3.addActionListener(actionPerformedButton3());
        panel.add(button4);
        //button4.addActionListener(actionPerformedButton4());
        panel.add(button5);
        //button5.addActionListener(actionPerformedButton5());
        panel.add(new JButton("button6"));
        panel.add(new JButton("button7"));
        panel.add(new JButton("button8"));
        panel.add(new JButton("button9"));
        panel2.add(new JButton("+"));
        panel2.add(new JButton("-"));
        panel2.add(new JButton("*"));
        panel2.add(new JButton("/"));
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.EAST);
        frame.setSize(380, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            textField.setText(button1.getText());
        }
    }
    /*public void actionPerformedButton2(ActionEvent e) {
        if (e.getSource() == button2) {
            textField.setText(button2.getText());
        }
    }
    public void actionPerformedButton3(ActionEvent e) {
        if (e.getSource() == button3) {
            textField.setText(button3.getText());
        }
    }
    public void actionPerformedButton4(ActionEvent e) {
        if (e.getSource() == button4) {
            textField.setText(button4.getText());
        }
    }
    public void actionPerformedButton5(ActionEvent e) {
        if (e.getSource() == button5) {
            textField.setText(button5.getText());
        }
    }*/

}
