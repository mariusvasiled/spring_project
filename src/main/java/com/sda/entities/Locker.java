package com.sda.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Locker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "number")
    private Integer number;

    public Locker() {
    }

    public Locker(Integer id, Integer number) {
       this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locker locker = (Locker) o;
        return Objects.equals(id, locker.id) &&
                Objects.equals(number, locker.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }
}
