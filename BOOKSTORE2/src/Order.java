/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bookstore;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sherdon Brown
 */
    public class Order extends Cart{
    //order confirmation number
    protected int confirmationNum;
    //List of products in the order with the order description
   // protected String[] productOrder = new String[100];
   // protected String[] productDescription = new String[100];
    ArrayList<String> productOrder = new ArrayList<String>();
    ArrayList<String> productDescription = new ArrayList<String>();
    //total of all items in the cart
    protected int TotalItem;
    //Total Number of items ordered
    protected int itemOrdered;
   // protected String[] item = new String[1000];
    Cart car= new Cart();
    
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    ArrayList<Integer> array3 = new ArrayList<Integer>();
    ArrayList<Integer> array4 = new ArrayList<Integer>();
    
    //default constructor
    public Order()
    {
    	confirmationNum = 0;
    	for(int i = 0; i <= productOrder.size() - 1; i++)
		{
			productOrder.add(" ");
		}
    	TotalItem = 0;
    	itemOrdered = 0;
    }
    
    protected void setConformationNum(int confirmN){
    	confirmationNum = confirmN;
    }
    
    protected void setProductOrder(){
    	for(int i = 0; i <= productOrder.size() - 1; i++)
		{
			productOrder.add(" ");
		}
    	//ord.PrintNumberOfItems();
    	//ord.PrintDescription();
    }
    
    protected void setTotalOfItem(){
    	car.PrintNumberOfItems();
    	//ord.get
    	//car.PrintDescription();
    }
    
    protected void setTotalItem(){
    	TotalItem = car.getTotalItem();
    }
    
  /*  protected void printSortName(){
    	Collections.sort(productOrder);
    	for(String counter: productOrder){
    		System.out.println(counter);
    	}
    }*/
    
}