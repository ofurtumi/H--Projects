class Hallo{  
    public static void main(String args[]){  
    String str = System.console().readLine(
        "Skrifaðu nafnið þitt: "
    );
    
    for (int i = 1;i <= 10; i++) {
        System.out.println("Halló " + str.toUpperCase());
     } 
    }  
}  

//In the OO paradigm, we design a system as a set of collaborating OBJECTS
//A CLASS defines the common characteristics of a set of (OBJECTS)
//A (CLASS) is defined at a system's design time, while (OBJECTS) are created and destroyed at run time of the system
//An object's state is defined by the () of its METHODS, while 