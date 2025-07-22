package com.niks.common.model;

import java.util.List;

public class EventPromotionResponse {

    private String eventId;
    private String eventName;
    private String eventType;
    private List<String> divisionIds;
    private List<PromotionResponse> promotions;

    public EventPromotionResponse() {}

    public EventPromotionResponse(String eventId, String eventName, String eventType, List<String> divisionIds, List<PromotionResponse> promotions) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventType = eventType;
        this.divisionIds = divisionIds;
        this.promotions = promotions;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
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

    public List<PromotionResponse> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<PromotionResponse> promotions) {
        this.promotions = promotions;
    }
}
