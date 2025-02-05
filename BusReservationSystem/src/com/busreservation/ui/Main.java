package com.busreservation.ui;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import com.busreservation.colors.Colors;
import com.busreservation.methods.AdminMethods;
import com.busreservation.methods.CustomerMethods;
import com.busreservation.methods.SignUpCustomer;

public class Main {

	public static void choiceCustomerOrAdmin() {
			
		System.out.println(Colors.BLACK_BOLD              +"+------------------------+"+"\n"
										                  +"| 1.ENTER AS CUSTOMER    |"+"\n"
								                          +"| 2.ENTER AS ADMIN       |"+"\n"
										                  +"| 3.EXIT                 |"+"\n"
										                  +"+------------------------+"+"\n"+Colors.RESET);
			
			
		ChoiceCustomer();
			
	}
	
	public static void ChoiceCustomer() {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print(Colors.BLACK_BOLD+"Please choose a Number: "+Colors.RESET);
		
		int choice = 0;
		
		try {
			choice = sc.nextInt();
		}catch (NoSuchElementException e) {
			System.out.println("");
			System.out.println(Colors.RED_BACKGROUND + "Input type should be number" + Colors.RESET);
			System.out.println("");
			choiceCustomerOrAdmin();
		}
		
		if(choice == 1) {

			customerMethods();
			
		}else if(choice == 2) {

			adminMethods(sc);
			
		}else if(choice == 3) {
			
			System.out.println("");
			System.out.println(Colors.BLACK_ITALIC+"Thank You! Have a Great Day"+Colors.RESET);
			sc.close();
			
		}else {
	
			System.out.println(Colors.RED_BACKGROUND+" Please select correct Option "+Colors.RESET);
			choiceCustomerOrAdmin();
		}
		
	}
	
	
	public static void customerMethods() {
		
		System.out.println("");
		System.out.println(Colors.BOXING+Colors.BLACK_BOLD+Colors.BANANA_YELLOW_BACKGROUND  +"   Customer Portal   "+Colors.RESET);
		
		System.out.println(Colors.BLACK_BOLD           
                                             +"+----------------------------------- +"+"\n"
		                                   	 +"| 1.Don't have Account? Sign Up      |"+"\n"
	                                         +"| 2.Login                            |"+"\n"
		                                     +"| 3.Back                             |"+"\n"
					                         +"+------------------------------------+"+"\n"+Colors.RESET);
		
		ChoiceCustomerTwo();
	}
	
	
	public static void ChoiceCustomerTwo(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(Colors.BLACK_BOLD+"Your Choice: "+Colors.RESET);
		
		int choice = 0; 
		
		try {
			choice = sc.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("");
			System.out.println(Colors.RED_BACKGROUND + "Input type should be number" + Colors.RESET);
			System.out.println("");
			customerMethods();
		}
		
		
		if(choice == 1) {
			
			 SignUpCustomer.signUpCustomer(sc);
			
		}else if(choice == 2) {

			 CustomerMethods.loginCustomer();
			
		}else if(choice == 3) {
			
			choiceCustomerOrAdmin();
			
		}else {
			
			System.out.println(Colors.RED_BACKGROUND+" Please select correct Option "+Colors.RESET);
			choiceCustomerOrAdmin();
		}
	}
	
	
	public static void adminMethods(Scanner sc) {
		
		 System.out.println("");
		 System.out.println(Colors.BOXING+Colors.BLACK_BOLD+Colors.BANANA_YELLOW_BACKGROUND +"  Admin Portal  "+Colors.RESET);
		AdminMethods.adminLogin();
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(Colors.BLACK_BOLD+"---------------------------------------------"+Colors.RESET);
			System.out.print(Colors.BOXING+Colors.RED_BACKGROUND_BRIGHT+"     WELCOME ");
	     
			Thread.sleep(500);
	        System.out.print("TO ");
	        Thread.sleep(500);
	
	        System.out.print("BUS ");
	        Thread.sleep(500);
	
	        System.out.print("RESERVATION ");
	        Thread.sleep(500);
	
	        System.out.print("SYSTEM     " + Colors.RESET);
	        Thread.sleep(500);
	
	        System.out.println();
	        System.out.println(Colors.BLACK_BOLD+"---------------------------------------------"+Colors.RESET);
	        System.out.println();
	        Thread.sleep(300);
	   
		   } catch (InterruptedException e) {
				
				e.printStackTrace();
		}
		
		choiceCustomerOrAdmin();
		
        sc.close();
	}
	
}
