public class WhileLoop {
    public static void main(String[] args) {
        int i = 3;
        while (i <= 5) {
            System.out.println(i + " ");
            i++;
        }

        
        // 3, 4, 5

        // 2, 4, 6, 8 how to?
        i = 2;
        while(i < 9) {
            System.out.print(i + " ");
            i = i + 2;
        }
        System.out.println();
    }
}
