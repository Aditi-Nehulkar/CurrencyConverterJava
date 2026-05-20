package currency_convt;
import java.util.Scanner;

 class Begining
{
	public Begining()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter currency to convert from: ");
		String from = sc.next("[A-Z]{3}");
		
		currency_from(from);
		
	}
	
	//need to create instance of selector class to access its methods
	Selector select = new Selector();
	
	
	public void currency_from(String from)
	{
		switch(from)
		{
		case "INR" : select.INR();
		break;
		
		case "USD" : select.USD();
		break;
		
		case "JPY" : select.JPY();
		break;
		
		case "EUR" : select.EUR();
		break;
		
		default : System.out.println("invalid");
	    break;
		}
	}
	
      //public void INR() {}
		//you can create this method in same class as well
    	  //here you dont need to create insatnce of another class

}
 
class Selector 
{
	//need to create method to use scanner
	
	public void INR() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter currency to convert to: ");
		String to = sc.next("[A-Z]{3}");
		
		System.out.println("enter amount: ");
		double num = sc.nextDouble();
		
		switch(to)
		{
		
		case "USD" : double USD = num*0.012;
		System.out.println("INR to USD: " +USD);
		break;
		
		case "JPY" : double JPY = num*1.74;
		System.out.println("INR to JPY: " +JPY);
		break;
		
		case "EUR" : double EUR = num*0.011;
		System.out.println("INR to EUR: " +EUR);
		break;
		
		default : System.out.println("invalid");
	    break;
		}
		
	}
	
    public void USD() {
    	Scanner sc = new Scanner(System.in);
		System.out.println("enter currency to convert to: ");
		String to = sc.next("[A-Z]{3}");
		
		System.out.println("enter amount: ");
		double num = sc.nextDouble();
		
		switch(to)
		{
		
		case "INR" : double INR = num*83.33;
		System.out.println("USD to INR: " +INR);
		break;
		
		case "JPY" : double JPY = num*145.00;
		System.out.println("USD to JPY: " +JPY);
		break;
		
		case "EUR" : double EUR = num*0.92;
		System.out.println("USD to EUR: " +EUR);
		break;
		
		default : System.out.println("invalid");
	    break;
		}
	}
    
    public void JPY() {
    	Scanner sc = new Scanner(System.in);
		System.out.println("enter currency to convert to: ");
		String to = sc.next("[A-Z]{3}");
		
		System.out.println("enter amount: ");
		double num = sc.nextDouble();
		
		switch(to)
		{
		
		case "USD" : double USD = num*0.0069;
		System.out.println("JPY to USD: " +USD);
		break;
		
		case "INR" : double INR = num*0.57;
		System.out.println("JPY to INR: " +INR);
		break;
		
		case "EUR" : double EUR = num*0.0063;
		System.out.println("JPY to EUR: " +EUR);
		break;
		
		default : System.out.println("invalid");
	    break;
		}
	}
    
    public void EUR() {
    	Scanner sc = new Scanner(System.in);
		System.out.println("enter currency to convert to: ");
		String to = sc.next("[A-Z]{3}");
		
		System.out.println("enter amount: ");
		double num = sc.nextDouble();
		
		switch(to)
		{
		
		case "USD" : double USD = num*1.09;
		System.out.println("EUR to USD: " +USD);
		break;
		
		case "JPY" : double JPY = num*158.00;
		System.out.println("EUR to JPY: " +JPY);
		break;
		
		case "INR" : double INR = num*90.90;
		System.out.println("EUR to INR: "+INR);
		break;
		
		default : System.out.println("invalid");
	    break;
		}
	}
}

public class Currency {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter currency to convert from: ");
		//String from = sc.next("[A-Z]{3}");
		
		Begining Beg = new Begining();
		//Beg.currency_from(from);
		
		

	}

}
