package com.powerstack.jopenstack.service_catalogue;

import java.util.Set;

import javax.inject.Inject;

@GroupAsZone
public class FunctionalZoneImpl implements ResourceGroup {
    
    private String id;
    
    private String functionalName;
    @Inject 
    private Set<ResourceGroup> nestingGroup;
    
    public String getId() {
    	return this.id;
    }
    
    public String getFunctionalName() {
    	return this.functionalName;
    }
    
    public Set<ResourceGroup> getChildren() {
    	return this.nestingGroup;
    }
}
