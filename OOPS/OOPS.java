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