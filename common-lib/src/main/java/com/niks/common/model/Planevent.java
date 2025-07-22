package com.niks.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collation = "planevents")
public class Planevent {

    @Id
    private String id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> promotionIds;

    private String eventType;
    private List<String> divisionIds;

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<String> getPromotionIds() {
        return promotionIds;
    }

    public void setPromotionIds(List<String> promotionIds) {
        this.promotionIds = promotionIds;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public List<String> getDivisionIds() {
        return divisionIds;
    }

    public void setDivisionIds(List<String> divisionIds) {
        this.divisionIds = divisionIds;
    }

    public Planevent() {
    }

    public Planevent(String id, String name, LocalDate startDate, LocalDate endDate, List<String> promotionIds, String eventType, List<String> divisionIds) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.promotionIds = promotionIds;
        this.eventType = eventType;
        this.divisionIds = divisionIds;
    }
}
