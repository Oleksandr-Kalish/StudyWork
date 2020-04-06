package ua.aval.transformation.simple.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ua.aval.transformation.simple.model.Conference;
import ua.aval.transformation.simple.model.Report;
import ua.aval.transformation.simple.repositary.JdbcConferenceRepository;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class ConferenceController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    JdbcConferenceRepository repo;


    @PostMapping("/conferences")
    public Conference newConference() {

        return null;
    }

    @GetMapping("/conferences")
    public List<Conference> getConference() {
        return   repo.findAll();
    }
}
