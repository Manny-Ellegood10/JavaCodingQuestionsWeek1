public class SumOFTwoAndSeven {
    public static int solution(int number) {
        int totalOfMultipleOf20r7 = 0;
        if (number < 0) {
            return 0;
        } else if (number > 0) {
            for (int i = 0; i < 1000; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    totalOfMultipleOf20r7 = totalOfMultipleOf20r7 + i;
                }
            }
        }
        return totalOfMultipleOf20r7;
    }
}
