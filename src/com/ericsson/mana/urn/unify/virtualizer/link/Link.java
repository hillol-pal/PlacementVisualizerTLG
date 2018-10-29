package com.ericsson.mana.urn.unify.virtualizer.link;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"id", "name" , "src", "dst","linkresource" })
public class Link {
    
    private String id;
    private String name;
    private String src;
    private String dst;
    
    private LinkResource linkresource;

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

    public String getSrc() {
        return src;
    }

    @XmlElement(name = "src")
    public void setSrc(String src) {
        this.src = src;
    }

    
    public String getDst() {
        return dst;
    }

    @XmlElement(name = "dst")
    public void setDst(String dst) {
        this.dst = dst;
    }

    public LinkResource getLinkresource() {
        return linkresource;
    }

    @XmlElement(name = "link-resource")
    public void setLinkresource(LinkResource linkresource) {
        this.linkresource = linkresource;
    }
    
    public Link linkBuilder(String id,String name,String source,String dest,LinkResource resource) {
	
	this.setId(id);
	this.setName(name);
	this.setSrc(source);
	this.setDst(dest);
	this.setLinkresource(resource);
	return this;
    }
    

}
