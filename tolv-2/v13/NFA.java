import edu.princeton.cs.algs4.*;

public class NFA {
    private char[] re; // match transitions
    private Digraph G; // epsilon transitions
    private int M; // number of states

    public NFA(String regexp) { // Create the NFA for the given regular expression.
        Stack<Integer> ops = new Stack<Integer>();
        re = regexp.toCharArray();
        M = re.length;
        G = new Digraph(M + 1);
        for (int i = 0; i < M; i++) {
            int lp = i;
            if (re[i] == '(' || re[i] == '|')
                ops.push(i);
            else if (re[i] == ')') {
                int or = ops.pop();
                int svig = or;
                while (re[svig] != ')') {
                    if (re[svig] == '|') {
                        lp = ops.pop();
                        G.addEdge(lp, or + 1);
                        G.addEdge(or, i);
                        svig--;
                    }
                }
                lp = or;
            }
            if (i < M - 1 && re[i + 1] == '*') // lookahead
            {
                G.addEdge(lp, i + 1);
                G.addEdge(i + 1, lp);
            }
            if (re[i] == '(' || re[i] == '*' || re[i] == ')')
                G.addEdge(i, i + 1);
        }
    }
}