package com.niks.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "storeGroups")
public class StoreGroup {

    @Id
    private String id;
    private String storeGroupName;
    private List<String> divisionIds;

    public StoreGroup() {
    }

    public StoreGroup(String id, String storeGroupName, List<String> divisionIds) {
        this.id = id;
        this.storeGroupName = storeGroupName;
        this.divisionIds = divisionIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreGroupName() {
        return storeGroupName;
    }

    public void setStoreGroupName(String storeGroupName) {
        this.storeGroupName = storeGroupName;
    }

    public List<String> getDivisionIds() {
        return divisionIds;
    }

    public void setDivisionIds(List<String> divisionIds) {
        this.divisionIds = divisionIds;
    }
}
