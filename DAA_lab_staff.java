import java.util.Scanner;
class Staff
{
String StaffId,name;
long phno;
int salary;
Scanner S=new Scanner(System.in);
void read()
{
System.out.print("Enter the staff ID : ");
StaffId=S.next();
System.out.print("Enter the name : ");
name=S.next();
System.out.print("Enter the phone number : ");
phno=S.nextLong();
System.out.print("Enter the salary : ");
salary=S.nextInt();
}
void display()
{
System.out.print(StaffId+" "+name+" "+phno+" "+salary);
}
}
class Teaching extends Staff
{
String domain;
int publication;
void read()
{
super.read();
System.out.print("Enter the domain of employee : ");
domain=S.next();
System.out.print("Enter the publication : ");
publication=S.nextInt();
}
void display()
{
super.display();
 System.out.print(" "+domain+" "+publication+"\n");
}
}
class Technical extends Staff
{
String skills[];
void read()
{
super.read();
System.out.print("Enter the skills of employee : ");
skills=S.next().split(",");
}
void display()
{
super.display();
for(int i=0;i<skills.length;i++)
System.out.print(skills[i]+" ");
}
}
class Contract extends Staff
{
int period;
void read()
{
super.read();
System.out.print("Enter the period of contract : ");
period=S.nextInt();
}
void display()
{
super.display();
System.out.print(" "+period+"\n");
}
}
public class StaffDemo
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
System.out.print("Enter the value of n :");
int n=S.nextInt();
Teaching T[]=new Teaching[n];
Technical Te[]=new Technical[n];
Contract C[]=new Contract[n];
for(int i=0;i<n;i++)
T[i]=new Teaching();
for(int i=0;i<n;i++)
Te[i]=new Technical();
for(int i=0;i<n;i++)
C[i]=new Contract();
System.out.println("Enter the details of Teaching staff :");
for(int i=0;i<n;i++)
T[i].read();
System.out.println("Enter the details of Technical staff :");
for(int i=0;i<n;i++)
Te[i].read();
System.out.println("Enter the details of Contract class : ");
for(int i=0;i<n;i++)
C[i].read();
System.out.println();
System.out.println("Details of Teaching staff are :");
System.out.println(" STAFFID "+"NAME "+"PHNO. "+"SALARY "+"DOMAIN "+"PUBLICATIONS");
for(int i=0;i<n;i++)
T[i].display(); 
System.out.println();
System.out.println("Deatails of Technical Staff are :");
System.out.println("STAFFID "+"NAME "+"PHNO. "+"SALARY "+"SKILLS");
for(int i=0;i<n;i++)
Te[i].display();
System.out.println();
System.out.println("Details of Contract Staff are :");
System.out.println("STAFFID "+"NAME "+"PHNO. "+" SALARY "+"CONTRACT PERIOD ");
for(int i=0;i<n;i++)
C[i].display();
 }
}
