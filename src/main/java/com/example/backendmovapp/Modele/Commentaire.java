package com.example.backendmovapp.Modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Commentaire {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    public Commentaire(Long id, String text, Long idFilm, Long idUser) {
        this.id = id;
        this.text = text;
        this.idFilm = idFilm;
        this.idUser = idUser;
    }

    private Long idFilm;
    private Long idUser;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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

    @Override
    public String toString() {
        return "Commentaire{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", idFilm=" + idFilm +
                ", idUser=" + idUser +
                '}';
    }
}
