/* Karen Tran   
 * CECS277, Section 3  
 * Lab 1
 * January 31, 2013
 */

//Importing the scanner object for inputComplex() 
import java.util.Scanner;
/**
 * Complex class can add, subtract, multiply, divide, and convert complex numbers to polar form.
 * */
public class Complex 
{
 /** @param The real number of the complex object */
 private double realPart; 
 /** @param The imaginary number of the complex object */
 private double imaginaryPart; 
 
 /** Default no-Argument constructor. This initializes with default values*/
 public Complex()
 {
	realPart = 5; 
	imaginaryPart = 5; 
 }; 
 
 /** Two argument constructor, where it initializes realPart and imaginaryPart*/
 public Complex(double realPart, double imaginaryPart)
 {
	 realPart = realPart; 
	 imaginaryPart = imaginaryPart; 
 };
 
 //Accessors 
 /** Returns the real part*/
 public double getReal()
 {
	 return realPart; 
 };
 
 /** Returns the imaginary part*/
 public double getImaginary()
 {
	 return imaginaryPart; 
 };
 
 //Modifiers
 /** Sets the real part to value */
 public void setReal(double value)
 {
	 realPart = value; 
 };
 /** Sets the denominator to value */ 
 public void setImaginary (double value)
 {
	 imaginaryPart = value; 
 };
 
 /** Inputs the real and the imaginary parts from the keyboard*/
 public void inputComplex()
 { 
	 Scanner in = new Scanner (System.in); 
	 realPart = in.nextDouble(); 
	 imaginaryPart = in.nextDouble(); 
 };
 
 /** Returns a string in the form "realPart + i*imaginaryPart" */
 public String toString()
 {
	 //When using toString(), it only converts objects to string, not primitive types.
	 //Two ways of converting. "" + variableName or DataType.toString(variableName)
	 return realPart + " + " + " i *(" + imaginaryPart + ")"; 
 };
 
 /**  Adds two Complex numbers*/
 public Complex add (Complex a)
 {
	 Complex result = new Complex();   
	 result.realPart = a.realPart + getReal();
	 result.imaginaryPart = a.imaginaryPart + getImaginary(); 
	 return result; 
 };
 
 /** Subtracts two Complex numbers */
 public Complex sub(Complex c1, Complex c2)
 {
	 Complex result = new Complex();
	 result.realPart = Math.abs(c1.realPart - c2.realPart);
	 result.imaginaryPart = Math.abs(c1.imaginaryPart - c2.imaginaryPart); 
	 return result; 
 };
 
 /**  Multiplies two Complex numbers */
 public Complex mul(Complex a)
 {
	 Complex result = new Complex();
	 result.realPart = a.realPart*realPart - (a.imaginaryPart*imaginaryPart); 
	 result.imaginaryPart = (a.imaginaryPart*realPart)+ (a.realPart*imaginaryPart); 
	 return result; 
 };
 
 /**  Divides two Complex numbers */ 
 public Complex div (Complex c1, Complex c2)
 {
	 Complex result = new Complex(); 
	 result.realPart = (((c1.realPart)*(c2.realPart)) + ((c1.imaginaryPart)*(c2.imaginaryPart))) / 
			 		(((c2.realPart)*(c2.realPart)) + ((c2.imaginaryPart)*(c2.imaginaryPart))); 
	 result.imaginaryPart = ((c1.imaginaryPart*c2.realPart) - (c1.realPart*c2.imaginaryPart)) /
			 		((c2.realPart*c2.realPart) + (c2.imaginaryPart*c2.imaginaryPart));
	 return result; 
 };
 
 /** Converts the complex number into a polar format */
 public String polarFormat (Complex a)
 {
	 double r; 
	 double theta;
	 r = Math.sqrt((a.realPart)*(a.realPart) + (a.imaginaryPart)*(a.imaginaryPart));
	 theta = Math.atan(a.imaginaryPart / a.realPart); 
	 String result = "(" + r + " e^ " + theta + ")"; 
	 return result;
 };

};