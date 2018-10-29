package com.ericsson.mana.urn.unify.virtualizer.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Variable {
    
    private String id;
    private String object;

    
    public String getId() {
        return id;
    }
    
    @XmlElement(name = "id")
    public void setId(String id) {
        this.id = id;
    }
    public String getObject() {
        return object;
    }
    
    @XmlElement(name = "object")
    public void setObject(String object) {
        this.object = object;
    }
    

}
