
public class TestInteger implements Comparable<TestInteger> {

	public static int javaCompares = 0;
	private int value;
	
	
	
	@Override
	public int compareTo(TestInteger other) {
		javaCompares++;
		return value - other.value;
	}

}
