package com.powerstack.jopenstack.service_catalogue;

import org.jclouds.openstack.nova.v2_0.domain.Flavor;
import org.jclouds.openstack.nova.v2_0.domain.HostAggregate;
import org.jclouds.openstack.nova.v2_0.domain.zonescoped.AvailabilityZone;

public class FlavorAssociation {
	private double rxtxFactor;
    private Flavor flavor;
    private HostAggregate hostAggregate;
    private AvailabilityZone availabilityZone;
	
	
	public double rxtxFactor() {
		return this.rxtxFactor;
	}

}
