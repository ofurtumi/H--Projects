/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-17-10 17:07
 * @ Lýsing: 	klasinn ReadArray inniheldur tvö föll, read1DintArray og read2DintArray, sem taka inn af staðalinntaki
 *              tölur og breyta þeim í fylki, auk þeirra er main klasi til þess að prufa föllin
 */

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadArray {
    private static Scanner s = new Scanner(System.in,StandardCharsets.UTF_8);
    public static void main(String[] args) {
        int[] m = read1DintArray();
        System.out.println(Arrays.toString(m));

        int[][] x = read2DintArray();
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));
        }
    }

    /**
     * Les inn einvítt heiltölufylki af staðalinntaki, fyrst er lesin inn lengd fylkisins og svo jafnmörg 
     * stök og lengdin segir til um
     * @return int[] einvítt heiltölufylki með stökum sem tekin tekin voru inn með staðalinntaki
     * @throws NoSuchElementException ef vídd fylkis er stærri en 1
     */
    public static int[] read1DintArray() throws NoSuchElementException {
        int n = s.nextInt();
        int[] intOut = new int[n];

        for (int i = 0; i < n; i++) {
            intOut[i] = s.nextInt();
        }

        return intOut;
    }
    /**
     * Les inn tvívítt heiltölufylki af staðalinntaki, fyrst er lesin inn fjöldi raða og svo fjöldi dálka og 
     * svo röð*dálkar mörg stök 
     * 
     * @return int[][] tvívítt heiltölufylki sem inniheldur stök sem tekin voru inn af staðalinntaki
     * @throws NoSuchElementException ef vídd fylkis er stærri eða minni en 2
     */
    public static int[][] read2DintArray() throws NoSuchElementException {
        int n = s.nextInt();
        int h = s.nextInt();
        int[][] intOut = new int[n][h];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < h; j++) {
                intOut[i][j] = s.nextInt();
            }
        }

        return intOut;
    }

    /**
     * Les inn einvítt fylki af staðalinntaki. Fyrst er víddin lesin og síðan jafnmörg stök og
     * víddin segir til um
     *
     * @return skilar fylkinu
     * @throws NoSuchElementException - ef ekki nógu mörg stök eru í staðalinntaki eða
     *                                þau eru ekki af kommutölutagi
     */
    public static double[] read1DdoubleArray() throws NoSuchElementException {
        int n = s.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextDouble();
        return a;
    }
}
