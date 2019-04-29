import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int a,i,b,c;
      Scanner sc= new Scanner(System.in);
      a=sc.nextInt();
      for(i=1;i<=a;i++)
      {
   b=i%2;
      if ( b!=0)
        System.out.println(i);
        
      }
      
	}
}