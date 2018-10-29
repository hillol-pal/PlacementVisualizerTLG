package com.ericsson.mana.urn.unify.virtualizer.node;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.ericsson.mana.urn.unify.virtualizer.link.Link;
import com.ericsson.mana.urn.unify.virtualizer.link.LinkResource;


@XmlType(propOrder= {"node","NF_instances","capabilities","flowtable"})
public class InfraNode extends Node {

    private Node node;
    private List<Node> NF_instances;
    private List<Node> capabilities;
    private FlowTable flowtable;
    public Node getNode() {
        return node;
    }
    
    @XmlElement(name = "node")
    public void setNode(Node node) {
        this.node = node;
    }
    public List<Node> getNF_instances() {
        return NF_instances;
    }
    
    @XmlElement(name = "NF_instances")
    public void setNF_instances(List<Node> nF_instances) {
        NF_instances = nF_instances;
    }
    
    
    public List<Node> getCapabilities() {
        return capabilities;
    }
    
    @XmlElement(name = "capabilities")
    public void setCapabilities(List<Node> capabilities) {
        this.capabilities = capabilities;
    }
    
    
    public FlowTable getFlowtable() {
        return flowtable;
    }
    
    @XmlElement(name = "flowtable")
    public void setFlowtable(FlowTable flowtable) {
        this.flowtable = flowtable;
    }
    
    public InfraNode nodeBuilder(Node node,List<Node> nF_insta,List<Node> capas,FlowTable flowtab) {
	
	this.setNode(node);
	this.setNF_instances(nF_insta);
	this.setCapabilities(capas);
	this.setFlowtable(flowtab);

	return this;
    }
    
    

}
