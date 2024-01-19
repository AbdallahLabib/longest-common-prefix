public class App {
    public static void main(String[] args) throws Exception {
        longestCommonPrefix(new String[] { "flower", "flow", "flight" });
    }
    
    public static String longestCommonPrefix(String[] strs) {
        // 1. Create a StringBuilder result to add the longest common prefix to it
        StringBuilder result = new StringBuilder();

        // 2. We'll start from the beginning of the String array because we check that 
        // letters in each word matches, and when we reach the point where they don't match
        // then we've found our largest common prefix.

        // 3. We'll loop on the first word's letters in the list to check how many letters 
        // inside it matches with letters inside other words.So, we have 2 loops; 
        // a) Loop on the 1st word (strs[0].length())
        // b) Loop on each String to check if the current char inside strs[0]  matches with the 
        //    current String. 
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                // This OR condition is to chech case like ["ab", "a"] where
                // the length of the 2nd word is less than the 1st word.
                // In this example, you find that in the second round i == 1 and length of
                // the second word == 1, in such case we have out-bounded the 2nd word
                // that's why we return the result, which will be ["a"];
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return result.toString();
                }
            }
            // After I check that the charAt(i) is indeed in each one of them, then I
            // append it to the result.
            result.append(strs[0].charAt(i));
        }
        return result.toString();
    }
}
