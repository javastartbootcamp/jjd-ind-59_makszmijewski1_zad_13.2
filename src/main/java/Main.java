import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        int a;
        while ((a = scanner.nextInt()) > 0) {
            numbers.add(a);
        }
        if (!numbers.isEmpty()) {
            showReverseList(numbers);
            showSum(numbers);
            showMinNumber(numbers);
            showMax(numbers);
        } else {
            System.out.println("Lista jest pusta");
        }
    }

    private void showMax(List<Integer> numbers) {
        int largetst = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largetst) {
                largetst = numbers.get(i);
            }
        }
        System.out.println("Największa liczba w liście to " + largetst);
    }

    private void showMinNumber(List<Integer> numbers) {
        int smallest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + smallest);
    }

    private void showSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i) + " + ");
        }
        System.out.print(numbers.get(numbers.size() - 1) + " = " + sum);
        System.out.println();
    }

    private void showReverseList(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i > 0; i--) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.print(numbers.get(0));
        System.out.println();
    }
}
