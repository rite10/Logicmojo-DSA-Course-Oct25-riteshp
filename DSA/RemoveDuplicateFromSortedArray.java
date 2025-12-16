import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicate(int[] array) {

        int rd = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[rd] != array[i]) {
                rd++;
                array[rd] = array[i];
            }
        }
        return rd + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayInput = sc.nextInt();
        int[] array = new int[arrayInput];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int rd = removeDuplicate(array);
        System.out.println(rd + " ");
    }

}

// Trick
// In a array [rd] =0 and array [i]=1; if rd !=i then increament rd then replace
// with array[i]
// other wise if rd==i then simply i++;
