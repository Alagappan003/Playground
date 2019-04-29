import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        String a,b="";
        int i;
        Scanner sc = new Scanner (System.in);
        a=sc.nextLine();
        
        for(i=a.length()-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        if(a.equals(b))
        System.out.print("Yes");
        else
        System.out.print("No");
    }
}