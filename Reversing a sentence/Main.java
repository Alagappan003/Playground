import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        String a,b="";
        int i;
        Scanner sc = new Scanner (System.in);
        a=sc.nextLine();
        String[] c=a.split(" ");
        for(i=c.length-1;i>=0;i--)
        {
          //  b=b+c[i];
             System.out.print(c[i]+" ");
        }
        
       
       
        
    }
}