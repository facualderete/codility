package sorting;

public class MaxProductOfThree {

    /**
     * As of JDK 8, the main sorting algorithm which is also used in standard stream API implementation for
     * sequential sorting is TimSort. Its worst case is O(n log n), but it works incredibly fast (with O(n)
     * and quite small constant) if data is presorted (in forward or reverse direction) or partially presorted
     * (for example, if you concatenate two sorted lists and sort them again).
     * @param A
     * @return
     */
    public static int solution(int[] A) {


//        A = Arrays.stream(A).sorted().toArray();

        mergeSort(A, 0, A.length - 1);
//        int[] B = {5, 6};
//        mergeSort(B, 0, B.length - 1);

        return 0;
    }

    private static void mergeSort(int[] A, int p, int r) {
        if (p >= r) return; // 0 -> 2 and 3 -> 5
        int q = (int) Math.floor(((double)p + (double)r) / 2);
        mergeSort(A, p, q);
        mergeSort(A, q + 1, r);
        merge(A, p, q, r);
    }

    private static void merge(int[] A, int p, int q, int r) {
        int leftSize = q - p + 1;
        int rightSize = r - q;
        int[] leftArray = new int[leftSize + 1];
        int[] rightArray = new int[rightSize + 1];

        for (int i = 0 ; i < leftSize ; i++) {
            leftArray[i] = A[p + i];
        }

        for (int i = 0 ; i < rightSize ; i++) {
            rightArray[i] = A[q + i + 1];
        }

        leftArray[leftSize] = Integer.MAX_VALUE;
        rightArray[rightSize] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p ; k <= r ; k++) {
            if (leftArray[i] < rightArray[j]) {
                A[k] = leftArray[i];
                i++;
            } else {
                A[k] = rightArray[j];
                j++;
            }
        }
    }
}
