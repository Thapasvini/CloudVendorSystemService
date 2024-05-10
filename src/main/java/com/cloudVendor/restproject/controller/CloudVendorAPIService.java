package com.cloudVendor.restproject.controller;

import com.cloudVendor.restproject.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
    }

    @PostMapping
    public String postCloudVendorDetails(@RequestBody CloudVendor c)
    {
        this.cloudVendor=c;
        this.cloudVendor=c;
        return "Cloud Vendor created succesfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor c)
    {
        this.cloudVendor=c;
        return "Cloud Vendor updated succesfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor=null;
        return "Cloud Vendor deleted succesfully";
    }
}
