package com.example.backendmovapp.Controller;

import com.example.backendmovapp.Modele.FilmFav;
import com.example.backendmovapp.Modele.User;
import com.example.backendmovapp.Repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userrepo;

    @GetMapping("/")
    public List<User> getALLUsers(){
        return  userrepo.findAll();
    }

    @GetMapping("/{username}/{password}")
    public  User getUserBuUsandPass(@PathVariable String username,@PathVariable String password){
        return userrepo.findAllByUsernameAndPassword(username,password);

    }

    @GetMapping("/{id}")
    public  User getUserbyID(@PathVariable Long id)
    {
        return userrepo.findUserById(id);
    }




    
}
