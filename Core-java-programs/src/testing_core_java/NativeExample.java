package testing_core_java;

public class NativeExample {

	public static void main(String[] args) {
		Native native1 = new Native();
		native1.m1(); // call or implement native method

	}
}

class Native{
	
	static {
		System.loadLibrary("Native Library"); // load native library
	}
	
	public native void m1(); // declear native method (compulsaty ends with semicolon)
}
