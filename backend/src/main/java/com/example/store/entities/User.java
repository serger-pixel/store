package com.example.store.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.ArrayList;

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int _id;

    private String _login;

    private String _password;

    private ArrayList<Item> _favorites;

    public User(String password, String login) {
        this._favorites = new ArrayList<Item>();
        this._password = password;
        this._login = login;
    }

    public int get_id() {
        return _id;
    }

    public String get_login() {
        return _login;
    }

    public String get_password() {
        return _password;
    }

    public ArrayList<Item> get_favorites() {
        return _favorites;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_login(String _login) {
        this._login = _login;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public void add_favorite(Item el){
        _favorites.add(el);
    }

    public void delete_favorite(Item el){
        _favorites.remove(el);
    }
}
