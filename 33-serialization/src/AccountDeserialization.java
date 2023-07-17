import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public class AccountDeserialization {
public static void main(String[] args) {
	try {
		FileInputStream file = new FileInputStream("C:\\Users\\vedang.badawe\\Documents\\text.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Account account = (Account)in.readObject();
		in.close();
		file.close();
		System.out.println(account);
	}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	} 
	
}
}
