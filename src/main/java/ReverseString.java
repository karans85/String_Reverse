public class ReverseString {
    public String reverse(String toReverse) {
        final char[] chars = toReverse.toCharArray();

        String reversed = "";
        for (int i = chars.length-1; i > -1 ; i--) {
            reversed += String.valueOf(chars[i]);
        }

        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverse("Anna"));
    }

}