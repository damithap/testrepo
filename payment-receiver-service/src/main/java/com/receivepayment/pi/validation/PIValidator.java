/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.receivepayment.pi.validation;

/**
 *
 * @author DPREMADASA
 */
public class PIValidator {
    
    public boolean validatePIRequest(String message){
        
        System.out.println("1.will route the payment instruction to Micro service");
        System.out.println("2.Micro service to receive the instruction");
        System.out.println("3.Validate the Channel identification");
        System.out.println("4.Verify the Authencity");
        System.out.println("5.Decrypt /Decode the message");
        System.out.println("6.Check Format, syntax, Check sum and hashes");
        System.out.println("7.Check the message level duplication");        
        System.out.println("");
        
        return false;
    }
    
}
