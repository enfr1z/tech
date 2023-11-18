package tech.tasks;

public class TaskTest {
    public static void main(String[] args) {
        int[] digits = {1, 0, 0, 0};
        int size = digits.length;
        int response = digits[0];
        int response2;


        for (int i = 1; i < size; i++) {
            response *= 10;
            response += digits[i];
        }

        System.out.println(response);
        response += 1;
        response2 = response;
        int size2 = 0;
        while (response2 != 0) {
            size2++;
            response2 /= 10;
        }
        int[] responseArray = new int[size2];
        int iterator = size2 - 1;
//        while (response != 0) {
        for (int i = size2 - 1; response != 0; i--) {
            responseArray[i] = response % 10;
            response /= 10;
//            iterator--;
        }
        for (int i = 0; i < responseArray.length; i++) {
            System.out.print(responseArray[i]);
        }
    }
}
