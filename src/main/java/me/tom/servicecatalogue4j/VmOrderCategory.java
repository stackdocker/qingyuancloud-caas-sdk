package com.powerstack.jopenstack.service_catalogue;

public interface VmOrderCategory {
    
	public VmOrderItem search(int vcpus, int ram, int disk);
}
