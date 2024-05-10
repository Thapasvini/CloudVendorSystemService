package com.cloudVendor.restproject.controller;

import com.cloudVendor.restproject.model.CloudVendor;
import com.cloudVendor.restproject.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIController
{
      //CloudVendor cloudVendor;//removig this intialization coz controller will interact with service layer

    CloudVendorService cloudVendorService;

    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //read specific clod vendor details
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        // to extract get mapping annotation we need to add PathVariable
        return cloudVendorService.getCloudVendor(vendorId); // retrieving from cloud service layer from method getCloudSetvice we have created there
    }

    //read all cloud vendor details
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllCloudVendor(); // retrieving from cloud service layer from method getCloudSetvice we have created there
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor c)
    {
        cloudVendorService.createCloudVendor(c);
        return "Cloud Vendor created succesfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor c)
    {

        cloudVendorService.updateCloudVendor(c);
        return "Cloud Vendor updated succesfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor deleted succesfully";
    }
}
