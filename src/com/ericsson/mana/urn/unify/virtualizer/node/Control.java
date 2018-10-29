package com.ericsson.mana.urn.unify.virtualizer.node;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder= {"controller","orchestrator"})
public class Control {
    
    private String controller;
    private String orchestrator;
    
    public String getController() {
        return controller;
    }
    @XmlElement(name = "controller")
    public void setController(String controller) {
        this.controller = controller;
    }
    public String getOrchestrator() {
        return orchestrator;
    }
    @XmlElement(name = "orchestrator")
    public void setOrchestrator(String orchestrator) {
        this.orchestrator = orchestrator;
    }

    
}
