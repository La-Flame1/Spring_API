package org.itdma.springapi.api.model;
/* ERD~ Skills
    skillId | int | PK |
    name | varchar(10) |
    category | varchar(10) |
    description | varchar(10) |
 */

public class Skills {
    private final int skillId;
    private final String skillName;
    private final String category;
    private final String description;

    public Skills (int skillId, String skillName    , String category, String description) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.category = category;
        this.description = description;
    }

    public int getSkillId() {
        return skillId;
    }
    public String getName() {
        return skillName;
    }
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
}
