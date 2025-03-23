public class method_overriding {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.sound();
    }
}
class Animals{
    void sound(){
        System.out.println("sound");
    }
}
class Dogs extends Animals{
    @Override
    void sound(){
        System.out.println("Bhaw");
    }
}
