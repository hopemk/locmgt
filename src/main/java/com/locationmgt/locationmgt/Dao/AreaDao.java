/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.locationmgt.Dao;

import com.locationmgt.locationmgt.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nashey
 */
@Repository
public interface AreaDao extends JpaRepository<Area, Long>{
    
}
