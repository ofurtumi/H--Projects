import edu.princeton.cs.algs4.*;

public class MedianFinder<Key extends Comparable<Key>> {
    private MaxPQ maxpq;

    public MedianFinder() {
        //búið til maxpq og minpx
        maxpq = new MaxPQ<key>();
        MinPQ minxpq = new MinPQ<key>();
    }

    public Key findMedian() {
        return null;
    }

    public Key deleteMedian() {
        return null;
    }

    public void insert(Key key) {
        
    }

    public void print() {
        System.out.println("MaxPQ: ");
        for (Key x : maxpq) {
            System.out.print((x + ", "));
        }
        System.out.println();
    }

    public void main(String[] args) {
        MedianFinder<String> m = new MedianFinder<String>();

        m.Insert("A");
        print();
        m.Insert("B");
        print();
        m.Insert("C");
        print();

        System.out.println(m.findMedian());
        print();
        System.out.println(m.findMedian());
        print();
    }

    // nota maxpq og minpq
}