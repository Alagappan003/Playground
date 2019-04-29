import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        String  a;
        int c=0,k=0;
        int b[]= new int[26];
        Scanner sc = new Scanner(System.in);
        a= sc.nextLine();
        StringBuilder se = new StringBuilder(a);
        int i;
        for(i=0;i<se.length();i++)
        {
           c= se.charAt(i);
           if(c>=65 && c<=91)
           {
            char d = (char) ((se.charAt(i))+32);
            se.setCharAt(i,d);
           }
        }
         for(i=0;i<se.length();i++)
        {
           c= se.charAt(i);
           if(c>='a' && c<='z')
           {
               k=se.charAt(i);
            b[k-97]++;
           }
        }
           
       
        
        for(i=0;i<26;i++)
        {
            if(b[i]==0)
            {
        char ch=    (char)    (i+97);
             System.out.print((char)ch+" ");
            }
        }

       
        
    }
}
