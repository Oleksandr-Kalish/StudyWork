package ua.aval.transformation.simple.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.aval.transformation.simple.model.Report;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {

    List<Report> findByIdConference(Long id);

    int countByAuthor(String author);

}
