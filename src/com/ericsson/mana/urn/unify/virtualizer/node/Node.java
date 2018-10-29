package com.ericsson.mana.urn.unify.virtualizer.node;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.ericsson.mana.urn.unify.virtualizer.common.Constraints;
import com.ericsson.mana.urn.unify.virtualizer.common.MetaData;
import com.ericsson.mana.urn.unify.virtualizer.link.Link;

@XmlType(propOrder= {"id","name","type","status","ports","links","resources","connected",
	"constraints","metadata"})
public class Node {
    
    private String id;
    private String name;
    private String type;
    private String status;
    
    private List<Port> ports;
    private List<Link> links;
    private SoftwareResource resources;
    private String connected;
    private Constraints constraints;
    private List<MetaData> metadata;
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
    public String getType() {
        return type;
    }
    
    @XmlElement(name = "type")
    public void setType(String type) {
        this.type = type;
    }
    public String getStatus() {
        return status;
    }
    
    @XmlElement(name = "status")
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public List<Port> getPorts() {
        return ports;
    }
    
    @XmlElementWrapper(name = "ports")
    @XmlElement(name = "port")
    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }
    public List<Link> getLinks() {
        return links;
    }
    
    @XmlElement(name = "links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }
    public SoftwareResource getResources() {
        return resources;
    }
    
    @XmlElement(name = "resources")
    public void setResources(SoftwareResource softwareresource) {
        this.resources = softwareresource;
    }
    public String getConnected() {
        return connected;
    }
    
    @XmlElement(name = "connected")
    public void setConnected(String connected) {
        this.connected = connected;
    }
    public Constraints getConstraints() {
        return constraints;
    }
    
    @XmlElement(name = "constraints")
    public void setConstraints(Constraints constraints) {
        this.constraints = constraints;
    }
    public List<MetaData> getMetadata() {
        return metadata;
    }
    
    @XmlElement(name = "metadata")
    public void setMetadata(List<MetaData> metadata) {
        this.metadata = metadata;
    }

    public Node nodeBuilder(String id,String nombre,String type,List<Port> ports,List<Link> links,
	    SoftwareResource resource,String connected,Constraints constra,List<MetaData> metadata) {
	
	this.setName(nombre);
	this.setId(id);
	this.setType(type);
	this.setPorts(ports);
	this.setLinks(links);
	this.setResources(resource);
	this.setConnected(connected);
	this.setConstraints(constra);
	this.setMetadata(metadata);
	
	return this;
	
    }
    
}
