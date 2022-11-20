public class SelectionSort {
    public static int[] sort(int[] arr) {
        int n = arr.length;
        int indice_min;
        int temp;
        for (int j = 0; j<= n-1; j++){
            indice_min = j;
            for (int i = n-1; i <= j-1; i++){
                if (arr[i]<arr[indice_min]){
                    indice_min = i;
                }
            }
            temp = arr[j];
            arr[j] = arr[indice_min];
            arr[indice_min] = temp;
        }
        return arr;
    }



    }
