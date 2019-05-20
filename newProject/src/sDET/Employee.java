package sDET;

public class Employee {
int Id;
String name;
double salary;
int depNumber;
String position;

void display() {
	System.out.println(Id);
	System.out.println(name);
	System.out.println(depNumber);
	System.out.println(position);
}
	public static void main(String[] args) {
		
Employee emp1 = new Employee();
emp1.Id = 501;
emp1.name = "John";
emp1.salary = 65000.00;
emp1.depNumber =21;
emp1.position = "QA Engineer";
emp1.display();

Employee emp2 = new Employee();
emp2.Id = 502;
emp2.name = "Brian";
emp2.salary = 90000.00;
emp2.depNumber = 21;
emp2.position = "QA Lead";
emp2.display();
	}

}
