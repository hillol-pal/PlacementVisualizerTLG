package com.ericsson.mana.urn.unify.virtualizer.node;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.ericsson.mana.urn.unify.virtualizer.common.MetaData;
import com.ericsson.mana.urn.unify.virtualizer.link.LinkResource;

@XmlType(propOrder= {"id","name","port_type","capability","sap","sap_data"
	,"control","addresses","metadata"})
public class Port {
    
    private String id;
    private String name;
    private String port_type;
    private String capability;
    private String sap;
    
    private SAPData sap_data;
    private Control control;
    private Addresses addresses;
    private List<MetaData> metadata;
    
    public List<MetaData> getMetadata() {
        return metadata;
    }
    @XmlElement(name = "metadata")
    public void setMetadata(List<MetaData> metadata) {
        this.metadata = metadata;
    }
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
    public String getPort_type() {
        return port_type;
    }
    
    @XmlElement(name = "port_type")
    public void setPort_type(String port_type) {
        this.port_type = port_type;
    }
    public String getCapability() {
        return capability;
    }
    
    @XmlElement(name = "capability")
    public void setCapability(String capability) {
        this.capability = capability;
    }
    public String getSap() {
        return sap;
    }
    
    @XmlElement(name = "sap")
    public void setSap(String sap) {
        this.sap = sap;
    }
    public SAPData getSap_data() {
        return sap_data;
    }
    
    @XmlElement(name = "sap_data")
    public void setSap_data(SAPData sap_data) {
        this.sap_data = sap_data;
    }
    public Control getControl() {
        return control;
    }
    
    @XmlElement(name = "control")
    public void setControl(Control control) {
        this.control = control;
    }
    public Addresses getAddresses() {
        return addresses;
    }
    
    @XmlElement(name = "addresses")
    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }
    
    
    public Port portBuilder(String id,String name,String port_type,String sap,SAPData sap_data,Control control,Addresses addr,List<MetaData> md) {
	
   	this.setId(id);
   	this.setName(name);
   	this.setPort_type(port_type);
   	this.setSap(sap);
   	this.setSap_data(sap_data);
   	this.setControl(control);
   	this.setAddresses(addr);
   	this.setMetadata(md);
   	
   	return this;
    }

    
    
}
