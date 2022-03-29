import edu.princeton.cs.algs4.*;

public class GraphArithmetic {
    // daemi
    // inn: calculate(dg,vv);
    // thar sem:
    // String[] values = {"+","3","2","1"};
    // Digraph dg = new Digraph(4);
    // dg.addEdge(0,1);
    // dg.addEdge(0,2);
    // dg.addEdge(0,3);
    // ut: 6.0
    public static double calculate(Digraph dg, String[] vertexValues) {
        partition(0, dg, vertexValues);
        return 0.0;
    }

    private static double partition(int n, Digraph dg, String[] values) {
        double out = 0;
        double[] vals = new double[2];
        if (dg.outdegree(n) != 0) {
            int cnt = 0;
            for (int i : dg.adj(n)) {
                vals[cnt++] = partition(i, dg, values);
            }

            switch (values[n]) {
                case "+":
                    return vals[0]+vals[1];
                case "-":
                    return vals[0]-vals[1];
                case "*":
                    return vals[0]*vals[1];
                case "/":
                    return vals[0]/vals[1];
                default:
                    break;
            }
        }
        return Integer.parseInt(values[n]);
    }

    private static String visualize(int n, Digraph dg, String[] values) {
        String out = "";
        if (dg.outdegree(n) != 0) {
            int cnt = 0;
            for (int i : dg.adj(n)) {
                out += visualize(i, dg, values);
                cnt++;
                if (cnt == 1) out += values[n];
            }
            return out;
        }
        return values[n];
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
        GraphArithmetic.calculate(dg, values);

        System.out.println("visualize(dg,values) --> " + visualize(0, dg, values));
    }

}