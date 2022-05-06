/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.locationmgt.controller;

import com.locationmgt.locationmgt.Dto.StreetDto;
import com.locationmgt.locationmgt.entity.Street;
import com.locationmgt.locationmgt.service.StreetService;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nashey
 */
@RestController
public class StreetController {
    @Autowired
    private StreetService streetService;
    
    @PostMapping("street/save")
    public String save(@RequestBody StreetDto streetDto){
        String response = streetService.saveStreet(streetDto);
        return response;
    }
    
    @GetMapping("street/findallbyarea")
    public List<Street> findAllStreetsByAreaId(@RequestParam(name="areaId") String areaId){
        long id = Long.valueOf(areaId);
        List<Street> response = streetService.findAllStreetsByAreaId(id);
        return response;
    }
    @DeleteMapping("street/deletebyid")
    public String deleteStreetById(@RequestParam(name="streetId") String streetId){
        long id = Long.valueOf(streetId);
        String response = streetService.deleteStreet(id);
        return response;
    }
    
}
