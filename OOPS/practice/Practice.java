public class Practice {
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1 = new Book(100);
        Book b2 = new Book(150);
        System.out.println(b2.count);

        Vehicle v1 = new Car();
        v1.print1();
        

    }
}

class Book{
    int price ;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}

class Vehicle{
    void print1(){
        System.out.println("Default constructor");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Child Class constructor");
    }
}