import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class SpilR {
    private String sort;
    private String gildi;

    public SpilR(String s, String g) {
        sort = s;
        gildi = g;
    }

    /**
     * Skilar true ef spili? o hefur s?mu sort og gildi og hluturinn
     *
     * @param o hlutur af klasanum Spil
     * @return true ef spili? o er jafnt og hluturinn
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpilR spil = (SpilR) o;
        return Objects.equals(sort, spil.sort) && Objects.equals(gildi, spil.gildi);
    }

    public int hashCode() {
        return Objects.hash(sort, gildi);
    }

    // public String toString() {
    //     return "sort: " + sort + ", gildi: "+ gildi;
    // }


    private class GildiComparator implements Comparator<SpilR> {
        String[] gildiValues = {"Ás", "Tvistur", "Þristur", "Fjarki", "Fimma","Sexa", "Sjöa", "Átta", "Nía", "Tía", "Gosi", "Drottning", "Kóngur"};
        public int compare(SpilR s1, SpilR s2) {
            int i = finnaIndex(gildiValues, s1.gildi);
            int j = finnaIndex(gildiValues, s2.gildi);
            
            if (i > j) return 1;
            if (i < j) return -1;
            return 0;
        }

        private int finnaIndex(String[] s, String c) {
            for (int i = 0; i < s.length; i++) {
                if (c.equals(s[i])) return i;
            }
            return 0;
        }
    }

    private class SortComparator implements Comparator<SpilR> {
        String[] sortValues = {"Hjarta", "Spaði", "Tígull", "Lauf"};
        public int compare(SpilR s1, SpilR s2) {
            int i = finnaIndex(sortValues, s1.sort);
            int j = finnaIndex(sortValues, s2.sort);

            if (i > j) return 1;
            if (i < j) return -1;
            return 0;
        }
        
        private int finnaIndex(String[] s, String c) {
            for (int i = 0; i < s.length; i++) {
                if (c.equals(s[i])) return i;
            }
            return 0;
        }
    }

    public Comparator<SpilR> getGildiComparator() {
        return new GildiComparator();
    }

    public Comparator<SpilR> getSortComparator() {
        return new SortComparator();
    }

    public static void main(String[] args) {
        SpilR a = new SpilR("Hjarta","Sjöa");
        SpilR b = new SpilR("Hjarta","Kóngur");
        SpilR c = new SpilR("Tígull","Ás");
        SpilR d = new SpilR("Lauf","Átta");
        SpilR e = new SpilR("Spaði","Sjöa");
        SpilR f = new SpilR("Tígull","Sjöa");
        SpilR g = new SpilR("Spaði","Átta");
        SpilR h = new SpilR("Spaði","Ás");

        SpilR[] ar = {a,b,c,d,e,f,g,h};

        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar, ar[0].getGildiComparator());
        for (SpilR spil : ar) {
            System.out.println(spil.toString());
        }
    }
}
