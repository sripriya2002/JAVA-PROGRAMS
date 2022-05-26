import java.util.Scanner;
public class Labp3a {
        public static void main(String[] args){
            int a,b;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter value for integer a");
            a=sc.nextInt();
            System.out.println("enter value of integer b");
            b=sc.nextInt();
            try{
                int c=a/b;
                System.out.println("result\n"+c);
            }catch(ArithmeticException e){
                System.out.println("Exception "+e);
            }
            
        }  
}
