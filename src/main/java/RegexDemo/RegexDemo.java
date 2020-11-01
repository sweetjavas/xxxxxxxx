package RegexDemo;

public class RegexDemo {
    public static void main(String[] args) {
        String input = "123456789";
        boolean ok = isNumber(input);
        System.out.println(ok);
        System.out.println("12312414".matches("\\d*"));
    }

    private static boolean isNumber(String str) {
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c < '0' || c > '9') {
                return false;

            }

        }return true;
    }
}


