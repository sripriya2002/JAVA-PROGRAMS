import java.util.Scanner;
class Student{
    String usn;
    String name;
    String program;
    long phone;
void read()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("enter the USN");
        usn=S.next();
        S.nextLine();
        System.out.println("enter the name");
        name=S.nextLine();
        System.out.println("enter the programme");
        program=S.next();
        System.out.println("enter the phone number");
        phone=S.nextLong();
        System.out.println();
       
    }
    void display()
    {
        System.out.println("USN"+usn);
        System.out.println("NAME"+name);
        System.out.println("program"+program);
        System.out.println("phone number:"+phone);
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the number of students\n");
        n=s.nextInt();
        Student[] sc=new Student[n];
        for(int i=0;i<n;i++)
        {
            sc[i]=new Student();
            sc[i].read();
        }
        System.out.println("student details");
        for(int i=0;i<n;i++)
        {
            sc[i].display();
        }
       
    }
   }
