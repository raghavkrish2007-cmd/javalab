public class Main {

    // Generic function to find maximum
    public static <T extends Comparable<T>> T findMax(T[] data) {
        T max = data[0];

        for (T value : data) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 25, 5, 40, 15};
        Double[] decimals = {2.5, 8.7, 3.2, 9.1};
        String[] names = {"Apple", "Mango", "Banana", "Orange"};

        System.out.println("Maximum Integer: " + findMax(numbers));
        System.out.println("Maximum Double: " + findMax(decimals));
        System.out.println("Maximum String: " + findMax(names));
    }
}
