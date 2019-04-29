import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String a;
        int c,i;
        int e[] = new int[26];
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        StringBuilder se = new StringBuilder(a);
        for(i=0;i<se.length();i++)
        {
           c= se.charAt(i);
           if(c>=65 &&  c<=91)
           {
               
               char d =(char) (se.charAt(i)+32);
               se.setCharAt(i,d);
           }
        }
        for(i=0;i<se.length();i++)
        {
            e[se.charAt(i)-97]++;
        }
        for(i=0;i<se.length();i++)
        {
             
            if(e[(se.charAt(i))-97]!=0)
            System.out.print(se.charAt(i)+""+e[(se.charAt(i))-97]+" ");
            e[se.charAt(i)-97]=0;
            
        }
        
    }
    
}