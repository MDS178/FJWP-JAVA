import java.util.Scanner;
public class PrimeNumber{
    public static boolean isPrime(int num) {
        if(num<=1) {
            return false;
        }
         for(int i = 2; i<=Math.sqrt(num);i++){
             if (num % i==0) {
                 return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i=start;i<=end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
          }
      }
      }