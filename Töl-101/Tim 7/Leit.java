/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-10-10 17:58
 * @ Lýsing: 	Fallið finna leitar í gegn um fylki að gefnu staki og skilar indexi 
 *              þess staks, ef stakið finnst ekki skilar fallið -1
 */

public class Leit {
    public static int finna(int[] a, int x) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                index = i; 
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] a = {1,5,8,3,4,6,2,7,9,1,4};
        System.out.println(finna(a, 4));
    }    
}
