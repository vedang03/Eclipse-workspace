package passbyvalue;


public class PassByValue {
	
	private static void incrementNumberByTen(int number) {
		number+=10;
	}



	public static void main(String[] args) {
		int number = 1;
		System.out.println(number);
		incrementNumberByTen(number);
		System.out.println(number);
		
		

	}
	

}
