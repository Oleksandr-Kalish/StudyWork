package ua.aval.transformation.simple.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nameReport;
    @NotBlank
    private String description;
    @NotBlank
    private String author;
    @NotBlank
    private Long idConference;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private ReportType reportType;

}
