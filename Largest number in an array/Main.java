import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int a,c=0,d,i;
      Scanner sc= new Scanner(System.in);
      a=sc.nextInt();
      int b[] = new int[a];
      for(i=0;i<a;i++)
      {
        b[i]=sc.nextInt();
      }
      c=b[0];
      for(i=0;i<a;i++)
      {
      if(c<b[i])
      {
        c=b[i];
      }
      
     
      }
      System.out.print(c);
    }
}