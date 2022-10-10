package net.yury.P07Filter.demo2;

import net.yury.P07Filter.Person;

import java.util.List;

public abstract class AbstractCriteriaCombination {
    protected Criteria[] criteriaList;

    public AbstractCriteriaCombination(Criteria... criteriaList) {
        this.criteriaList = criteriaList;
    }

    public abstract List<Person> meetCriteria(List<Person> persons);
}
