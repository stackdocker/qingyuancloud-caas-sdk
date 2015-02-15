package com.powerstack.jopenstack.service_catalogue;

import java.util.HashSet;

import javax.inject.Inject;

public class VmOrderCategoryImpl implements VmOrderCategory {
    private HashSet<VmOrderItemImpl> items;
    
    @Inject 
    public void setItems(HashSet<VmOrderItemImpl> items) {
    	this.items = items;
    }
    
    public VmOrderItem search(int vcpus, int ram, int disk) {
    	VmOrderItemImpl item;
        while ((item = items.iterator().next()) != null) {
        	if (item.getVcpus() == vcpus && item.getRam() == ram 
        			&& item.getDisk() == disk) return item;
        }
        return null;
    }
}
