/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author Sherdon Brown
 */
public class Bookstore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	int choice = 0;
         Scanner input = new Scanner(System.in);
         
         displayWelcomeMessage();
       
        Order ord= new Order();
        Cart crt = new Cart();
        productInventory pI = new productInventory();
         
         while(6 != choice)
         {
        	 displayMenu();
        	 System.out.println("Please eneter a number between 1 - 6 as choices: ");
        choice=input.nextInt();
        //pI.intDataVerification();
         switch (choice){
             
             case 1:{
                 showProductMenu(pI);
                 break;
         }
             case 2:{
            	 productMenu(pI);
                 break;
         }
             case 3:{
            	 sortingMethod(pI);
                 break;
         }
             case 4:{
            	 addToCart(pI);
                 break;
         }
             case 5:{
            	 pI.printInvent();
                // showProductMenu();
                 break;
         }
             
         }
    }
    
}
  static void displayWelcomeMessage(){
       System.out.println("Welcome! to the new book store");
  }  
    
static void displayMenu(){
         
        System.out.println("Welcome! Please choose an option.");
        System.out.println("1. View Catalog");
        System.out.println("2. Search Catalog");
        System.out.println("3. Sort Catalog");
        System.out.println("4. Add to Shopping Cart");
        System.out.println("5. Checkout");
        System.out.println("6. Exit");
         
         
}

static void showProductMenu(productInventory pI){
	pI.printInvent();
}

static void productMenu(productInventory pI){
	int choice = 0;
	String Category = " ";
	System.out.println("what catalog do you like to select (Enter1,2,3,or4): ");
	System.out.println("1. Textbooks");
	System.out.println("2. Campus Gear");
	System.out.println("3. School Supplies");
	System.out.println("4. Gifts");
	Scanner input = new Scanner(System.in);
	choice=input.nextInt();
	switch (choice){

	case 1:{
		Category = "Textbooks";
		break;
	}
	case 2:{
		Category = "Campus Gear";
		break;
	}

	case 3:{
		Category = "School Supplies";
		break;
	}
	case 4:{
		Category = "Gifts";
		break;
	}
	}
	pI.category(Category);
}

static void sortingMethod(productInventory pI){
	int choice = 0;
	String continu = " ";
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	System.out.println("How would you like to sort(enter 1 or 2): ");
	System.out.println("1. Price");
	System.out.println("2. Production");
	choice=input.nextInt();
    switch (choice){
        
        case 1:{
        	pI.printSortPrice();
            break;
    }
        case 2:{
        	pI.printSortName();
        	break;
        }
    }
    System.out.println("would you like to continue enter y for yes or n for no: ");
    continu =input.nextLine();
}

static void addToCart(productInventory pI){
	int choice = 0;
	String Category = " ";
	System.out.println("what catalog do you like to select (Enter1,2,3,or4): ");
	System.out.println("1. Textbooks");
	System.out.println("2. Campus Gear");
	System.out.println("3. School Supplies");
	System.out.println("4. Gifts");

	Scanner input = new Scanner(System.in);
	choice=input.nextInt();
	switch (choice){

	case 1:{
		Category = "Textbooks";
		break;
	}
	case 2:{
		Category = "Campus Gear";
		break;
	}
	case 3:{
		Category = "School Supplies";
		break;
	}
	case 4:{
		Category = "Gifts";
		break;
	}
	}
	//pI.category(Category);
	pI.productDescription(Category);
	
}

static void showCart(){
	
}
static void checkout(){
    
}

static void calculateOrderTotal(){
	
}

static void receivePayment(){
	
}

static void printOrderConfirmations(){

}

static void exitProgram(){
    
}

}

    