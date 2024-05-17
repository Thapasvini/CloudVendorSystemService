package com.cloudVendor.restproject.controller;

import com.cloudVendor.restproject.model.CloudVendor;
import com.cloudVendor.restproject.response.ResponseHandler;
import com.cloudVendor.restproject.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        // to extract get mapping annotation we need to add PathVariable
        return ResponseHandler.responseBuilder("Requested vendor details are above", HttpStatus.OK,cloudVendorService.getCloudVendor(vendorId));

        //return cloudVendorService.getCloudVendor(vendorId); // retrieving from cloud service layer from method getCloudSetvice we have created there
        // second return statment gives response in generic method and
        //first reponse statement reponse is as the custom method defined in response handler
    }

    //read all cloud vendor details
    @GetMapping()
   /* public List<ResponseEntity<Object>> getAllCloudVendorDetails()
    {
        return ResponseHandler.responseBuilderAlldata("Requested vendor details are above", HttpStatus.OK,cloudVendorService.getAllCloudVendor());
        //return cloudVendorService.getAllCloudVendor(); // retrieving from cloud service layer from method getCloudSetvice we have created there
    }*/
    public ResponseEntity<Object> getAllCloudVendorDetails()
    {
        return ResponseHandler.responseBuilderAlldata("Requested vendor details are above", HttpStatus.OK, cloudVendorService.getAllCloudVendor());
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
