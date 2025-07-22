package com.niks.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "planProductGroups")
public class PlanProductGroup {

    @Id
    private String id;
    private String planProductGroupName;
    private List<String> divisionIds;

    public PlanProductGroup() {
    }

    public PlanProductGroup(String id, String planProductGroupName, List<String> divisionIds) {
        this.id = id;
        this.planProductGroupName = planProductGroupName;
        this.divisionIds = divisionIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlanProductGroupName() {
        return planProductGroupName;
    }

    public void setPlanProductGroupName(String planProductGroupName) {
        this.planProductGroupName = planProductGroupName;
    }

    public List<String> getDivisionIds() {
        return divisionIds;
    }

    public void setDivisionIds(List<String> divisionIds) {
        this.divisionIds = divisionIds;
    }
}
