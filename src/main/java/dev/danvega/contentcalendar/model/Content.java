package dev.danvega.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

//@Table(value="tbl_content") //to give different table name
public record Content(
        @Id//indicating a primary key
        Integer id,
        //@NotEmpty//from jakarta.validation.constraints which says element must not be null or empty
        @NotBlank//says element must have at least one non-whitespace character
        String title,
        @Column(value="description")
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
