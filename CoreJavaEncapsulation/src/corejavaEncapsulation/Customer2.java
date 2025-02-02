package corejavaEncapsulation;

import java.util.Scanner;

public class Customer2{
    private int id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String address;

    // Constructor
    public Customer2(int id, String name, String email, String phone, String password, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.address = address;
    }
    

    // Getters and Setters (omitted for brevity)

    public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getPhone() {
		return phone;
	}


	public String getPassword() {
		return password;
	}


	public String getAddress() {
		return address;
	}

class Example
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input as a single string
        System.out.println("Enter customer information separated by commas (id, name, email, phone, password, address):");
        String input = scanner.nextLine();

        // Splitting the input string by commas
        String[] values = input.split(",");

        // Trim whitespaces from each value
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i].trim();
        }

        // Create Customer object using the split values
        Customer2 customer = new Customer2(
            Integer.parseInt(values[0]),  // id
            values[1],                     // name
            values[2],                     // email
            values[3],                     // phone
            values[4],                     // password
            values[5]                      // address
        );

        // Display values using getters
        System.out.println("Customer Information:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Password: " + customer.getPassword());
        System.out.println("Address: " + customer.getAddress());

        // Close the scanner
        scanner.close();
    }
}
}
