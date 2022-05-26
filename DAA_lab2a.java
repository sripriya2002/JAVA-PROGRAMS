import java.util.Scanner;
class Staff{
		protected int id,salary;
		protected String name;
	    protected long phone;
	  Scanner sc=new Scanner(System.in);
	  void read()
	  {
		  
		  System.out.println("Enter the staff Id");
		  id=sc.nextInt();
		  System.out.println("Enter the staff name");
		  name=sc.next();
		  System.out.println("Enter the phone number");
		  phone=sc.nextLong();
		  System.out.println("Enter the staff salary");
		  salary=sc.nextInt();
	 }
	  void display()
	  {
		  System.out.print(id+"\t"+name+"\t"+phone+"\t"+salary);
	  }
	  
}
class Teaching extends Staff
{
	private String domain;
	private int publication;
	void readTeaching()
	{
		 super.read();
		 System.out.println("Enter the domain");
		 domain=sc.next();
		 System.out.println("Enter the number of publications");
		 publication=sc.nextInt();
	}	 
	void displayTeaching()
	{
		 super.display();
		 System.out.println("\t"+domain+"\t"+publication);
	}
}
class Technical extends Staff
{
	private String skill;
	void readTechnical()
	{
		 super.read();
		 System.out.println("Enter the skill");
		 skill=sc.next();
	}
	void displayTechnical()
	{
		 super.display();
		 System.out.println("\t"+skill);
	}
}
class Contract extends Staff
{
	  private  int period;
	 void readContract()
	 {
		 super.read();
		 System.out.println("Enter the period");
		 period=sc.nextInt();
	 }
	 void displayContract()
	 {
		 super.display();
		 System.out.println("\t"+period);
	 }
	
}
public class Lab2a {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of staff details to be created");
		n=sc.nextInt();
		Teaching T[]=new Teaching[n];
		Technical TE[]=new Technical[n];
		Contract C[]=new Contract[n];
		System.out.println("Enter the "+n+" "+"teaching staff details");
		for(i=0;i<n;i++)
		{
			T[i]=new Teaching();
			System.out.println("Enter the "+(i+1)+" "+"teaching staff details");
			T[i].readTeaching();
		}
		System.out.println("Enter the "+n+" "+"technical staff details");
		for(i=0;i<n;i++)
		{
			TE[i]=new Technical();
			System.out.println("Enter the "+(i+1)+" "+"technical staff details");
			TE[i].readTechnical();
		}
		System.out.println("Enter the "+n+" "+"contact staff details");
		for(i=0;i<n;i++)
		{
			C[i]=new Contract();
			System.out.println("Enter the "+(i+1)+" "+"contact staff details");
			C[i].readContract();
		}
		System.out.println("*******Teaching staff details********");
		System.out.println("StaffId\tName\tPhone\t\tSalary\tDomain\tpublication");
		for(i=0;i<n;i++)
			T[i].displayTeaching();
		System.out.println("*******Technical staff details********");
		System.out.println("StaffId\tName\tPhone\t\tSalary\tskills");
		for(i=0;i<n;i++)
			TE[i].displayTechnical();
		System.out.println("*******contract staff details********");
		System.out.println("StaffId\tName\tPhone\t\tSalary\tperiod");
		for(i=0;i<n;i++)
		 	C[i].displayContract();
	}

}
