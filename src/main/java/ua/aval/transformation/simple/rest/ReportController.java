package ua.aval.transformation.simple.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ua.aval.transformation.simple.model.Conference;
import ua.aval.transformation.simple.model.Report;
import ua.aval.transformation.simple.repositary.JdbcConferenceRepository;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class ReportController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    JdbcConferenceRepository repo;

    @PutMapping("/conferences")
    public void editConference() {

    }

    @PostMapping("/conferences/{conference_id}/talks")
    public void addReport( @PathVariable("conference_id") Long id) {

    }

    @GetMapping("/conferences/{conference_id}/talks")
    public Report getReport( @PathVariable("conference_id") Long id) {

        return null;
    }
}
