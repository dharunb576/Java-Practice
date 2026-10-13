// public class exam{  
//   public static void main(String args[]){  
//    try{  
//       //code that may raise exception  
//       int data=100/10;  
//     System.out.println("rest of the code...");  
//    }
// catch(ArithmeticException e)
// {
// System.out.println(e);
// System.out.println("heloo");
// }  
//     System.out.println("main program in main method");
//   }  
// }  


// public class exam{    
//     public static void main(String[] args) {  
//         try  
//         {  
//         int data=50/0; //may throw exception   
//                          // if exception occurs, the remaining statement will not exceute  
//         System.out.println("rest of the code");  
//         }  
//              // handling the exception   
//         catch(ArithmeticException e)  
//         {  
//             System.out.println(e);  
//         }  
          
//     }  
      
// }  



// import java.awt.*;    
// public class exam extends Frame {    
//      // initializing using constructor  
//    exam() {  
//       // creating a button   
//       Button b = new Button("Click Me!!");  
  
//       // setting button position on screen  
//       b.setBounds(100,10,100,10);  
//         // adding button into frame    
//       add(b);  
//         // frame size 300 width and 300 height    
//       setSize(300,300);  
//         // setting the title of Frame  
//       setTitle("This is our basic AWT example");          
//       // no layout manager   
//       setLayout(null);     
//       // now frame will be visible, by default it is not visible    
//       setVisible(true);  
// }    
  
// // main method  
// public static void main(String args[]) {   
// exam f = new exam();   
//  }    
// }    



// import javax.swing.*;  
// public class exam extends JFrame{  
//     exam(){

    

// JFrame f=new JFrame();//creating instance of JFrame  

// JLabel f1 = new JLabel("First Name :");
// f1.setBounds(20,50,80,20);
// JLabel f2 = new JLabel("Last name : ");
// f2.setBounds(20,100,50,20);
// JLabel dob = new JLabel("Enter DOB: ");
// dob.setBounds(20,150,80,20);
// JTextField t1 = new JTextField();
// dob.setBounds(20,150,100,20);

          
// JButton b=new JButton("click");//creating instance of JButton  
// b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
// f.add(f1);
// f.add(f2);     
// f.add(dob);     
// f.add(b);
// f.add(t1);
// f.setTitle("MOSES");
// f.setSize(500,100);//400 width and 500 height  
// f.setLayout(null);//using no layout managers  
// f.setVisible(true);//making the frame visible  
//     }
// public static void main(String[] args) {  
//     new exam();
// }  
// }



import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2;
    Choice op;        // Combo box
    Button calc;
    TextArea result;  // Multi-line output

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