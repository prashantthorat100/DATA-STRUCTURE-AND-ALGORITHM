public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);
        // h.color = "black";

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
        ch.changeColor();
        System.out.println(ch.color);

        Mustang m = new Mustang();
        m.eat();
        

    }
}


abstract class Animal{
    String color ;

    public Animal() {
        System.out.println("Animal Constructor Called");
    }

    
    void eat(){
        System.out.println("Animal Eats");
    } 
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    public Mustang() {
        System.out.println("Mustang Constructor Called");
    }
    
}

class Chicken extends Animal{

    Chicken() {
        System.out.println("Chicken Constructor Called");
    }
    
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}