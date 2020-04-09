package ru.geekbrains.J1.L1.hometask;

public class HomeTask01 {
    public static void main(String[] args){
        byte b = 123;
        short s = 1000;
        int i = 1234567890;
        long l = 12345678900L;

        float f = 31.123f;
        double d = 31.1234567;

        char a = 'a';

        boolean varBoolean = true;

        String varString = "this is string var!";

        System.out.println(l);
        System.out.println(d);
        System.out.println(varBoolean);
        System.out.println(varString);

        System.out.println(method_1(2,3, 10, 3));


        System.out.println(method_2(2,3));
        System.out.println(method_2(4,5));

        method_3(-125);
        method_3(23);
        method_3(0);

        System.out.println("if num = -1, method 4 have result = " + method_4(-1));
        System.out.println("if num = -5, method 4 have result = " + method_4(5));
        System.out.println("if num = 0, method 4 have result = " + method_4(0));


        System.out.println(method_5("Иван"));
        System.out.println(method_5("Сергей"));
        System.out.println(method_5("Наташа"));
        System.out.println(method_5("Маша"));


        method_6(2020);
        method_6(2019);
        method_6(2018);
        method_6(2017);
        method_6(2016);
        method_6(2000);
        method_6(1800);
        method_6(1700);
        method_6(1600);
        method_6(1500);
        method_6(1400);
        method_6(0);

    }


    private static float method_1(int a, int b, int c, int d){
        return a * (b + (c / d));
    }


    private static boolean method_2(int x, int y){
        boolean resultVar;
        if (x * y > 10 && x * y <= 20){
            return true;
        }
        return false;
    }


    private static boolean method_3(int x){
        if (x >= 0){
            return true;
        }
        return false;
    }


    private static boolean method_4(int x){
        if (x >= 0){
            return false;
        }
        return true;
    }


    private static String method_5(String name){
        return "Привет, " + name + "!";
    }


    /*
     * Чтобы компенсировать накопившуюся ошибку и избежать подобного смещения в будущем,
     * в 1582 году римский папа Григорий XIII провёл реформу календаря. Чтобы средний календарный
     * год лучше соответствовал солнечному, было решено изменить правило високосных лет.
     * По-прежнему високосным оставался год, номер которого кратен четырём, но исключение делалось для тех,
     * которые были кратны 100. Такие годы были високосными только тогда, когда делились ещё и на 400.
     *
     * Отсюда следует распределение високосных годов:
     *
     * - год, номер которого кратен 400, — високосный;
     * - остальные годы, номер которых кратен 100, — невисокосные (например, го­ды 1700, 1800, 1900, 2100);
     * - остальные годы, номер которых кратен 4, — високосные[5].
     */

    private static void method_6(int year){
        if (year <= 0){
            System.out.println(year + " это некорректное значение года");
        } else if (year % 400 == 0) {
            System.out.println(year + " это високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " это не високосный год");
        } else if (year % 4 == 0){
            System.out.println(year + " это високосный год");
        } else {
            System.out.println(year + " это не високосный год");
        }
    }
}
