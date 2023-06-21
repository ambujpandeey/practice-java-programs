package com.designpattern;

public class SingletonEx2 {
	private static SingletonEx2 instancEx2 = new SingletonEx2();
	
	//Eager way of creating a Singleton
	public static SingletonEx2 getSingletonEx2() {
		
		return instancEx2;
	}

}
