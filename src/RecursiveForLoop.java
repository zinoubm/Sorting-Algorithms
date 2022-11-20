import java.util.function.Function;

public class RecursiveForLoop {

    public void recursiveFor(int i, int count, Runnable function){
        function.run();
        if (i > count){
            return;
        }
        recursiveFor(i++, count, function);
    }
}
