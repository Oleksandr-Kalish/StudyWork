package ua.aval.transformation.simple.repositary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ua.aval.transformation.simple.model.Conference;

import java.util.List;
import java.util.Optional;
@Repository
public class JdbcConferenceRepository implements ConferenceRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public <S extends Conference> S save(S s) {
        return null;
    }

    @Override
    public <S extends Conference> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Conference> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Conference> findAll() {
        return  jdbcTemplate
                .queryForList("select * from Conference",  Conference.class);
    }

    @Override
    public Iterable<Conference> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Conference conference) {

    }

    @Override
    public void deleteAll(Iterable<? extends Conference> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
