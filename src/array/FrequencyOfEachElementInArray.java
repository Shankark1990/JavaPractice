package array;

public class FrequencyOfEachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String listOfArray[] = { "Moon", "Sun", "Earth", "Soil" };

		System.out.println("Size of listOfArray: " + listOfArray.length);

		for (int i = 0; i < listOfArray.length; i++) {

			System.out.println(listOfArray[i] + " element size is: " + listOfArray[i].length());

		}

	}

}
