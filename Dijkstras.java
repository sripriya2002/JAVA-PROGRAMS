import java.util.Scanner;
class Dijkstra{

	void shortest(int n,int src,int cost[][]){
	
		int i,j,u=0,min;
		int s[]=new int[10];
		int d[]=new int[10];
		for(i=1;i<=n;i++){
		
			s[i]=0;
			d[i]=cost[src][i];
		}
		s[src]=1;
		for(i=1;i<=n;i++){
		
			min=999;
			for(j=1;j<=n;j++){
			
				if(s[j]==0)
				   if(d[j]<min){
				   
					   min=d[j];
					   u=j;
				   }
			
		    }
			s[u]=1;
			for(int m=1;m<=n;m++){
			
				if(s[m]==1||s[m]==0){
				
					if(d[m]>(d[u]+cost[u][m]))
						d[m]=d[u]+cost[u][m];
				}
			}
	    }
		System.out.println("Shortest path");
		for(int k=1;k<=n;k++)
			System.out.print(src+"-->"+k+"="+d[k]+"\n");
      }
}
public class DijkstraDemo {

public static void main(String args[]){
 
	Scanner S=new Scanner(System.in);
	Dijkstra d=new Dijkstra();
	int i,j,n,src;
	int a[][]=new int[10][10];
	System.out.print("Enter the number of vertice : ");
	n=S.nextInt();
System.out.print("Enter the cost adjacency matrix\n(Enter 999 if there is no edge)\n ");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
			a[i][j]=S.nextInt();
	}
	System.out.print("Enter the source vertex : ");
	src=S.nextInt();
	d.shortest(n,src,a);
	
 }
}
