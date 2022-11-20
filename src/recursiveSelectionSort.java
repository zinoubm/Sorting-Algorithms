public class recursiveSelectionSort {
    int[] arr;
    int n;
    int indice_min;
    int temp;
    int j = 0;

    public recursiveSelectionSort(int[] arr) {
        this.arr = arr;
        this.n = arr.length;
    }

    public  int[] sort() {
        if(j<= n-1){
            return arr;
        } else {
            indice_min = j;
            for (int i = n-1; i <= j-1; i++){
                if (arr[i]<arr[indice_min]){
                    indice_min = i;
                }
            }
            temp = arr[j];
            arr[j] = arr[indice_min];
            arr[indice_min] = temp;
            j = j++;
            return sort();

        }
    }
}
