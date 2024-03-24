import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private JButton add, sub, mul, div, equal, clear;
    private JPanel panel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 50));
        textField.setEditable(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("C");

        b1.addActionListener(this);
        panel.add(b1);
        b2.addActionListener(this);
        panel.add(b2);
        b3.addActionListener(this);
        panel.add(b3);
        add.addActionListener(this);
        panel.add(add);
        b4.addActionListener(this);
        panel.add(b4);
        b5.addActionListener(this);
        panel.add(b5);
        b6.addActionListener(this);
        panel.add(b6);
        sub.addActionListener(this);
        panel.add(sub);
        b7.addActionListener(this);
        panel.add(b7);
        b8.addActionListener(this);
        panel.add(b8);
        b9.addActionListener(this);
        panel.add(b9);
        mul.addActionListener(this);
        panel.add(mul);
        b0.addActionListener(this);
        panel.add(b0);
        div.addActionListener(this);
        panel.add(div);
        equal.addActionListener(this);
        panel.add(equal);
        clear.addActionListener(this);
        panel.add(clear);

        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == b2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == b3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == b4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == b5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == b6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == b7) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == b8) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == b9) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == b0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == add) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        } else if (e.getSource() == sub) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        } else if (e.getSource() == mul) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        } else if (e.getSource() == div) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");

        }
            else if (e.getSource() == clear) {
            textField.setText("");


        } else if (e.getSource() == equal) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
        } else if (e.getSource() == clear) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
