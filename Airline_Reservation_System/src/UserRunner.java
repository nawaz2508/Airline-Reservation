import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRunner {

	private static List<Customer> customers = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer(1, "kmnawaz25@gmail.com","MohdNawaz","9321337770","Bhiwandi",28,"Male","123456");
		
		System.out.println("Press 1 to add new customer");
		System.out.println("Press 2 to search new customer");
		System.out.println("Press 3 to delete customer");
		System.out.println("Press 4 to display all customer");

		Scanner sc = new Scanner(System.in);

		while(true){
	
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		if(choice==1) {
			c1.addNewCustomer();
		}else if(choice == 2) {
			int cust_id = sc.nextInt();
			c1.searchUser(cust_id);
		}else if(choice == 3) {
			int cust_id = sc.nextInt();
			c1.deleteCustomer(cust_id);
		}else if(choice == 4) {
			c1.printCustomer();
		}
	}
		
		
		

	}

	

}
