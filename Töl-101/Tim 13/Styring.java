public class Styring implements StyringSkil{
    private boolean taekid;

    public void kveikja() {
        taekid = true;
    }

    public void slokkva() {
        taekid = false;
    }

    public boolean erKveikt() {
        return taekid;
    }

    public static void main(String[] args) {
        Styring s = new Styring();
        s.kveikja();
        System.out.println(s.erKveikt());
        s.slokkva();
        System.out.println(s.erKveikt());
    }
}
