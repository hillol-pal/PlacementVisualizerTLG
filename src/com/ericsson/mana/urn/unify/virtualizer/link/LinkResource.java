package com.ericsson.mana.urn.unify.virtualizer.link;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"delay", "bandwidth" , "cost", "qos" })
public class LinkResource {
    
    private String delay;
    private String bandwidth;
    private String cost;
    private String qos;
    
    
    
    public String getDelay() {
        return delay;
    }
    
    @XmlElement(name = "delay")
    public void setDelay(String delay) {
        this.delay = delay;
    }
    public String getBandwidth() {
        return bandwidth;
    }
    
    @XmlElement(name = "bandwidth")
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }
    public String getCost() {
        return cost;
    }
    
    @XmlElement(name = "cost")
    public void setCost(String cost) {
        this.cost = cost;
    }
    public String getQos() {
        return qos;
    }
    
    @XmlElement(name = "qos")
    public void setQos(String qos) {
        this.qos = qos;
    }
    
    public LinkResource linkResourceBuilder(String delay,String bw,String cost,String qos) {
	
	this.setDelay(delay);
	this.setBandwidth(bw);
	this.setCost(cost);
	this.setQos(qos);
	
	return this;
    }

}
