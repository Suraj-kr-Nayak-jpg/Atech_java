public class mobile_phone {
    public static void main(String[] args) {
        mobile_phone1 s22 = new mobile_phone1();
        s22.model = "ultra series";
        s22.Ram = 12;
        s22.color = "Black";
        s22.battery = 100;
        s22.storage = 256;
        s22.sim_slot = 2;
        s22.processor = "Snap_dragon";
        s22.display();
    }
}
class mobile_phone1{
    String model;
    int Ram;
    int storage;
    String processor;
    int battery;
    String color;
    int sim_slot;

    void display(){
        System.out.println("model= " + model);
        System.out.println("storage= " + storage);
        System.out.println("processor= " + processor);
        System.out.println("battery= " + battery);
        System.out.println("color= " + color);
        System.out.println("Ram =" + Ram);
        System.out.println("sim_slot= " + sim_slot);
    }
}

