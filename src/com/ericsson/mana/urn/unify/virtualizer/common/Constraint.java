package com.ericsson.mana.urn.unify.virtualizer.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"id","formula"})
public class Constraint {
    
    private String id;
    private String formula;
    
    
    public String getId() {
        return id;
    }
    
    @XmlElement(name = "id")
    public void setId(String id) {
        this.id = id;
    }
    public String getFormula() {
        return formula;
    }
    
    @XmlElement(name = "formula")
    public void setFormula(String formula) {
        this.formula = formula;
    }
    
    

}
