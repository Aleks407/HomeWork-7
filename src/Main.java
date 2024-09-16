public class Main {
    public static void main(String[] args) {
//Task 1
        System.out.println("Задача № 1");
        int deposit =15000;
        int total=2_459_000;
        int month=0;
        while( deposit<=total){
            month++;
            System.out.println("Месяц "+month+" сумма накоплений равна "+deposit+" рублей");
            deposit=deposit+15000;

        if(deposit>total){
                System.out.println("Месяц " +(month+1)+
                        " сумма накоплений равна "+(deposit+(total-deposit))+ " рублей");

        }
    }
//Task 2
        System.out.println("Задача № 2");
        int i=0;
        while( i<10){
            i++;
            System.out.print(i+" " );
        }
        System.out.println();
        for(int j=10;j>0;j--) {
            System.out.print(j + " ");
        }
//Task 3
        System.out.println();
        System.out.println("Задача № 3");
        int population=12_000_000;

        for(int k=1;k<=10;k++){
            int natalityOnThousand=population/1000*17;
            int mortalityOnThousand=population/1000*8;
            population=population+natalityOnThousand-mortalityOnThousand;
            System.out.println("Год "+k+" численность населения составляет "
                    +population);
        }
//Task 4
        System.out.println("Задача № 4");
        int month1=0;
        float percent=7F/100;
        int deposit1=15000;
        int endSum = 12_000_000;
        while (deposit1<=endSum ){
            month1++;
            deposit1=(int)(deposit1*(1+percent));
         System.out.println("Месяц "+month1+" сумма накоплений равна "+deposit1+" рублей");

        }
//Task 5
        System.out.println("Задача № 5");
        month1 = 0;
        percent = 7F / 100;
        deposit1 = 15000;
        endSum = 12_000_000;
        while (deposit1<=endSum ){
            month1++;
            deposit1=(int)(deposit1*(1+percent));
            if (month1%6==0){System.out.println("Месяц "+month1+
                    " сумма накоплений равна "+deposit1+" рублей");
            }
        }
//Task 6
        System.out.println("Задача № 6");
        month1 = 0;
        percent = 7F / 100;
        deposit1 = 15000;
        int depositTerm = 108;
        while (month1<=depositTerm ) {
            month1++;
            deposit1 = (int) (deposit1 * (1 + percent));
            if (month1 % 6 == 0) {System.out.println("Месяц " + month1 +
                        " сумма накоплений равна " + deposit1 + " рублей");
            }
        }
//Task 7
        System.out.println("Задача № 7");
         int ferstDay=2;
         for(int day=ferstDay;day<=31;day+=7) {
    System.out.println("Сегодня "+day+"-е число. Необходимо подготовить отчет");
    }

//Task 8
        System.out.println("Задача № 8");
        int yearBefore=2024-200;
        int yearAfter=2024+100;
        for(int year=0;year<yearAfter;year+=79) {
            if(year>yearBefore ) System.out.println(year);
        }







    }
}
