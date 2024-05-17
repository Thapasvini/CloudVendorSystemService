package com.cloudVendor.restproject.service.impl;

import com.cloudVendor.restproject.exception.CloudVendorNotFoundException;
import com.cloudVendor.restproject.model.CloudVendor;
import com.cloudVendor.restproject.repository.CloudVendorRepository;
import com.cloudVendor.restproject.service.CloudVendorService;
import org.springframework.stereotype.Service;

// if we want to add more bussiness logic add more methods or change the existing logic
import java.util.List;
@Service // mandatory add to service layer
public class CloudVendorServiceImpl implements CloudVendorService
{

    CloudVendorRepository cloudVendorRepository;// coz this is what interacts with the db

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor); // we are saving this entity in the database via repository
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor); // we are updating the same entity in the database via repository
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Delete success";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {

       if(cloudVendorRepository.findById(vendorId).isEmpty())// here with get we get entire cloudvendor object
            throw new CloudVendorNotFoundException("Requested CloudVendor details by Id does not exist");
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}

