package Main;

import Worker.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Programmer> programmers = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();
        ArrayList<Cook> cookers = new ArrayList<>();

        programmers.add(new Programmer("Вася"));
        programmers.add(new Programmer("Петя"));
        programmers.add(new Programmer("Женя"));

        drivers.add(new Driver("Женя"));
        drivers.add(new Driver("Маша"));
        drivers.add(new Driver("Фердинанд"));

        cookers.add(new Cook("Люся"));
        cookers.add(new Cook("Лена"));
        cookers.add(new Cook("Катя"));
        for(Programmer programmer : programmers){
            programmer.voice();
            programmer.writeCode();
        }
        for(Driver driver : drivers){
            driver.voice();
            driver.drive();
        }
        for(Cook cook : cookers){
            cook.voice();
            cook.cookFood();
        }

        Director director = new Director();
//        Counter counter = new Counter() {
//            @Override
//            public String report(int countMonth) {
//                return "Отчет за "+countMonth+" месяцев готов";
//            }
//        };
//        director.force(counter, 6);
        director.force(new Counter() {
            @Override
            public String report(int countMonth) {
                return "Отчет за "+countMonth+" месяцев готов";
            }
        }, 6);

    }
}
