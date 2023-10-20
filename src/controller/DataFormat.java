/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import common.Validation;
import java.util.Date;

/**
 *
 * @author MINH TUAN
 */
public class DataFormat {

    Validation vl;

    public DataFormat() {
        vl = new Validation();
    }

    public void ValidateProgram() {
        System.out.println("====== Validate Progaram ======");
        String number = vl.checkPhone("Phone number: ");
        String email = vl.checkEmail("Email: ");
        Date date = vl.checkDate("Date: ");
    }
}
