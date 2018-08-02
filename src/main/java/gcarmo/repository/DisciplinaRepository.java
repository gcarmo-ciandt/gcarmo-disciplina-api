package gcarmo.repository;

import gcarmo.model.Disciplina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface DisciplinaRepository extends CrudRepository<Disciplina, UUID> {
}
