package net.yury.P07Filter.demo2;

import net.yury.P07Filter.Person;

public class CriteriaFemale implements Criteria {
    @Override
    public boolean meetCriteria(Person person) {
        return "female".equalsIgnoreCase(person.getGender());
    }
}
