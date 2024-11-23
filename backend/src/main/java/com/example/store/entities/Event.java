package com.example.store.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int _id;

    private String _text;

    public Event(String text) {
        this._text = text;
    }

    public int get_id() {
        return _id;
    }

    public String get_text() {
        return _text;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_text(String _text) {
        this._text = _text;
    }
}
