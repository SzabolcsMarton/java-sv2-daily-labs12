package day05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringStatistics {

    //Hany kulonbozo karakter van a szovegben

    public int numberOfDifferentLetters(String stringToCheck){
        Set<Character> temp = new HashSet<>();
        for (int i = 0; i < stringToCheck.length();i++){
           temp.add(stringToCheck.charAt(i));
        }

        return temp.size();
    }

    public Map<Character,Integer> numberOfCharsByChars(String stringToCheck){
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < stringToCheck.length(); i++) {
            if(!result.containsKey(stringToCheck.charAt(i))){
                result.put(stringToCheck.charAt(i),1);
            }else {
                result.put(stringToCheck.charAt(i),result.get(stringToCheck.charAt(i)) + 1);
            }
        }
        return result;
    }

}
