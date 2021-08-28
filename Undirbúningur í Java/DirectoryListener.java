import java.io.File;

public class DirectoryListener {

    public static String dirLister (String fileName) {
        String str = "";
        
        try {
            File file = new File(fileName);
            
            for (String string : file.list()) {
                str = str + string + "\n";
            }    
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return str;
    }

    public static void main(String[] args) {

        System.out.print(dirLister("C:/Users/thorv/OneDrive/Desktop"));
    }
}
