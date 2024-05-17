package com.cloudVendor.restproject.response;

import com.cloudVendor.restproject.model.CloudVendor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseHandler
{
    public static ResponseEntity<Object> responseBuilder
            (String message,HttpStatus httpStatus,Object responseObject)
    {
        Map<String, Object> response= new HashMap<>();

        response.put("httpStatus",httpStatus);
        response.put("data",responseObject);
        response.put("message",message);

    return new ResponseEntity<>(response,httpStatus);
    }

    public static ResponseEntity<Object> responseBuilderAlldata
            (String message,HttpStatus httpStatus,List<CloudVendor> responseObject)
    {
        Map<String, Object> response= new HashMap<>();

        response.put("httpStatus",httpStatus);
        response.put("data",responseObject);
        response.put("message",message);

        return new ResponseEntity<>(response,httpStatus);
    }
   /* public static List<ResponseEntity<Object>> responseBuilderAlldata
            (String message,HttpStatus httpStatus,List<CloudVendor> responseObject)
    {
        List<ResponseEntity<Object>> l= new ArrayList<>();
        for(int i=0;i<responseObject.size();i++)
        {
            Map<String, Object> response= new HashMap<>();

            response.put("httpStatus",httpStatus);
            response.put("data",responseObject.get(i));
            response.put("message",message);

            l.add(new ResponseEntity<>(response,httpStatus));
        }


        return l;
    }*/

}
