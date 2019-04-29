import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   int a,c,d,e,i;
    Scanner sc = new Scanner (System.in);
    a=sc.nextInt();
    int b[]=new int[a];
    for(i=0;i<a;i++)
    {
      b[i] = sc.nextInt();
    }
    int index=0,nee=0;
    for(i=0;i<a;i++)
    {
      if(nee<b[i])
      {
        nee=b[i];
        index=i;
      }
    }
    System.out.println(index);
  }
}