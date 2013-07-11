import java.util.Scanner; 
/**
 * A tester for the Complex class*/
public class testComplex
{
	public static void main(String[] args) 
	{	 
		//Create three Complex objects
		Complex c1 = new Complex(); 
		Complex c2 = new Complex();  
		Complex c3 = new Complex(); 
		
		//Assign values to c1 and c2
		System.out.println("Please enter two set of complex numbers: ");
		c1.inputComplex();
		c2.inputComplex();
		System.out.println("Your two set of complex numbers are" 
				+ "\n" +"c1: " + c1 + "and c2: " + c2 + "\n");
		
		System.out.println("What would you like to do with these two complex numbers?");
		System.out.println("Type in the number next to the operations");
		System.out.println("1. Add" + "\n" + "2. Subtract" + "\n" + "3. Multiply" + "\n" + "4. Divide"
				+ "\n" + "5. Convert to Polar Format" + "\n"+ "6. Set new Complex numbers" + "\n" + "7. Quit");
		
		Scanner in = new Scanner (System.in);
		int input = in.nextInt(); 
		//'repeat' will help the while-loop continue looping through depending on the user's input
		boolean repeat = false; 
		
		while (input != 7)
		{ 
			//Add c1 and c2
			if (input == 1)
			{
				c3 = c1.add(c2); 
				System.out.println("\n" + c3 + " = (" + c1 + ") + (" + c2 + ")");
				repeat = true; 
			}
			
			//Subtract c1 and c2 
			if (input == 2) 
			{	
				c3 = c3.sub(c1, c2); 
				System.out.println("\n" + c3 + " = (" + c1 + ") - (" + c2 + ")"); 
				repeat = true; 
			}
			
			//Multiply c1 and c2
			if (input == 3)
			{	
				c3 = c1.mul(c2); 
				System.out.println("\n" + c3 + " = (" + c1 + ") x (" + c2 + ")");
				repeat = true;
			}
			
			//Divide c1 and c2
			if (input == 4)
			{	
				c3 = c3.div(c1, c2); 
				System.out.println("\n" + c3 + " = (" + c1 + ") / (" + c2 + ")"); 
				repeat = true;
			}
			
			//Polar Format of c1 and c2
			if (input == 5) 
			{	
				String a = c1.polarFormat(c1);
				String b = c2.polarFormat(c2); 
				System.out.println("\n" + c1 + " is " + a);
				System.out.println(c2 + " is " + b); 
				repeat = true;
			}
			
			//Set new numbers for c1
			if (input == 6) 
			{
				System.out.println("What number would you like to change to c1(realPart) and c2(imaginaryPart)?"); 
				c1.setReal(in.nextDouble()); 
				c2.setImaginary(in.nextDouble());
				System.out.println("\n" + "realPart: " + c1.getReal() + "\n" + "imaginaryPart: " + c2.getImaginary());
				repeat = true;
			} 
			
			//Shows the menu of operation, and request user's input
			if (repeat == true)
			{
				System.out.println("\n"+"Type in the number next to the operations");
				System.out.println("1. Add" + "\n" + "2. Subtract" + "\n" + "3. Multiply" + "\n" + "4. Divide"
						+ "\n" + "5. Convert to Polar Format" + "\n"+ "6. Set new Complex numbers" + "\n" + "7. Quit");
				input = in.nextInt(); 
			}
		}
		System.out.println("Thanks for testing my code!");	    
	}

}
/* Runtime Output: 
 * Please enter two set of complex numbers: 
	1 2 
	3 4
	Your two set of complex numbers are
	c1: 1.0 +  i *(2.0)and c2: 3.0 +  i *(4.0)
	
	What would you like to do with these two complex numbers?
	Type in the number next to the operations
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	5. Convert to Polar Format
	6. Set new Complex numbers
	7. Quit
	1
	
	4.0 +  i *(6.0) = (1.0 +  i *(2.0)) + (3.0 +  i *(4.0))
	
	Type in the number next to the operations
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	5. Convert to Polar Format
	6. Set new Complex numbers
	7. Quit
	2
	
	2.0 +  i *(2.0) = (1.0 +  i *(2.0)) - (3.0 +  i *(4.0))
	
	Type in the number next to the operations
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	5. Convert to Polar Format
	6. Set new Complex numbers
	7. Quit
	3
	
	3.0 +  i *(8.0) = (1.0 +  i *(2.0)) x (3.0 +  i *(4.0))
	
	Type in the number next to the operations
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	5. Convert to Polar Format
	6. Set new Complex numbers
	7. Quit
	4

	0.44 +  i *(0.08) = (1.0 +  i *(2.0)) / (3.0 +  i *(4.0))
		
	Type in the number next to the operations
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	5. Convert to Polar Format
	6. Set new Complex numbers
	7. Quit
	5
	
	1.0 +  i *(2.0) is (2.23606797749979 e^ 1.1071487177940904)
	3.0 +  i *(4.0) is (5.0 e^ 0.9272952180016122)
	
	Type in the number next to the operations
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	5. Convert to Polar Format
	6. Set new Complex numbers
	7. Quit
	6
	What number would you like to change to c1(realPart) and c2(imaginaryPart)?
	20.3
	35.4
	
	realPart: 20.3
	imaginaryPart: 35.4
	
	Type in the number next to the operations
	1. Add
	2. Subtract
	3. Multiply
	4. Divide
	5. Convert to Polar Format
	6. Set new Complex numbers
	7. Quit
	7
	Thanks for testing my code!

*/
