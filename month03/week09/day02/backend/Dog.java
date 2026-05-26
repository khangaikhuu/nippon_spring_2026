public class Dog extends Animal{
    
    public Dog(boolean canRun, String gender, String race) {
        super(canRun, gender, race);
    }

    @Override
    public void printInfo() {
        System.out.println("Dog has gender of " + getGender() + ". " + getRace());
    }
}

/**
 * Bird class үүсгээд түүнийг Animal class-аас удамшуулаад
 * Шинээр printInfo функцыг шувуу бол нисдэг гэхдээ хааяаа гүйж чаддаг
 * эмэгтэй гэж хэвлэдэг болгоорой.
 * Нэмээд дээрээс нь iCanFly гэдэг boolean утга буцаадаг функц бичиж 
 * Main дээрээ дуудаж харуулаарай.
 */