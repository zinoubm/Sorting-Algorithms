import java.util.Arrays;

public class TestSorter {
    static int[] snippet = {7, 2, 3, 1, 8};
    public static void runTest(){
        System.out.println("Bubble sort");
        System.out.println(Arrays.toString(Bubble.sort(snippet)));
        System.out.println("");

        System.out.println("Insert sort");
        System.out.println(Arrays.toString(InsertSort.sort(snippet)));
        System.out.println("");

        System.out.println("Selection sort");
        System.out.println(Arrays.toString(SelectionSort.sort(snippet)));
        System.out.println("");

        System.out.println("Selection recursive sort");
        recursiveSelectionSort sorter1 = new recursiveSelectionSort(snippet);
        System.out.println(Arrays.toString(SelectionSort.sort(snippet)));
        System.out.println("");
    }
}
