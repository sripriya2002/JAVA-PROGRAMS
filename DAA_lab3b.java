import java.util.*;
class Second implements Runnable{
    public int x;
    String name;
    Second(int x,String name){
        this.x=x;
        this.name=name;
    }
    public void run(){
        System.out.println("Thread executing is:"+name);
        System.out.println("square of a number is "+x*x);

    }
}
class Third implements Runnable{
    public int x;
    String name;
    Third(int x,String name){
        this.x=x;
        this.name=name;
    }
    public void run(){
        System.out.println("Thread executing is:"+name);
        System.out.println("cube of a number is "+x*x*x);

    }
}
class First extends Thread{
    int n;
    String name;
    First(int n,String name){
        this.n=n;
        this.name=name;
    }
    public void run(){
        int num=0;
        Random R=new Random();
        try{
            for(int i=0;i<n;i++){
                num=R.nextInt(100);
                System.out.println("thread executing is:"+name);
                System.out.println("first thread generated number is:"+num);
                Thread.sleep(1000);
                Thread t2=new Thread(new Second(num,"second"));
                t2.start();
                System.out.println("");
                Thread t3=new Thread(new Third(num,"Third"));
                t3.start();
                System.out.println(" ");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}
public class labp3b{
    public static void main(String args[]){
        System.out.println("enter the value of n\n");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        First a=new First(n,"First");
        a.start();

    }
}
