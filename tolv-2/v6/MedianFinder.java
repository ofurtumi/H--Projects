import edu.princeton.cs.algs4.*;

public class MedianFinder<Key extends Comparable<Key>> {
    private MaxPQ<Key> maxpq;
    private MinPQ<Key> minpq;

    public MedianFinder() {
        //búið til maxpq og minpx
        maxpq = new MaxPQ<Key>(); //geymir stærri helming raðarinnar??
        minpq = new MinPQ<Key>(); //geymir minni helming raðarinnar???
    }

    public Key findMedian() {
        int maxSize = maxpq.size();
        int minSize = minpq.size();

        if (maxpq.isEmpty() && minpq.isEmpty()) return null;
        else if (maxSize == minSize || maxSize > minSize) return maxpq.max();
        else return minpq.min();
    }

    public Key deleteMedian() {
        int maxSize = maxpq.size();
        int minSize = minpq.size();
        Key deleted = null;

        if (maxpq.isEmpty() && minpq.isEmpty()) return null;
        else if (maxpq.isEmpty() || minpq.isEmpty()) {
            if (maxpq.isEmpty()) deleted = minpq.delMin();
            else deleted = maxpq.delMax();
        }
        else if (maxSize == minSize || maxSize > minSize) deleted = maxpq.delMax();
        else deleted = minpq.delMin();
        return deleted;
    }

    public void insert(Key key) {
        if (maxpq.isEmpty() || key.compareTo(maxpq.max()) < 0) maxpq.insert(key);
        else minpq.insert(key);
        
        if (maxpq.size() > minpq.size()+1) minpq.insert(maxpq.delMax());
        else if (minpq.size() > maxpq.size()+1) maxpq.insert(minpq.delMin());
    }

    public static void main(String[] args) {
        MedianFinder<String> m = new MedianFinder<String>();

        m.insert("A");
        m.insert("B");
        m.insert("C");
        m.insert("D");
        m.insert("E");
        // print();

        System.out.println(m.findMedian());
        m.deleteMedian();
        System.out.println(m.findMedian());
        m.deleteMedian();
        System.out.println(m.findMedian());
        m.deleteMedian();
        System.out.println(m.findMedian());
        m.deleteMedian();
        System.out.println(m.findMedian());
        m.deleteMedian();
        System.out.println(m.findMedian());

    }

    // nota maxpq og minpq
}