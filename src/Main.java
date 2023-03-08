public class Main {
    public static void main(String[] args) {
        task1and2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1and2() {
        byte xs = 67;
        short s = -159;
        short s2 = 569;
        int m = 27897;
        long l = 987678965549L;
        float xl = 2.786F;
        double xxl = 27.12;

        System.out.println("Значение переменной xs с типом byte равно "+ xs);
        System.out.println("Значение переменной s с типом short равно "+ s);
        System.out.println("Значение переменной s2 с типом short равно "+ s2);
        System.out.println("Значение переменной m с типом int равно "+ m);
        System.out.println("Значение переменной l с типом long равно "+ l);
        System.out.println("Значение переменной xl с типом float равно "+ xl);
        System.out.println("Значение переменной xxl с типом double равно "+ xxl);
    }
    public static void task3() {
        int ludmilaP = 23;
        int annaS = 27;
        int ekaterinaA = 30;
        int totalPeper = 480;
        int paperPerPerson = totalPeper/(ludmilaP + annaS + ekaterinaA);
        System.out.println("На каждого ученика рассчитано " + paperPerPerson + " листов бумаги.");
    }
    public static void task4() {
        int bottle2Min = 16 ;
        int bottle1Min = bottle2Min/2 ;
        int bottle20Min = bottle1Min*20;
        int bottle24Hours = bottle1Min*1440;
        int bottle3Day = bottle1Min*4320;
        int bottle1Month = bottle1Min*43200; // из расчета что в месяце 30 дней
        System.out.println("За 20 минут машина произвела " + bottle20Min + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottle24Hours + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottle3Day + " штук бутылок.");
        System.out.println("За месяц (из 30 дней) машина произвела " + bottle1Month + " штук бутылок.");
    }
    public static void task5() {
        int totalTin = 120;
        int whiteTinPerRoom = 2;
        int brownTinPerRoom = 4;
        int totalTinPerRoom = whiteTinPerRoom + brownTinPerRoom;
        int numberOfRooms = totalTin/totalTinPerRoom;
        int totalWhiteTin = numberOfRooms*whiteTinPerRoom;
        int totalBrownTin = numberOfRooms*brownTinPerRoom;
        System.out.println("В школе, где " + numberOfRooms + " классов, нужно " + totalWhiteTin + " банок белой краски и " + totalBrownTin + " банок коричневой краски.");
    }
    public static void task6() {
        int bananas = 5 ;
        int weightBananas = bananas * 80;
        double milk = 200;
        double volumeMilk =  milk * (105f/100);
        int iceCream = 2 ;
        int weightIceCream = iceCream * 100;
        int egg = 4 ;
        int weightEgg = egg * 70;
        double totalWeightGr = weightBananas + volumeMilk + weightIceCream + weightEgg;
        double totalWeightKg = totalWeightGr/1000;
        System.out.println("Вес спортзавтрака в граммах : " + totalWeightGr + " , а в килограммах : "+ totalWeightKg);
    }
    public static void task7() {
        int totalWeightKg = 7;
        int totalWeightGr = totalWeightKg*1000;
        int minWeightPerDay = 250;
        int maxWeightPerDay = 500;
        int minTime = totalWeightGr / maxWeightPerDay;
        int maxTime = totalWeightGr / minWeightPerDay;
        int averageTime = (minTime + maxTime) / 2;
        System.out.println("Минимальное время на похудение: " + minTime+ " максимальное : " + maxTime + " среднее время: " + averageTime);
    }
    public static void task8() {
        int MashaW = 67760;
        int DenisW = 83690;
        int KristinaW = 76230;

        int MashaWperY = MashaW *12;
        int DenisWperY = DenisW *12;
        int KristinaWperY = KristinaW *12;

        int MashaNW = MashaW + (MashaW*10/100);
        int DenisNW = DenisW + (DenisW*10/100);
        int KristinaNW = KristinaW + (KristinaW*10/100);

        int MashaNWperY = MashaNW * 12;
        int DenisNWperY = DenisNW *12;
        int KristinaNWperY = KristinaNW *12;

        int diffMasha = MashaNWperY - MashaWperY;
        int diffDenis = DenisNWperY - DenisWperY;
        int diffKristina = KristinaNWperY - KristinaWperY;

        System.out.println("Маша теперь получает " + MashaNW + " рублей. Годовой доход вырос на " + diffMasha + " рублей.");
        System.out.println("Маша теперь получает " + DenisNW + " рублей. Годовой доход вырос на " + diffDenis + " рублей.");
        System.out.println("Маша теперь получает " + KristinaNW + " рублей. Годовой доход вырос на " + diffKristina + " рублей.");
    }
}