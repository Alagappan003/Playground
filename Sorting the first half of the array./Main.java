import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   int a,i,j,temp=0;
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    int b[]=new int[a];
     for(i=0;i<a;i++)
    {
      b[i]=sc.nextInt();
    }
    
    for(i=0;i<(a/2)-1;i++)
    {
      for(j=0;j<(a/2)-i-1;j++)
      {
        if(b[j]>b[j+1])
        {
          temp=b[j];
          b[j]=b[j+1];
          b[j+1]=temp;
        }
      }
    }
    for(i=0;i<a;i++)
    {
      System.out.print(b[i]+" ");
    }
  }
}