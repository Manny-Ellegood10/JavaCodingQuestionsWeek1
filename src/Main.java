public class Main {
    public static int solution(int number) {
        int totalOfMultipleOf30r5 = 0;
        if (number < 0) {
            return 0;
        } else if (number > 0) {
            for (int i = 0; i < 1000; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    totalOfMultipleOf30r5 = totalOfMultipleOf30r5 + i;
                }
            }
        }
        return totalOfMultipleOf30r5;
    }
}