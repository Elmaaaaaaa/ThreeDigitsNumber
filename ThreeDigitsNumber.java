/* Generate a three-digit number. Extract individual digitss of the number. 
 * Multiply all three digits and print the minimum multiplication result */
public class ThreeDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int) (100 + Math.random() * 900);
		System.out.println("Generated three-digit number is " + number + ".");
		int dig1, dig2, dig3;
		dig1 = (number / 100);
		dig2 = (number % 100) / 10;
		dig3 = (number % 100) % 10;
		System.out.println("Minimum multiplication result of digits " + dig1 + ", "
				+ dig2 + " and " + dig3 + " is: "
				+ (dig1 * dig2 * dig3));

	}

}
