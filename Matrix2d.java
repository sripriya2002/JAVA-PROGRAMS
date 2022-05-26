import java.util.Scanner;
class Matrix2d {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int m,n;
        
        System.out.println("enter the number of rows and columns");
        m=s.nextInt();
        n=s.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("the array is ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the triangle elements are ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
                if(i==j)
                    break;
               
                
            }
            System.out.println();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(i>j)
                        System.out.print(a[i][j]+" ");
                
                    
                }
                System.out.println();
            }
        }
    }
}
