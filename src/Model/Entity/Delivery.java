/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

/**
 *
 * @author phatt
 */
public class Delivery {
    private static final char SEPARATOR = ',';
    private String deliveryID;
    private String productName;
    private String cusAddress;

    public Delivery(String deliveryID, String productName, String cusAddress) {
        this.deliveryID = deliveryID;
        this.productName = productName;
        this.cusAddress = cusAddress;
    }
    
    public Delivery(String line) {
        String[] parts = line.split(SEPARATOR + "");
        deliveryID = parts[0].trim();
        productName = parts[1].trim();
        cusAddress = parts[2].trim();
    }

    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    @Override
    public String toString() {
        return (deliveryID + SEPARATOR + productName + SEPARATOR + cusAddress);
    }

    
    
}
