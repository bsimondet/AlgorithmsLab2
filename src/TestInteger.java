
public class TestInteger implements Comparable<TestInteger> {

	public static int javaCompares = 0;
	private int value;
	
	public TestInteger(int myint) {
		value = myint;
	}
	
	/*public int nextTestInt(){
		value++;
		return 
	}*/
	
	@Override
	public int compareTo(TestInteger other) {
		javaCompares++;
		return value - other.value;
	}

	public static TestInteger TestInteger(int nextInt) {
		// TODO Auto-generated method stub
		return new TestInteger(nextInt);
	}

	/*public static TestInteger(int nextInt) {
		// TODO Auto-generated method stub
		return TestInteger(nextInt);
	}*/
}