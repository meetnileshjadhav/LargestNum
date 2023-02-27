import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num 1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num 2");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("Num1 is greater");
		}
		else if(num1 < num2) {
			System.out.println("Num2 is greater");
		}
		else if(num1 == num2){
			System.out.println("Both numbers are equal");
		}
		else {
			System.out.println("Please enter valid numbers");
		}
		
	}
}