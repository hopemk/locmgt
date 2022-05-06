/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.locationmgt;

import com.locationmgt.locationmgt.entity.Area;
import com.locationmgt.locationmgt.entity.Street;
import java.time.LocalDate;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author nashey
 */
public class StreetServiceTests {
    
    private Area area1 = new Area(1, "CBD", LocalDate.now());
    private Street street1 = new Street(1, "Cafe", LocalDate.now(), area1);
    /*
    @Before
    public void setUp() {
    }
    */
    
}
