import java.util.Scanner;
import java.util.Random;
class Quick{
    void sort(int a[],int low,int high){
        int j;
        if(low<high){
            j=partition(a,low,high);
            sort(a,low,j-1);
            sort(a,j+1,high);
        }
    }
    int partition(int a[],int low,int high){
        int i,j,pivot,temp;
        pivot=a[low];
        i=low+1;
        j=high;
        for(;;){
            while((i<high)&&(pivot>=a[i])){
                i++;
            
            }
            while((pivot<a[j])&&(j>=low)){
                j--;

            }
            if(i<j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else{
                temp=a[low];
                a[low]=a[j];
                a[j]=temp;
                return j;
            }
        
        }
    }
}
public class Quicksort{
    public static void main(String args[]){
        Quick Q1=new Quick();
        Scanner Sb=new Scanner(System.in);
        Random Rb=new Random();
        int a[]=new int[10000];
        System.out.println("enter the value of n");
        int n= Sb.nextInt();
        for(int i=0;i<n;i++)
            a[i]=Rb.nextInt(1000);
        System.out.println("before sorting:");
        for(int i=0;i<n;i++)
            System.out.println(a[i]+" ");
        long startTime=System.currentTimeMillis();
            Q1.sort(a,0,n-1);
        long endTime=System.currentTimeMillis();
        long totalTime=endTime-startTime;
        System.out.println();
        System.out.println("after sorting");
        for(int i=0;i<n;i++)
            System.out.println(a[i]+" ");
        System.out.println();
        System.out.println("total time taken :"+(totalTime)+"ms");


    }
}
