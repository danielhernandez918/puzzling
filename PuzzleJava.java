import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 1; i <=10; i++) {
            random10.add(rand.nextInt(20) + 1);
        }
        return random10;
    }

    public String getLetter() {
		String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        char randomChar = alphabetString.charAt(rand.nextInt(26));
        return String.valueOf(randomChar);
    }

	public String getPassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password+= getLetter();
        }
        return password;
    }

	public ArrayList<String> getPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(getPassword());
        }
        return passwordSet;

    }
};