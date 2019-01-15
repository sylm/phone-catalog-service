package com.bbiloskursky.controller;

import com.bbiloskursky.model.Phone;
import com.bbiloskursky.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/phone-service/v1")
public class PhoneCatalogController {

    @Autowired
    private PhoneRepository phoneRepository;

    @GetMapping("/phones")
    public ResponseEntity<List<Phone>> getAllPhones(@RequestParam(required = false) String[] ids){
        if(ids != null){
            new ResponseEntity<>(phoneRepository.findAllById(Arrays.asList(ids)), HttpStatus.OK);
        }
        return new ResponseEntity<>(phoneRepository.findAll(), HttpStatus.OK);
    }
}
