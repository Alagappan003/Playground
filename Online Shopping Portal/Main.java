class Users {
		     
}

class Customers extends Users{
    
    int customerid;
    String name;
    long mobilenumber;
    String shippingaddress;
    String dob;
    String gender;
    float feedbackrating;
     public void display()
    {
        System.out.println(name+", "+mobilenumber);
    }
    
   
    public void editaddress()
    {
        System.out.println(name+", "+shippingaddress);
        System.out.println(name+", Coimbatore");
    }
    
    public void placeorder(){
        System.out.println("Order placed successfully!");
    }
			
}

class Suppliers extends Users {
    
    int supplierid;
    String name;
    long mobilenumber;
    String billingaddress;
    int itemstock;
    String paymentstatus;
    String orderhistory;
    
    
    public void display()
    {
        System.out.println(name+", "+mobilenumber);
    }
    
     public void editaddress()
    {
        System.out.println(name+", "+billingaddress);
        System.out.println(name+", Delhi");
    }
    
    public void increaseStockLevel()
    {
        System.out.println(name+", "+(itemstock+5));
        
    }
    
    public void increaseStockLevel1()
    {
        System.out.println(name+", "+(itemstock+10));
    }
		
}
public class Main {
	public static void main(String[] args) {
	    Customers obj1= new Customers();
	    obj1.customerid=1001;
	    obj1.name="Saakshi";
        obj1.mobilenumber=9000000000L;
        obj1.shippingaddress="Bangalore";
        obj1.dob="16-Jul-1990";
        obj1.gender="F";
        obj1.feedbackrating=4.75F;
        
        
        Customers obj2= new Customers();
        obj2.customerid=1008;
	    obj2.name="Rahul";
        obj2.mobilenumber=9000000001L;
        obj2.shippingaddress="Chennai";
        obj2.dob="27-Jan-1992";
        obj2.gender="M";
        obj2.feedbackrating=4.35F;
        
        Suppliers obj3= new Suppliers();
        
        obj3.supplierid=7901;
        obj3.name="ABC Traders";
        obj3.mobilenumber=8000000000L;
        obj3.billingaddress="Mumbai";
        obj3.itemstock=10;
        obj3.paymentstatus="Paid";
        obj3.orderhistory="Lakme Kajal, Salwar";
        
        
        Suppliers obj4= new Suppliers();
        obj4.supplierid=7972;
        obj4.name="XYZ Enterprises";
        obj4.mobilenumber=8000000900L;
        obj4.billingaddress="Kolkata";
        obj4.itemstock=7;
        obj4.paymentstatus="Unpaid";
        obj4.orderhistory="T-Shirt, Jeans";
        
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
        
        obj1.editaddress();
        obj3.editaddress();
        
        obj1.placeorder();
        
        obj3.increaseStockLevel();
        obj4.increaseStockLevel1();
	    
		
    }	
}