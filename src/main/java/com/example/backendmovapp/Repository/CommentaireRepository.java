package com.example.backendmovapp.Repository;

import com.example.backendmovapp.Modele.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {

    List<Commentaire> findAllByIdFilm(Long idfilm);

}
