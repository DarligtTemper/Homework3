public class Main {
    public static void main(String[] args) {
        int a = 2147483647;
        byte b = 126;
        short c = 32767;
        long l = 9223372036854775803L;
        float f = 4569.1265f;
        double d = 3153.4124434651;
        System.out.println("Задача №1: ");
        System.out.println("Значние пременной 'a' c типом int равно: " + a);
        System.out.println("Значние пременной 'b' c типом byte равно: " + b);
        System.out.println("Значние пременной 'c' c типом short равно: " + c);
        System.out.println("Значние пременной 'l' c типом long равно: " + l);
        System.out.println("Значние пременной 'f' c типом float равно: " + f);
        System.out.println("Значние пременной 'd' c типом double равно: " + d);


        float alpha = 27.12f;
        long beta = 987678965549L;
        float gamma = 2.786f;
        short lambda = 589;
        short omicron = -159;
        short delta = 27897;
        byte zeta = 67;
        System.out.println("Задача №2: ");
        System.out.println("Значние пременной 'alpha' c типом float равно: " + alpha);
        System.out.println("Значние пременной 'beta' c типом long равно: " + beta);
        System.out.println("Значние пременной 'gamma' c типом float равно: " + gamma);
        System.out.println("Значние пременной 'lambda' c типом short равно: " + lambda);
        System.out.println("Значние пременной 'omicron' c типом short равно: " + omicron);
        System.out.println("Значние пременной 'delta' c типом short равно: " + delta);
        System.out.println("Значние пременной 'zeta' c типом byte равно: " + zeta);

        int lP = 23;
        int aS = 27;
        int eA = 30;
        int allStudents = lP + aS + eA;
        int paper = 480;
        int paperPerStudent = paper/allStudents;
        System.out.println("Задача №3: ");
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        int bottlePerTwoMin = 16;
        int bottlePer20min = bottlePerTwoMin * 10;
        int bottlePerDay = bottlePer20min * 3 * 24;
        int bottlePerThreeDays = bottlePerDay * 3;
        int bottlePerMonth = bottlePerThreeDays * 10;
        System.out.println("Задача №4: ");
        System.out.println("За 20 минут машина произвела " + bottlePer20min + " штук бутылок");
        System.out.println("За один день машина произвела " + bottlePerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlePerThreeDays + "штук бутылок");
        System.out.println("За месяц машина произвела " + bottlePerMonth + "штук бутылок");

        int allCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int cansPerClass = whitePerClass + brownPerClass;
        int classes = allCans/cansPerClass;
        int allWhitePaintCans = whitePerClass * classes;
        int allBrownPaintCans = brownPerClass * classes;
        System.out.println("Задача №5: ");
        System.out.println("В школе, где " + classes + " классов, нужно " + allWhitePaintCans + " банок белой краски и " + allBrownPaintCans + " банок кориченивой краски.");

        int bananas = 5;
        int bananaWeight = 80;
        int milkMl = 200;
        int milkWeight = 105;
        int milkGs = milkMl*milkWeight/100;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int eggs = 4;
        int eggWeight = 70;
        int sportsmanBreakfastGs = (bananas*bananaWeight)+(milkGs)+(iceCream*iceCreamWeight)+(eggs*eggWeight);
        float breakfastKG = sportsmanBreakfastGs/1000f;
        System.out.println("Задача№6: ");
        System.out.println("Если смешать все ингридиенты, то завтрак спорстмена в граммах будет весить: " + sportsmanBreakfastGs + " грамм. А в килограммах: " + breakfastKG + "Кг." );

        int weightToLose = 7;
        int weightToLoseG = weightToLose * 1000;
        int weightLoosePerDayDiet1 = 250;
        int weightLoosePerDayDiet2 = 500;
        int daysWithDiet1 = weightToLoseG/weightLoosePerDayDiet1;
        int daysWithDiet2 = weightToLoseG/weightLoosePerDayDiet2;
        System.out.println("Задача №7: ");
        System.out.println("Для начала переведём вес, который надо сбросить в килограммы,таким обазом нашему спортсмену надо сбросить : " + weightToLoseG + "грамм." );
        System.out.println("Таким образом, если спорстмен будет соблюдать диету, при которой он треяет 250 грамм веса в день, то ему потребуется " + daysWithDiet1 + " дней, чтобы сбросить нужный вес.");
        System.out.println("Если же спорстмен будет соблюдать более строгую диету и терять по 500 грамм веса в день, то ему потребуется " + daysWithDiet2 + " дней, что достичть нужных результатов.");

        int mashaPay = 67760;
        int denisPay = 83690;
        int kristinaPay = 76230;
        float index = 1.1f;
        int mashaYearNow = mashaPay*12;
        int denisYearNow = denisPay*12;
        int kristinaYearNow = kristinaPay*12;
        float mashaPayNew = mashaPay*index;
        float denisPayNew = denisPay*index;
        float kristinaPayNew = kristinaPay*index;
        float mashaYearNew = mashaPayNew*12;
        float denisYearNew = denisPayNew*12;
        float kristinaYearNew = kristinaPayNew*12;
        float mashaDiff = mashaYearNew - mashaYearNow;
        float denisDiff = denisYearNew - denisYearNow;
        float kristinaDiff = kristinaYearNew - kristinaYearNow;
        System.out.println("Задача №8: ");
        System.out.println("Маша теперь получает: " + mashaPayNew + " рублей. Годовой доход вырос на: " + mashaDiff + "рублей.");
        System.out.println("Денис теперь получает: " + denisPayNew+ " рублей. Годовой доход вырос на: " + denisDiff + "рублей.");
        System.out.println("Кристина теперь получает: " + kristinaPayNew + " рублей. Годовой доход вырос на: " + kristinaDiff + "рублей.");



    }
}