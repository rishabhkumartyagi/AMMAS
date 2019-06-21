package amrita;

import java.util.Scanner;
import java.util.Vector;

public class menu 
{
	Scanner inp=new Scanner(System.in);
	
	private static Vector<food> foodList;
	private static int menuCount;
	
	
	
	public void addFood()
	{
		System.out.println("Enter the name of food Item :");
		String tempName=inp.nextLine();
		System.out.println("Enter the type of food :");
		String tempType=inp.nextLine();
		System.out.println("Enter the cost per serve :");
		double tempCost=inp.nextDouble();
		System.out.println("Enter the category of the food :");
		String tempCategory=inp.nextLine();
		System.out.println("Enter the number of days it will be served :");
		int n=inp.nextInt();
		while(!(n>=1 && n<=7))
		{
			System.out.println("The no of days can only be a positive number from 1 to 7 please check your input!!!:");
			n=inp.nextInt();
		}
		if(n>=1 && n<=7)
		{
		int[] day=new int[7];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the corresponding to the week day it will be served :");
			day[i]=inp.nextInt();
		}
		
		food foodItem=new food(tempName,tempCategory,day,tempType,tempCost);
		foodList.addElement(foodItem);
		++menuCount;
		}
		
	}
	
	
	public void displayCount()
	{
		System.out.println("There are "+menuCount+" food Items present in the menu :");
	}
	
	
	public void displayMenu()
	{
		for(int i=0;i<menuCount;i++)
		{
			System.out.println((i+1)+") "+foodList.elementAt(i));
		}
	}
	
	
	public void displayFoodItem(String name)
	{
		for(int i=0;i<menuCount;i++)
		{
			if(foodList.elementAt(i).getName().compareTo(name)==0)
			{
				System.out.println("Details of the food Item :");
				System.out.println("Name : "+foodList.elementAt(i).getName());
				System.out.println("Category : "+foodList.elementAt(i).getCategory());
				System.out.println("Day : "+foodList.elementAt(i).getDay());
				System.out.println("Type : "+foodList.elementAt(i).getType());
				System.out.println("Cost per serve : "+foodList.elementAt(i).getCostPerServe());
			}
		}
	}
	
	public static int search(String foodItem)
	{int flag=-1;
		for(int i=0;i<menuCount;i++)
		{
			if(foodList.elementAt(i).getName().compareTo(foodItem)==0)
			{
				flag=i;
			}
		}
			return flag;
	}


	public static Vector<food> getFoodList() {
		return foodList;
	}


	public static void setFoodList(Vector<food> foodList) {
		menu.foodList = foodList;
	}


	public static int getMenuCount() {
		return menuCount;
	}


	public static void setMenuCount(int menuCount) {
		menu.menuCount = menuCount;
	}
	
	
}
