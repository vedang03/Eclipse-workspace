import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AccountTest {
public static void main(String[] args) {
	Account account = new Account(1,"Vedang",20000);
	try {
		FileOutputStream file = new FileOutputStream("C:\\Users\\vedang.badawe\\Documents\\text.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(account);
		out.close();
		file.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("Serialization Successful");
}
}
