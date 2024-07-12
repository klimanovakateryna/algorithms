//Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters,and that you are given the "true" length of the string. (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)

package strings;

public class URLify {

    public static String replaceURL(String input) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(input.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String testString = "Mr John Smith";
        String result = replaceURL(testString);
        System.out.println(result);
    }
}
