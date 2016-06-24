package com.powerstack.jopenstack.service_catalogue;

import javax.inject.Inject;
import javax.inject.Named;

@Named("ServiceCatalogue:standard")
public class VmOrderItemImpl implements VmOrderItem {

	private String id;
	private String name;
	private int vcpus;
	private int ram;
	private int disk;
	private String os;
	@Inject
	FlavorAssociation flavorAssociation;
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getVcpus() {
		return this.vcpus;
	}
	
	public int getRam() {
		return this.ram;
	}
	
	public int getDisk() {
		return this.disk;
	}
	
	public String getOs() {
		return this.os;
	}
}
