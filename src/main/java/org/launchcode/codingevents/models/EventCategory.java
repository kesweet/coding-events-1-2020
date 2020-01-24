package org.launchcode.codingevents.models;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventCategory {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
