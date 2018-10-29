package com.ericsson.mana.urn.unify.virtualizer.node;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder= {"flowtable"})
public class FlowTable {
    
    List<FlowEntry> flowtable;

    public List<FlowEntry> getFlowtable() {
        return flowtable;
    }

    @XmlElementWrapper(name="flowtable")
    @XmlElement(name = "flowentry")
    public void setFlowtable(List<FlowEntry> flowentry) {
        this.flowtable = flowentry;
    }
    
    

}
