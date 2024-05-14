package com.cloudVendor.restproject.model;

import jakarta.persistence.*;

@Entity
@Table(name="cloud_vendor_info")// different to table which will be created in my db
public class CloudVendor
{

    @Id
    @Column(name = "vendor_id", length = 40)
    private String vendorId;
    @Column(name = "vendor_name", length = 50)
    private String vendorName;
    @Column(name = "vendor_address", length = 50)
    private String vendorAddress;
    @Column(name = "vendor_phone_number", length = 50)
    private String vendorPhoneNumber;

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
    public CloudVendor()
    {}

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }
}


