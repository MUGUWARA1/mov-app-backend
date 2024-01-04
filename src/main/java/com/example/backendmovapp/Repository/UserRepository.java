package com.example.backendmovapp.Repository;

import com.example.backendmovapp.Modele.FilmFav;
import com.example.backendmovapp.Modele.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    User findAllByUsernameAndPassword(String username ,String pass);
    User findUserById(Long id);


}
