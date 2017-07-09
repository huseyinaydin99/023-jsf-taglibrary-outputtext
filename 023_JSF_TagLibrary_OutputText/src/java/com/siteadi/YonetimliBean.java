/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class YonetimliBean {

    /**
     * Creates a new instance of YonetimliBean
     */
    private String radioHtmlKodu = "<input type'radio' name='chk1' value='Java Server Faces' />",checkboxHtmlKodu = "<input type'checkbox' name='chk1' value='Java Server Faces' />";
    public YonetimliBean() {
    }

    public String getRadioHtmlKodu() {
        return radioHtmlKodu;
    }

    public void setRadioHtmlKodu(String radioHtmlKodu) {
        this.radioHtmlKodu = radioHtmlKodu;
    }

    public String getCheckboxHtmlKodu() {
        return checkboxHtmlKodu;
    }

    public void setCheckboxHtmlKodu(String checkboxHtmlKodu) {
        this.checkboxHtmlKodu = checkboxHtmlKodu;
    }
    
    
    
}
