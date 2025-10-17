package org.itdma.springapi.api.model;

/* ERD Government
    governId | int | PK |
    deptName | varchar(10) |
    province | varchar(10) |
    contacts | varchar(10) |
    isactive | boolean |
 */

public class Government {
    private final int governId;
    private final String deptName;
    private final String province;
    private final String contacts;
    private final Boolean isactive;

    public Government (int governId, String deptName, String province, String contacts, Boolean isactive) {
        this.governId = governId;
        this.deptName = deptName;
        this.province = province;
        this.contacts = contacts;
        this.isactive = isactive;
    }

    public int getGovernmentId() {
        return governId;
    }
    public String getDeptName() {
        return deptName;
    }
    public String getProvince() {
        return province;
    }
    public String getContacts() {
        return contacts;
    }
    public Boolean getIsactive() {
        return isactive;
    }
}
