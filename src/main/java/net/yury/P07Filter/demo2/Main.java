package net.yury.P07Filter.demo2;

import net.yury.P07Filter.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        System.out.println(new CriteriaCombination(male).meetCriteria(persons));

        System.out.println("\nFemales: ");
        System.out.println(new CriteriaCombination(female).meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        System.out.println(new CriteriaCombination(singleMale).meetCriteria(persons));
        // 上面这种方式 和 下面这种方式 基本是等价的
        // 使用下面这种方式，就可以少写一个 AndCriteria
        System.out.println(new CriteriaCombination(single, male).meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        System.out.println(new CriteriaCombination(singleOrFemale).meetCriteria(persons));
    }
}
