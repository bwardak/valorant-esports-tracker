package com.example.api.repositories;

import com.example.api.models.Tournament;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Table(name = "tournaments")
@Repository
public interface TournamentsRepository extends JpaRepository<Tournament, Long> {
}