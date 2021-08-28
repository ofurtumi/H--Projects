class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Sausage {
    Sausage() {
        System.out.println("Sausage()");
    }
}

class Salad {
    Salad() {
        System.out.println("Salad()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class Supper extends Lunch {
    Supper() {
        System.out.println("Supper()");
    }
}

class Sandwich extends Supper {
    Bread b = new Bread();
    Sausage s = new Sausage();
    Salad sd = new Salad();
    Sandwich() {
        System.out.println("Sandwich()");
    }
    public static void main(String[] args) {
        new Sandwich();
    }
}