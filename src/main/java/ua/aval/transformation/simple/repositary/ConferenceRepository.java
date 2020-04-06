package ua.aval.transformation.simple.repositary;

import org.springframework.data.repository.CrudRepository;
import ua.aval.transformation.simple.model.Conference;

import java.util.Optional;

public interface ConferenceRepository extends CrudRepository<Conference, Long> {

    @Override
    <S extends Conference> S save(S s);

    @Override
    <S extends Conference> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    Optional<Conference> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Conference> findAll();

    @Override
    Iterable<Conference> findAllById(Iterable<Long> iterable);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Conference conference);

    @Override
    void deleteAll(Iterable<? extends Conference> iterable);

    @Override
    void deleteAll();
}
