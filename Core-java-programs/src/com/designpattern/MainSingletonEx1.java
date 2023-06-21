package com.designpattern;

public class MainSingletonEx1 {
	
	public static void main(String[] args) {
//		new SingletonEx1();// The constructor SingletonEx1() is not visible
		
		// Lazy Way
		SingletonEx1 instance = SingletonEx1.instance();
		System.out.println(instance.hashCode());
		
		SingletonEx1 instance2 = SingletonEx1.instance();
		System.out.println(instance2.hashCode());
		
		//Eager Way
		SingletonEx2 singletonEx2 = SingletonEx2.getSingletonEx2();
		System.out.println(singletonEx2.hashCode());

		SingletonEx2 singletonEx3 = SingletonEx2.getSingletonEx2();
		System.out.println(singletonEx3.hashCode());
		
		
		// LAZY WAY IS BEST TO CREARE A OBJECT
	}
}
