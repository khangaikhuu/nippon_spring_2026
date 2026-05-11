
public class Example01 {

    // void — утга буцаахгүй, зүгээр ажиллана
    static void printLine(String text) {
        System.out.println(text);
    }

    // int — бүхэл тоо буцаана
    static int square(int n) {
        return n * n;
    }

    // Ex01
    // String параметр аваад 
    // Hello, тухайн параметрийг нийлүүлээд буцаадаг функц
    // бичнэ үү. Нэр нь stringConcat гэдэг нэртэй байна.
    // main дотор дуудаж үр дүнг 3 утгатай харуулна уу
    static String stringConcat(String name) {
        return "Hello" + name;
    }

    // Ex02
    // Утга буцаадаггүй зөвхөн 2 мөрөн дээр 
    // Чамайг хэн гэдэг
    // бас чиний нас хэд вэ гэдгийг хэвлэж харуулдаг
    // болгоорой. Параметр байхгүй. Нэр нь aboutMe.
    static void aboutMe() {
        System.out.println("I'm Khangaikhuu.");
        System.out.println("I'm 44 years old.");
    }

    // String — мөр буцаана
    static String repeat(String s, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += s;
        }
        return result;
    }
    // boolean — true/false буцаана
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(5)); // false
        System.out.println(isEven(4)); // true

        System.out.println(repeat("*", 5));
        System.out.println(repeat("+", 15));
        System.out.println(repeat("<>", 10));

        aboutMe();
        aboutMe();
        aboutMe();

        System.out.println(stringConcat("Khangaikhuu"));
        System.out.println(stringConcat("Myangaa"));
        System.out.println(stringConcat("Khishgee"));

        printLine("Hello");
        printLine("Test");

        int a = square(4);
        System.out.println(a); // 16
        int b = square(15);
        System.out.println(b); // 225
        System.out.println(square(16)); // 256
    }
}
