import java.util.Scanner;
class Main{
  public static int som ( int num){
    int i,sm=0;
    for(i=1;i<=num;i++)
    {
      sm=sm+i;
    }
    return sm;
  }
	public static void main (String[] args){
	    // Type your code here
      int a,b;
      Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      b=som(a);
      System.out.print(b);
	}
}