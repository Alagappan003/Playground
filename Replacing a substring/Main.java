import java.util.Scanner;
 public class Main{
public static void main(String args[])
{
   
        String a,b,c;
        Scanner sc = new Scanner (System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        c=sc.nextLine();
       // StringBuilder se = new StringBuilder(a);
        //StringBuilder see = new StringBuilder(b);
       //StringBuilder  seee = new StringBuilder(c);
      
     String d[]=a.split(" ");
     int i;
       for(i=0;i<d.length;i++)
       {
           if(d[i].equals(b))
           {
               d[i]=c;
           }
       }
       for(i=0;i<d.length;i++)
       {
           System.out.print(d[i]+" ");
       }
        
    }
}