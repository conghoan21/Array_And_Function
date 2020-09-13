import java.util.Scanner;
public class findMinValue {
    public static int minValue(int[] array){
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < index) {
                index = arr[j];
            }
        }
        System.out.println("The smallest element in the array is: " + arr[index]);

    }

}
