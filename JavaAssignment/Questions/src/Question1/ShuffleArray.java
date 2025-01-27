package Question1;
import java.util.Random;
public class ShuffleArray {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		shuffle(array);
		System.out.println("shuffled array: ");
		for (int i : array) {
			System.out.print(i);
		}
	}
	public static void shuffle(int[] arr) {
		Random random = new Random();
		for (int i = arr.length -1; i > 0 ; i--) {
			int j = random.nextInt(i + 1);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
