public class BubbleSortExample {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Внешний цикл — сколько «волн» делаем
        for (int i = 0; i < n - 1; i++) {
            // Внутренний цикл — сравниваем соседей
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Фиксированный массив
        int[] data = {64, 34, 25, 12, 90, 11, 5};

        System.out.print("До сортировки: ");
        printArray(data);

        bubbleSort(data);

        System.out.print("После сортировки: ");
        printArray(data);
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
