import java.util.*; 
class Knapsack{ 
 
    void greedyknap(int weight[],int profit[],int n,int c) {
 
        float p=0; 
        float x[]=new float[10]; 
        int i,u; 
        for(i=0;i<n;i++){ 

            x[i]=0; 
        } 
        u=c; 
        for(i=0;i<n;i++) {
 
            if(weight[i]>u) 
                break; 
            x[i]=1; 
            u=u-weight[i]; 
            } 
            if(i<n) 
                x[i]=(float)u/weight[i]; 
            System.out.println("Solution vector is:"); 
            for(i=0;i<n;i++) 
                System.out.println(x[i]); 
            for(i=0;i<n;i++) {

                p=p+(profit[i]*x[i]); 
            } 
            System.out.println("Maximum profit is: "+p); 
       } 
} 

class KnapsackDemo{ 

public static void main(String args[]) {

    int i,n,c,u,j; 
    int profit[]=new int[100]; 
    int weight[]=new int[100]; 
    float ratio[]=new float[100]; 
    System.out.println("Enter the number of items"); 
    Scanner sc=new Scanner(System.in); 
    n=sc.nextInt(); 
    System.out.println("Enter the profit of each item"); 
    for(i=0;i<n;i++) {
 
        profit[i]=sc.nextInt(); 
    } 
    System.out.println("Enter the weight of each item"); 
    for(i=0;i<n;i++) {
 
        weight[i]=sc.nextInt(); 
    } 
    System.out.println("Enter the capacity of knapsack"); 
    c=sc.nextInt(); 
    for(i=0;i<n;i++){ 
 
        ratio[i]=profit[i]/weight[i]; 
    } 
    for(i=0;i<n-1;i++) {
 
        for(j=0;j<n-i-1;j++){ 

            if(ratio[j]<=ratio[j+1]){ 
 
                float temp=ratio[j+1]; 
                ratio[j+1]=ratio[j]; 
                ratio[j]=temp; 
                int temp1=profit[j+1]; 
                profit[j+1]=profit[j]; 
                profit[j]=temp1; 
                int temp2=weight[j+1]; 
                weight[j+1]=weight[j]; 
                weight[j]=temp2; 
            } 
        } 
    } 
    Knapsack k=new Knapsack(); 
    k.greedyknap(weight,profit,n,c); 
    } 
}
