// package com.practice;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class MyWindow extends JFrame {
//     private JLabel heading;
//     private JLabel clockLabel;
//     private Font font = new Font("", Font.BOLD, 35);

//     MyWindow() {
//         setTitle("My Clock");
//         setSize(400, 400);
//         setLocation(300, 50);
//         createGUI();
//         startClock();
//         setVisible(true);
//     }

//     public void createGUI() {
//         heading = new JLabel("My Clock");
//         clockLabel = new JLabel("Time");

//         heading.setFont(font);
//         clockLabel.setFont(font);

//         setLayout(new GridLayout(2, 1));
//         add(heading);
//         add(clockLabel);
//     }

//     public void startClock() {
//         Timer timer = new Timer(1000, new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
// //                String dateTime = new Date().toString();
// //            	String dateTime = new Date().toLocaleString();
            	
//             	Date d = new Date();
//             	SimpleDateFormat sfd=new SimpleDateFormat(pattern: "hh : mm : ss a");
//             	String dateTme=sfd.format(d);
//             	clockLabel.setText(dateTime);
            	
//                 clockLabel.setText(dateTime);
//             }
//         });
//         timer.start();
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new MyWindow();
//         });
//     }
// }
