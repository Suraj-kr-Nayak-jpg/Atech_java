public class construct_overloading {
    public static void main(String[] args) {
        Car c1 = new Car("x1","blue",1995);
        c1.display();
    }
}
class Car{
    String model;
    String color;
    int date;

    Car(String model, String color, int date) {
        this.model = model;
        this.color = color;
        this.date = date;
    }

    Car() {
        model = "x2";
        color = "red";
        date = 1962;
    }

    Car(String model){
        this.model=model;
        this.color="purple";
        this.date=2000;
    }
    void display(){
        System.out.println("model="+model+"color="+color+"launch on"+date);
    }
}