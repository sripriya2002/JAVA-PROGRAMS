import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n;
        int flag=0;
        System.out.println("enter the number");
        n=s.nextInt();
        if(n==0 || n==1 || n==2){
            System.out.println("number is a prime");
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
               flag=1;
               break;
            }
            else{
                flag=0;
            }
        }
        if(flag==0){
            System.out.println("number is a prime");
        }
        else{
            System.out.println("number is not a prime");
        }
    }
}
