package org.itdma.springapi.api.controller;


import org.itdma.springapi.api.model.Skills;
import org.itdma.springapi.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SkillController {
    private SkillService skillService;

    ///For short injection of service
    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/skills")
    public Skills getSkill(@RequestParam int skillId) {
        Optional skills = skillService.getSkills(1);
        if (skills.isPresent()) {
            return (Skills) skills.get();
        }
        return null;
    }
}
