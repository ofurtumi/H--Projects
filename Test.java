import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {6,5,4,3,2};
        int[] b = {2,3,4,5,6};
        int i = 1;
        int j = 2;
        int c = a[i++] + b[--i] + b[j++] + a[i + j++];
        System.out.println(c);
        System.out.println(i);
        System.out.println(j);
    }
}
