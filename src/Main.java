import java.util.Scanner;

/* ДЗ доработать калькулятор на использование методов, разнести функционал по методам:
сумма отдельно, разность отдельно и т.д Выполнить запрос новых данных в бесконечный цикл */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.print("\nВведите первое число: ");
        int a = scanner.nextInt();

        System.out.print("""
                Если Вас интересует сложение, то введите цифру 1
                Если Вас интересует вычитание, то введите цифру 2
                Если Вас интересует умножение, то введите цифру 3
                Если Вас интересует деление, то введите цифру 4
                Ваш выбор:\s""");
        int vybor = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int result = 0;

        switch (vybor) {
            case 1:
                result = addition(a, b);
                System.out.println("Сумма введённых Вами чисел: " + result);
                break;
            case 2:
                result = subtraction(a, b);
                System.out.println("Разность введённых Вами чисел: " + result);
                break;
            case 3:
                result = multiplication(a, b);
                System.out.println("Произведение введённых Вами чисел: " + result);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Деление на 0 невозможно");
                } else {
                    result = division(a, b);
                    System.out.println("Частное введённых Вами чисел: " + result);
                }
                break;
            default:
                System.out.println("""
                        Вы не были внимательны, данная операция не предусмотрена.
                        Отличного времени суток! До свидания!))""");
                scanner.close();
                return;
        }
        }
    }

    public static int addition(int a, int b){
        return a+b;
    }

    public static int subtraction(int a, int b){
        return a-b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static int division(int a, int b){
        return a/b;
    }
}