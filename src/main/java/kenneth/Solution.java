package kenneth;

/**
 * Main class for defining the required function(s).
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String mergeAlternately(String word1, String word2) {
        // 1 <= word1.length, word2.length <= 100
        // word1 and word2 consist of lowercase English letters

        StringBuilder result = new StringBuilder();


        if (word1 != null && word2 != null) {
            final int word1Len = word1.length();
            final int word2Len = word2.length();

            int word1Pointer = 0;
            int word2Pointer = 0;

            while (word1Pointer < word1Len || word2Pointer < word2Len) {
                if (word1Pointer < word1Len) {
                    result.append(word1.charAt(word1Pointer));
                    word1Pointer++;
                }

                if (word2Pointer < word2Len) {
                    result.append(word2.charAt(word2Pointer));
                    word2Pointer++;
                }
            }
        }

        return result.toString();
    }

}
