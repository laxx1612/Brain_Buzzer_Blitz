package com.capgemini.brain.buzzer.blitz.leaderboard.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.capgemini.brain.buzzer.blitz.leaderboard.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    @Query("SELECT COUNT(*) + 1 FROM User u WHERE u.ratings > (SELECT u2.ratings FROM User u2 WHERE u2.username = :username)")
    Integer getRankByUsername(@Param("username") String username);

    @Query("SELECT u FROM User u ORDER BY u.ratings DESC")
    List<User> findAllOrderByRatingsDesc();
}