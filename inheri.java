public class inheri {
    public static void main(String[] args) {
        // Fish f1 = new Fish();
        // f1.breathe();
        // f1.color="Blue";
        // f1.eat();
        // f1.swim();

        // Dog d1 = new Dog();
        // d1.breathe();
        // d1.color="Black";
        // d1.leg = 4;
        // d1.eat();

        // mamals m1 = new mamals();
        // Bird b1 = new Bird();
        // Fish f1 = new Fish();
        
        
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class mamals extends Animal{
    int leg;
    void walk(){
        System.out.println("walks");
    }
}
class Bird extends Animal{
    int leg;
    void fly(){
        System.out.println("fly");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
// class Dog extends mamals{
//     String breed;
// }
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swim");
//     }
// }