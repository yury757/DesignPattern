package net.yury.P07Filter.demo2;

import net.yury.P07Filter.Person;

public class CriteriaSingle implements Criteria {
    @Override
    public boolean meetCriteria(Person person) {
        return "single".equalsIgnoreCase(person.getMaritalStatus());
    }
}
