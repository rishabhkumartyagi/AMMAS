package amrita;
import java.util.Vector;

public class suggList {
	
	private static Vector<suggestion> Slist;
	private static int suggCount;
	
	public void  Add(String suggString,int rno)
	{
		
		suggestion s=new suggestion(suggString, suggCount+1, rno+10);
		Slist.addElement(s);
		++suggCount;
				
	}
	
	public void displaySuggest()
	{
		if(suggCount==0)
		{
			System.out.println("SuggestionBox is empty!!!");
		}
		else
		{
			for(int i=0;i<suggCount;i++)
			{
				System.out.println((i+1)+") "+Slist.elementAt(i).getSuggest());
			}
		}
	}
	
	public void dispSingleSugg(int srno)
	{
		for(int i=0;i<suggCount;i++)
		{
			if(Slist.elementAt(i).getSrno()==srno)
			{
				System.out.println(srno+") "+Slist.elementAt(i).getSuggest());
				return;
			}
		}
		System.out.println("The given serial number does not exsit!!!");
	}
	
	public void delete(int srno,int rno)
	{
		for(int i=0;i<suggCount;i++)
		{
			if(Slist.elementAt(i).getSrno()==srno)
			{
				if(rno==0||rno==Slist.elementAt(i).getKey())
				{
					Slist.remove(i);
					System.out.println("Deletion Successful");
				}
				else
					System.out.println("Sorry you don't have permission!!!");
			}
			else
			{
				System.out.println("The serial no is not present!!!");
			}
		}
	}
	
}
