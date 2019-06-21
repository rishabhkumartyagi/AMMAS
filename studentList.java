package amrita;
import java.util.Vector;

public class studentList {
	
	private static Vector<student> stuList;
	
	private static int stuCount;
	
	public void  Add(String name, String department, String degree, String year, int rno)
	{
		
		student s=new student(name,department,degree,year,rno);
		stuList.addElement(s);
		++stuCount;
				
	}
	
	public void displayStudent(int rno)
	{
		if(stuCount==0)
		{
			System.out.println("Student Directory is empty!!!");
		}
		else
		{
			for(int i=0;i<stuCount;i++)
			{
				System.out.println((i+1)+") ");
				stuList.elementAt(i).display();
			}
		}
	}
	
	public void dispSingleStu(int rno)
	{
		for(int i=0;i<stuCount;i++)
		{
			if(stuList.elementAt(i).getRno()==rno)
			{
				System.out.println(rno+") ");
				stuList.elementAt(i).display();
				return;
			}
		}
		System.out.println("The given serial number does not exsit!!!");
	}
	
	public void delete(int rno,int key)
	{
		for(int i=0;i<stuCount;i++)
		{
			if(stuList.elementAt(i).getRno()==rno)
			{
				if(key==0)
				{
					stuList.remove(i);
					System.out.println("Deletion Successful");
				}
				else
					System.out.println("Sorry you don't have permission!!!");
			}
			else
			{
				System.out.println("The Roll no is not present!!!");
			}
		}
	}

	public static Vector<student> getStuList() {
		return stuList;
	}

	public static void setStuList(Vector<student> stuList) {
		studentList.stuList = stuList;
	}

	public static int getStuCount() {
		return stuCount;
	}

	public static void setStuCount(int stuCount) {
		studentList.stuCount = stuCount;
	}
	
	
	public int search(int rno)
	{int flag=-1;
		for(int i=0;i<stuCount;i++)
		{
			if(stuList.elementAt(i).getRno()==rno)
			{
				flag=i;
			}
		}
			return flag;
	}


}
