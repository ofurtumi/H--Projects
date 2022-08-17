public class nem implements Comparable{
    public String n;
    public String c;

    public nem(String name, String course) {
        this.n = name;
        this.c = course;
    }

    @Override
    public int compareTo(Object b) {
        nem that = (nem)b;
        int first = this.n.compareTo(that.n);
        if(first != 0) return first;
        int second = this.c.compareTo(that.c);
        return second;
    }    
}
