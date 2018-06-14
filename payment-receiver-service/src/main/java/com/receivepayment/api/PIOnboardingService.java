/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.receivepayment.api;

import com.receivepayment.pi.validation.PIValidator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DPREMADASA
 */
@RestController
public class PIOnboardingService {
    
    @RequestMapping("/receivepayment")
    public Boolean piOnboardingValidation(@RequestParam(value="message", defaultValue="") String message) {
        
        PIValidator pIValidator = new PIValidator();
        System.out.println("Message " + message);
        return pIValidator.validatePIRequest(message);
        
        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
}
