
import java.util.*;
public class Fibino {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.print("enter 1st number:");
		int num1=sc.nextInt(); //0
		
		System.out.print("enter 2nd number:");
		int num2=sc.nextInt();//1
		*/
		int i=1,num1=0,num2=1;
		System.out.print("enter n:");
		int n=sc.nextInt();//count
		
		while(i<=n)
		{
			System.out.println(num1+"");
			
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			i++;
		}
		

	}

}