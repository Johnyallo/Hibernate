package ru.netology.hiberhome.Repository;

import ru.netology.hiberhome.Person.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
        @PersistenceContext
        private EntityManager manager;

        public List<Person> getPersonsByCity(String city) {
            return manager.createQuery("SELECT p FROM Person p WHERE p.city_living = :city").setParameter("city", city).getResultList();
        }
}
