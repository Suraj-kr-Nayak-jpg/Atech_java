public class oops {
    public static void main(String[] args) {
        car c1= new car();
        c1.model="hyundai";
        c1.color="Red";
        c1.launchYear=1995;
        c1.display();
    }
}
class car{
    String model;
    String color;
    int launchYear;
    void display(){
        System.out.println("model="+model);
        System.out.println("color="+color);
        System.out.println("launchYear="+launchYear);
    }

}
