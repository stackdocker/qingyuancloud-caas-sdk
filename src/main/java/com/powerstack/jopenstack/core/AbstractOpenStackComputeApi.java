package com.powerstack.jopenstack.core;

import java.io.Closeable;
import java.io.IOException;

import org.jclouds.ContextBuilder;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;
import org.jclouds.openstack.nova.v2_0.NovaApi;

import com.google.common.collect.ImmutableSet;
import com.google.common.io.Closeables;
import com.google.inject.Module;

public abstract class AbstractOpenStackComputeApi implements Closeable {
	protected final NovaApi openstackComputeApi;
	
	public AbstractOpenStackComputeApi(String tenant, String user, String password, String region, String endpoint) {
		Iterable<Module> modules = ImmutableSet.<Module>of(new SLF4JLoggingModule());

		String provider = "openstack-nova";
        String identity = tenant + ":" + "demo"; // tenantName:userName
        String credential = password;
        
        
        openstackComputeApi = ContextBuilder.newBuilder(provider)
                .endpoint(endpoint)              //"http://xxx.xxx.xxx.xxx:5000/v2.0/"
                .credentials(identity, credential)
                .modules(modules)
                .buildApi(NovaApi.class);
	}
	
    
	public void close() throws IOException {
		// TODO Auto-generated method stub
		Closeables.close(openstackComputeApi, true);
	}
}
