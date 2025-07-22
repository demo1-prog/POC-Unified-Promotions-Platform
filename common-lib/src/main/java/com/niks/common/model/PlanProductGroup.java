package com.niks.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "planProductGroups")
public class PlanProductGroup {

    private String groupId;
    private String groupName;
    private String description;

    public PlanProductGroup() {
    }

    public PlanProductGroup(String groupId, String groupName, String description) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.description = description;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
