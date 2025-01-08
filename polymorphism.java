public class polymorphism {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(2,3));
        System.out.println(c1.sum(3.4f,6.7f));
        System.out.println(c1.sum(2,3,5));
        deer d1 = new deer();
        d1.eat();

        
    }
    
}
class Calculator{
    public int sum(int a, int b){
        return a+b;

    }
    public float sum(float a, float b){
        return a+b;

    }
    public int sum(int a, int b,int c){
        return a+b+c;

    }
    
}

class Animal1{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer extends Animal1{
    void eat(){
        System.out.println("eat grass");
    }
}
