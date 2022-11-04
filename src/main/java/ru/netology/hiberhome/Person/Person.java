package ru.netology.hiberhome.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="persons")
public class Person {
    @Id
    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int age;

    @Column
    private String phone_number;

    @Column
    private String city_living;

}
