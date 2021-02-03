
package local.project2.fraction;
import java.util.Scanner;
/**
 *COSC 237
 * Austin Scott
 */
public class main {
    public static void main(String[] args){
	//variables
        int numer, denom;
	Fraction frac1 = null;
	Fraction frac2 = new Fraction(4,8);
        Scanner input = new Scanner(System.in);
	Boolean valid_input = false;
        //get the input and make sure no zero denominator
	while (!valid_input){
	try
	{
		System.out.print("Enter numerator <space> denominator:");
		numer = input.nextInt();
		denom = input.nextInt();
		frac1 = new Fraction(numer,denom);
		valid_input = true;
	}
	catch (ZeroDenominatorException e)
	{
		System.out.println("Denominator of Zero found – Please reenter");
	}
        }
        System.out.println(frac1.getNumerator());
        System.out.println(frac1.getDenominator());
        System.out.println(frac1.toString());
        System.out.println(frac1.equals(frac2));
        System.out.println(frac1.abs());
        System.out.println(frac1.add(frac2));
        System.out.println(frac1.subtract(frac2));
        System.out.println(frac1.multiply(frac2));
        System.out.println(frac1.divide(frac2));
        System.out.println(frac1.invert());
        System.out.println(frac1.toDecimal());
        System.out.println(frac1.reduce());
        System.out.println(frac1.lessThan(frac2));
        System.out.println(frac1.greaterThan(frac2));
        System.out.println(frac1.isReducedForm());
        System.out.println(frac1.isProperFrac());
        System.out.println(frac1.isUnitFrac());
    }
}
