package com.ericsson.mana.urn.unify.virtualizer;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import com.ericsson.mana.urn.unify.virtualizer.common.MetaData;
import com.ericsson.mana.urn.unify.virtualizer.link.Link;
import com.ericsson.mana.urn.unify.virtualizer.link.LinkResource;
import com.ericsson.mana.urn.unify.virtualizer.node.InfraNode;
import com.ericsson.mana.urn.unify.virtualizer.node.Node;
import com.ericsson.mana.urn.unify.virtualizer.node.Port;

public class BuilderMain {
    
    public static void main(String args[]) {
	
	
	Virtualizer vz=new Virtualizer();
	
	vz=vz.virtualizerLocalBuilder(vz, "INTERNAL","Internal-Mininet-Topology");
	

	vz=vz.linkBuilder(vz, buildSampleLinks());
	
	vz=vz.nodeBuilder(vz, buildSampleNodes());

	System.out.println(jaxbObjectToXML(vz));
    }
    
    private static List<InfraNode> buildSampleNodes() {
	
	List<InfraNode> nodelist=new ArrayList<InfraNode>();
	
	nodelist.add(new InfraNode().nodeBuilder(new Node().nodeBuilder
		("EE1", "ee-infra-1", "EE", samplePortBuilder(), null, null, null, null, null), null, null, null));
	
	return nodelist;
    }

    private static List<Port> samplePortBuilder() {
	// TODO Auto-generated method stub
	List<Port> ports=new ArrayList<Port>();
	
	ports.add(new Port().portBuilder("1", null,"port-abstract", null, null, null, null,null));
	ports.add(new Port().portBuilder("2", null, "port-abstract", null, null, null, null,null));
	ports.add(new Port().portBuilder("3", null,"port-sap", null, null, null, null,null));
	
	return ports;
    }

    private static List<Link> buildSampleLinks() {
	//Build list of sample Links for testing the XML
	
	List<Link> links=new ArrayList<Link>();
	
	links.add(new Link().linkBuilder("mn-link1", null, "../../../nodes/node[id=EE1]/ports/port[id=1]", 
		"../../../nodes/node[id=SW3]/ports/port[id=1]", new LinkResource().linkResourceBuilder("1.5", "10.0", null,null)));
	links.add(new Link().linkBuilder("mn-link1-back", null, "../../../nodes/node[id=SW3]/ports/port[id=1]", 
		"../../../nodes/node[id=EE1]/ports/port[id=1]", new LinkResource().linkResourceBuilder("1.5", "10.0", null,null)));
	links.add(new Link().linkBuilder("mn-link2", null, "../../../nodes/node[id=EE2]/ports/port[id=1]",
		"../../../nodes/node[id=SW2]/ports/port[id=1]", new LinkResource().linkResourceBuilder("1.5", "10.0", null,null)));

	links.add(new Link().linkBuilder("mn-link2-back",null,"../../../nodes/node[id=SW2]/ports/port[id=1]",
		"../../../nodes/node[id=EE2]/ports/port[id=1]", new LinkResource().linkResourceBuilder("1.5", "10.0", null,null)));

	links.add(new Link().linkBuilder("mn-link3", null, "../../../nodes/node[id=SW3]/ports/port[id=2]", 
		"../../../nodes/node[id=SW2]/ports/port[id=2]", new LinkResource().linkResourceBuilder("1.5", "10.0", null,null)));
	
	links.add(new Link().linkBuilder("mn-link3-back", null, "../../../nodes/node[id=SW2]/ports/port[id=2]",
		"../../../nodes/node[id=SW3]/ports/port[id=2]", new LinkResource().linkResourceBuilder("1.5", "10.0", null,null)));

	
	return links;
    }

 

    private static String jaxbObjectToXML(Virtualizer dto) {
	    String xmlString = "";
	    try {
	        JAXBContext context = JAXBContext.newInstance(Virtualizer.class);
	        Marshaller m = context.createMarshaller();

	        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); 

	        StringWriter sw = new StringWriter();
	        m.marshal(dto, sw);
	        xmlString = sw.toString();

	    } catch (JAXBException e) {
	        e.printStackTrace();
	    }

	    return xmlString;
	    
    }
    
   

}
