import java.util.*;
//import required packages

class Faculty
{
  public void salary(int bsalary)
  {
    System.out.println("Base Salary:"+" "+ bsalary);
  }
}
class CSE
{
  public void salary(int bsalary)
  {
    System.out.println("CSE Faculty:"+" "+ (bsalary+3000));
  }
}
class IT
{
  public void salary(int bsalary)
  {
    System.out.println("IT Faculty:"+" "+ (bsalary+5000));
  }
}
class ECE
{
  public void salary(int bsalary)
  {
    
    System.out.println("ECE Faculty:"+" "+ (bsalary+4500));
  }
}

public class Main
{
  public static void main(String[] args)
  {
    
    //implement your required concept here
    Scanner sc = new Scanner(System.in);
    int bsalary= sc.nextInt();
    
    if(bsalary>0){
        
    
    
    Faculty obj = new Faculty();
    obj.salary(bsalary);
    
    CSE obj1 = new CSE();
    obj1.salary( bsalary);
    
    IT obj2 = new IT();
    obj2.salary( bsalary);
    
    ECE obj4 = new ECE();
    obj4.salary( bsalary);
    }
    else
    {
        System.out.print("null");
    }
  }
}