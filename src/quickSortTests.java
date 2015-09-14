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
	public void rtestEmpty() {
		String[] someStrings = {};
		String[] sorted = {};
		randomizedQuickSort.quickSort(someStrings);
		System.out.println("rtestEmpty");
		System.out.println(Arrays.toString(someStrings));
		assertArrayEquals(sorted, someStrings);
	}

	@Test
	public void rtestInts() {
		Integer[] someInts = { 3, 5, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		randomizedQuickSort.quickSort(someInts);
		System.out.println("rtestInts");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void rtestOneElement() {
		Integer[] someInts = { 3 };
		Integer[] sortedInts = { 3 };
		randomizedQuickSort.quickSort(someInts);
		System.out.println("rtestOneElement");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void rtestReverse() {
		Integer[] someInts = { 5, 3, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		randomizedQuickSort.quickSort(someInts);
		System.out.println("rtestReverse");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void rtestAllSameValue() {
		Integer[] someInts = { 5, 5, 5, 5, 5 };
		Integer[] sortedInts = { 5, 5, 5, 5, 5 };
		randomizedQuickSort.quickSort(someInts);
		System.out.println("rtestAllSameValue");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);}
	
	
	//###################threePivotQuickSort###############
	
	
	@Test
	public void rttestEmpty() {
		String[] someStrings = {};
		String[] sorted = {};
		threePivotQuickSort.quickSort(someStrings);
		System.out.println("rtestEmpty");
		System.out.println(Arrays.toString(someStrings));
		assertArrayEquals(sorted, someStrings);
	}

	@Test
	public void rttestInts() {
		Integer[] someInts = { 3, 5, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		threePivotQuickSort.quickSort(someInts);
		System.out.println("rtestInts");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void rttestOneElement() {
		Integer[] someInts = { 3 };
		Integer[] sortedInts = { 3 };
		threePivotQuickSort.quickSort(someInts);
		System.out.println("rtestOneElement");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void rttestReverse() {
		Integer[] someInts = { 5, 3, 1, 0, -4, -10 };
		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
		threePivotQuickSort.quickSort(someInts);
		System.out.println("rtestReverse");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}

	@Test
	public void rttestAllSameValue() {
		Integer[] someInts = { 5, 5, 5, 5, 5 };
		Integer[] sortedInts = { 5, 5, 5, 5, 5 };
		threePivotQuickSort.quickSort(someInts);
		System.out.println("rtestAllSameValue");
		System.out.println(Arrays.toString(someInts));
		assertArrayEquals(sortedInts, someInts);
	}
}
