package com.powerstack.jopenstack.service_catalogue;

import java.util.Set;

import javax.inject.Inject;

@GroupAsDataCenter
public class DataCenterImpl implements ResourceGroup {
    
    private String id;
    
    private String name;
    @Inject
    private Set<ResourceGroup> nestingGroup;
    
    public String getId() {
    	return this.id;
    }
	
    public String getName() {
    	return this.name;
    }
    
    public Set<ResourceGroup> getChildren() { 
    	return this.nestingGroup; 
    }
}
