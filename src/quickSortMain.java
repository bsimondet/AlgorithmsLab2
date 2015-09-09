import java.util.Arrays;
import java.util.Random;

import javax.lang.model.element.VariableElement;

public class quickSortMain {

	public static void main(String[] args) {
		System.out.println("***Testing Integer Arrays of 100,000 Integers***");
		Integer[] randomInts1 = randomIntArray(10);
		TestInteger[] randomTestInts = randomTestIntArray(1000);
		long c = 0;
		long d = 0;
		long g = 0;
		long h = 0;
		long loops = 5;
		Integer[] intArray = new Integer[100000];
		TestInteger[] testIntArray = new TestInteger[100000];
		TestInteger[] kindaRandomTestInts = kindofRandomTestInts();
		Integer[] kindaRandomInts = kindofRandomInts();
		
		for (int i = 0; i < loops; i++){
			
			long a = javaSort(kindaRandomTestInts);
			long b = testTime(randomInts1);
		//	long e = javaSort(randomTestInts);
			//long f = testTime(randomInts1);
			
			System.out.println("Java's merge sort on 10 sequences of 1000 took " + a + " comparisons.");
			System.out.println("Our quick sort on 10 sequences of 1000 took " + b + " comparisons.");
			
			c = a + c;
			d = b + d;
			
			//System.out.println("Java's merge sort on a sorted array took " + e + " comparisons.");
			//System.out.println("Our quick sort on a sorted array took " + f + " comparisons.");
			
			//g = e + g;
			//h = f + h;
			
		}
		 
		System.out.println("Java completed " + c/loops + " comparisons on average." );
		System.out.println("Our quick sort completed " + d/loops + " comparisons on average." );
		
		//System.out.println("Java completed " + g/loops + " comparisons on average on sorted arrays." );
		//System.out.println("Our quick sort completed " + h/loops + " comparisons on average on sorted arrays." );
		
		
		System.out.println(isSorted(randomInts1));

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
	
	public static TestInteger[] kindofRandomTestInts(){
		TestInteger[] randomTestInts = new TestInteger[10000];
		int k = 0;
		
		for (int l = 0; l < 10; l++){
			
			for (int j = 0; j < 1000; j++){
				randomTestInts[j+k] = TestInteger.TestInteger(j+k);
			}
			k+=1000;
		}
		return randomTestInts;
	}
	
	public static Integer[] kindofRandomInts(){
		Integer[] randomTestInts = new Integer[10000];
		int k = 0;
		
		for (int l = 0; l < 100; l++){
			
			for (int j = 0; j < 100; j++){
				randomTestInts[j+k] = j+k;
			}
			k+=100;
		}
		return randomTestInts;
	}
	
	public static boolean isSorted(Integer[] arr){
		int i = 0;
		boolean isSorted = true;
		while (arr[i+1]<arr.length){
			if (arr[i] > arr[i+1]){
				isSorted = false;
			}
		}
		return isSorted;
	}
	
}
