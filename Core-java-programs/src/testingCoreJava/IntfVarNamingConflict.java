package testingCoreJava;

public class IntfVarNamingConflict implements Left, Right {
	
	public static void main(String[] args) {
		System.out.println("value of x from Left: "+Left.x);		
		System.out.println("value of x from Right: "+Right.x);
	}
	
}


interface Left{
	int x= 10;
}

interface Right{
	int x = 20;
}

