package thread;

public class ThreadgroupTest {
	public static void main(String[] args) {

		ThreadGroup group = new ThreadGroup("mythreadgrp");
		ThreadGroup cgroup = new ThreadGroup(group, "cgrp");

		Thread thread = new Thread(group, "test");
		cgroup.list();

		System.out.println(cgroup.activeCount());
		System.out.println(cgroup.getParent());

		A1 a1 = new A1(cgroup, "a1");
		a1.start();

		cgroup.list();

		System.out.println(cgroup.activeCount());
		System.out.println(cgroup.getParent());
		
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		 
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread t1: t) {
		System.out.println(t1.getName()+"-------"+t1.isDaemon());
		}

		

	}
}

class A1 extends Thread {

	A1(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {
		System.out.println("A class");
	}

}

class B1 extends Thread {
	public void run() {
		System.out.println("B class");
	}
}