package construtcs;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

      String isGraduated;
      System.out.println("Are you a Graduate ? Yes/No");
      isGraduated=sc.next();
      if(isGraduated.equals("Yes"))
      {
    	  System.out.println("You are Eligible");
      }
     

	}

}