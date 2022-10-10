package net.yury.P07Filter.demo2;

import net.yury.P07Filter.Person;

public class CriteriaMale implements Criteria {
    @Override
    public boolean meetCriteria(Person person) {
        return "male".equalsIgnoreCase(person.getGender());
    }
}
