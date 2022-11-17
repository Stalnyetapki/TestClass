public class Main {
    public static void main(String[] args) {
        byte byteNumber = -128;
        short shortNumber = -32768;
        int intNumber = -2147483648;
        long longNumber = -9223372036854775808L;
        double doubleNumber = 100.005d;

        //переполнение byte
        byteNumber  = (byte) (byteNumber - 1);
        System.out.println(byteNumber);

        //переполнение short
        shortNumber  = (short) (shortNumber - 1);
        System.out.println(shortNumber);

        //переполнение int
        intNumber  = intNumber - 1;
        System.out.println(intNumber);

        //переполнение longNumber
        longNumber  = longNumber - 1L;
        System.out.println(longNumber);

        //Сложение byte и short - вышло за рамки диапазона short  - привелось к int
        System.out.println(byteNumber + shortNumber);

        //Сложение short и int - вышло за рамки диапазона int  - произошло переполнение
        System.out.println(intNumber + shortNumber);

        //Сложение int и long - вышло за рамки диапазона long  - произошло переполнение
        System.out.println(intNumber + longNumber);

        //Сложение int и double - произошло приведение к double без переполнения
        System.out.println(intNumber + doubleNumber);





    }
}
