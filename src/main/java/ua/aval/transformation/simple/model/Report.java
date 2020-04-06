package ua.aval.transformation.simple.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

    private Long idConference;
    @NotEmpty
    @Enumerated(EnumType.STRING)
    private ReportType reportType;

}
