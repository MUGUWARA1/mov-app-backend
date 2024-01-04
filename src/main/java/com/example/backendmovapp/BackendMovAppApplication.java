package com.example.backendmovapp;

import com.example.backendmovapp.Controller.CommentaireController;
import com.example.backendmovapp.Controller.FilmFavController;
import com.example.backendmovapp.Repository.CommentaireRepository;
import com.example.backendmovapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendMovAppApplication {

    @Autowired
    private CommentaireRepository commRepo;
    @Autowired
    private CommentaireController comc;
    @Autowired
    private FilmFavController fc;

    @Autowired
    private UserRepository userrepo;

    public static void main(String[] args) {
        SpringApplication.run(BackendMovAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner useSerice(){
        return args -> {
            System.out.println(comc.getComments());
            System.out.println(fc.getfilmbyUserID(4L));


        };
    }



}
