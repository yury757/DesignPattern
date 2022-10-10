package net.yury.P07Filter.demo2;

import net.yury.P07Filter.Person;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public boolean meetCriteria(Person person) {
        return criteria.meetCriteria(person) || otherCriteria.meetCriteria(person);
    }

}
