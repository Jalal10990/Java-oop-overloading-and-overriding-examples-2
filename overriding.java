//What is Method Overriding?
// Method overriding allows a child class to modify the method of a parent class.

// 🔹 Rules for Method Overriding:
// ✔ The method name must be same in both parent and child class.
// ✔ The return type must be same or a subclass.
// ✔ The method in the child class must have the same parameters.
// ✔ The parent method must be inherited (not private).

class Animal{
    void sound(){
        System.out.println("Aanimals make sound...");
    }
}

//child class overriding sound() method

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barjs...");
    }
}
public class overriding{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();
        Dog myDog = new Dog();
        myDog.sound();
    }
}
