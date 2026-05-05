public class Array01 {
    public static void main(String[] args) {
        // 100 variable
        int a = 6;
        a = 7;
        double b = 5.6;
        String name = "Eegi";
        char letter = 'C';
        boolean hudal = false;

        // array төрөлтэй variable
        int[] buhelToonuud = {1, 10, 5, 6, 7};

        // boolean
        // String
        // double
        // char
        String[] names = {"Бат", "Дорж", "Сүрэн"};
        double[] prices = {12.99, 5.50, 8.75};
        boolean[] hudluud = {false, false, false};
        char[] usegnuud = {'A','B'};
        System.out.println(names);

        // index гэдэг зүйл буюу элемент сонгох
        // index => 0 гэдэг тооноос эхэлдэг
        System.out.println(names[0]);
        // бусад элементүүдийг хэвлэнэ үү
        // 3-р index дээх элементийг хэвлэнэ үү
        System.out.println(names[2]);
        System.out.println(prices[1]); // 5.50
        prices[1] = 4.50;
        System.out.println(prices[1]); // 4.50


        // array хэдэн элементтэй болохыг мэдэх
        System.out.println(usegnuud.length);

        // 10 тоотой myNumbers гэдэг double төрөлтэй array үүсгэнэ үү
        double[] myNumbers =  {5.6, 7.5, 10.0, 5.7, 1.5, -1.8, 10.6, 7.4, 10.6, 99.5};

        // 5 дахь элементийг 1-ээр нэмэгдүүлж хадгална уу
        myNumbers[4] = myNumbers[4] + 1;
        // эхний элементийг 0 болгоно уу
        myNumbers[0] = 0;
        // хамгийн сүүлчийн элементийг 8-аар нэмэгдүүлээд хадгална уу
        myNumbers[myNumbers.length - 1] = myNumbers[myNumbers.length - 1] + 8;
        // бүх элементүүдийг доош нь цувуулан хэвлэнэ үү
        for(int i = 0; i < myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }

    }
}
