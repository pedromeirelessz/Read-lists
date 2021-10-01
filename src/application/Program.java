package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	/*
	 * However, you cannot add data to a wildcard type collection, because the
	 * compiler doesn't know the specific type from which the list was instantiated.
	 */
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}