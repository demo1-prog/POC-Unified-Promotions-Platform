package com.niks.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "storeGroups")
public class StoreGroup {

    private String groupId;
    private String location;
    private String region;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StoreGroup(String groupId, String location, String region) {
        this.groupId = groupId;
        this.location = location;
        this.region = region;
    }

    public StoreGroup() {
    }
}
