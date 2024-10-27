// class Employee {
//     static int empID = 2;
//     int basicSal = 20000;
//     int incentive = 200;

//     void countSalaries() {
//         System.out.println(basicSal + incentive);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         // Employee engineer = new Employee();
//         // System.out.println(engineer.empID);
//         System.out.println(Employee.empID); // Why is it giving error because above where int empID=2; I have to add static keyword

//     }
// }

import MyPackage2.MyClass;

class Test{
    public static void main(String[] args) {
        Employee engineer = new Employee();
        MyClass myClass = new MyClass();
        myClass.print();
        System.out.println(engineer.getph());
        System.out.println(engineer.getName());
    }
}




private int ph =0;
private String name;
private int basicSal=20000;
private int incentive = 200;

Employee(){
    ph=2222;
    name="vicky";
}

Employee(String empName, int phoneNo){
    ph=phoneNo;
    name=empName;
}
private void countSalaries(){
    System.out.println(basicSal);
}

// getter & setter

int getph(){
    return ph;
}

String getName(){
    return name;
}

void setPh(int phone){
    ph=phone;
}
void setNamee(String name){
    this.name=name;
}
}