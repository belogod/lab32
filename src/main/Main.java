package main;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
new Main().run();    }

    private void run() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person (1, "Petrov","Petr", "Petrovich", "Nikolaev", 1, 3332144),
                new Person(2, "Ivanov", "Ivan", "Ivanovich", "Kiev", 23, 8888888),
                new Person (3, "Katrin", "Katia", "Antonova", "Lvov", 68, 444444444),
                new Person(4, "Novikov", "Anton", "Vladimirovich", "Kiev", 150, 123214455),
                new Person(5, "Andreeva", "Anna", "Sergeevna", "Lvov", 8, 123214455)
        ));
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        menu:

        do{
            System.out.println("1 - список покупців в алфавітному порядку");
            System.out.println("2 - список покупців, у яких номер кредитної картки знаходиться в  інтервалі від 0 до 50");
            System.out.println("3 - список покупців, імена яких починаються із 3 рядка");
            System.out.println("0 - выход");

            m = scanner.nextInt();

            switch (m){

                case 1 : showAlphabet(persons); break;
                case 2 : showNumberCard(persons); break ;
                case 3 : showName(persons); break ;
                case 0 : break  menu;

            } System.out.println("**********************");

        }  while (m!=0);


    }

    private void showAlphabet(List<Person> persons) {
        persons.stream()
            .sorted(Comparator.comparing(Person::getName))
            .forEach(System.out::println);
    }

    private void showNumberCard(List<Person> persons) {
        showAllwithfilters(persons, p->p.getCard() <=50);

    }

    private void showName(List<Person> persons) {
        showAllwithfilters(persons, p->p.getId() >=3);
    }
    private void showAllwithfilters(List<Person> persons, Predicate<Person> predicate){
        persons.stream().filter(predicate).forEach(p-> System.out.println(p));
    }
}
