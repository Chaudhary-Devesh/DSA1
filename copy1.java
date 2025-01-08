public class copy1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        student1 s1 = new student1();
        s1.name="Devesh";
        s1.roll=162;
        s1.password="Chaudhary";
        s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=90;
        student1 s2 = new student1(s1);
        s2.marks[0]=20;
        System.out.println(s1.marks[0]);
        System.out.println(s2.marks[0]);
        s2.name="Sunil";
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
    
}
class student1{
    String name;
    int roll;
    String password;
    int marks[];
    student1(student1 s1){
        this.marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;


    }
    student1(){
        this.marks = new int[3];
        System.out.println("runing");
    }

}
    

