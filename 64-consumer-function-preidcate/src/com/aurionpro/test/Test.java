package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		Consumer<String>consumer = (name)->{
			System.out.println(name);
		};
		
		consumer.accept("Vedang");
		
		BiConsumer<String,Integer>consumer1 = (name,id)->{
			System.out.println(name+" "+id);
		};
		consumer1.accept("Vedang", 3);
		
		Function<String,Integer>funcobj = (name)->{
			return name.length();
		};
		System.out.println(funcobj.apply("Vedang"));
		
		BiFunction<Integer,Integer,Integer>funcobj2 = (num1 , num2)->{
			return num1+num2;
		};
		System.out.println(funcobj2.apply(2,3));
		
		Predicate<String>predobj = (word)->{
			return word.length()<=6;
		};
		System.out.println(predobj.test("Vedang"));
		
		BiPredicate<Integer,String>preobj2=(size,word)->{
			return word.length()<=size;
		};
		System.out.println(preobj2.test(4,"Vedang"));

	}

}
