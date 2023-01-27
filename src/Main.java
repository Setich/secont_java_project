import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    public static void firstTask() {
        /* С клавиатуры задаются координаты точки, а также радиус круга, центр которого находится в начале координат.
                Определить, принадлежит ли данная точка кругу. */
        //Необходимо вычеслить гиппотинузу координатами x и y для нахождления точки
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение координаты x");
        //переменная точки x
        int x = sc.nextInt();

        System.out.println("Введите значение координаты y");
        //переменная точки y
        int y = sc.nextInt();

        System.out.println("Введите радиус круга");
        //переменная радиуса круга
        int radius = sc.nextInt();
        //вычисление гипотенузы
        int hypotenuse = x * x + y * y;

        //Если длинна гипотенузы меньше или ровна радиусу то точка принадлежит кругу. Иначе - нет.
        if(hypotenuse <= radius) {
            System.out.println("Точка принадлежит кругу");
        } else {
            System.out.println("Точка кругу не принадлежит");
        }
    }

    public static void secondTask() {
        /*Вычисление значения функции
        Требуется написать программу, вычисляющую значение какой-либо функции у = f(x). Допустим, такой:
        у = x – 2, если x > 0,
        y = 0, если x = 0,
        y = |x|, если x < 0. */

        //Объект сканер, с входным потоком
        Scanner sc = new Scanner(System.in);
        //считываем переменную ввода с клавиатуры
        System.out.println("Введите значение функции у = f(x)");
        int x = sc.nextInt();
        //переменная для y
        int y = 0;

        if(x > 0){
            y = x - 2;
        } else if(x == 0) {
            y = 0;
        } else {
            y = Math.abs(x);            //про модуль числа нашел тут https://proglang.su/java/numbers-abs
        }
        System.out.println(y);
    }
}
