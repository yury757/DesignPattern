package net.yury.P07Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> res = new ArrayList<>(persons.size());
        for (Person person : persons) {
            if ("male".equalsIgnoreCase(person.getGender())) {
                res.add(person);
            }
        }
        return res;
    }
}
