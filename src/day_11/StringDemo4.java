package day_11;

public class StringDemo4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(array);
    }

    private static void print(int[] array) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            str.append(array[i]);
            if(i != array.length - 1) {
                str.append(", ");
            }
        }
        str.append("]");
        System.out.println(str);
    }
}
