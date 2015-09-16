  import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class quickSortTests {
	//#############quick sort#############
	@Test
	public void testEmpty() {
		String[] someStrings = {};
		String[] sorted = {};
		quickSort.quickSort(someStrings);
		assertArrayEquals(sorted, someStrings);
	}

	@Test
	public void testInts() {
		Integer[] someInts = { 3, 5, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		quickSort.quickSort(someInts);
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void testOneElement() {
		Integer[] someInts = { 3 };
		Integer[] sortedInts = { 3 };
		quickSort.quickSort(someInts);
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void testReverse() {
		Integer[] someInts = { 5, 3, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		quickSort.quickSort(someInts);
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void testAllSameValue() {
		Integer[] someInts = { 5, 5, 5, 5, 5 };
		Integer[] sortedInts = { 5, 5, 5, 5, 5 };
		quickSort.quickSort(someInts);
		assertArrayEquals(sortedInts, someInts);
	}
	//###################randomized quick sort###############
	
	
	@Test
	public void randTestEmpty() {
		String[] someStrings = {};
		String[] sorted = {};
		randomizedQuickSort.quickSort(someStrings);
		System.out.println("rtestEmpty");
		System.out.println(Arrays.toString(someStrings));
		assertArrayEquals(sorted, someStrings);
	}

	@Test
	public void randTestInts() {
		Integer[] someInts = { 3, 5, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		randomizedQuickSort.quickSort(someInts);
		System.out.println("rtestInts");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void randTestOneElement() {
		Integer[] someInts = { 3 };
		Integer[] sortedInts = { 3 };
		randomizedQuickSort.quickSort(someInts);
		System.out.println("rtestOneElement");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void randTestReverse() {
		Integer[] someInts = { 5, 3, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		randomizedQuickSort.quickSort(someInts);
		System.out.println("rtestReverse");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void randTestAllSameValue() {
		Integer[] someInts = { 5, 5, 5, 5, 5 };
		Integer[] sortedInts = { 5, 5, 5, 5, 5 };
		randomizedQuickSort.quickSort(someInts);
		System.out.println("rtestAllSameValue");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);}
	
	
	//###################threePivotQuickSort###############
	
	
	@Test
	public void threeTestEmpty() {
		String[] someStrings = {};
		String[] sorted = {};
		threePivotQuickSort.quickSort(someStrings);
		System.out.println("threetestEmpty");
		System.out.println(Arrays.toString(someStrings));
		assertArrayEquals(sorted, someStrings);
	}

	@Test
	public void threeTestInts() {
		Integer[] someInts = { 3, 5, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		threePivotQuickSort.quickSort(someInts);
		System.out.println("threetestInts");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void threeTestOneElement() {
		Integer[] someInts = { 3 };
		Integer[] sortedInts = { 3 };
		threePivotQuickSort.quickSort(someInts);
		System.out.println("threetestOneElement");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void threeTestReverse() {
		Integer[] someInts = { 5, 3, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		threePivotQuickSort.quickSort(someInts);
		System.out.println("threetestReverse");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void threeTestAllSameValue() {
		Integer[] someInts = { 5, 5, 5, 5, 5 };
		Integer[] sortedInts = { 5, 5, 5, 5, 5 };
		threePivotQuickSort.quickSort(someInts);
		System.out.println("threetestAllSameValue");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}
	//###################InsertionQuickSort###############
	
	
		@Test
		public void insertTestEmpty() {
			String[] someStrings = {};
			String[] sorted = {};
			insertionQuickSort.quickSort(someStrings);
			System.out.println("insertTestEmpty");
			System.out.println(Arrays.toString(someStrings));
			assertArrayEquals(sorted, someStrings);
		}

		@Test
		public void insertTestInts() {
			Integer[] someInts = { 3, 5, 1, 0, -4, -10 };
			Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
			insertionQuickSort.quickSort(someInts);
			System.out.println("insertTestInts");
			System.out.println(Arrays.toString(someInts));
			assertArrayEquals(sortedInts, someInts);
		}

		@Test
		public void insertTestOneElement() {
			Integer[] someInts = { 3 };
			Integer[] sortedInts = { 3 };
			insertionQuickSort.quickSort(someInts);
			System.out.println("insertTestOneElement");
			System.out.println(Arrays.toString(someInts));
			assertArrayEquals(sortedInts, someInts);
		}

		@Test
		public void insertTestReverse() {
			Integer[] someInts = { 5, 3, 1, 0, -4, -10 };
			Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
			insertionQuickSort.quickSort(someInts);
			System.out.println("insertTestReverse");
			System.out.println(Arrays.toString(someInts));
			assertArrayEquals(sortedInts, someInts);
		}

		@Test
		public void insertTestAllSameValue() {
			Integer[] someInts = { 5, 5, 5, 5, 5 };
			Integer[] sortedInts = { 5, 5, 5, 5, 5 };
			insertionQuickSort.quickSort(someInts);
			System.out.println("insertTestAllSameValue");
			System.out.println(Arrays.toString(someInts));
			assertArrayEquals(sortedInts, someInts);
		}

		@Test
		public void insertionTestReverse() {
			TestInteger first = new TestInteger(5);
			TestInteger second = new TestInteger(3);
			TestInteger third = new TestInteger(1);
			TestInteger fourth = new TestInteger(0);
			TestInteger fifth = new TestInteger(-4);
			TestInteger sixth = new TestInteger(-10);
			TestInteger[] someInts = new TestInteger[6];
			TestInteger[] sortedInts = new TestInteger[6];
			someInts[0] = first;
			someInts[1] = second;
			someInts[2] = third;
			someInts[3] = fourth;
			someInts[4] = fifth;
			someInts[5] = sixth;
			sortedInts[5] = first;
			sortedInts[4] = second;
			sortedInts[3] = third;
			sortedInts[2] = fourth;
			sortedInts[1] = fifth;
			sortedInts[0] = sixth;
			insertionQuickSort.insertionSort(someInts);
			System.out.println("insertionTestReverse");
			System.out.println(Arrays.toString(someInts));
			assertArrayEquals(sortedInts, someInts);
		}

		
}
