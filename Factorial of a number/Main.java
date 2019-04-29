import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int a,b,c=1,d,i;
      Scanner sc= new Scanner(System.in);
      a=sc.nextInt();
      for(i=1;i<=a;i++)
      {
        c=c*i;
      }
      System.out.println(c);
	}
}