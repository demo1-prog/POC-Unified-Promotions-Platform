package com.niks.promotion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "Promotions")
public class Promotion {

    @Id
    private String id;
    private Long promotionId;
    private String promotionType;
    private LocalDate promoStartDate;
    private LocalDate promoEndDate;
    private String eventId;
    private Double promoAmount;
    private Integer itemLimit;
    private Integer minQuantity;
    private List<String> divisionIds;

    public Promotion() {
    }

    public Promotion(String id, Long promotionId, String promotionType, LocalDate promoStartDate, LocalDate promoEndDate,
                     String eventId, Double promoAmount, Integer itemLimit, Integer minQuantity, List<String> divisionIds) {
        this.id = id;
        this.promotionId = promotionId;
        this.promotionType = promotionType;
        this.promoStartDate = promoStartDate;
        this.promoEndDate = promoEndDate;
        this.eventId = eventId;
        this.promoAmount = promoAmount;
        this.itemLimit = itemLimit;
        this.minQuantity = minQuantity;
        this.divisionIds = divisionIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public LocalDate getPromoStartDate() {
        return promoStartDate;
    }

    public void setPromoStartDate(LocalDate promoStartDate) {
        this.promoStartDate = promoStartDate;
    }

    public LocalDate getPromoEndDate() {
        return promoEndDate;
    }

    public void setPromoEndDate(LocalDate promoEndDate) {
        this.promoEndDate = promoEndDate;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Double getPromoAmount() {
        return promoAmount;
    }

    public void setPromoAmount(Double promoAmount) {
        this.promoAmount = promoAmount;
    }

    public Integer getItemLimit() {
        return itemLimit;
    }

    public void setItemLimit(Integer itemLimit) {
        this.itemLimit = itemLimit;
    }

    public Integer getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    public List<String> getDivisionIds() {
        return divisionIds;
    }

    public void setDivisionIds(List<String> divisionIds) {
        this.divisionIds = divisionIds;
    }

}
