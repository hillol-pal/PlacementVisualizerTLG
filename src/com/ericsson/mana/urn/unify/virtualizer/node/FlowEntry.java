package com.ericsson.mana.urn.unify.virtualizer.node;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.ericsson.mana.urn.unify.virtualizer.common.Constraints;
import com.ericsson.mana.urn.unify.virtualizer.link.LinkResource;

@XmlType(propOrder={"id", "name" , "priority", "port", "match","action","out","linkresource","constraints" })
public class FlowEntry {

    private String id;
    private String name;
    private String priority;
    private String port;
    private String match;
    private String action;
    private String out;
    
    private LinkResource linkresource;
    private Constraints constraints;
    
    
   
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
    public String getPriority() {
        return priority;
    }
    
    @XmlElement(name = "priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getPort() {
        return port;
    }
    
    @XmlElement(name = "port")
    public void setPort(String port) {
        this.port = port;
    }
    public String getMatch() {
        return match;
    }
    
    @XmlElement(name = "match")
    public void setMatch(String match) {
        this.match = match;
    }
    public String getAction() {
        return action;
    }
    
    @XmlElement(name = "action")
    public void setAction(String action) {
        this.action = action;
    }
    public String getOut() {
        return out;
    }
    
    @XmlElement(name = "out")
    public void setOut(String out) {
        this.out = out;
    }
    
    public LinkResource getLinkresource() {
        return linkresource;
    }
    
    @XmlElement(name = "link-resource")
    public void setLinkresource(LinkResource linkresource) {
        this.linkresource = linkresource;
    }
    public Constraints getConstraints() {
        return constraints;
    }
    
    @XmlElement(name = "constraints")
    public void setConstraints(Constraints constraints) {
        this.constraints = constraints;
    }
    
    
    
}
