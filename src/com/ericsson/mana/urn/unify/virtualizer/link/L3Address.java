package com.ericsson.mana.urn.unify.virtualizer.link;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"id","name","configure","client","requested","provided"})
public class L3Address {

    private String id;
    private String name;
    private String configure;
    private String client;
    private String requested;
    private String provided;
    
    
    public String getId() {
        return id;
    }
    @XmlElement(name = "id")
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }
    public String getConfigure() {
        return configure;
    }
    @XmlElement(name = "configure")
    public void setConfigure(String configure) {
        this.configure = configure;
    }
    
   
    public String getClient() {
        return client;
    }
    
    @XmlElement(name = "client")
    public void setClient(String client) {
        this.client = client;
    }
    public String getRequested() {
        return requested;
    }
    
    @XmlElement(name = "requested")
    public void setRequested(String requested) {
        this.requested = requested;
    }
    public String getProvided() {
        return provided;
    }
    
    @XmlElement(name = "provided")
    public void setProvided(String provided) {
        this.provided = provided;
    }
    
    
}
