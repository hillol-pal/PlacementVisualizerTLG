package com.ericsson.mana.urn.unify.virtualizer.node;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.ericsson.mana.urn.unify.virtualizer.link.L3Address;

@XmlType(propOrder= {"l2","l3_address","l4"})
public class Addresses {

    
    private String l2;
    private L3Address l3_address;
    private String l4;
    
    
    public String getL2() {
        return l2;
    }
    @XmlElement(name = "l2")
    public void setL2(String l2) {
        this.l2 = l2;
    }
    public L3Address getL3_address() {
        return l3_address;
    }
    @XmlElement(name = "l3_address")
    public void setL3_address(L3Address l3_address) {
        this.l3_address = l3_address;
    }
    public String getL4() {
        return l4;
    }
    @XmlElement(name = "l4")
    public void setL4(String l4) {
        this.l4 = l4;
    }
    
    
    
    
}
