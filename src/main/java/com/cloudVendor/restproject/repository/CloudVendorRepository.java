package com.cloudVendor.restproject.repository;

import com.cloudVendor.restproject.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
//JpaRepository have lots have many methods, so we dont need to import methods secially, bt if we want custom methods need to write them,
// JPARepo helps in methods like save,
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>
//here we have given model class name and datatype of Id i.e., vendorId
{

}
