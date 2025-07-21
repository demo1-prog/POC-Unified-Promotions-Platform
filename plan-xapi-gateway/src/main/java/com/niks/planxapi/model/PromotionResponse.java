package com.niks.planxapi.model;

public class PromotionResponse {

    private String promotionId;
    private String promotionType;

    public PromotionResponse() {}

    public PromotionResponse(String promotionId, String promotionType) {
        this.promotionId = promotionId;
        this.promotionType = promotionType;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }
}
