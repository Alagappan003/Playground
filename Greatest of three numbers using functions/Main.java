import java.util.Scanner;
class Main{
  public static int ss(int x,int y){
  if(x>y)
    return x;
    else
     return y;
  }
	public static void main (String[] args){
	    int a,b,c,d,k;
      Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
     c=sc.nextInt();
      k=ss(a,b);
      k=ss(k,c);
      System.out.print(k);
    
	}
}