import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int a,b,i,count=0;
      Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      for(i=1;i<=a;i++)
      {
        b=a%i;
        if(b==0)
        System.out.println(i);
      }
      
	}
}