package TNSday3.scanner;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// scanner objects to accepts user inputs
		 Scanner ob=new Scanner(System.in);
		 String name;
		 System.out.println("Enter Person Name:");
		 name =ob.next();
		 System.out.println("Enter Age");
		 int age=ob.nextInt();
		 System.out.println("Enter Gender");
		 String gender=ob.next();
		 System.out.println("Enter Income");
		 int income = ob.nextInt();
		 
		 
		 //person object and initilize values  using setter
		 person person=new person();
		 person.setName(name);
		 person.setAge(age);
		 person.setGender(gender);
		 person.setIncome(income);
		 
		 //display person details using tostrting method
		 System.out.println(person);
		 
		 TaxCalcukation calc=new TaxCalcukation();
		 calc.CalculatelateTax(person); //tax calculation
		 System.out.println("After calculationTax:");
		 
		 System.out.println(person);
		 

	}

}
