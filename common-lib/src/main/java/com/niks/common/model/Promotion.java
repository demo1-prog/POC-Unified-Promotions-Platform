package com.niks.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document(collection = "promotions")
public class Promotion {

    @Id
    private String id;
    private String vendor;
    private String productName;
    private BigDecimal discount;
    private LocalDate validFrom;
    private LocalDate validTo;
    private String planeventId;

    public Promotion() {
    }

    public Promotion(String id, String vendor, String productName, BigDecimal discount, LocalDate validFrom, LocalDate validTo, String planeventId) {
        this.id = id;
        this.vendor = vendor;
        this.productName = productName;
        this.discount = discount;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.planeventId = planeventId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public String getPlaneventId() {
        return planeventId;
    }

    public void setPlaneventId(String planeventId) {
        this.planeventId = planeventId;
    }
}
