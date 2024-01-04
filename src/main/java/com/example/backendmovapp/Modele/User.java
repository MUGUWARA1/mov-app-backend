package com.example.backendmovapp.Modele;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom,prenom;
    private String username ,password;

    @JsonManagedReference
    @OneToMany(mappedBy ="user",fetch = FetchType.EAGER)

    private List<FilmFav> filmFavList;

    public User( String nom, String prenom, String username, String password, List<FilmFav> filmFavList) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
        this.filmFavList = filmFavList;
    }

    public User() {
    }

    @Override
    public String   toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", filmFavList=" + filmFavList +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<FilmFav> getFilmFavList() {
        return filmFavList;
    }

    public void setFilmFavList(List<FilmFav> filmFavList) {
        this.filmFavList = filmFavList;
    }
}
