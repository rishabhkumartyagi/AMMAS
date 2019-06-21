package amrita;
import java.util.Scanner;


public class test {
	
	
	private static int guestCount;
	
	public void statistics(String foodItem)
	{
		menu m=new menu();
		studentList l=new studentList();
		
		double tempCost =(30/7)*menu.getFoodList().elementAt(m.search(foodItem)).getCostPerServe()*menu.getFoodList().elementAt(m.search(foodItem)).getDay().length*l.getStuCount();
		System.out.println("Average cost per month is : "+tempCost);
		
	}

	public void stuUI()
	{
		studentList s=new studentList();
		int index=s.search(key);
		System.out.println("Hi !!!");
		System.out.println("how are you "+s.getStuList().elementAt(index).getName());
		System.out.println("Please enter your choice form the given menu : ");
		System.out.println("");
	}
	
	public void genUI()
	{
		Scanner inp=new Scanner(System.in);
		
		System.out.println("###########################################################################");
		System.out.println("###########################################################################");
		System.out.println("##     ***         ||     ||        ||     ||        ***        @ @ @    ##");
		System.out.println("##    ** **       ||||  || ||      ||||  || ||      ** **      @         ##");
		System.out.println("##   **   **     ||   ||    ||    ||   ||    ||    **   **      @ @      ##");
		System.out.println("##  ** ** ***   ||           ||  ||           ||  ** ** ***        @     ##");
		System.out.println("## **       ** ||             ||||             ||**       **  @ @ @      ##");
		System.out.println("###########################################################################");
		System.out.println("###########################################################################");
		
		System.out.println("Hi dear user welcome to AMRITA MESS MANAGEMENT SYSTEM (AMMAs)!!!");
		System.out.println("Please choose from the following : ");
		System.out.println("1) Student\n2) Manager 3) Guest");
		int choice=inp.nextInt();
		
		switch(choice)
		{
			case 1:stuUI();
			break;
			case 2:managUI();
			break;
			case 3:genUI();
			break;
		}
		
		inp.close();
	}
	
	public void managUI()
	{
		System.out.println("Hi !!!");
		System.out.println("how are );
		System.out.println("Please enter your choice form the given menu : ");
		System.out.println("");
	}
	
	public void guestUI()
	{
		++guestCount;
		System.out.println("Hi !!!");
		System.out.println("You are our "+guestCount+" guest");
		System.out.println("Please enter your choice form the given menu : ");
		System.out.println("");
		
	}

}
