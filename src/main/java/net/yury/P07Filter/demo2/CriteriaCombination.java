package net.yury.P07Filter.demo2;

import net.yury.P07Filter.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaCombination extends AbstractCriteriaCombination {
    public CriteriaCombination(Criteria... criteriaList) {
        super(criteriaList);
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> res = new ArrayList<>(persons.size());
        for (Person person : persons) {
            boolean add = true;
            for (Criteria criteria : criteriaList) {
                if (!criteria.meetCriteria(person)) {
                    add = false;
                    break;
                }
            }
            if (add) res.add(person);
        }
        return res;
    }
}
