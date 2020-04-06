package ua.aval.transformation.simple.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.aval.transformation.simple.model.Conference;

import java.util.List;


public interface ConferenceRepository extends JpaRepository<Conference, Long> {


    boolean existsByNameConf(Conference conf);

    boolean existsByDateConf(Conference conf);

    List<Conference> queryById(Conference conf);

    List<Conference> findAll();

    Conference findFirstByDateConfOrNameConf(String date, String name);

    int countByDateConfOrNameConf(String date, String name);
}
