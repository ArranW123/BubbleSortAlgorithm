import java.util.Arrays;

public class BubbleSort {
	static boolean SortDone = false;
	static int IterationCounter = 0;
	public static void main(String[] args) {

		int[] numbers = {7,9,5,1,7,6,7,8};
		
		System.out.println("Original Sort: "+ Arrays.toString(numbers)); //Displays the original array
		checkingarray(numbers);
		System.out.println(IterationCounter +" Iteration: "+ Arrays.toString(numbers)); //Displays the iteration array
		checkingarray(numbers);
		System.out.println(IterationCounter +" Iteration: "+ Arrays.toString(numbers)); //Displays the iteration array
		checkingarray(numbers);
		System.out.println(IterationCounter +" Iteration: "+ Arrays.toString(numbers)); //Displays the iteration array


		//make a while loop doing these iterations, and check if the array has been fully sorted and display how many bubble sort iterations there were

	}
	
	public static void checkingarray(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
try {

			if(numbers[i] > numbers[i+1]) {
				
				int first = numbers[i];
				int second = numbers[i+1];
				
				numbers[i] = second;
				numbers[i+1] = first;
											
			}
						
	} catch(ArrayIndexOutOfBoundsException e) {
		IterationCounter++;
		break;

	}

}
		
}
	
}

