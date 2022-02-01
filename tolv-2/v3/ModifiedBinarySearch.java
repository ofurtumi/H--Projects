public class ModifiedBinarySearch {
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        int minnstaIndex = -1;
        while (lo <= hi) {
            int mid = (lo+hi) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else if (mid > 0 && a[mid-1] == key) {
                hi = mid;
            }
            else if (key == a[mid]) {
                minnstaIndex = mid;
                break;
            }

        }
        return minnstaIndex;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5,5,6,6,7};
        int[] b = {1,2,3,4,5,6,7};
        int[] c = {4};
        int key = 4;
        System.out.println("Runnar");
        System.out.println(indexOf(b, key));
        System.out.println(indexOf(a, key));
        System.out.println(indexOf(c, key));
    }
}
