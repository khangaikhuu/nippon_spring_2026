// дээд түвшний хэл
// 
public class Main {
    static void printHello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println("Class and Objects");
        printHello();
        // 
        Human khangaikhuu = new Human();
        System.out.println(khangaikhuu.age); // dot notation
        System.out.println(khangaikhuu.firstName);
        System.out.println(khangaikhuu.lastName);
        System.out.println(khangaikhuu.gender);

        // setting properties буюу object-д утга оноох
        khangaikhuu.gender = "Eregtei";
        khangaikhuu.firstName = "Khangaikhuu";
        khangaikhuu.lastName = "Uvgunkhuu";

        System.out.println(khangaikhuu.age); // dot notation
        System.out.println(khangaikhuu.firstName);
        System.out.println(khangaikhuu.lastName);
        System.out.println(khangaikhuu.gender);
        // Horse
        Animal horse = new Animal();
        horse.race = "Mammalia";
        horse.gender = "Female";
        horse.age = 5;
        System.out.println(horse.race);
        System.out.println(horse.gender);
        System.out.println(horse.age);

        // 
        Child mychild = new Child("Khangaikhuu", 0);
        System.out.println(mychild.age);
        System.out.println(mychild.name);

        // Student
        Student zayaStudent = new Student(20, "Zaya", 4.0);
        System.out.println(zayaStudent.name);

        zayaStudent.printHello();
        zayaStudent.introduceMySelf();
        System.out.println(zayaStudent.nextYear());
        zayaStudent.nextYear(4.0);
    }
}
