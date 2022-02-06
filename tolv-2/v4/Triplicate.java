public class Triplicate{
    public static String triplicate(String[] a,String[] b,String[] c){
        for (String oa : a) {
            for (String ob : b) {
                if (oa.equals(ob)) {
                    for (String oc : c) {
                        if (oa.equals(oc)) return oa;
                    }
                }
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] a = {"oli","joi","stebbi","stina"};
        String[] b = {"jenny","stina","gunna","loa"};
        String[] c = {"hall","tumi","gulli","stina"};

        System.out.println(triplicate(a, b, c));
    }
}