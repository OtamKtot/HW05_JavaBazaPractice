package javaBaza;

public class  Main {
    public static void main(String[] args) {
/*      примитивные типы данных:

        boolean — логические тип;
        хранит значение true и false.
        boolean isTrue = true;
        boolean isFalse = false;

        char — хранит одиночный символ
         2 бита памяти.
        char a = 'a';

        String — строковые переменные, не представляют собой примитивы и хранят в себе целые строки.
        String name = "Alex";

        0)=====HW====вещественные типы / числа с плавающей точкой

        byte — целочисленный тип;
        хранит целое число от -128 до 127;
         1 бит памяти.
        byte a = -128;
        byte b = 127;

        short — целочисленный тип;
        хранит целое число от -32'768 до 32'767;
         2 бита памяти.
        short a = -32768;
        short b = 32767;

        int — целочисленный тип;
        хранит целое число от -2'147'483'648 до 2'147'483'647;
         4 бита памяти.
        int a = -2147483648;
        int b = 2147483647;

        long — целочисленный тип;
        хранит целое число от –9'223'372'036'854'775'808 до 9'223'372'036'854'775'807;
         8 бит памяти.
        long a = –9223372036854775808L;
        long b = 9223372036854775807L;

        float — хранит число с плавающей точкой от -3.4E+38 до 3.4E+38.
         32 бита памяти.
        float a = 8.5F;
        float b = -3.2F;

        double — хранит число с плавающей точкой от -1.7E+308 до 1.7E+308.
         64 бита памяти.
        double a = 8.5;
        double b = -3.2;
*/

/*      1)====HW====поупражняться с математическими и логическими операторами,
        добиться переполнения при вычислениях,
      результаты вывести в консоль

 */
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println("Given:");
        System.out.println("a = 10");
        System.out.println("b = 20");
        System.out.println("c = 30");
        System.out.println("d = 40");
        System.out.println("==================");
        System.out.println("Arithmetics results:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (a--));
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));
        System.out.println("==================");


        if (a > b) {
            System.out.println("Logic results:");
            System.out.println("a > b IS TRUE!");
            System.out.println("==================");
        } else if (a > b) {
            System.out.println("Logic results:");
            System.out.println("a < b IS TRUE!");
            System.out.println("==================");
        } else if (a == b) {
            System.out.println("Logic results:");
            System.out.println("a equal b IS TRUE!");
            System.out.println("==================");
        } else if (a < b && c > a) {
            System.out.println("Logic results:");
            System.out.println("a lesser then b & c greater then a");
            System.out.println("==================");
        }


        // Overload
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Overload:");
        System.out.println("maxValue + 1 : " + (maxValue + 1));
        System.out.println("==================");

        //попробовать вычисления комбинаций типов данных (int и double)
        double x = 10.5;
        int y = 20;
        double z = 20.5;
        System.out.println("int + double combination");
        System.out.println(x + y + z);
        System.out.println((x + y) - z);
    }
}