public class opps{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.setColor("blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // p1.color="red";
        // System.out.println(p1.color);
        // Student s1 = new Student();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        BankAccount mybn = new BankAccount();
        mybn.userName="Devesh";
        mybn.setPassword("chaudhary");
        

        
    }
}
class BankAccount{
    public String userName;
    // private String password;
    public void setPassword(String pwd){
        // password = pwd;
    }
    
}
class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy , int chem, int math ){
        percentage = (phy+chem+math)/3;
    }
}