package com.ericsson.mana.urn.unify.virtualizer;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ericsson.mana.urn.unify.virtualizer.common.MetaData;
import com.ericsson.mana.urn.unify.virtualizer.link.Link;
import com.ericsson.mana.urn.unify.virtualizer.node.InfraNode;
import com.ericsson.mana.urn.unify.virtualizer.node.Node;

@XmlRootElement
@XmlType(propOrder = {"id","name","nodes","links","metadata"})
public class Virtualizer {
    
    private Virtualizer vz=null;

    private String id;
    private String name;
    private List<InfraNode> nodes;
    
    private List<Link> links;
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
    public List<InfraNode> getNodes() {
        return nodes;
    }
    
    @XmlElementWrapper(name="nodes")
    @XmlElement(name = "node")
    public void setNodes(List<InfraNode> nodelist) {
        this.nodes = nodelist;
    }
    public List<Link> getLinks() {
        return links;
    }
    
    @XmlElementWrapper(name="links")
    @XmlElement(name = "link")
    public void setLinks(List<Link> links) {
        this.links = links;
    }
    public List<MetaData> getMetadata() {
        return metadata;
    }
    
    @XmlElement(name = "metadata")
    public void setMetadata(List<MetaData> metadata) {
        this.metadata = metadata;
    }
    
    private Virtualizer getVirtuaLizer(){
	
	vz=new Virtualizer();
	return vz;
	
    }
    
    public Virtualizer virtualizerLocalBuilder(Virtualizer vz,String id,String name){
	
   	vz.setId(id);
   	vz.setName(name);
   	
   	return vz;
    }
       
   public Virtualizer nodeBuilder(Virtualizer vz,List<InfraNode> nodes) {
   	
       vz.setNodes(nodes);
       
       return vz;
   }
       
   public Virtualizer linkBuilder(Virtualizer vz,List<Link> links) {
   	
       vz.setLinks(links);
       
       return vz;
       
   }
       
   public Virtualizer metadataBuilder(Virtualizer vz,List<MetaData> metadata) {
   	
       
       vz.setMetadata(metadata);
       return vz;
   }
    
    
}
