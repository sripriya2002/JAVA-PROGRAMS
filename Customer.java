import java.util.*;
public class Customer {
        String name,dob;
        void read(){
            System.out.println("enter the customer name");
            Scanner sc=new Scanner(System.in);
            name=sc.next();
            System.out.println("enter date of birth as dd/mm/yyyy");
            dob=sc.next();
            System.out.println("customer data read");
            System.out.println("<"+name+","+dob+">");

        }
        void display(){
            StringTokenizer st=new StringTokenizer(dob);
            System.out.println("customer details\n");
            System.out.println("<"+name);
            while(st.hasMoreTokens()){
                System.out.print(",");
                system.out.print(st.nextToken("/"));

            }
            System.out.print(">");

        }
        public static void main(String args[]){
            Customer c=new Customer();
            c.read();
            c.display();
        }
}
