package com.aurionpro.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationArray {
public static void main(String[] args) {
	try {
		FileInputStream file = new FileInputStream("C:\\Users\\vedang.badawe\\Documents\\text.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Account[] account = (Account[])in.readObject();
		in.close();
		file.close();
		for (int i = 0; i < account.length; i++) {
			System.out.println(account[i]);
		}
		
	}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	} 
	
}

}

