import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener {

    Label nameL, emailL, genderL, deptL, addressL;
    TextField nameT, emailT;
    TextArea addressA;
    Checkbox male, female;
    CheckboxGroup genderGroup;
    Choice dept;
    Button submit;
    TextArea output;

    public RegistrationForm() {

        setLayout(new FlowLayout());

        nameL = new Label("Name:");
        nameT = new TextField(20);

        emailL = new Label("Email:");
        emailT = new TextField(20);

        genderL = new Label("Gender:");
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);

        deptL = new Label("Department:");
        dept = new Choice();
        dept.add("CSE");
        dept.add("ECE");
        dept.add("EEE");
        dept.add("IT");

        addressL = new Label("Address:");
        addressA = new TextArea(4, 20);

        submit = new Button("Register");

        output = new TextArea(6, 30);

        add(nameL); add(nameT);
        add(emailL); add(emailT);
        add(genderL); add(male); add(female);
        add(deptL); add(dept);
        add(addressL); add(addressA);
        add(submit);
        add(output);

        submit.addActionListener(this);

        setTitle("AWT Registration Form");
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String data = "Name: " + nameT.getText() +
                      "\nEmail: " + emailT.getText() +
                      "\nGender: " + genderGroup.getSelectedCheckbox().getLabel() +
                      "\nDepartment: " + dept.getSelectedItem() +
                      "\nAddress: " + addressA.getText();

        output.setText(data);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
