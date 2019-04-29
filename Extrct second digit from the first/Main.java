import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int a,b,c,d,e,f=0,g,i,z;
      Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
      b=a%10;
     // c=a/10000;
      while(a!=0)
      {
       i=a%10;
        f=f*10+i;
        a=a/10;
      }
      c=f%100;
      z=c/10;
      System.out.println(z);
    }
}
        
        
        
        