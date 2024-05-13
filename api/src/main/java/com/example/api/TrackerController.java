package com.example.api;

import com.example.api.models.Match;
import com.example.api.models.Player;
import com.example.api.models.Team;
import com.example.api.models.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class TrackerController {
    @Autowired
    private TrackerService trackerService;



    // CREATE
    @PostMapping("/tournament")
    public ResponseEntity<Tournament> createTournament(@RequestBody Tournament tournament) {
        Tournament newTournament = trackerService.addTournament(tournament);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTournament);
    }

    @PostMapping("/player")
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        Player newPlayer = trackerService.addPlayer(player)
        return ResponseEntity.status(HttpStatus.CREATED).body(newPlayer);
    }

    @PostMapping("/team")
    public ResponseEntity<Team> createTeam(@RequestBody Team team) {
        Team newTeam = trackerService.addTeam(team);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTeam);
    }

    @PostMapping("/match")
    public ResponseEntity<Match> createMatch(@RequestBody Match match) {
        Match newMatch = trackerService.addMatch(match);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMatch);
    }



    // READ




    // UPDATE




    // DELETE
}