package com.ericsson.mana.urn.unify.virtualizer.node;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder= {"cpu","mem","storage","cost","zone"})
public class SoftwareResource {
    
    private String cpu;
    private String mem;
    private String storage;
    private String cost;
    private String zone;
    
    
    public String getZone() {
        return zone;
    }

    @XmlElement(name = "zone")
    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getCpu() {
        return cpu;
    }
    
    @XmlElement(name = "cpu")
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getMem() {
        return mem;
    }
    
    @XmlElement(name = "mem")
    public void setMem(String mem) {
        this.mem = mem;
    }
    public String getStorage() {
        return storage;
    }
    
    @XmlElement(name = "storage")
    public void setStorage(String storage) {
        this.storage = storage;
    }
    public String getCost() {
        return cost;
    }
    
    @XmlElement(name = "cost")
    public void setCost(String cost) {
        this.cost = cost;
    }
    
    

}
