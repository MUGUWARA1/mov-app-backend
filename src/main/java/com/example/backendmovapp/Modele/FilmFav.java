package com.example.backendmovapp.Modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class FilmFav {

    @Id
    private Long id;
    private String title;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_user",nullable = false)
    private User user;

    public FilmFav(Long id, String title, User user) {
        this.id = id;
        this.title = title;
        this.user = user;
    }

    public FilmFav() {
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "FilmFav{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", user=" + user.getId() +
                '}';
    }
}
