package pl.mathrill.roas.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mathrill.roas.model.Record;
import pl.mathrill.roas.repository.RecordRepository;
import pl.mathrill.roas.service.RecordService;

import java.util.List;
import java.util.Optional;

@Service
public class RecordServiceImpl implements RecordService {
    private RecordRepository recordRepository;

    @Autowired
    public RecordServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public Record save(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public void deleteById(Long id) {
        recordRepository.deleteById(id);
    }

    @Override
    public List<Record> getAll() {
        return recordRepository.findAll();
    }

    @Override
    public Optional<Record> getOne(Long id) {
        return recordRepository.findById(id);
    }
}
