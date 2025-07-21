package com.niks.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "planevents")
public class Planevent {

    @Id
    private String id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<String> promotionIds;
    private List<String> storeGroupIds;
    private List<String> planProductGroupIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public List<String> getPromotionIds() {
        return promotionIds;
    }

    public void setPromotionIds(List<String> promotionIds) {
        this.promotionIds = promotionIds;
    }

    public List<String> getStoreGroupIds() {
        return storeGroupIds;
    }

    public void setStoreGroupIds(List<String> storeGroupIds) {
        this.storeGroupIds = storeGroupIds;
    }

    public List<String> getPlanProductGroupIds() {
        return planProductGroupIds;
    }

    public void setPlanProductGroupIds(List<String> planProductGroupIds) {
        this.planProductGroupIds = planProductGroupIds;
    }
}
