package java_assignment;
import java.util.Scanner;
public class Q1 {

	double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
	public static void main(String arg[])	
	{
	    double a;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature");
                   a=sc.nextDouble();
	    Q1 fah=new Q1( );
	    double result=fah.celsius(a);	
	    System.out.println("Celsius temperature is = "+result);		  	  	     
	} 	


}
