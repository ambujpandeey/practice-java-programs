package aa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CountStringFromArrays {

	public static void main(String[] args) {

		String[] array = { "Ambuj", "Shanat", "Ambuj", "Shanat" };

		List<String> asList = Arrays.asList(array);

		int frequency = Collections.frequency(asList, "Shanat");
		System.out.println("Frequency : " + frequency);

		System.out.println("----------------------------");

		int count = count(asList, "Ambuj");
		System.out.println("Through Custom Count : " + count);
	}

	static int count(Collection<?> coll, Object obj) {
		int result = 0;
		if (obj == null) {
			for (Object e : coll)
				if (e == null) 
					result++;
		} else {
			for (Object e : coll)
				if (e.equals(obj)) 
					result++;
		}
		return result;
	}

}
