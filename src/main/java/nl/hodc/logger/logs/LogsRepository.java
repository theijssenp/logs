package nl.hodc.logger.logs;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "logs", path = "logs")

public interface LogsRepository extends PagingAndSortingRepository<Logs, Long>, CrudRepository<Logs,Long> {

    List<Logs> findById(@Param("id") long id);
  
  }
