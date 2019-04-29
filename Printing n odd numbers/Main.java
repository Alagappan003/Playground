import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int i ,a,count=0,b;
      Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      for(i=1;i<=100;i++)
      {
        b=i%2;
        if(b!=0)
        {
          System.out.println(i);
          count++;
        }
        if(count==a)
        {
          break;
        }
      }
	}
  
}