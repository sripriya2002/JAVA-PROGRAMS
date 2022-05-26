import java.util.Scanner;
import java.util.Random;
class Mergesort{
    void Merge(int low,int high,int a[]){
        int mid;
        if(low<high){
            mid=(low+high)/2;
            Merge(low,mid,a);
            Merge(mid+1,high,a);
            merge(low,mid,high,a);
        }
    }
    void merge(int low,int mid,int high,int a[]){
        int h,k,j;
        int b[]=new int[10000];
        h=low;k=low;j=mid+1;
        while((h<mid+1) && (j<=high)){
            if(a[h]<a[j]){
                b[k]=a[h];
                h=h+1;
            }
            else{
                b[k]=a[j];
                j=j+1;
            }
            k=k+1;
        }
        if(j>high){
            for(int i=h;i<=mid;i++){
                b[k]=a[i];
                k=k+1;
            }
        
        }
        else{
            for(int i=j;i<=high;i++){
                b[k]=a[i];
                k=k+1;
            }
        
        }
        for(int i=low;i<=high;i++)
            a[i]=b[i];
    }
}
public class MergeSort{
    public static void main(String args[]){
        Mergesort M=new Mergesort();
        Scanner S=new Scanner(System.in);
        Random R=new Random();
        System.out.println("enter the value of n");
        int n=S.nextInt();
        int a[]=new int[10000];
        for(int i=0;i<n;i++)
            a[i]=R.nextInt(100);
        System.out.println("Before sorting:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"");
        int low=0;
        int high=n-1;
        long start=System.nanoTime();
        M.Merge(low,high,a);
        long end=System.nanoTime();
        System.out.println();
        System.out.println("after sorting:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"");
        System.out.println("\n"+"time taken to sort is"+(end-start)+"ns");
        }
}
