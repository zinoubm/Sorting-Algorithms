import java.util.Arrays;

public class TestSearch {
    static int[] snippet = {4 ,7 ,9 , 12, 45, 75};
    public static void runTest(){
        int res = LinearSearch.find(TestSearch.snippet, 7);
        System.out.println("la position est" + res);
    }
}
