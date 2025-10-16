package org.itdma.springapi.service;


import org.itdma.springapi.api.model.Skills;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    private List<Skills> skillList;

    public SkillService() {

        /// Sample Data
        skillList = new ArrayList<>();
                Skills skills1 = new Skills(1, "Java", "Programming", "Java is a programming language");
                Skills skills2 = new Skills(2, "C++", "Programming", "C++ is a programming language");
                Skills skills3 = new Skills(3, "Python", "Programming", "Python is a programming language");
                Skills skills4 = new Skills(4, "HTML", "Web Development", "HTML is a markup language");
                Skills skills5 = new Skills(5, "CSS", "Web Development", "CSS is a style sheet language");
                Skills skills6 = new Skills(6, "JavaScript", "Web Development", "JavaScript is a programming language");

        skillList.addAll(Arrays.asList(skills1,skills2,skills3,skills4,skills5,skills6));
    }

    public Optional<Skills> getSkills(int skillId) {
        for (Skills skill : skillList) {
            try {
                if (skill.getSkillId() == skillId) {
                    return Optional.of(skill);
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Skills getNamedSkill (String skillName) {
        for (Skills skills : skillList) {
            try {
                if (skills.getName().equals(skillName)) {
                    return skills;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Skills getNamedSkillCategory (String category) {
        for (Skills skills : skillList) {
            try {
                if (skills.getCategory().equals(category)) {
                    return skills;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Skills getNamedSkillDescription (String description) {
        for (Skills skills : skillList) {
            try {
                if (skills.getDescription().equals(description)) {
                    return skills;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public List<Skills> getAllSkills() {
        return skillList;
    }
}
