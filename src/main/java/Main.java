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
        boolean condition = true;
        int a;
        while (condition) {
            a = scanner.nextInt();
            if (a > 0) {
                numbers.add(a);
            } else {
                condition = false;
            }
        }
        showReverseList(numbers);
        showSum(numbers);
        showMinNumber(numbers);
        showMax(numbers);
    }

    private void showMax(List<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println("Największa liczba w liście to " + numbers.get(numbers.size() - 1));
    }

    private void showMinNumber(List<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println("Najmniejsza liczba w liście to " + numbers.get(0));
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
