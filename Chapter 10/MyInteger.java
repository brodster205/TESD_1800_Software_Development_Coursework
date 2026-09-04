class testMyInteger {
	public static void main(String[] args) {
		MyInteger value = new MyInteger(94);
		if (value.isEven() == true){
			System.out.println("Value is Even");
		}
		if (value.isPrime() == true){
			System.out.println("Value is Prime");
		}
		if (value.isOdd() == true){
			System.out.println("Value is Odd");
		}
		if (value.isEven(9) == true){
			System.out.println("Value is Even");
		}
		if (value.isPrime(9) == true){
			System.out.println("Value is Prime");
		}
		if (value.isOdd(9) == true){
			System.out.println("Value is Odd");
		}
		if (MyInteger.isEven(value) == true){
			System.out.println("Value is Even");
		}
		if (MyInteger.isPrime(value) == true){
			System.out.println("Value is Prime");
		}
		if (MyInteger.isOdd(value) == true){
			System.out.println("Value is Odd");
		}
		System.out.println(value.equals(26));
		System.out.println(value.equals(value));
		char[] array = {'1', '2', '3', '4', '5'};
		System.out.println("The Array is now: " + MyInteger.parseInt(array));
		String numString = ("12345");
		System.out.println("The String is now: " + MyInteger.parseInt(numString));
	}
}
class MyInteger {
	int value;
	MyInteger(int newValue){
		value = newValue;
	}
	int getValue(){
		return this.value;
	}
	public boolean isEven(){
		if (value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		if (value % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isPrime(){
		if (value <= 1){
			return false;
		}
		for (int n = 2; n * n <= value; n++){
			if (value % n == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int value){
		if (value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int value){
		if (value % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPrime(int value){
		if (value <= 1){
			return false;
		}
		for (int n = 2; n <= value / 2; n++){
			if (value % n == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger integer){
		if (integer.value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(MyInteger integer){
		if (integer.value % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPrime(MyInteger integer){
		if (integer.value <= 1){
			return false;
		}
		for (int n = 2; n <= integer.value / 2; n++){
			if (integer.value % n == 0){
				return false;
			}
		}
		return true;
	}
	public boolean equals(int number){
		if (number == value){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean equals(MyInteger num){
		if (num.value == value){
			return true;
		}
		else{
			return false;
		}
	}
	public static int parseInt(char[] numCharacter){
		int result = 0;
		for (int i = 0; i < numCharacter.length; i++){
			char currentCharacter = numCharacter[i];
			int numValue = currentCharacter - '0';
			result = (result * 10) + numValue;
		}
		return result;
	}
	public static int parseInt(String numString){
		int result = 0;
		for (int i = 0; i < numString.length(); i ++){
			char currentCharacter = numString.charAt(i);
			int numValue = currentCharacter - '0';
			result = (result * 10) + numValue;
		}
		return result;
	}
}


