package com.example.backendmovapp;

import com.example.backendmovapp.Controller.CommentaireController;
import com.example.backendmovapp.Modele.Commentaire;
import com.example.backendmovapp.Repository.CommentaireRepository;
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

    public static void main(String[] args) {
        SpringApplication.run(BackendMovAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner useSerice(){
        return args -> {
            System.out.println(comc.getComments());

        };
    }



}
