package ch15;

// This is an example of inner class (local class)

// There are two inner classes in this example, DataStructure and EvenIterator.
// DataStructure is inside the class of InnerClassExample1; and 
// EvenIterator is inside the class of DataStructure, so it is an inner inner class.
// Both inner classes are declared inside of a block (but outside of methods),
// so they are all local classes.

// |--InnerClassExample1
// |----DataStructureIterator (an inner interface for EvenIterator, must be outside of DataStructure)
// |
// |----DataStructure   (inner class)
// |------constructor()
// |------printEven()   (an EvenIterator object is instantiated)
// |
// |------EvenIterator  (inner inner class implemented DataStructureIterator interface)
// |--------hasNext()
// |--------next()
// |
// |----main()

public class InnerClassExample1 {

	// inner interface of Iterator for DataStructure class
	// cannot declare interface inside a block, must outside method, constructor.
	interface DataStructureIterator extends java.util.Iterator<Integer> {
	};

	public class DataStructure {

		// Create an array
		private final static int SIZE = 15;
		private int[] arrayOfInts = new int[SIZE];

		public DataStructure() {
			// fill the array with ascending integer values
			for (int i = 0; i < SIZE; i++) {
				arrayOfInts[i] = i;
			}
		}

		public void printEven() {

			// Print out values of even indices of the array
			DataStructureIterator iterator = this.new EvenIterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
			System.out.println();
		}

		// Inner class implements the DataStructureIterator interface,
		// which extends the Iterator<Integer> interface

		private class EvenIterator implements DataStructureIterator {

			// Start stepping through the array from the beginning
			private int nextIndex = 0;

			public boolean hasNext() {

				// Check if the current element is the last in the array
				return (nextIndex <= SIZE - 1);
			}

			public Integer next() {

				// Record a value of an even index of the array
				Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

				// Get the next even element
				nextIndex += 2;
				return retValue;
			}
		}

	}

	public static void main(String s[]) {

		// Fill the array with integer values and print out only
		// values of even indices

		InnerClassExample1 ice = new InnerClassExample1();

		// cannot directly instantiate ds, since DataStructure is a inner class
		DataStructure ds = ice.new DataStructure();
		ds.printEven();
	}

}
