import java.util.Scanner;
class Main { 
	public static void main(String[] args){
      int a,i,j,k=1,b;
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      a=in.nextInt();
      for(i=1;i<=a;i++)
      {
        for(j=1;j<=i;j++)
        {
          b=k%2;
          if(b==0)
         System.out.print("#");
          else
            System.out.print("*");
          k++;
          
      }
        System.out.print("\n");
        }
    }
}