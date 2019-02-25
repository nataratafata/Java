/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bookstore;
//package bookstore;
import java.util.ArrayList;

/**
 *
 * @author Sherdon Brown
 */
public class Cart extends productInventory{
	//product description
	//protected String[] productD = new String[100];
	//protected String[] productD = new String[100];
	ArrayList<String> productD = new ArrayList<String>();
	ArrayList<String> productC = new ArrayList<String>();
	ArrayList<Integer> productQ = new ArrayList<Integer>();
	ArrayList<Integer> productP = new ArrayList<Integer>();
	//Product price 
	//protected int[] productP = new int[100];
	
	//Subtotal of all items in the cart
	protected int productSubTotal;
	
	//Total number of items in the cart
	protected int TotalCartItem;
	//count the subtotal
	protected int subT;


	//protected int productPrice;
	//protected int clientID;

	//protected int totalItems;
	//protected double totalPrice;
	//protected int i;

	//protected String[] item = new String[1000];


	//default constructor
	public Cart()
	{
		//clientID = 0;
		//totalItems = 0;
		//i = 0;
		for(int i = 0; i <= productD.size() - 1; i++)
		{
			//productD[i] = " ";
			productD.add(" ");
		}

		for(int i = 0; i <= productP.size() - 1; i++)
		{
			//productP[i] = 0;
			productP.add(0);
		}

		productSubTotal = 0;
		TotalCartItem = 0;
		subT = 0;
	}

	protected void setAddToCart(){
		printInvent();
		
	}
	protected void setDescription(String D){
		//product description
		
		/*for(int i = 0; i <= productD.size()- 1; i++)
		{
			do{
				productD.add(" ");
				continue;
			}while(productD.equals(" "));
		}*/
	}
	
	protected void setPrice(int P){
		//product price
		for(int i = 0; i <= productP.size() -1; i++)
		{
			do{
				productP.add(P);
				continue;
			}while(productP.equals(0));
		}
	}
	
	protected void setSubTotal(){
		//Subtotal of all items in the cart
		for(int i = 0; i <= productP.size()-1; i++)
		{
			TotalCartItem++;
			productSubTotal += subT;
		}
	}
	
	protected void PrintDescription(){
		System.out.println("product description");
		for(int i = 0; i <= productD.size() - 1; i++)
		{
			System.out.println(" " + productD.size());
		}
	}
	
	public void PrintNumberOfItems(){
		System.out.println("product Total");
		
		System.out.println(" " +TotalCartItem);
		
	}
	
	public int getTotalItem(){
		return TotalCartItem;
	}
	
	
	
	
}
