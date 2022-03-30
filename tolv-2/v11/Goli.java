import edu.princeton.cs.algs4.*;

public class Goli {
    public static double calculate(Digraph dg, String[] vertexValues) {
        if (dg.V() == 0) {
            return 0.0;
        }
        if (dg.V() == 1) {
            if (vertexValues[0].equals("*") || vertexValues[0].equals("+")) {
                return 0.0;
            } else {
                return Double.parseDouble(vertexValues[0]);
            }
        }

        Double[] sums = new Double[dg.V()];
        int cnt = dg.V() - 1;
        while (!vertexValues[cnt].equals("*")) {
            sums[cnt] = Double.parseDouble(vertexValues[cnt]);
            cnt--;
        }

        for (int i = cnt; i >= 0; i--) {
            Queue<Integer> children = new Queue<Integer>();
            int cnt2 = 0;
            Double singleSum;
            for (int w : dg.adj(i)) {
                children.enqueue(w);
                cnt2++;
            }
            if (vertexValues[i].equals("*")) {
                singleSum = sums[children.dequeue()];
                for (int j = 1; j < cnt2; j++) {
                    singleSum = singleSum * sums[children.dequeue()];
                }
                sums[i] = singleSum;
            } else if (vertexValues[i].equals("+")) {
                singleSum = sums[children.dequeue()];
                for (int j = 1; j < cnt2; j++) {
                    singleSum = singleSum + sums[children.dequeue()];
                }
                sums[i] = singleSum;
            } else {
                sums[i] = Double.parseDouble(vertexValues[i]);
            }
        }
        return sums[0];
    }

    public static void main(String[] args) {
        Digraph dg = new Digraph(9);
        dg.addEdge(0, 1);
        dg.addEdge(0, 3);
        dg.addEdge(1, 2);
        dg.addEdge(1, 3);
        dg.addEdge(2, 4);
        dg.addEdge(2, 5);
        dg.addEdge(3, 6);
        dg.addEdge(3, 7);
        dg.addEdge(4, 7);
        dg.addEdge(4, 8);
        String[] values = { "*", "*", "+", "+", "*", "-1", "4", "5", "2" }; // 720.0

        // Digraph dg = new Digraph(3);
        // dg.addEdge(0, 1);
        // dg.addEdge(0, 2);
        // String[] values = { "*", "5", "2" };

        System.out.println("dg.toString() --> " + dg.toString());
        System.out.println("calculate(dg,values) --> " + calculate(dg, values));
    }

}