package passbyvalue;

public class IncrementByOne {

	public static void main(String[] args) {
		int number = 10;
		number = incrementNumbersByOne(number);
		System.out.println(number);
		
		

	}
	
	private static int incrementNumbersByOne(int number) {
		number+=1;
		return number;
	}

}
