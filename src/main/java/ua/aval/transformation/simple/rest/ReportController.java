package ua.aval.transformation.simple.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.aval.transformation.simple.model.Report;
import ua.aval.transformation.simple.service.ReportService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReportController {

    private ReportService reportService;

    @PostMapping("/conferences/{conference_id}/talks")
    public Report addReport( @RequestBody Report report,
                            @PathVariable("conference_id") Long id) {

        return reportService.addReportToConference(id, report);
    }

    @GetMapping("/conferences/{conference_id}/talks")
    public List<Report> getReport(@PathVariable("conference_id") Long id) {

        return reportService.getReports(id);
    }
}
