/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanhai.iou;

import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;

/**
 *
 * @author callme
 */
public class IOU_VM {
    private String fields1 = "QQCC";
    
    @AfterCompose
    public void afterCompose(@ContextParam(ContextType.VIEW) Component view){
        Selectors.wireComponents(view, this, false);
    }
    
    @Command("dQuery")
    public void dQuery(){
        System.out.println(" in dQuery");
        System.out.println("dCond getColumn2 = ");
    }

    
    
//<editor-fold defaultstate="collapsed" desc="getter, setter">
    public String getFields1() {
        return fields1;
    }
    
    public void setFields1(String fields1) {
        this.fields1 = fields1;
    }
//</editor-fold>
    
    
}
