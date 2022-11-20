import java.util.Arrays;

public class Bubble {
    public static int[] sort(int[] arr) {
        int n = arr.length;
        boolean permutation;
        int temp;
        do {
            permutation = false;
            for (int i = 0; i <= n-2; i++){
                if (arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    permutation = true;
                }
            }
        }
        while (permutation == true);
        return arr;
    }
}
