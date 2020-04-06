package ua.aval.transformation.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import ua.aval.transformation.simple.model.Report;
import ua.aval.transformation.simple.repositary.ReportRepository;

import java.util.List;

@Service
public class ReportService {


    private final ReportRepository repo;

    public ReportService(ReportRepository reportRepository) {
        this.repo = reportRepository;
    }

    public Report addReportToConference(Long id, Report report) {
        int count = repo.countByAuthor(report.getAuthor());
        if (count >= 3) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
        report.setIdConference(id);
        return repo.save(report);
    }

    public List<Report> getReports(Long id) {

        return repo.findByIdConference(id);
    }
}
