public class OOPS{

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setTip(12);
        System.out.println(p1.color);
        System.out.println(p1.tip);


        BankAccount myAcc = new BankAccount();
        myAcc.userName = "newUser";
        myAcc.setPassword("hello");
        System.out.println( myAcc.getPassword());

        // Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student(22);
        Student s4 = new Student("Pranav",27);
        System.out.println(s4.name);
        System.out.println(s2.name);
        System.out.println(s3.age);
        System.out.println(s4.rollNo + s4.name);

        s2.name = "Sunny";
        s2.age = 20;
        s2.password = "movie";
       

        s2.marks[0] = 89;
        s2.marks[1] = 99;
        s2.marks[2] = 79;
        // Copy Constructor
        Student s1 = new Student(s2);

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.password);

        s2.name = "dhiraj";
        s2.marks[0] = 100;
        System.out.println(s2.marks[0]);
        System.out.println(s1.marks[0]);

        



        


    }
}

class BankAccount{
    private String Password;
    public String userName;
    public void setPassword(String pwd){
        this.Password = pwd;
    }
    public String getPassword(){
        return this.Password;
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
    public String getColor(){
        return this.color;
    }
    public int getTip(){
        return this.tip;
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    String password;
    int marks[] ;

    // shallow copy Constructor
    // Student(Student s2) {
    //     marks = new int[3];
    //     this.name = s2.name;
    //     this.age = s2.age;
    //     this.password = s2.password;
    //     this.marks = s2.marks;

    // }
    // Deep Copy Constructor
    Student(Student s2) {
        marks = new int[3];
        this.name = s2.name;
        this.age = s2.age;
        this.password = s2.password;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s2.marks[i];
        }

    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    public Student(String name) {
        this.name = name;
        marks = new int[3];
    }
    public Student(int age){
        this.age = age;
        marks = new int[3];
    }
    public Student(String name,int rollNo){
        this.rollNo = rollNo;
        this.name = name;
        marks = new int[3];
    }

    

}