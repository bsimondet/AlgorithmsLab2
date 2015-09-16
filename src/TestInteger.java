
public class TestInteger implements Comparable<TestInteger> {

	public static long javaCompares = 0;
	private int value;
	
	public TestInteger(int myint) {
		value = myint;
	}
	
	public String toString(){
		return Integer.toString(value);
	}
	
	public int toInt(){
		return value;
	}
	
	@Override
	public int compareTo(TestInteger other) {
		javaCompares++;
		return value - other.value;
	}
}
