package com.spending.traxker.controller;

import com.spending.traxker.dto.Spending;
import com.spending.traxker.service.SpendingService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/spending")
@AllArgsConstructor
public class SpendingController {

    SpendingService spendingService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Spending addNewSpending(@RequestBody Spending spending){
        return spendingService.addNewSpending(spending);
    }
}
