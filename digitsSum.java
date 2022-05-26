import java.util.Scanner;
class Digitsum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num,temp,digit;
        int sum=0;
        int sum1=0;
        System.out.println("enter the number");
        num=s.nextInt();
        temp=num;
        while(temp!=0){
            digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        
        if(sum>=10){
            num=sum;
            while(num!=0){
                digit=num%10;
                sum1+=digit;
                num/=10;
            }
        }
        if(sum>=10){
            System.out.println("sum is "+sum1);
        }
        else{
            System.out.println("sum is "+sum);
        }
    }
}
