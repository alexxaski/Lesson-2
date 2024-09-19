public class Main {
    public static void main(String[] args) {

        byte clientOS = 0;
        switch (clientOS) {
            case 0 :
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1 :
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой команды не существует");
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
        // надеюсь в этот раз все правильно сразу
    }
}

