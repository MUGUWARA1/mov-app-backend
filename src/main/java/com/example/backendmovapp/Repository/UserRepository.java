package com.example.backendmovapp.Repository;

import com.example.backendmovapp.Modele.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
