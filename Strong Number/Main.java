import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int a,b=0,c=0,d,i,e=0,x,y,z;
      Scanner sc = new Scanner(System.in);
      a= sc.nextInt();
      b=a%10;
      c=(a/10)%10;
      d=a/100;
      x=b;
      y=c;
      z=d;
      for(i=1;i<x;i++)
      {
        b=b*i;
        
      }
      for(i=1;i<y;i++)
      {
        c=c*i;
      }
      for(i=1;i<z;i++)
      {
        d=d*i;
      }
      e=b+c+d;
      if(a==e)
      System.out.print("Yes");
     else
        System.out.print("No");
	}
}