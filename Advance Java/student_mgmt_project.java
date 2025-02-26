// // //  1) load the driver:
//     Class.forName("com.mysql.jdbc.Driver")

// // 2) Create a Connection:
//     Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbname", "username", "password");

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

// public class student_mgmt_project {
//     public static void main(String[] args) throws IOException {
//         System.out.println("Welcome to Student Management App");
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         while (true) {
//             System.out.println("Press 1 to ADD student");
//             System.out.println("Press 2 to DELETE student");
//             System.out.println("Press 3 to display student");
//             System.out.println("Press 4 to exit student");

//             int c = Integer.parseInt(br.readLine());

//             if (c == 1) {
//                 // add student
//             } else if (c == 2) {
//                 // delete student
//             } else if (c == 3) {
//                 // display students
//             } else if (c == 4) {
//                 // exit;
//                 break;
//             } else {

//             }

//         }
//         System.out.println("Thanks for using my app");
//     }

// }





package com.student.manage;

private class Student{
    private String studentName;
    private String studentPhone;
    private String studentCity;
}

public Student(int StudentID, String studentName, String studentPhone, String studentClass){
    super();
    this.studentId = StudentID;
    this.studentName = studentName;
    this.studentCity = studentClass;
}

public Student(String studentName, String studentName, String studentPhone, String StudentCity){
    super();
    this.studentId = studentName;
    this.studentPhone = studentPhone;
    this.studentCity = studentCity;
}

public Student(){
    
}