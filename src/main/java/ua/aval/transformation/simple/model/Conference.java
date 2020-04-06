package ua.aval.transformation.simple.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nameConf;

    @Min(100)
    private Long memberCount;

    @NotBlank
    private String theme;

    @NotBlank
    private String dateConf;


}
