package com.example.backendmovapp.Repository;

import com.example.backendmovapp.Modele.FilmFav;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmFavRepository extends JpaRepository<FilmFav,Long> {

    @Query("select f from FilmFav f where f.user.id=?1")
    public List<FilmFav> findAllByUserId(Long id);


}
