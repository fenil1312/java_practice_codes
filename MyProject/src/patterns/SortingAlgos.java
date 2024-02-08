package patterns;

public class SortingAlgos {

	static void bubbleSort(int[] arr) {

		System.out.println("\nUsing Bubble Sort...");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	static void selectionSort(int[] arr) {

		System.out.println("\nUsing Selection Sort...");
		for (int i = 0; i < arr.length; i++) {
			int small = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[small] > arr[j]) {
					small = j;
				}
			}
			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
	}

	static void insertionSort(int[] arr) {

		System.out.println("\nUsing Insertion Sort...");
		for (int i = 1; i < arr.length; i++) {
			int curr = i;
			int prev = i - 1;

			while (prev >= 0 && arr[prev] > arr[curr]) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = arr[curr];
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 5, 4, 1, 2, 6, 3 };
		System.out.println("Original Array...");
		printArray(arr);

		bubbleSort(arr);
		printArray(arr);

		selectionSort(arr);
		printArray(arr);
		
		insertionSort(arr);
		printArray(arr);
		
	}

}
