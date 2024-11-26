package com.Arthur.TodoList.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.boot.autoconfigure.AutoConfiguration;

@Entity
public class Todoitem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String title;
    private boolean done;
    @Version
    private Long version;

    public Todoitem(Long id, String title, boolean done, Long version) {
        this.id = id;
        this.title = title;
        this.done = done;
        this.version = version;
    }

    public Todoitem() {
    }
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
