package com.thread.other;

public class ThreadLocalDemo {
	
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get()); //null
		tl.set("Durga");
		System.out.println(tl.get()); //Durga
		tl.remove();
		System.out.println(tl.get()); //null
		}

	

}
