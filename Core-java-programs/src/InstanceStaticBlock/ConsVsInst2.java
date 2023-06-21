package InstanceStaticBlock;

public class ConsVsInst2 {

	static int Count = 0;
	{
		Count++;
	}

	ConsVsInst2() {
		// Count++;
	}

	ConsVsInst2(int i) {
		// Count++;
	}

	ConsVsInst2(double d) {
		// Count++;
	}

	public static void main(String[] args) {
		ConsVsInst2 ci = new ConsVsInst2();
		ConsVsInst2 ci2 = new ConsVsInst2(22);
		ConsVsInst2 ci3 = new ConsVsInst2(44.66);
		ConsVsInst2 ci4 = new ConsVsInst2(400);
		ConsVsInst2 ci5 = new ConsVsInst2();

		System.out.println("The number of object created : " + Count);
	}
}
