/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MINH TUAN
 */
public class Validation {

    Library l;
    String DATE_FORMAT = "dd/MM/yyyy";

    public Validation() {
        l = new Library();
    }

    public String checkPhone(String msg) {
        while (true) {
            String phone = l.getString(msg);
            String pattern = "^[0-9]{10}$";
            String pattern1 = "^[a-z]+$";

            if (phone.matches(pattern1)) {
                System.err.println("Phone number must is number");
                continue;
            }
            if (!phone.matches(pattern)) {
                System.err.println("Phone number must be 10 digits. Please enter again your phone");
                continue;
            }
            return phone;
        }
    }

    public Date checkDate(String msg) {
        boolean isValidDate = false;
        Date date = null;

        while (!isValidDate) {
            try {
                date = validStringToDate(msg);
                isValidDate = true;
            } catch (ParseException ex) {
                msg = l.getString("Date: ");
            }
        }

        return date;
    }

    public Date validStringToDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
         df.setLenient(false);
        return df.parse(date);
    }

    public String checkEmail(String msg) {
        while (true) {
            int vt = 0;
            String sub = "";
            String email = l.getString(msg);
            if (email.startsWith(" ")) {
                System.err.println("Email must is correct format");
                continue;
            } else {
                vt = email.indexOf("@");
                if (email.charAt(0) == '@') {
                    System.err.println("Email must is correct format");
                    continue;
                }
                sub = email.substring(vt + 1);
            }
            String pattern = "^[a-z]+\\.com$";

            if (!sub.matches(pattern)) {
                System.err.println("Email must is correct format");
                continue;
            }
            return email;
        }
    }

}
