package ru.netology.services;

public class FreelanceService {

    public int calculate(int income, int expenses, int threshold){
        int money = 0;
        int count = 0;

        for (int month = 0; month < 12; month++){

            if (money >= threshold) { //проверяем отдыхаем или нет
                money = money - expenses;
                money = money / 3;
                count++;
            } else {
                money = money + income - expenses;// будет работать, то его деньги увеличиваются на income, доход от работы, и уменьшаются на expense, обязательные месячные траты;
            }
        }
        return count;
    }
}
