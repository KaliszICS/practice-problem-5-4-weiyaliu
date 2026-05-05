public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void stringSwap (String[ ] arr, int a, int b) {

		String temp;

		temp = arr[a];
		arr[a] =arr[b];
		arr[b] = temp;

	}

	public static void reverse(int[ ] arr) {

		int temp;
		int index;

		for (int i = 0; i < arr.length; i++) {

			index = arr.length - 1 - i;

			if (i<index) {
				
				temp= arr[i];
				arr[i] = arr[index];
				arr[index ] = temp;
				
			}
		}
	}

	public static String[] toWordArray (String str) {
			
		String[] arr;
		arr = str.split(" ");
			
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) {
					count++;
			}
		}

		String[] arr2 = new String[count];

		int  index = 0;

		for(int i= 0; i< arr.length; i++) {
			if(!arr[i].equals("")) {
				arr2[index] = arr[i];
				index++;
			}
		}

		return arr;
	}
		
}
	
