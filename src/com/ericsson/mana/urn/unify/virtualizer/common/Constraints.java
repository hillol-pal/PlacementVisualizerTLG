package com.ericsson.mana.urn.unify.virtualizer.common;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Constraints {

    private List<Affinity> affinity;
    private List<Antiaffinity> antiaffinity;
    private List<Variable> variable;
    private List<Constraint> constraint;
    private String restorability;
    
    
    public List<Affinity> getAffinity() {
        return affinity;
    }
    public void setAffinity(List<Affinity> affinity) {
        this.affinity = affinity;
    }
    public List<Antiaffinity> getAntiaffinity() {
        return antiaffinity;
    }
    public void setAntiaffinity(List<Antiaffinity> antiaffinity) {
        this.antiaffinity = antiaffinity;
    }
    public List<Variable> getVariable() {
        return variable;
    }
    public void setVariable(List<Variable> variable) {
        this.variable = variable;
    }
    public List<Constraint> getConstraint() {
        return constraint;
    }
    public void setConstraint(List<Constraint> constraint) {
        this.constraint = constraint;
    }
    public String getRestorability() {
        return restorability;
    }
    public void setRestorability(String restorability) {
        this.restorability = restorability;
    }
    
    
    
}
