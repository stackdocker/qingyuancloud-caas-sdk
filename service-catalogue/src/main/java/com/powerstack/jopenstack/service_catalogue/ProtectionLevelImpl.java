package com.powerstack.jopenstack.service_catalogue;

import java.util.Set;

import javax.inject.Inject;

@GroupAsLevel
public class ProtectionLevelImpl implements ResourceGroup {
    
    private String id;
    
    private String protectionName;
    @Inject
    private Set<ResourceGroup> nestingGroup;
    
    public String getId() {
    	return this.id;
    }
    
    public String getProtectionName() {
    	return this.protectionName;
    }
    
    public Set<ResourceGroup> getChildren() {
    	return this.nestingGroup;
    }
}
