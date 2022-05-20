import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.*;


public class QueueAlgorithms {

    public static void main(String[] args) {
        printBinary(14);
    }

    public static void printBinary(int n) {
        if (n <= 0) {
            out.println();
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            int current = queue.remove();
            out.println(current);
            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
        out.println();
    }
}
