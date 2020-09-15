package stacksandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class StoneWall {

    public static int solution(int[] H) {
        Deque<Integer> stack = new LinkedList<>();
        int count = 0;
        int height = 0;

        for (int i = 0 ; i < H.length ; i++) {
            // if going down, poll from stack and count
            if (H[i] < height) {
                height = H[i];
                int lastPeek = 0;
                while (!stack.isEmpty() && stack.peek() > height) {
                    // do not count when the next block is the same size as the previous one!
                    if (lastPeek != stack.peek()) {
                        count++;
                    }
                    lastPeek = stack.pop();
                }
            } else {
                // if going up, stack
                height = H[i];
            }
            // always push to stack
            stack.push(H[i]);
        }

        // clean remaining stack
        int lastPeek = 0;
        while (!stack.isEmpty()) {
            if (lastPeek != stack.peek()) {
                count++;
            }
            lastPeek = stack.pop();
        }

        return count;
    }
}
