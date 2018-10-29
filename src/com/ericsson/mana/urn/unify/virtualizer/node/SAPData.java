package com.ericsson.mana.urn.unify.virtualizer.node;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.ericsson.mana.urn.unify.virtualizer.link.LinkResource;

@XmlType(propOrder= {"technology","role","resources"})
public class SAPData {
    
    private String technology;
    private String role;
    private LinkResource resources;
    
    
    public String getTechnology() {
        return technology;
    }
    @XmlElement(name = "technology")
    public void setTechnology(String technology) {
        this.technology = technology;
    }
    public String getRole() {
        return role;
    }
    
    @XmlElement(name = "role")
    public void setRole(String role) {
        this.role = role;
    }
    public LinkResource getResources() {
        return resources;
    }
    
    @XmlElement(name = "resources")
    public void setResources(LinkResource resource) {
        this.resources = resource;
    }
    
    
}
