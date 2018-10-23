package com.cg.bam.ui;

import java.util.Scanner;

import com.cg.bam.dto.Customer;
import com.cg.bam.service.BankAccountServiceImpl;

public class Main {
	public static void main(String args[]){
		
		BankAccountServiceImpl service = new BankAccountServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		String name,mobileNo;
		float age;
		double amount;
		int ch = 0;
		do{
			System.out.println("1.Add Customer\n2.Deposit amount\n3.Withdraw Amount\n4.Fund transfer\n5.Check balance\n6.Exit");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch){
				case 1 :
						
						System.out.println("Enter customer name : ");
						name = sc.next();
						
						System.out.println("Enter mobile no. : ");
						mobileNo = sc.next();
						
						System.out.println("Enter age : ");
						age = sc.nextFloat();
						
						System.out.println("Enter initial amount : ");
						amount = sc.nextDouble();
						
						Customer customer = new Customer();
						
						customer.setName(name);
						customer.setMobileNo(mobileNo);
						customer.setAge(age);
						customer.setInitialBalance(amount);
						
						service.createAccount(customer);						
					
					break;
					
				case 2 :
							
						System.out.println("Enter your mobile number : ");
						mobileNo = sc.next();
						
						System.out.println("Enter the amount you want to deposit");
						amount = sc.nextDouble();
						
						service.deposit(mobileNo, amount);						
					
					break;
					
				case 3 :
						System.out.println("Enter your mobile number : ");
						mobileNo = sc.next();
						
						System.out.println("Enter the amount you want to withdraw : ");
						amount = sc.nextDouble();
						
						service.withdraw(mobileNo, amount);
						
					break;
				
				case 4 :
					
					System.out.println("Enter your mobile number : ");
					mobileNo = sc.next();
					
					System.out.println("Enter the amount you want to transfer : ");
					amount = sc.nextDouble();
					
					System.out.println("Enter receivers mobile number : ");
					String mobileNoReciever = sc.next();
					
					service.fundTransfer(mobileNo, mobileNoReciever, amount);
					
					break;
					
				case 5 :
					
						System.out.println("Enter the moible id to check balance");
						mobileNo = sc.next();
						
						System.out.println("Current Amount "+service.checkBalance(mobileNo));
					break;
					
				case 6 :
						System.out.println("Ok bye");
					break;
				default : System.out.println("Invalid input!");
			}
			
		}while(ch != 6);
		
	}
}
