import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int a,b,c=0,d;
      Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      while(a!=0)
      {
        b=a%10;
        c=c+b;
        a=a/10;
      }
      System.out.println(c);
	}
}