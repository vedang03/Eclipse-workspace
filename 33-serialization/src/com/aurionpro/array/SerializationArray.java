	package com.aurionpro.array;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationArray {

	public static void main(String[] args) {
		Account[] account = {
				new Account(1,"Vedang",20000),
				new Account(2,"Tanish",30000)
		};
		
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\vedang.badawe\\Documents\\text.bin");
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


