package Calculator;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
      float a,b,s;
      int x;
      Scanner sc = new Scanner(System.in);
      while(true) {
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiply");
      System.out.println("4. Divide");
      System.out.println("5. Exit");
      x=sc.nextInt();
      switch(x) {
                 
      case 1 : System.out.println("Enter first number");
               a = sc.nextFloat();
               System.out.println("Enter second number");
               b = sc.nextFloat();
               s=a+b;
               System.out.println("Sum = "+s);
               break;
               
      case 2 : System.out.println("Enter first number");
               a = sc.nextFloat();
               System.out.println("Enter second number");
               b = sc.nextFloat();
               s=a-b;
               System.out.println("Difference = "+s);
               break;
      
      case 3 : System.out.println("Enter first number");
               a = sc.nextFloat();
               System.out.println("Enter second number");
               b = sc.nextFloat();
               s=a*b;
               System.out.println("Product = "+s);
               break;
      
      case 4 : System.out.println("Enter first number");
               a = sc.nextFloat();
               System.out.println("Enter second number");
               b = sc.nextFloat();
               s=a/b;
               System.out.println("Remainder = "+s);
               break;
               
      case 5 : System.out.println("*****Thank you*****");
               System.exit(0);
      }
      }
	}

}
