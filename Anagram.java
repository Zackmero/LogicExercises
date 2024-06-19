package execises;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Zacarias Mercado
 */
public class Anagram {

    public static void main(String[] args) {

        Anagram a = new Anagram();

        String fWord = JOptionPane.showInputDialog(null, "Set the first word: ", "Anagram", 3);

        String sWord = JOptionPane.showInputDialog(null, "Set the second word: ", "Anagram", 3);

        if (a.validate(fWord, sWord)) {
            JOptionPane.showMessageDialog(null, "Those words are an anagram", "Result Anagram", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Those words aren't an anagram", "Result Anagram", 0);
        }

    }

    public boolean validate(String firstWord, String secondWord) {

        //Create char variable with first word and sort it
        char[] chain1 = firstWord.toUpperCase().toCharArray();
        Arrays.sort(chain1);

        //Create char variable with second word and sort it
        char[] chain2 = secondWord.toUpperCase().toCharArray();
        Arrays.sort(chain2);

        
//        String chainSorted1 = Arrays.toString(chain1);
//        String chainSorted2 = Arrays.toString(chain2);

        String chainSorted1 = String.valueOf(chain1);
        String chainSorted2 = String.valueOf(chain2);

        if (firstWord.toUpperCase().equals(secondWord.toUpperCase())) {
            return false;
        } else if (chainSorted1.equals(chainSorted2)) {
            return true;
        }
        return false;
    }

}
