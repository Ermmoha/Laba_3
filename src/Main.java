import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для сортировки: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();
        insertionSort(characters);

        String sortedString = new String(characters);
        System.out.printf("Отсортированная строка: %s ",sortedString );
    }
    public static void insertionSort(char[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            char key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}