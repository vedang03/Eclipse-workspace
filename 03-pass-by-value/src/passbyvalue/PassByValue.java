package passbyvalue;


public class PassByValue {
	
	private static int incrementNumberByTen(int number) {
		return number+=10;
	}



	public static void main(String[] args) {
		int number = 1;
		System.out.println(number);
		incrementNumberByTen(number);
		System.out.println(number);
		
		

	}
	

}
