public class Person {

	int empID;

	Person(int empID) {
		this.empID = empID;
	}

	public int getEmpID(){
		return empID;
		
	}

}


public interface Shape {
	public void computeArea();
}


public class Rectangle implements Shape {
	@Override
	public void computeArea() {
	System.out.println("Compute Rectangle Area")