package com.example.parabens;

import androidx.annotation.NonNull;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Element {
    private String id;
    private String name;
    private String description;
    private boolean isFavourite;
    private Date lastSeen;

    public Element(String name, String description) {
        setName(name);
        setDescription(description);
        isFavourite = false;
        lastSeen = new Date(2020,4,15);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }
}