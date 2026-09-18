public class methodOverRide {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
}

// RunTime PolyMorphism
class Animal{
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat Grass and Leaves only");
    }
}

