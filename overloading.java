// What is Method Overloading?
// Method overloading means having multiple methods with the same name but different parameters in the same class.

// 🔹 Rules for Method Overloading:
// ✔ Methods must have different parameters (different number or types of arguments).
// ✔ Methods can have different return types, but it is not enough for overloading.

class MathOperations {
    
    int add(int a, int b) {
        return a + b;
    }

    // three parameters (same name, different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    //  double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class overloading {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println("Sum 1: " + obj.add(5, 10));
        System.out.println("Sum 2: " + obj.add(5, 10, 15));
        System.out.println("Sum 3: " + obj.add(5.5, 2.3));
    }
}

