package com.example.backendmovapp.Controller;

import com.example.backendmovapp.Modele.FilmFav;
import com.example.backendmovapp.Modele.User;
import com.example.backendmovapp.Repository.FilmFavRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class FilmFavController {

    @Autowired
    private FilmFavRepository filmrepo;



    @PostMapping("/favories")
    public FilmFav addFilm(@RequestBody  FilmFav f){
        if(!filmrepo.findAll().contains(f))
        {
            return filmrepo.save(f);
        }else {
            return f;
        }


    }
    @DeleteMapping("/favories/{idFilm}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeFilm(@PathVariable Long idFilm) throws Exception {
            // Check if the film with the specified ID exists
            if (filmrepo.existsById(idFilm)) {
                // Film found, delete it from the repository
                filmrepo.deleteById(idFilm);
            }else {
            // Film not found, return appropriate status code
            throw new Exception("Film with id " + idFilm );
        }
    }

    @GetMapping("/favories")
    public  List<FilmFav> getFilms(){
        return filmrepo.findAll();
    }

    @GetMapping("/favories/{idUser}")
    public  List<FilmFav> getfilmbyUserID(@PathVariable Long idUser)
    {
        return filmrepo.findAllByUserId(idUser);
    }





}
