package InstanceStaticBlock;

public class ConsVsInst {

	static int Count = 0;
	{
		Count++;
	}

	ConsVsInst() {

	}

	ConsVsInst(int i) {

	}

	ConsVsInst(double d) {

	}

	public static void main(String[] args) {
		ConsVsInst ci = new ConsVsInst();
		ConsVsInst ci2 = new ConsVsInst(22);
		ConsVsInst ci3 = new ConsVsInst(44.66);

		System.out.println("The number of object created : " + Count);
	}
}
