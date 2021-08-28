import java.io.*;

public class num {
    public static void oddEven(File file){
        try {
            FileInputStream fis = new FileInputStream(file);
            FileWriter odd = new FileWriter("odd.txt");
            FileOutputStream even = new FileOutputStream("even.txt");

            int i = 0;
            while ((i=fis.read())!=-1){
                if (i%2<=0) even.write((char)i);//System.out.println("Even " + (char)i);
                    
                else odd.write((char)i);//System.out.println("Odd " + (char)i);
            }
            fis.close();
            odd.close();
            even.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static String readFile(String file) {
        String str = "";

        try {
            FileInputStream fis = new FileInputStream(file);

            int i = 0;
            while ((i=fis.read())!=-1) {
                str = str + ((char)i);
            }
            fis.close();
            return str;
        }

        catch(Exception e){
            e.printStackTrace();
        }
        return str;
    }
    public static void main(String[] args){
        File file = new File("num.txt");
        oddEven(file);
        System.out.println("odd.txt: " + readFile("odd.txt"));
        System.out.println("even.txt: " + readFile("even.txt"));

    }
}
