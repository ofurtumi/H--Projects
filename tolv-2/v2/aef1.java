public class aef1 
{ 
   public static void main(String[] args) {
      int tala = Integer.parseInt(args[0]);
      Stopwatch s = new Stopwatch();
      // System.out.println(a(tala));
      System.out.println(b(tala));
      double t = s.elapsedTime();
      System.out.println("el time: " + t);
   }

   public static int a(int N) {
      int sum = 0;
      for (int n = N; n > 0; n /= 2) {
         for (int i = 0; i < n; i++) {
            sum++;
         }
      }
      return sum;
   }

   public static int b(int N) {
      int sum = 0;
      for (int i = 1; i < N; i *= 2)
         for(int j = 0; j < i; j++)
            sum++; 
      return sum;
   }
}