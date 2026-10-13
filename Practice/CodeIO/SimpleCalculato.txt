

import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2;
    Choice op;
    Button calc;
    TextArea result;

    public SimpleCalculator() {

        setLayout(new FlowLayout());

        l1 = new Label("Enter Number 1:");
        t1 = new TextField(10);

        l2 = new Label("Enter Number 2:");
        t2 = new TextField(10);

        l3 = new Label("Select Operation:");
        op = new Choice();
        op.add("Add");
        op.add("Subtract");
        op.add("Multiply");
        op.add("Divide");

        calc = new Button("Calculate");
        result = new TextArea(5, 30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(op);
        add(calc);
        add(result);

        calc.addActionListener(this);

        setTitle("AWT Simple Calculator");
        setSize(350, 300);
        setVisible(true);

        // Window close support
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double r = 0;

            String choice = op.getSelectedItem();

            if (choice.equals("Add")) r = a + b;
            else if (choice.equals("Subtract")) r = a - b;
            else if (choice.equals("Multiply")) r = a * b;
            else if (choice.equals("Divide")) r = a / b;

            result.setText("Result: " + r);
        } catch (Exception ex) {
            result.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}