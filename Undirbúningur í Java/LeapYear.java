/**
 * @ Höfundur: Þorvaldur Tumi Baldursson 
 * @ Netfang: ttb3@hi.is 
 * @ Búið til: 2021-03-09 10:07:24 
 * @ Lýsing: Segir til um hvor ár sé hlaupár eða ekki
 */

public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        boolean isLepYear;

        isLepYear = (year % 4 == 0) && (year % 100 != 0);

        isLepYear = isLepYear || (year % 400 == 0);

        System.out.println(isLepYear);
        System.out.println(Math.min(5, Math.min(4, 7)));
        
    }
}
