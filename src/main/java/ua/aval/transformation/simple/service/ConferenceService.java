package ua.aval.transformation.simple.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import ua.aval.transformation.simple.model.Conference;
import ua.aval.transformation.simple.repositary.ConferenceRepository;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ConferenceService {

    private final ConferenceRepository repo;

    public Conference addConference(Conference conference) {
        checkConference(conference);
        return repo.save(conference);
    }

    public Conference editConference(Long id, Conference conference) {
        checkEditConference(id, conference);

        return repo.save(conference);
    }

    public List<Conference> getAll() {

        List<Conference> all = repo.findAll();
        return all != null ? all : Collections.emptyList();
    }

    private void checkConference(Conference conference) {

        if (conference.getMemberCount() < 100 || repo.existsByDateConf(conference) || repo.existsByNameConf(conference)) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
    }

    private void checkEditConference(Long id, Conference conference) {
        long count = repo.countByDateConfOrNameConf(conference.getDateConf(), conference.getNameConf());
        if (count == 0) {
            return;
        }
        if (count > 1 || (count == 1 && !repo.findFirstByDateConfOrNameConf(conference.getDateConf(), conference.getNameConf()).getId().equals(id))) {
            throw new HttpClientErrorException(HttpStatus.CONFLICT);
        }
    }
}
