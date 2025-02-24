public class inheritance {
    public static void main(String[] args) {
        Honda h1 =new Honda();
        h1.name_of_cars("Car1");
        h1.car_model();
        h1.body_type();
    }
}
class Body_makers{
    void body_type(){
        System.out.println("Platinum body");
    }
}
class cars extends Body_makers{
    String car_name;
    void name_of_cars(String car_name){
        this.car_name=car_name;
        System.out.println("car name is " +car_name);
    }
}
class Honda extends cars{
    void car_model(){
        System.out.println("Honda City");
    }


}
