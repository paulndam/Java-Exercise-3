public class Exercise {
    public static void main(String[] args) {

        String word1 = "FriedRice";
        System.out.println(frontBack(word1));

    }
    

    // Given a string, return a new string where the first and last chars have been exchanged.
    // frontBack("code") → "eodc"
    // frontBack("a") → "a"
    // frontBack("ab") → "ba"

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;

        }
        String middleString = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + middleString + str.charAt(0);
    }
}