package dev.danvega.contentcalendar.repository;

import dev.danvega.contentcalendar.model.Content;
import dev.danvega.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
        List<Content> findAllByTitleContains(String keyword);

        @Query("select * from content where status= :status")
        List<Content> listByStatus(@Param("status") Status status);
        //@Param Annotation to bind method parameters to a query via a named parameter.
}
