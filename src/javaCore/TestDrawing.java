package javaCore;

abstract class Shape{
	abstract void draw();
}

class Ractanglee extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Ractangle");
	}
}
class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Circle");	
	}
}


public class TestDrawing {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		s1.draw();
		
		Shape s2 = new Ractanglee();
		s2.draw();		
	}
}
