import java.util.Arrays;
import java.util.Random;

import javax.lang.model.element.VariableElement;

public class quickSortMain {

	public static void main(String[] args) {
		sortN(10000, 5);
		sortN(10000,5,1);
		sortN(1000,5,10);
		sortN(100,5,100);
		 
		/*
		TestInteger[] somearray = semisortedTestInts(4,1);
		for (int i = 0;i<16;i++){
			System.out.println(somearray[i].toString());
		}
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void sortN(int n,int times) {
		System.out.println("*** Testing sorting arrays with " + n + " values, " + times + " times.***");
		long javaAverageCompares = 0;
		long quickSortAverageCompares = 0;
		for (int i = 0; i < times; i++){
			TestInteger[] testArray = randomTestIntArray(n);
			TestInteger[] testArray2 = testArray.clone();
			long javaTime = javaSort(testArray);
			long quickTime = testTime(testArray2);
			System.out.println("Java used " + javaTime + " compares.");
			System.out.println("Our quick sort used " + quickTime + " compares.");
			javaAverageCompares = javaTime + javaAverageCompares;
			quickSortAverageCompares = quickTime + quickSortAverageCompares;
		}
		javaAverageCompares = javaAverageCompares/times;
		quickSortAverageCompares = quickSortAverageCompares/times;
		System.out.println("On average, java took " + javaAverageCompares + " compares.");
		System.out.println("On average, our quick sort took " + quickSortAverageCompares + " compares.");
	}
	
	public static void sortN(int length,int times,int blocks) {
		System.out.println("*** Testing sorting arrays with " + length*blocks + " values, " + blocks + " blocks, " + times + " times.***");
		long javaAverageCompares = 0;
		long quickSortAverageCompares = 0;
		for (int i = 0; i < times; i++){
			TestInteger[] testArray = semisortedTestInts(blocks,length);
			TestInteger[] testArray2 = testArray.clone();
			long javaTime = javaSort(testArray);
			long quickTime = testTime(testArray2);
			System.out.println("Java used " + javaTime + " compares.");
			System.out.println("Our quick sort used " + quickTime + " compares.");
			javaAverageCompares = javaTime + javaAverageCompares;
			quickSortAverageCompares = quickTime + quickSortAverageCompares;
		}
		javaAverageCompares = javaAverageCompares/times;
		quickSortAverageCompares = quickSortAverageCompares/times;
		System.out.println("On average, java took " + javaAverageCompares + " compares.");
		System.out.println("On average, our quick sort took " + quickSortAverageCompares + " compares.");
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
	
	public static TestInteger[] randomTestIntArray(int arrayLength) {
		Random rand = new Random();
		TestInteger[] randomTestInts = new TestInteger[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			randomTestInts[i] = new TestInteger(rand.nextInt(1000000));
		}
		return randomTestInts;
	}
	
	public static TestInteger[] semisortedTestInts(int blocks, int length){
		TestInteger[] testintarray = new TestInteger[blocks*length];
		for (int i = 0;i<blocks;i++){
			TestInteger[] temparray = randomTestIntArray(length);
			javaSort(temparray);
			System.arraycopy(temparray,0,testintarray,length*i,length);
		}
		return testintarray;
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
