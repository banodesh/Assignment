import java.util.Scanner;
class prog2
{
	public static void main(String args[])
	{
		char oerator;
		Double num1,num2,result;

		// create an object of Scanner class
		Scanner input = new Scanner9(System.in);

		// ask users to enter operator
		System.out.println("Choose an operator: +,-,*,/,%");
		operator = input.next().charAt(0);

		// ask user to enter No.
		System.out.println("enter first no.");
		num1 = input.nextDouble();
		System.out.println("enter second no.");
		num2 = input.nextDouble();
		
		switch (operator) {
		
		// perform addition between no.
		case '+':
		result=num1+num2 ;
		System.out.println("the addition is ="+result);
		break;
		
		
		// perform subtraction between no.
		case '-':
		result=num1-num2 ;
		System.out.println("the subtraction is ="+result);
		break;

		// perform subtraction between no.
		case '*':
		result=num1-num2 ;
		System.out.println("the multiplication is ="+result);
		break;

		// perform division between no.
		case '/':
		result=num1/num2 ;
		System.out.println("the subtraction is ="+result);
		break;

		// perform mode between no.
		case '%':
		result=num1%num2 ;
		System.out.println("the subtraction is ="+result);
		break;

		default:
		System.out.println("invalid operator");
		break;
		}
	input.close();
	}
}