package ua.aval.transformation.simple.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.aval.transformation.simple.model.Conference;
import ua.aval.transformation.simple.service.ConferenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ConferenceController {

    private ConferenceService conferenceService;


    @PostMapping("/conferences")
    public Conference newConference(@RequestBody Conference conference) {
        return conferenceService.addConference(conference);
    }

    @GetMapping("/conferences")
    public List<Conference> getConference() {
        System.out.println("SDFG"+conferenceService.toString());
        return conferenceService.getAll();
    }

    @PutMapping("/conferences/{conference_id}")
    public void editConference(@RequestBody Conference conference,
                               @PathVariable("conference_id") Long id) {
        conferenceService.editConference(id, conference);
    }

}
