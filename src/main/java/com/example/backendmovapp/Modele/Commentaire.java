package com.example.backendmovapp.Modele;

import jakarta.persistence.*;

@Entity
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;


    private Long idFilm;

    @OneToOne
    private User user;

    public Commentaire(Long id, String text, Long idFilm, User user) {
        this.id = id;
        this.text = text;
        this.idFilm = idFilm;
        this.user = user;
    }

    public Commentaire() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Long idFilm) {
        this.idFilm = idFilm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", idFilm=" + idFilm +
                ", user=" + user +
                '}';
    }
}