import java.util.ArrayList;
// import java.util.Random;

public class PuzzleTest {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
        String randomLetter = generator.getLetter();
        System.out.println(randomLetter);

        String randomPassword = generator.getPassword();
        System.out.println(randomPassword);

        ArrayList<String> passwordSet = generator.getPasswordSet(4);
		System.out.println(passwordSet);
	}
}