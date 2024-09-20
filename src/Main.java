public class Main {
    public static void main(String[] args) {
/*Задача 1
У банка появилось мобильное приложение. Поэтому теперь,
когда пользователь заходит на сайт с телефона, ему предлагается
 скачать приложение с учетом того, какая операционная система у пользователя.
Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
 и выдает соответствующее сообщение:
Для iOS — «Установите версию приложения для iOS по ссылке».
Для Android — «Установите версию приложения для Android по ссылке».
Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).

Внимательно прочитал и скопировал сюда, не вижу жесткого условия
что код должен выглядеть в операторе else if.
Но все же переделал.
 */
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Такой команды нет");
        }

        short clientDeviceYear = 2014 ;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        short year = 1989 ;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }

        int deliveryDistance = 95 ;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 + срок доставки");
        } else if ( deliveryDistance <= 60 && deliveryDistance > 20) {
            System.out.println("Потребуется дней: 2 + срок доставки");
        } else if ( deliveryDistance <= 100 && deliveryDistance > 60) {
            System.out.println("Потребуется дней: 3 + срок доставки");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        byte monthNumber = 1 ;
        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("ЗИМА");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("ВЕСНА");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("ЛЕТО");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("ОСЕНЬ");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}