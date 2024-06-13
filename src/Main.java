public class Main {
    public static void main(String[] args) {

        // Задача 1
        /*С помощью цикла while посчитайте, сколько месяцев потребуется,
         чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и
         готовы откладывать по 15 тысяч рублей.
         Результат программы должен быть выведен в консоль с тем количеством месяцев,
         которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .*/

        System.out.println("Задача 1");
        int salary1 = 15000;
        int total1 = 0;
        int i = 1;
        final int INITIAL_AMOUNT = 2_459_000;
        while (total1<INITIAL_AMOUNT){
            total1 +=  salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +total1+ "рублей");
            i++;
        }

        // Задача 2
        /*Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        Для обоих циклов можно использовать как одну общую переменную, так и свою в каждом цикле.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующим:
        1 2 3 4 5 6 7 8 9 10
        10 9 8 7 6 5 4 3 2 1*/

        System.out.println("Задача 2");
        i=1;
        while (i<=10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i>0; i--){
            System.out.print(i + " ");
        }
         System.out.println();

        // Задача 3
        /*В стране Y население — 12 миллионов человек.
        Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет,
        если показатели рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».*/

        System.out.println("Задача 3");
        int countPeople = 12_000_000;
        int countBirth = 17;
        int countMort = 8;
        int countPlus = countBirth - countMort;
        double countPlus1000 = (double) countPlus/1000;
        int year = 1;
        while (year<=10){
            countPeople += countPeople*countPlus1000;
            System.out.println("Год " + year + ", численность населения составляет "+ countPeople);
            year++;
        }

        // Задача 4
        /*Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
         Первоначальная сумма вклада — 15 тысяч рублей.
        Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.*/

        System.out.println("Задача 4");
        double total = 15000;
        final double INTEREST_RATE = 0.07;
        final int INITIAL_AMOUNT_VASILII = 12_000_000;
        i = 1;
        while (total<=INITIAL_AMOUNT_VASILII){
            total += total*INTEREST_RATE;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +Math.round(total)+ "рублей");
            i++;
        }

        // Задача 5
        /*Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
         а только каждый шестой. Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.*/

        System.out.println("Задача 5");
        total = 15000;
        i = 1;
        while (total<=INITIAL_AMOUNT_VASILII){
            total += total*INTEREST_RATE;
            if (i % 6==0){
                System.out.println("Месяц " + i + ", сумма накоплений равна " +Math.round(total)+ "рублей");
            }
            i++;
        }

        // Задача 6
        /*Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать,
        какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.*/

        System.out.println("Задача 6");
        total = 15000;
        i = 1;
        int period = 12*9;
        while (i <= period){
            total += total*INTEREST_RATE;
            if (i % 6==0){
                System.out.println("Месяц " + i + ", сумма накоплений равна " +Math.round(total)+ "рублей");
            }
            i++;
        }

        // Задача 7
        /*В компании пятница — отчетный день.
        Нужно написать программу, которая считает дни месяца по датам, определяет, какой день — пятница,
        и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.*/

        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        // Задача 8
        /*Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
        а также следующий год ее появления (ближайшие 100 лет).
        Для вычисления периода можно создать две дополнительные переменные, которые содержат
         год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и
         100 лет после в качестве завершения периода расчета.
        В результате решения задачи в консоли должен получиться следующий результат:
        1896
        1975
        2054*/

        System.out.println("Задача 8");
        int dateT = 2024;
        int date1 = dateT - 200;
        int date2 = dateT + 100;
        i = 0;
        while (i<=date2){
            if (i >= date1) {
                System.out.println(i);
            }
            i = i+79;
        }
    }
}