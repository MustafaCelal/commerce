package com.fiba.commerce.business.dto;

public class CartProductDto {

    private long cartProductId;

    private long productId;

    private long salesQuantity;

    private double salesPrice;

    private double lineAmount;

    public CartProductDto() {
    }

    public CartProductDto(long cartProductId, long productId,
                          long salesQuantity, double salesPrice, double lineAmount) {
        this.cartProductId = cartProductId;
        this.productId = productId;
        this.salesQuantity = salesQuantity;
        this.salesPrice = salesPrice;
        this.lineAmount = lineAmount;
    }

    public long getCartProductId() {
        return cartProductId;
    }

    public void setCartProductId(long cartProductId) {
        this.cartProductId = cartProductId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(long salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(double lineAmount) {
        this.lineAmount = lineAmount;
    }

}
