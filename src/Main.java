public class Main {
    public static void main(String[] args) {
        checkLeap(2029);
        chooseVersion(1, 2013);
        System.out.println("Доставка займет " + calculationDeliveryTime(33) + " дней.");
    }

    public static void checkLeap (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year > 1584) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    public static void chooseVersion (int OS, int year) {
        if (OS == 0 && year >= 2015) {
            System.out.println("Установите последнюю версию приложения для iOS по ссылке.");
        } else if (OS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (OS == 1 && year >= 2015) {
            System.out.println("Установите последнюю версию приложения для Android по ссылке.");
        } else if (OS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            throw new RuntimeException("Ошибка ввода данных.");
        }
    }

    public static int calculationDeliveryTime (int distance) {
        int deliveryTime = 0;
        if (distance <= 20) {
            deliveryTime = 1;
        } else if (distance <= 60) {
            deliveryTime = 2;
        } else if (distance <= 100) {
            deliveryTime = 3;
        } else {
            System.out.println("Доставка невозможна.");
            deliveryTime = 4545665;
        }
        return deliveryTime;
    }
}