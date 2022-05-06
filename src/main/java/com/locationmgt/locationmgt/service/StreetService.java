/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.locationmgt.service;

import com.locationmgt.locationmgt.Dto.StreetDto;
import com.locationmgt.locationmgt.entity.Street;
import java.util.List;

/**
 *
 * @author nashey
 */
public interface StreetService {
    String saveStreet(StreetDto streetDto);
    
    List<Street> findAllStreetsByAreaId(Long id);
    
    String deleteStreet(Long id);
    
}
