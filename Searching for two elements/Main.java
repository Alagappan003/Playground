import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int a,c,d,i;
      Scanner sc= new Scanner(System.in);
      a=sc.nextInt();
      int b[] = new int[a];
      for(i=0;i<a;i++)
      {
        b[i]=sc.nextInt();
      }
      c=sc.nextInt();
      d=sc.nextInt();
      int count=0;
      for(i=0;i<a;i++)
      {
         count++;
      if(c==b[i])
      {
        System.out.println(count-1);
        break;
      }
      }
      if(count==a)
      {
         System.out.println("-1");
      }
    int sum=0;
       for(i=0;i<a;i++)
      {
         sum++;
      if(d==b[i])
      {
        System.out.println(sum-1);
        break;
      }
      }
      if(sum==a)
      {
         System.out.println("-1");
      }
    }
  
}