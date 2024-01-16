package com.rungroup.springMVC.repository;

import com.rungroup.springMVC.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String url);
    @Query("Select c from Club c where lower(c.title) LIKE lower(concat('%', :query, '%') ) ")
    List<Club> searchClubs(String query);
}
