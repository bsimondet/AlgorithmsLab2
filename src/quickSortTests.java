//  import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class quickSortTests {
//
//	@Test
//	public void testEmpty() {
//		String[] someStrings = {};
//		String[] sorted = {};
//		quickSort.quickSort(someStrings);
//		assertArrayEquals(sorted, someStrings);
//	}
//
//	@Test
//	public void testInts() {
//		Integer[] someInts = { 3, 5, 1, 0, -4, -10 };
//		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
//		quickSort.quickSort(someInts);
//		assertArrayEquals(sortedInts, someInts);
//	}
//
//	@Test
//	public void testOneElement() {
//		Integer[] someInts = { 3 };
//		Integer[] sortedInts = { 3 };
//		quickSort.quickSort(someInts);
//		assertArrayEquals(sortedInts, someInts);
//	}
//
//	@Test
//	public void testReverse() {
//		Integer[] someInts = { 5, 3, 1, 0, -4, -10 };
//		Integer[] sortedInts = { -10, -4, 0, 1, 3, 5 };
//		quickSort.quickSort(someInts);
//		assertArrayEquals(sortedInts, someInts);
//	}
//
//	@Test
//	public void testAllSameValue() {
//		Integer[] someInts = { 5, 5, 5, 5, 5 };
//		Integer[] sortedInts = { 5, 5, 5, 5, 5 };
//		quickSort.quickSort(someInts);
//		assertArrayEquals(sortedInts, someInts);
//	}
//}
