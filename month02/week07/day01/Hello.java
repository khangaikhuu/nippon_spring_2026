public class Hello {
    // reusage - Java Method/Function
    // java method definition - жавагийн функцын тодорхойлолт
    static void hello (String name) {
        System.out.println("=== Тавтай морилно уу ===");
        System.out.println("Хэрэглэгч: " + name);
        System.out.println("========================");
    }
    public static void main(String[] args) {
        // Метод ашиглаагүй — давтагдаж байна
        // Метод ашиглах - method/function call
        // аргумент буюу бодит утга параметрийн оронд орлуулах
        hello("Батаа");
        hello("Сарнай");
        hello("Хангайхүү");
        hello("Саруултөгс");
    }
}
