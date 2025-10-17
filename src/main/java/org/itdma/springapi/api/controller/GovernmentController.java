package org.itdma.springapi.api.controller;

import org.itdma.springapi.api.model.Government;
import org.itdma.springapi.service.GovernmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GovernmentController {
    private GovernmentService governmentService;

    ///For short injection of service
    @Autowired
    public GovernmentController(GovernmentService governmentService) {
        this.governmentService = governmentService;
    }

    @GetMapping("/government")
    public Government getGovernment(@RequestParam int governId) {
        Optional government = governmentService.getGovernment(governId);
        if (government.isPresent()) {
            return (Government) government.get();
        }
        return null;
    }
}
