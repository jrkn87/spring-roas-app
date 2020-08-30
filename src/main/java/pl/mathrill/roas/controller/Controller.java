package pl.mathrill.roas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.mathrill.roas.model.Record;
import pl.mathrill.roas.service.RecordService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {
    private RecordService recordService;

    @Autowired
    public Controller(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/records")
    public List<Record> getAll() {
        return recordService.getAll();
    }

    @GetMapping("/record")
    public Optional<Record> getOne(@RequestParam Long id) {
        return recordService.getOne(id);
    }

    @PostMapping("/record/save")
    public void save(@RequestBody Record record) {
        recordService.save(record);
    }

    @PutMapping("/record/update")
    public void update(@RequestBody Record record) {
        recordService.save(record);
    }

    @DeleteMapping("/record")
    public void deleteOne(@RequestParam Long id) {
        recordService.deleteById(id);
    }
}
