package com.ericsson.mana.urn.unify.virtualizer.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class MetaData {
    
   
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    @XmlElement(name = "key", required = true, nillable = false)
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    @XmlElement(name = "value", required = false)
    public void setValue(String value) {
        this.value = value;
    }
    
    

}
