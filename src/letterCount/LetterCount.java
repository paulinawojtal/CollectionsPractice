package letterCount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class LetterCount {

    // count how many time each letter appear in a file
    public static Map<Character, Integer> countLetters() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("lalka-tom-pierwszy.txt"));

        Map<Character, Integer> letters = new TreeMap<>();

        while(sc.hasNext()){
            String line = sc.nextLine();
            for(int i=0; i<line.length(); i++){
                char letter = line.toLowerCase().charAt(i);
                if(Character.isAlphabetic(letter)){
                    if(letters.containsKey(letter)){
                        int letterCount = letters.get(letter);
                        letters.put(letter, letterCount + 1);
                    } else {
                        letters.put(letter, 1);
                    }
                }
            }
        }
        return letters;
    }

    public static void printMap(Map<Character, Integer> letters){
        letters.forEach((k,v) -> System.out.println(k + ": " + v));
    }

    public static void main(String[] args) throws FileNotFoundException {

       Map<Character, Integer> letters = countLetters();
       printMap(letters);
    }

}
