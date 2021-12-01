import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();

		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

		String randLetter = generator.getRandomLetter();
		System.out.println(randLetter);
		
		String randPassword = generator.generatePassword();
		System.out.println(randPassword);

		ArrayList<String> newPassword = generator.getNewPasswordSet(8);
		System.out.println(newPassword);
	}
}