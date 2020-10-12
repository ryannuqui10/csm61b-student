import java.util.HashMap;
import java.util.List;
import java.util.Set; 
import java.util.Map; 

public class InterviewQuestions {
    public static boolean sumUp(int[] array, int n) {
        // TODO: Replace the following code with your solution
        return true;
    }

    public static boolean isPermutation(String s1, String s2) {
        // TODO: Replace the following code with your solution
        Map<Character, Integer> charCounts1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            if (charCounts1.containsKey(c)) {
                charCounts1.put(c, charCounts1.get(c) + 1);
            } else {
                charCounts1.put(c, 1);
            }
        }

        Map<Character, Integer> charCounts2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            if (charCounts2.containsKey(c)) {
                charCounts2.put(c, charCounts2.get(c) + 1);
            } else {
                charCounts2.put(c, 1);
            }
        }

        if (!charCounts1.keySet().equals(charCounts2.keySet())) {
            return false;
        }

        for (char key : charCounts1.keySet()) {
            if (charCounts1.get(key) != charCounts2.get(key)) {
                return false;
            }
        }
        return true;
    }
}
