package countingelements;

public class PermCheck {

    public static int solution(int[] A) {
        int[] occurrences = new int[A.length];
        for (int value : A) {
            if (value <= A.length) {
                occurrences[value - 1]++;
            }
        }
        for (int occurrence : occurrences) {
            if (occurrence != 1) {
                return 0;
            }
        }
        return 1;
    }
}
