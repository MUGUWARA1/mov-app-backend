package com.example.backendmovapp.Controller;

import com.example.backendmovapp.Modele.Commentaire;
import com.example.backendmovapp.Repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CommentaireController {

    @Autowired
    private CommentaireRepository commrep;


    @GetMapping("/comments")
    public List<Commentaire> getComments(){
        return commrep.findAll();
    }

    @GetMapping("/comments/{id}")
    public List<Commentaire> getCommentsbyId(@PathVariable Long id){
        return commrep.findAllByIdFilm(id);
    }

    @PostMapping("/comments")
    public Commentaire postCommentaire(@RequestBody Commentaire c){
        return commrep.save(c);
    }


}
