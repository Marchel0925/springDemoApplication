package com.example.demo.ex9;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/files-data")
public class FileDataController {

    private final FileDataRepository fileDataRepository;

    @GetMapping()
    public List<FileData> allFileData(){
        return fileDataRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FileData> findFileDataByID(@PathVariable("id") Long id){
        return fileDataRepository.findById(id);
    }

    @PostMapping()
    public ResponseEntity<FileData> addFileData(@RequestBody @Valid FileData fileData){ // need postman to send a body json
        fileDataRepository.save(fileData);
        return ResponseEntity.status(HttpStatus.CREATED)
                .location(URI.create("localhost:8081/" + fileData.getId()))
                .body(fileData); // to return a URI and header body.
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updateFileData(@PathVariable("id") Long id , @RequestBody FileData customFileData){
        Optional<FileData> fileData = fileDataRepository.findById(id);
        return "Ok";
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<FileData> delete(@PathVariable("id") Long id){
        fileDataRepository.delete(fileDataRepository.getOne(id));
        return ResponseEntity.status(HttpStatus.OK).body(null); // body() is needed to not throw error.
    }
}
