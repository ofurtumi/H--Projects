/** 
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Búið til: 	2021-28-08 12:25:34
 * @ Lýsing:    Reiknar 4 mismunandi dæmi og skilar útkomum þeirra í streng sem er síðan prentaður í einni línu
 */

public class Reikna {
    public static void main(String[] args) {
        String strOut = new String(); 
        
        strOut += 2+20/10*2 + " ";
        strOut += 2/3/2 + " ";
        strOut += "2" + true + " ";
        strOut += 5.1+3.0 + "5";

        System.out.println(strOut);
    }
}
