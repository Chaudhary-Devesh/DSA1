public class Abstracta {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);

        Chiken c1 = new Chiken();
        c1.eat();
        c1.walk();

        
    }
    
}
abstract class Animal1{
    String color;
    Animal1(){
        color="brown";
    }
    void eat(){
        System.out.println("animals eats");
    }
    abstract void walk();
}
class Horse extends Animal1 {
    void changecolor(){
        color = "White";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }

    
}
class Chiken extends Animal1 {
    void walk(){
        System.out.println("walks in 2 legs");
    }

    
}
