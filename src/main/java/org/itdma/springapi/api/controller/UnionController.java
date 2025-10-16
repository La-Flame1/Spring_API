package org.itdma.springapi.api.controller;

import org.itdma.springapi.api.model.Union;
import org.itdma.springapi.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class UnionController {
    private UnionService unionService;

    ///For short injection of service
    @Autowired
    public UnionController(UnionService unionService) {
        this.unionService = unionService;
    }

    @GetMapping("/union")
    public Union getUnion(@RequestParam int unionId) {
        Optional union = unionService.getUnion(unionId);
        if (union.isPresent()) {
            return (Union) union.get();
        }
        return null;
    }
}
