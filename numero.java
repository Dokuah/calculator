import java.util.Scanner;

import java.lang.*;

public class numero{
	public static void Add(int num1, int num2){
		int result = num1 + num2;
		System.out.println("The sum is " + result);
	}

	public static void Subtract(int num1, int num2){
		int result = num1 - num2;
		System.out.println("The subtraction is " + result);
	}

	public static void Divide(int num1, int num2){
		float result = num1 / num2;
		System.out.println("The division is " + result);
	}

	public static void Multiply(int num1, int num2){
		int result = num1 * num2;
		System.out.println("The product is " + result);
	}

	public static void SquareRoot(int num1){
		double result = Math.sqrt(num1);
		System.out.println("The SquareRoot is " + result);
	}

	public static void Power(int num1, int num2){
		double result = Math.pow(num1, num2);
		System.out.println("The  is " + result);
	}

	public static void Mod(int num1, int num2){
		float result = num1 % num2;
		System.out.println("The mod is " + result);
	}

	public static void main(String[] args) {
		int option;
		Scanner in = new Scanner(System.in);

		System.out.println("Choose an option");
		System.out.println("................");
		System.out.println("1- Add");
		System.out.println("2- Subtract");
		System.out.println("3- Divide");
		System.out.println("4- Multiply");
		System.out.println("5- SquareRoot");
		System.out.println("6- Power");
		System.out.println("7- Mod");
		option = Integer.parseInt(in.nextLine());

		if (option==1){
			int f1,f2;

		System.out.println("Enter first number");
		f1 = Integer.parseInt(in.nextLine());

		System.out.println("Enter second number");
		f2 = Integer.parseInt(in.nextLine());
		Add(f1,f2);
	}

		else if (option==2){
			int f1,f2;
			System.out.println("Enter first number");
		f1 = Integer.parseInt(in.nextLine());

		System.out.println("Enter second number");
		f2 = Integer.parseInt(in.nextLine());
		Subtract(f1,f2);
	}

		else if (option==3){
			int f1,f2;
			System.out.println("Enter first number");
		f1 = Integer.parseInt(in.nextLine());

		System.out.println("Enter second number");
		f2 = Integer.parseInt(in.nextLine());
		Divide(f1,f2);
	}

		else if (option==4){
			int f1,f2;
			System.out.println("Enter first number");
		f1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Enter second number");
		f2 = Integer.parseInt(in.nextLine());
		Multiply(f1,f2);
	}


		else if (option==5){
			int f1;
			System.out.println("number");
		f1 = Integer.parseInt(in.nextLine());
		SquareRoot(f1);		
	}

		else if (option==6){
			int f1,f2;
			System.out.println("Enter base");
		f1 = Integer.parseInt(in.nextLine());

		System.out.println("Enter exponent");
		f2 = Integer.parseInt(in.nextLine());
		Power(f1,f2);
	}

		else {
			int f1,f2;
			System.out.println("Enter first number");
		f1 = Integer.parseInt(in.nextLine());
			
			System.out.println("Enter second number");
		f2 = Integer.parseInt(in.nextLine());
		Mod(f1,f2);

		}

		}

	}

		
		
		