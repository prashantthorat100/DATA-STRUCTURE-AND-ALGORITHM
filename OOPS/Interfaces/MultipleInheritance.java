public class multipleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.house();
        c.car();
    }
}

interface Father {
    void house();
}

interface Mother {
    void car();
}

class Child implements Father, Mother {

    public void house() {
        System.out.println("Father's house");
    }

    public void car() {
        System.out.println("Mother's car");
    }
}

