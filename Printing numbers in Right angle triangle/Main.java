import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int a,b,i,j;
      Scanner sc =new Scanner(System.in);
      a=sc.nextInt();
      for(i=1;i<=a;i++)
      {
        for(j=1;j<=i;j++)
        {
          System.out.print(i);
        }
        System.out.print("\n");
        
      }
	}
}