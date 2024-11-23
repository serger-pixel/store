package com.example.store.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int _id;

    private int _price;

    private String _name;

    public Item(int _price, String _name) {
        this._price = _price;
        this._name = _name;
    }

    public int get_price() {
        return _price;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_price(int _price) {
        this._price = _price;
    }
}
