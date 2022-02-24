public class K5 {
    public static void SampleSort(int[] arr) {
        int[] sample = new int[31];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = StdRandom.uniform(0, 1000000);
        }
        int x = sample[16];
        int v = arr[x];
    }
    public static void main(String[] args) {
        StdRandom.setSeed(69420);
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = StdRandom.uniform(1,10000000);
        }
    }

    private static void sort(int[] arr, int lo, int hi) {
        if (hi <= lo)
            return;
        int part = partition(a, lo, hi);
        sort(arr, lo, part - 1);
        sort(arr, part + 1, hi);
    }

    private static int partition(int[] arr, int lo, int hi, int v) {
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (arr[j] > v) {
                swap(arr, i, j);
                i++;
            } else if (arr[j] == v) {
                swap(arr, j, hi);
                j--;
            }
        }

        swap(arr, i, hi);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
