import java.util.Arrays;
import java.util.Random;

import javax.lang.model.element.VariableElement;

public class quickSortMain {

	public static void main(String[] args) {
		System.out.println("***Testing Integer Arrays of 100,000 Integers***");
		Integer[] randomInts1 = randomIntArray(1000);
		TestInteger[] randomTestInts = randomTestIntArray(1000);
		long c = 0;
		long d = 0;
		long g = 0;
		long h = 0;
		long loops = 10;
		Integer[] intArray = new Integer[100000];
		TestInteger[] testIntArray = new TestInteger[100000];
		
		for (int i = 0; i < loops; i++){
			
			long a = javaSort(randomTestInts);
		//	long b = testTime(randomInts1);
			System.arraycopy(randomTestInts, 0, testIntArray,i * 1000,1000);
		//	long e = javaSort(randomTestInts);
		//	long f = testTime(randomInts1);
			
			//System.out.println("Java's merge sort took " + a + " comparisons.");
			//System.out.println("Our quick sort took " + b + " comparisons.");
			
			//c = a + c;
			//d = b + d;
			
			//System.out.println("Java's merge sort on a sorted array took " + e + " comparisons.");
			//System.out.println("Our quick sort on a sorted array took " + f + " comparisons.");
			
			//g = e + g;
			//h = f + h;
			
		}
		 
		System.out.println("java took " + javaSort(testIntArray));
		//System.out.println("Java completed " + c/loops + " comparisons on average." );
		//System.out.println("Our quick sort completed " + d/loops + " comparisons on average." );
		
		//System.out.println("Java completed " + g/loops + " comparisons on average on sorted arrays." );
		//System.out.println("Our quick sort completed " + h/loops + " comparisons on average on sorted arrays." );
		

	}

	private static <T extends Comparable<T>> long testTime(T[] arr ) {
		quickSort.comparisonCount = 0;
		quickSort.quickSort(arr);
		return quickSort.comparisonCount;
	}
	
	private static <T extends Comparable<T>> long javaSort(T[] arr ) {
		TestInteger.javaCompares = 0;
		Arrays.sort(arr);
		return TestInteger.javaCompares;
	}
	
	public static Integer[] randomIntArray(int arrayLength) {
		Random rand = new Random();
		Integer[] randomInts = new Integer[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			randomInts[i] = rand.nextInt(1000000);
		}
		return randomInts;
	}
	
	public static TestInteger[] randomTestIntArray(int arrayLength) {
		Random rand = new Random();
		TestInteger[] randomTestInts = new TestInteger[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			randomTestInts[i] = TestInteger.TestInteger(rand.nextInt(1000000));
		}
		return randomTestInts;
	}

}
