package com.powerstack.jopenstack.core;


import java.io.IOException;

import org.jclouds.openstack.nova.v2_0.domain.zonescoped.AvailabilityZone;
import org.jclouds.openstack.nova.v2_0.extensions.AvailabilityZoneApi;

import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;

public class NovaAvailabilityZoneList extends AbstractOpenStackComputeApi {
    private final Optional<AvailabilityZoneApi> novaAzApi;
	
	public NovaAvailabilityZoneList(String tenant, String user,
			String password, String region, String endpoint) {
		super(tenant, user, password, region, endpoint);
		// TODO Auto-generated constructor stub
		novaAzApi = openstackComputeApi.getAvailabilityZoneApi(region);
	}

	public FluentIterable<AvailabilityZone> all() throws IOException {
		return novaAzApi.get().list();
	}

}
