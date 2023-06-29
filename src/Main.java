public class Main {
    public static void main(String[] args) {
        int account = 100;
        int pay = 2001;
        int bonus = pay > 1000 ? pay / 100 : 0;
        int total = account + pay + bonus;
        if (bonus == 0) {
            System.out.println("Клиент пополнил счёт на " + pay + " рублей — бонусов нет, итоговая сумма на счету клиента — " + total + " рублей.");
        } else {
            System.out.println("Клиент пополнил счёт на " + pay + " рублей — бонус равен " + bonus + " рублям, итоговая сумма на счету клиента — " + total + " рублей.");
        }

    }
}