
package functions;
import java.util.*;
public class ConPEx {
	
        ConPEx(String PAN)
        {
        	System.out.println(PAN);
        }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your PAN number:");
		String pan=sc.next();
		ConPEx on= new ConPEx(pan);
	}

}