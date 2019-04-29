import java.util.*;

class Item 
{
  private int price;
  
  public void setprice(int price)
  {
   this.price=price;
  }
  public int getprice()
  {
      return price;
  }
  
}
   
class Customer extends Item
{
    
  private String product;
  private int quantity;
  
  public void setproduct(String product)
  {
   this.product=product;   
  }
  
  public void setquantity(int quantity)
  {
   this.quantity=quantity;   
  }
  public String getproduct()
  {
      return product;
  }
   public int getquantity()
  {
      return quantity;
  }
}

class Bill extends Customer
{
  //implement your logic to calculate total price
  public int result(int p,int q)
  {
      int z=p*q;
      return z;
  }
}
public class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Scanner sc = new Scanner (System.in);
    String product=sc.next();
    int price = sc.nextInt();
    i.setprice(price);
    
    
    
    int quantity=sc.nextInt();
    c.setproduct(product);
    c.setquantity(quantity);
    
   
    int p=i.getprice();
    int q=c.getquantity();
    String y=c.getproduct();
     Bill obj = new Bill();
     int z=obj.result(p,q);
     //System.out.println(y);
     System.out.println("Total Price is :"+" "+z);
    
    //write the logic here
  }
}