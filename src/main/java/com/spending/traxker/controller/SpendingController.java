package com.spending.traxker.controller;

import com.spending.traxker.dto.Spending;
import com.spending.traxker.service.SpendingService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "v1/spending")
@AllArgsConstructor
public class SpendingController {

    SpendingService spendingService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Spending addNewSpending(@RequestBody Spending spending) {
        return spendingService.addNewSpending(spending);
    }

    @PostMapping(path= "/add-multiple", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Spending> addMultipleNewSpending(@RequestBody List<Spending> spendings) {
        return spendingService.addMultipleNewSpending(spendings);
    }

    @GetMapping(path = "/getbyid")
    public Spending getBySpendingId(@RequestParam(name = "spendingId") UUID spendingId){
        return spendingService.getBySpendingId(spendingId);
    }


}
