package com.example.store.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.ArrayList;

public class ListEvent {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int _id;

    private ArrayList<Event> _list;

    public ListEvent() {
        this._list = new ArrayList<Event>();
    }

    public ArrayList<Event> get_list() {
        return _list;
    }

    public int get_id() {
        return _id;
    }

    public void add_event(Event el){
        _list.add(el);
    }

    public void delete_event(Event el){
        _list.remove(el);
    }
}
