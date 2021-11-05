import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Flugskrapari {
    private static int currentIndex = 0;
    private static ArrayList<String[]> heildin = new ArrayList<String[]>();
    public static void main(String[] args) throws IOException {
        String html = (readHTML("https://www.isavia.is/keflavikurflugvollur/flugupplysingar/brottfarir"));

        for (int i = 0; i < 50; i++) {
            String[] arrayid = new String[5];
            arrayid[0] = aaetludBrottfor(html);
            arrayid[1] = afangastadur(html);
            arrayid[2] = flugnumer(html);
            arrayid[3] = flugfelag(html);
            arrayid[4] = stadaFlugs(html);
            if (arrayid[0].contains("a href")) break;
            heildin.add(arrayid);
        }

        for (String[] stak : heildin) {
            System.out.println(Arrays.toString(stak));
        }
    }

    public static String readHTML (String s) {
        In page = new In(s);
        String html = page.readAll();
        String out = islenskir(html);
        currentIndex = html.indexOf("table-schedule",currentIndex);
        return out;
    } // skila vefsíðuni 

    public static String aaetludBrottfor (String html) {
        int p = html.indexOf("\"schedule-items-entry\"", currentIndex);
        int from = html.indexOf("<td", p);
        from = html.indexOf(">", from);
        int to = html.indexOf("</td>", from);
        String out = html.substring(from + 1, to);
        currentIndex = to;
        return out;
    } // skila áætlaðri brottför 
    
    public static String afangastadur (String html) {
        int p = html.indexOf("<span", currentIndex);
        int from = html.indexOf("title=\"", p);
        int to = html.indexOf("\">", from);
        String out = html.substring(from + 7, to);
        currentIndex = to;
        return out;
    } // skila áfangastað

    public static String flugnumer (String html) {
        int p = html.indexOf("<td>", currentIndex);
        int from = html.indexOf(">", p);
        int to = html.indexOf("</td>", from);
        String out = html.substring(from + 1, to);
        String[] outArray = out.split("");
        out = outArray[10] + outArray[11] + outArray[12] + outArray[13] + outArray[14];
        currentIndex = to;
        return out;
    } //skila aðalflugnúmeri 

    
    public static String flugfelag (String html) {
        int p = html.indexOf("<td>", currentIndex);
        int from = html.indexOf("title=\"", p);
        int to = html.indexOf("\">", from);
        String out = html.substring(from + 7, to);
        currentIndex = to;
        return out;
    } // skila flugfélagi 
    
    public static String stadaFlugs (String html) {
        int p = html.indexOf("<td>", currentIndex);
        int from = html.indexOf("title=\"", p);
        int to = html.indexOf("\">", from);
        String out = html.substring(from + 7, to);
        currentIndex = to;
        return out;
    } // skila stöðu flugs, t.d. farin xx, áætluð brottför o.s.frv. 

    public static String islenskir(String html) {
        html = html.replace("&#246;", "ö");
        html = html.replace("&#237;", "í");
        html = html.replace("&#243;", "ó");
        html = html.replace("&#225;", "á");
        html = html.replace("&#230;", "æ");
        html = html.replace("&#193;", "Á");
        html = html.replace("&#253;", "ý");
        html = html.replace("&#240;", "ð");

        return html;
    }
}
