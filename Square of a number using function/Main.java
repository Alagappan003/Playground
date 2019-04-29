import java.util.Scanner;
class Main
{
  public static int sop(int num){
    num=num*num;
    return num;
  }
	public static void main (String[] args)
    {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
       a=sc.nextInt();
       b=sop(a);
      System.out.print(b);
	   
	} 
}