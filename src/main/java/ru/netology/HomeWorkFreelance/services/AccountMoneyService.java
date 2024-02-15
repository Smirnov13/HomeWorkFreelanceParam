package ru.netology.HomeWorkFreelance.services;

public class AccountMoneyService {
    public int calculate(int income, int expense, int threshold) {
        int count = 0;  // счётчик месяцев отдыха
        int money = 0;  // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expense;
                money = money / 3;
            } else {
                money = money - expense + income;
            }
        }
        return count;
    }
}


//public int calculate(int income, int expenses) {
//    int count = 0; // счётчик месяцев отдыха
//    int money = 0; // количество денег на счету
//    for (int month = 0; month < 12; month++) {
//        if (money >= expenses) { // можем ли отдыхать?
//            count++; // увеличиваем счётчик месяцев отдыха
//            money = money - expenses;
//        } else {
//            money = money + income;
//        }
//    }
//    return count;
//}