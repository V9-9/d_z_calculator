import java.util.Scanner;

/*     ДЗ: Доработать калькулятор, получение от пользователя действия, которое нужно выполнить.
Можно получить таким образом - если пользователь вводит 1, то это сложение, 2 - разность и т.д.
Вывести результат действия. Используйте конструкции if -else, case.                          */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Если Вас интересует сложение, то введите цифру 1\nЕсли Вас интересует"
               + " вычитание, то введите цифру 2\nЕсли Вас интересует умножение, то введите цифру 3"
               + "\nЕсли Вас интересует деление, то введите цифру 4\nВаш выбор: ");
        int vybor = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        scanner.close();

        switch (vybor) {
            case 1:
                int c = a + b;
                System.out.println("\nСумма введённых Вами чисел: " + c);
                break;
            case 2:
                int d = a - b;
                System.out.println("\nРазность введённых Вами чисел: " + d);
                break;
            case 3:
                int e = a * b;
                System.out.println("\nПроизведение введённых Вами чисел: " + e);
                break;
            case 4:
                if (b==0){
                    System.out.println("Деление на 0 невозможно");
                    break;
                }
                int f = a / b;
                System.out.println("\nЧастное введённых Вами чисел: " + f);
                break;
            default:
                System.out.println("\nВы не были внимательны, данная операция не предусмотрена.\nОтличного времени суток! До свидания!))");
        }
    }
}