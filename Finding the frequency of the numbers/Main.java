import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int a,b,i,j,count;
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int c[]= new int[a];
        int d[]= new int[a];
        for(i=0;i<a;i++)
        {
            c[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            d[c[i]-1]++;
        }
        for(i=0;i<b;i++)
        {
            System.out.print(i+1+" "+d[i]);
            System.out.print("\n");
        }
    }
}