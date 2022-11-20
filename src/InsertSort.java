public class InsertSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        int i;
        int cle;
        for (int j = 1; j <= n-1; j++){
            cle = arr[j];
            i=j-1;
            while (i >= 0 && arr[i] > cle) {
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i+1] = cle;
        }
        return arr;
    }
}
