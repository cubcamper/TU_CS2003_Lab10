package lab10;


public class Lab10 {
	
	public static void main(String[] args) {
		
		//Goal: Find largest palindromic number that is made from the product
		//		of two 4-digit numbers
		
		//example: The largest palindromic number that is made from the product
		//		   of two 2-digit numbers is 9009
		//		   91 * 99 = 9009
		
		//isaPalindrome("s");
		
		System.out.println(9743);
		
		int[] nums = {9009, 333, 242, 953};
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(printPlaces(nums[i]));
		}
		
	}
	
	/*
	static boolean isPalindromicNumber(int n) {
		int thousands = n/10;
		int hundreds = n/100;
		int tens = n/1000;
	}
	*/
	
	static boolean printPlaces(int n) {
		int ones, tens, hundreds, thousands;
		
		
		
		thousands = (n - (n%10)) / 1000;
		hundreds = ( (n-(n%100)) - (thousands*1000) ) /100   ;
		tens = ( (n - (thousands*1000) - (hundreds*100) ) /10 );
		ones = n%10;
		
		System.out.println("Ones: " + ones);
		System.out.println("Tens: " + tens);
		System.out.println("Hundreds: " + hundreds);
		System.out.println("Thousands: " + thousands);
		
		boolean isPalindrome = false;
		
		if (thousands == ones) {
			if (hundreds == tens) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
		
		
	}
	
	/*
	9743
	thousands = 9 = (9000) / 1000
	hundreds = 7 = (9700 - 9000 ) /10
	tens = 4 = (9740 - 9700) / 10
	ones = 3 = (9743 - 9740)
	*/
	
	
	
}