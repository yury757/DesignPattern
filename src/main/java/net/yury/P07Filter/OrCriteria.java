package net.yury.P07Filter;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        final List<Person> people1 = criteria.meetCriteria(persons);
        final List<Person> people2 = otherCriteria.meetCriteria(persons);
        for (Person person : people1) {
            if (!people2.contains(person)) {
                people2.add(person);
            }
        }
        return people2;
    }
}
