package pl.mathrill.roas.service;

import pl.mathrill.roas.model.Record;
import java.util.List;
import java.util.Optional;

public interface RecordService {
    Record save(Record record);
    void deleteById(Long id);
    List<Record> getAll();
    Optional<Record> getOne(Long id);
}
