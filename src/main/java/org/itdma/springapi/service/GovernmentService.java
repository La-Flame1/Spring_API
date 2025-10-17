package org.itdma.springapi.service;

import org.itdma.springapi.api.model.Government;
import org.itdma.springapi.api.model.Union;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class GovernmentService {

    private List<Government> governmentList;
    
    public GovernmentService() {
        
        /// Sample Data
        governmentList = new ArrayList<>();
        Government government1 = new Government(1, "Tshwane", "Gauteng", "1234567890", true);
        Government government2 = new Government(2, "Tshwane", "Gauteng", "1234567890", true);
        Government government3 = new Government(3, "Tshwane", "Gauteng", "1234567890",  true);
        Government government4 = new Government(4, "Tshwane", "Gauteng", "1234567890",  true);
        Government government5 = new Government(5, "Tshwane", "Gauteng", "1234567890", true);

        governmentList.addAll(Arrays.asList(government1, government2, government3, government4, government5));
    }
    public Optional<Government> getGovernment(int governId) {
        
        Optional optional = Optional.empty();
        for (Government government : governmentList) {
            try {
                if (government.getGovernmentId() == governId) {
                    optional = Optional.of(government);
                    return optional;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Government getNamedDeptName(String deptName) {
        for (Government government : governmentList) {
            try {
                if (government.getDeptName().equals(deptName)) {
                    return government;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Government getNamedProvince(String province) {
        for (Government government : governmentList) {
            try {
                if (government.getProvince().equals(province)) {
                    return government;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Government getNamedContacts(String contacts){
        for (Government government : governmentList) {
            try {
                if (government.getContacts().equals(contacts)) {
                    return government;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public Government getNamedIsactive(Boolean isactive) {
        for (Government government : governmentList) {
            try {
                if (government.getIsactive().equals(isactive)) {
                    return government;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
