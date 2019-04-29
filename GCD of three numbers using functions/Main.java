import java.util.Scanner;
class Main{
  public static int ss(int x,int y){
  int gcd=0,i;
    for(i=1;i<=x && i<=y ; i++)
    {
       if(x%i==0 && y%i==0)
            gcd = i;
    }
    return gcd;
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