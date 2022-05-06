/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.locationmgt.controller;

import com.locationmgt.locationmgt.Dto.StreetDto;
import com.locationmgt.locationmgt.service.StreetService;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
}
