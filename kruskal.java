import java.util.Scanner;
class Kruskal
{
	int parent[]=new int[10];
	int a=0,b=0,u=0;
	int v=0,ne=1,min=0,mincost=0;
	void kru(int mat[][],int n)
	{
		for(int i=1;i<=n;i++)
			 parent[i]=0;
		while(ne<n)
		{
			min=999;
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(mat[i][j]<min&&i!=j)
					{
						min=mat[i][j];
						u=i;
						v=j;
					}
			a=find(u);
			b=find(v);
			if(union(a,b))
			{
				System.out.println("Edge:("+u+","+v+")"+"="+min);
				mincost=mincost+min;
				ne++;
			}
			mat[u][v]=mat[v][u]=999;
		}
		System.out.println("The cost of minimum spanning tree ="+mincost);
	}

    int find(int i)
    {
    	int j=i;
    	while(parent[j]>0)
    		j=parent[j];
    	return j;
    }

    boolean union(int m,int n)
    {
    	if(m!=n)
    	{
    		parent[n]=m;
    		return true;
    	}
     return false;
    }
}

public class KruskalDemo 
{
 public static void main(String args[])
 {
	 int a[][]=new int[10][10],n,i,j;
	 Kruskal k=new Kruskal();
	 Scanner S=new Scanner(System.in);
	 System.out.print("Enter the number of vertices :");
	 n=S.nextInt();
	 System.out.println("Enter the cost adjacency matrix : ");
	 for(i=1;i<=n;i++)
		 for(j=1;j<=n;j++)
			 a[i][j]=S.nextInt();
	 k.kru(a, n);
 }
}
