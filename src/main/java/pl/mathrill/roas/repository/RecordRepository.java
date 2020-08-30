package pl.mathrill.roas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mathrill.roas.model.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
