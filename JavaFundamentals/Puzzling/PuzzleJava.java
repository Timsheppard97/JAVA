import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=1;i<10;i++) {
            myArray.add(randMachine.nextInt(21));
        }
        return myArray;
    }

    public String getRandomLetter() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] randomLetter = new String[26];
        for (int i=0;i<26;i++) {
            randomLetter[i] = String.valueOf(letters.charAt(i));
        }
        return randomLetter[randMachine.nextInt(26)];
    }

    public String generatePassword() {
        String password = "";
        for (int i=0;i<8;i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        length = 8;
        int i = 0;
        ArrayList<String> newPassword = new ArrayList<String>();
        while (i<length) {
            newPassword.add(generatePassword());
            i++;
        }
        return newPassword;
    }
}