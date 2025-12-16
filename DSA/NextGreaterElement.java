import java.util.Scanner;

public class NextGreaterElement {

    public static String findNextGreate(String value) { 
 
        char[] arr = value.toCharArray();
        int i = arr.length - 2;

        // moves i till i>i+1
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i == -1) {
            return "-1";
        }
        int k = arr.length - 1;
        while (arr[i] >= arr[k]) {
            k--;
        }
        // Swap elemnet
        char temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;

        //Reverse the suffix
        int left = i + 1, right = arr.length - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(findNextGreate(num));

    }

}
