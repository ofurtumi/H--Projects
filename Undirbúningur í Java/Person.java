public class Person {
    private String name;
    private int age;
    private byte gender;

    //private static final byte HE = 0; commentaði þessi tvö út til þess að losna við warning
    //private static final byte THEY = 2;
    private static final byte SHE = 1;

    Person(String name, int age, byte gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString() {
        String printText = name + ", " + age + " years old";
        return printText;
    }

    public static void main(String args[]) {
        Person anna = new Person("Anna", 21, Person.SHE);
        Person eva = new Person("Eva", 20, Person.SHE);

        System.out.println(anna.gender + eva.gender);
    }
}
