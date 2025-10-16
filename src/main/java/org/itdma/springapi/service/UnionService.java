package org.itdma.springapi.service;

import org.itdma.springapi.api.model.Union;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UnionService {

    private List<Union> unionList;

    public UnionService() {

        /// Sample Data
        unionList = new ArrayList<>();

        Union union1 = new Union(1, 1, "A", "1234567890", 100, true);
        Union union2 = new Union(2, 2, "B", "1234567890", 100, true);
        Union union3 = new Union(3, 3, "C", "1234567890", 100, true);
        Union union4 = new Union(4, 4, "D", "1234567890", 100, true);
        Union union5 = new Union(5, 5, "e", "1234567890", 100, true);

        unionList.addAll(Arrays.asList(union1,union2,union3,union4,union5));
    }
    public Optional<Union> getUnion(int unionId) {
        Optional optional = Optional.empty();
        for (Union union : unionList) {
            try {
                if (union.getUnionId() == unionId) {
                    optional = Optional.of(union);
                    return optional;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public Union getNamedRegistrationNo(int registrationNo) {
        for (Union union : unionList) {
            try {
                if (union.getRegistrationNo() == registrationNo) {
                    return union;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public Union getNamedSectors(String sectors) {
        for (Union union : unionList) {
            try {
                if (union.getSectors().equals(sectors)) {
                    return union;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Union getNamedcontacts(String contacts) {
        for (Union union : unionList) {
            try {
                if (union.getContacts().equals(contacts)) {
                    return union;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Union getNamedSize(int size) {
        for (Union union : unionList) {
            try {
                if (union.getSize() == size) {
                    return union;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Union getNamedIsactive(Boolean isactive) {
        for (Union union : unionList) {
            try {
                if (union.getIsactive().equals(isactive)) {
                    return union;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public List<Union> getAllUnions() {
        return unionList;
    }
}
