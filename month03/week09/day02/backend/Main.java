public class Main {
    public static void main(String[] args) {
        Father myFather = new Father("Uvgunkhuu", 69);
        myFather.printInfo();
        Son mySon = new Son("Khangaikhuu", 44);
        mySon.printInfo();
        // Please create Animal Instance. Print info хэвлэнэ үү.
        Animal animal = new Animal(false, "Male", "Animal");
        animal.printInfo();
        // Dog гэдэг класс үүсгээд түүнийг амьтнаас уламжлуулдаг болгоорой. Эрэгтэй тарган bulldog үүсгээрэй.
        // print info хэвлэнэ үү.
        Dog bulldog = new Dog(false, "Male", "Bulldog");
        bulldog.printInfo();
    }
}
