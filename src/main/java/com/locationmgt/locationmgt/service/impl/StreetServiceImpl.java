/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.locationmgt.service.impl;

import com.locationmgt.locationmgt.Dao.AreaDao;
import com.locationmgt.locationmgt.Dao.StreetDao;
import com.locationmgt.locationmgt.Dto.StreetDto;
import com.locationmgt.locationmgt.entity.Street;
import com.locationmgt.locationmgt.service.StreetService;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nashey
 */
@Service
public class StreetServiceImpl implements StreetService{
    
    @Autowired
    private StreetDao streetDao;
    
    @Autowired
    private AreaDao areaDao;

    @Override
    public String saveStreet(StreetDto streetDto) {
        Street street = new Street();
        street.setName(streetDto.getName());
        street.setArea(areaDao.findById(streetDto.getAreaId()).get());
        street.setDateCreated(LocalDate.now());
        streetDao.save(street);
        return "success";
    }
    
}
