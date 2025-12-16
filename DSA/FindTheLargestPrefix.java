import java.util.Arrays;

public class FindTheLargestPrefix {

    static String findPrefix(String[] arrays) {

        StringBuilder prefix = new StringBuilder();
        Arrays.sort(arrays);

        char[] first = arrays[0].toCharArray();
        char[] last = arrays[arrays.length - 1].toCharArray();

        for (int i = 0; i < first.length - 1; i++) {
            if (first[i] != last[i]) {
                break;
            }
            prefix.append(first[i]);
        }

        return prefix.toString();
    }

    public static void main(String[] args) {

        String[] arrays = { "club", "clap", "clove" };
        String prefix = findPrefix(arrays);
        System.out.println("The longest prefix is :: " + prefix);

    }
}
