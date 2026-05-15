
/**
 * Шаардлага:
 * static int[] reverse(int[] arr) — урвуу дараалалтай шинэ массив буцаана
 * static int[] filterEven(int[] arr) — зөвхөн тэгш тоонуудыг буцаана
 * static int[] multiplyBy(int[] arr, int factor) — бүх элементийг factor-аар үржүүлнэ
 * static int secondMax(int[] arr) — 2-р хамгийн их утга
 * static void printArray(int[] arr) — [1, 2, 3] хэлбэрээр хэвлэнэ
 * Тест кейсүүд:
 *
 *  *Оролт	Метод	Гаралт
 * {1, 2, 3, 4, 5}	reverse	{5, 4, 3, 2, 1}
 * {1, 2, 3, 4, 5}	filterEven	{2, 4}
 * {1, 2, 3, 4, 5}	multiplyBy(3)	{3, 6, 9, 12, 15}
 * {3, 7, 2, 9, 5}	secondMax	7
 */
public class ArrayTransformer {
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    static int[] reverse(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - 1 - i];
        }
        return newArray;
    }
    // {1, 2, 3, 4, 5}	filterEven	{2, 4}
    static int[] filterEven(int[] arr) {
        int count =0;
        for(int i =0; i< arr.length;i++){
            if(arr[i] % 2 == 0){
                count = count + 1;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for(int i =0; i< arr.length;i++){
            if(arr[i] % 2 == 0){
                newArray[index++] = arr[i];
            }
        }
        return newArray;
    }
    //{1, 2, 3, 4, 5}	multiplyBy(3)	{3, 6, 9, 12, 15}

    static int[] multiplyBy(int[] arr, int factor) {
        for(int i=0; i < arr.length; i++){
            arr[i] = arr[i] * factor;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 7, 2, 9, 5};
        
        printArray(arr1);  // Result: [1, 2, 3, 4, 5]
        printArray(reverse(arr1)); // Expected: [5, 4, 3, 2, 1]
        printArray(filterEven(arr1)); // Expected: [2, 4]
        printArray(multiplyBy(arr1, 3)); // 
        printArray(arr1); // call by reference
    }
}
