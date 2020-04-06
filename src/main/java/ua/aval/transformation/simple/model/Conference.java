package ua.aval.transformation.simple.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nameConf;

    @Max(100)
    @NotBlank
    private Long memberCount;

    @NotBlank
    private String theme;

    @NotBlank
    private Date dateConf;

    public Conference(@NotBlank String nameConf, @Max(100) @NotBlank Long memberCount, @NotBlank String theme, @NotBlank Date dateConf) {
        this.nameConf = nameConf;
        this.memberCount = memberCount;
        this.theme = theme;
        this.dateConf = dateConf;
    }
}
