public class Main {

    public static int getClientOS(int clientOS1, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        return 0;

    }



    public static int showLeapYear(int years) {
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println(years + " " + "год является високосным");
        } else {
            System.out.println(years + " " + "год не является високосным");
        }
        return years;
    }

    public static int showTimeDelivery(int deliveryDistance) {
        int timeDelivery = 1;
        if (deliveryDistance > 20) {
            timeDelivery++;
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            timeDelivery++;
        }
        System.out.println("Потребуется дней: " + timeDelivery);

        return timeDelivery;

    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println("задание 1");
        System.out.println();

        int getInfo = getClientOS(0, 2013);



        System.out.println();
        System.out.println("задание 2");
        System.out.println();

        int leapYear = showLeapYear(2100);

        System.out.println();
        System.out.println("задание 3");
        System.out.println();

        int deliveryTime = showTimeDelivery(90);
    }




}