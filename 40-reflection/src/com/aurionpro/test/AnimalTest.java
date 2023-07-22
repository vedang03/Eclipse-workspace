package com.aurionpro.test;
import com.aurionpro.model.*;
import java.lang.Class;
import java.lang.reflect.*;
import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
		try {

			Dog d1 = new Dog();

			Class obj = d1.getClass();

			String name = obj.getSimpleName();
			System.out.println("ClassName: " + name);

			int modifier = obj.getModifiers();

			String mod = Modifier.toString(modifier);
			System.out.println("Modifier: " + mod);

			Class superClass = obj.getSuperclass();
			System.out.println("Superclass: " + superClass.getSimpleName());

			Method[] methods = obj.getDeclaredMethods();
			for (Method m : methods) {
				System.out.println("Method: " + m.getName());
				System.out.println("Return type of method: " + m.getReturnType());
				int mod1 = m.getModifiers();
				System.out.println("Modifier of method: " + Modifier.toString(mod1));

			}
			Constructor[] constructors = obj.getDeclaredConstructors();
			for (Constructor c : constructors) {
				System.out.println(c.getName());
				System.out.println(c.getParameters());

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
