public class inheritance{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dogs tommy = new Dogs();
        tommy.legs = 4;
        tommy.breathe();
        System.out.println(tommy.legs);

        Bird crow = new Bird();
        crow.feather = 220;
        crow.fly();

        Mammals human = new Mammals();
        human.legs = 2;
        human.walk();

        shark.swim();
    }
}


// Parent Class , Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}


// SingleLevel inheritance
// heirarchical level inheritance
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("can walk");
    }
}
// heirarchical level inheritance
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("can swim");
    }
}
// heirarchical level inheritance
class Bird extends Animal{
    int feather;
    void fly(){
        System.out.println("can fly");
    }
}




// MultiLevel inheritance
class Dogs extends Mammals{
    String Breed;
    void breed(){
        System.out.println("DobberMan");
    }
}

// Child Class , Derived , SubClass
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Can Swim in water");
//     }
// }