package tech;


/*
    Вывести числа в формате 123, 124, 125, 126, 127, 128, 129, 134, 135, 136 ... 789
    Можно использовать только циклы while ветвления if длина строки не должна превышать 80 символов
    Количество строк кода в main должно быть не больше 25
    12,13,14,15,16,17, 18, 19, 23, 24, 25, 26, 27, 28 ... 89
 */
public class Main {
    public static void main(String[] args) {
        int digital = 1;
        int digital2 = 2;
        int digital3 = 3;
        while (digital <= 7) {
            while (digital2 <= 8) {
                while (digital3 <= 9) {
                    if (digital3 > digital2 && digital2 > digital) {
                        System.out.print(digital + "" + digital2 + "" + digital3);
                        if (digital3 != 9 || digital2 != 8 || digital != 7) {
                            System.out.print(", ");
                        }
                    }
                    digital3++;
                }
                digital3 = 0;
                digital2++;
            }
            digital2 =  0;
            digital++;
        }
    }
}


