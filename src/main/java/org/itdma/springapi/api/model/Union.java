package org.itdma.springapi.api.model;
/* ERD~ Unions
    unionId | int | PK |
    registrationNo | varchar(10) |
    sectors | varchar(10) |
    contacts | varchar(10) |
    size | int |
    isactive | boolean |

 */

public class Union {
    private final int unionId;
    private final int registrationNo;
    private final String sectors;
    private final String contacts;
    private final int size;
    private final Boolean isactive;

    public Union (int unionId, int registrationNo, String sectors, String contacts,
              int size, Boolean isactive) {
                this.unionId = unionId;
                this.registrationNo = registrationNo;
                this.sectors = sectors;
                this.contacts = contacts;
                this.size = size;
                this.isactive = isactive;
    }
    public int getUnionId() {
        return unionId;
    }
    public int getRegistrationNo() {
        return registrationNo;
    }
    public String getSectors() {
        return sectors;
    }
    public String getContacts() {
        return contacts;
    }
    public int getSize() {
        return size;
    }
    public Boolean getIsactive() {
        return isactive;
    }
}
