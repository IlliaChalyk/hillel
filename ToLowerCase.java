public class ToLowerCase {
    public static void main(String[] args) {

        String randomString = "#1AmC";
        System.out.println(toLower(randomString));
    }

    private static String toLower(String str) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }

        String result = new String(chars);
        return result;

    }
}