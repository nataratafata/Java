//package bookstore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;
import java.lang.String;

//typedef struct Person {
 //   char name[10];
 //   int  age;
  //  int  group;
//} Person;

public class productInventory{
	protected String productName;
	protected String Textbooks;
	protected String CampusGear;
	protected String schoolSupplies;
	protected String gifts;
	protected String productNameDescrip;
	protected int x;
	protected int y;
	protected static boolean swapped;
	protected static int[] index = new int[16];
	 protected static String[] productdescra = new String[16];
	 protected static int categoryItemsRemove;
	 ArrayList<Integer> CategoryList = new ArrayList<Integer>();
	 ArrayList<String> productdescr = new ArrayList<String>(Arrays.asList(productdescra));
	 protected String[] productCatea = new String[16];
	 ArrayList<String> productCate = new ArrayList<String>(Arrays.asList(productCatea));
	 protected static double[] productPricea = new double[16];
	 //ArrayList<Double > productPrice = new ArrayList<Double>(Arrays.asList(productPricea));
	 protected static double[] productQuantitya = new double[16];
	 //ArrayList<Integer> productQuantity = new ArrayList<Integer>();
	  // public static final Comparator<Team> BY_NAME = new ByName();
	  // public static final Comparator<Team> BY_POINTS = new ByPoints();
	/* public struct Person {
		    char name[10];
		    int  age;
		    int  group;
		} Person;*/
		
	//default constructor
	    public productInventory()
	    {
	    	x = 0;
	    	y = 0;
	    	//A
			productdescra = new String [] {"JAVA Programming", "Network Solutions", "Web Design Ideas", "Fabulous Desserts`", "T-shirts", "Sweatshirts", "Shorts", "Jacket",
						"Book bag", "Pencils", "Pens", "Folders", "Blinders", "Highlighters", "Alumni Drink ware", "Gift Cards"};
	    	//productdescr.addAll(productdescra);
		    //D
			/* Person people[] = {
				        { "John",    12, 2 },
				        { "David",   30, 1 },
				        { "Michael", 12, 2 },
				        { "Steve",   12, 1 },
				        { "Sam",     19, 2 },
				        { "Claire",  12, 1 }
				    };*/
			productCatea = new String [] {"Textbooks", "Textbooks", "Textbooks", "Textbooks", "Campus Gear", "Campus Gear", "Campus Gear", "Campus Gear",
					"School Supplies", "School Supplies", "School Supplies", "School Supplies", "School Supplies", "School Supplies", "Gifts", "Gifts"};
			//B
			productPricea = new double [] {150.00, 75.00, 55.00, 25.00, 15.00, 40.00, 10.00, 65.00,
					20.00, 1.00, 2.00, 1.00, 3.00, 2.00, 25.00, 25.00};
			//productPricea.toString();
			//C
			productQuantitya = new double [] {10, 5, 7, 15, 20, 5, 20, 5,
					10, 5, 5, 8, 15, 4, 25, 50};
			
			index = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	    }
	    
	    
	   /* protected static boolean isDes(int x, int y, String[] productdescra, double[] productPricea, double[] productQuantitya){
	    	return productPricea[x]>productPricea[y] || 
	    			productPricea[x]==productPricea[y]  && (productQuantitya[x]>productQuantitya[y] || productQuantitya[x]==productQuantitya[y] && strcmp(productdescra[x], productdescra[y])>0);
	    	
	    }*/
	//private static int strcmp(String string, String string2) {
			// TODO Auto-generated method stub
		//	return 0;
		//}


	protected void productName(String pn){
		productName = pn;
	}
	
	protected void productQuantity(int pq){
		
	}
	
	protected void price(int p){
		
	}
	
	protected void category(String Category){
		
		System.out.println("Production Description             Product Catgory              Product price           Product Quantity");
		for(int i = 0; i < 16; i++){
			if(productCatea[i] == Category){
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(productdescra[i]+ "                   " +productCatea[i]+ "                $" +productPricea[i]+ "                      "+productQuantitya[i]);
				CategoryList.add(i);
				//maybe remove
				//categoryItemsRemove[i];
			}
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	
	}
	
	protected void productDescription(String Category){
		//System.out.println("What Product from the category would you like to pick enter the number for choice");
		Scanner input = new Scanner(System.in);
		int choice;
		
		int i = 0;
		int j = 0;
		int cateList = 0;
		for(i = 0; i < 16; i++){
			if(productCatea[i] == Category){
				CategoryList.add(i);
			}
		}
		
		for(i = 0; i<CategoryList.size(); i++){	
			System.out.println(i+1 + ": " +productdescra[CategoryList.get(i)]);
		}
		
		i = 0;
		cateList = 0;
		choice=input.nextInt();
		do{
			if(i == choice){
				System.out.println("Production Description                 Product Catgory                   Product price                 Product Quantity");
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(i+1 + ": " +productdescra[CategoryList.get(i-1)]+ "                   " +productCatea[CategoryList.get(i-1)]+ "                $" +productPricea[CategoryList.get(i-1)]+ "                      "+productQuantitya[CategoryList.get(i-1)]);
				//j = choice; 
				j = i;
			}
			i++;
		}while(i <= CategoryList.size());
		
		System.out.println("How much quantity would you like? : ");
		choice=input.nextInt();
		i = 0;
		
		
		do{
			productQuantitya[CategoryList.get(j-1)]--;
			
			i++;
		}while(i < choice);
		
	}
	
	protected void printInvent(){
		//productOrder[i] = " ";
		//i put a 16 instead of a <=16
		System.out.println("Production Description             Product Catgory              Product price           Product Quantity");
		for(int i = 0; i < 16; i++)
		{
			//if(productQuantitya[i]<=0)
			//{
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(productdescra[i]+ "                   " +productCatea[i]+ "                $" +productPricea[i]+ "                      "+productQuantitya[i]);
			//}
		}	
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	protected void printSortName(){
    	
		 long j;
		    String Atemp = null;
		    String Dtemp = null;
		    double Btemp;
		    double Ctemp;
		Arrays.sort(productdescra);
		
		 for(long i=1; i<16; ++i) {
		        j=i;

		            Btemp = productPricea[(int) (j-1)];
		            productPricea[(int) (j-1)] = productPricea[(int) j];
		            productPricea[(int) j] = Btemp;

		//----> Swap the D and C elements the same way you swapped B

		            Ctemp = productQuantitya[(int) (j-1)];
		            productQuantitya[(int) (j-1)] = productQuantitya[(int) j];
		            productQuantitya[(int) j] = Ctemp;
		            
		            Dtemp = productCatea[(int) (j-1)];
		            productCatea[(int) (j-1)] = productCatea[(int) j];
		            productCatea[(int) j] = Dtemp;

		//----> Swapping of D and C is done

		            j = j-1;
		    }
		
		for(int i = 0; i < productdescra.length; i++)
		{
			System.out.print(productdescra[i] +"  $"+productPricea[i] + "  Category:" + productCatea[i] +"  Quantity: "+productQuantitya[i]+ " \n ");
		}
		System.out.println();
    }
	
	
	
	protected void printSortPrice(){
		
	    long j;
	    String Atemp = null;
	    String Dtemp = null;
	    double Btemp;
	    double Ctemp;
	    for(long i=1; i<16; ++i) {
	        j=i;
	        while(j>0 && productPricea[(int) (j-1)] > productPricea[(int) j]) {

	            Btemp = productPricea[(int) (j-1)];
	            productPricea[(int) (j-1)] = productPricea[(int) j];
	            productPricea[(int) j] = Btemp;

	//----> Swap the D,C and A elements the same way you swapped B

	            Ctemp = productQuantitya[(int) (j-1)];
	            productQuantitya[(int) (j-1)] = productQuantitya[(int) j];
	            productQuantitya[(int) j] = Ctemp;

	            Atemp = productdescra[(int) (j-1)];
	            productdescra[(int) (j-1)] = productdescra[(int) j];
	            productdescra[(int) j] = Atemp;
	            
	            Dtemp = productCatea[(int) (j-1)];
	            productCatea[(int) (j-1)] = productCatea[(int) j];
	            productCatea[(int) j] = Dtemp;

	//----> Swapping of D,C and A is done

	            j = j-1;
	        }
	    }
		
    	//print it sorted
	    for(int i = 0; i < 16; i++){
			System.out.print(" $" + productPricea[i] + "  " +productdescra[i] + "  Category:" + productCatea[i] +"  Quantity: "+productQuantitya[i]+ "\n");
		}
		System.out.println();
    }
	
	
	
	
	protected void intDataVerification(){
		 Scanner input = new Scanner(System.in);
	        double numberIntVerification;
	        boolean restart = false;
	        do{
	            restart = false;
	            try{
	            	System.out.println("Enter number 1: ");
	            	numberIntVerification = input.nextInt();
	            }catch(ArithmeticException e){
	                System.out.println("Error: division by zero");
	                input.nextLine();
	                restart = true;
	            }catch(InputMismatchException e){
	                System.out.println("Error: Non integer");
	                input.nextLine();
	                restart = true;
	            }
	      }
	        while(restart);
	       
	}
	
	protected void stringDataVerification(){
		 Scanner input = new Scanner(System.in);
	        String numberStrVerification;
	        boolean restart = false;
	        do{
	            restart = false;
	            try{
	            	System.out.println("Enter number 1: ");
	            	numberStrVerification = input.nextLine();
	            }catch(ArithmeticException e){
	                System.out.println("Error: division by zero");
	                input.nextLine();
	                restart = true;
	            }catch(InputMismatchException e){
	                System.out.println("Error: Non integer");
	                input.nextLine();
	                restart = true;
	            }
	      }
	        while(restart);
	       
	}

	

}

