package testing_core_java;

class Temp2         // 1 st Parent class
{
	Temp2()
	{
		// calls constructor 2
		this(23);
		System.out.println("----------------------------------------");
		System.out.println("The Default constructor for Temp2");
		System.out.println("----------------------------------------");
	}

	// parameterized constructor 2
	Temp2(int x)
	{
		// calls constructor 3
		this(23, 100);
		System.out.println(x);
	}

	// parameterized constructor 3
	Temp2(int x, int y)
	{
		System.out.println(x * y);
	}
	
}


class Temp1 extends Temp2      // 2nd Parent class (Intermediate Parent)
{
	Temp1()
	{
		// calls constructor 2
		this(9);
		System.out.println("----------------------------------------");
		System.out.println("The Default constructor for Temp1");
		System.out.println("----------------------------------------");
	}

	// parameterized constructor 2
	Temp1(int x)
	{
		// calls constructor 3
		this(9, 10);
		System.out.println(x);
	}

	// parameterized constructor 3
	Temp1(int x, int y)
	{
		System.out.println(x * y);
	}

}


class Temp extends Temp1
{
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	Temp()
	{
		// calls constructor 2
		super(2,4);
		//this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	Temp(int x)
	{
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	Temp(int x, int y)
	{
		System.out.println(x * y);
	}

	public static void main(String args[])
	{
		// invokes default constructor first
		new Temp();
	}
}
