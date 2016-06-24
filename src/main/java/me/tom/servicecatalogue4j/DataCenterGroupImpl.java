package com.powerstack.jopenstack.service_catalogue;

import java.util.Set;

import javax.inject.Inject;

public class DataCenterGroupImpl implements ResourceGroup {
    
    private String id;
   
    private String organization;
    @Inject
    private Set<ResourceGroup> dataCenters;
    
    public String getId() {
    	return this.id;
    }
    
    public String getOrganization() {
    	return this.organization;
    }
    
    public Set<ResourceGroup> getChildren() {
    	return this.dataCenters;
    }
    
    public DataCenterGroupImpl(String id, String organization) {
    	this.id = id;
    	this.organization = organization;
    }
    
    @Inject
    public void addDataCenter(@GroupAsDataCenter ResourceGroup dataCenter) {
    	dataCenters.add(dataCenter);
    }
}
