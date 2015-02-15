package com.powerstack.jopenstack.service_catalogue;

import java.io.IOException;
import java.util.HashSet;

import javax.inject.Inject;

import org.jclouds.openstack.nova.v2_0.domain.Flavor;

import com.google.common.collect.FluentIterable;
import com.powerstack.jopenstack.core.NovaFlavorList;

public class ServiceCatalogueImpl implements ServiceCatalogue {

	
	private VmOrderCategory vmOrderCategory;
	
	@Inject
	public void SetVmOrderCategory(VmOrderCategory vmOrderCategory) {
		this.vmOrderCategory = vmOrderCategory;
	}
	
	public VmOrderCategory getVmOrderCategory() {
		return this.vmOrderCategory;
	}
	
	@Inject
	private void invokeNovaFlavorList(NovaFlavorList invoker) {
		FluentIterable<Flavor> flavors = null;
		HashSet<VmOrderItemImpl> orders = new HashSet<VmOrderItemImpl>();
		VmOrderItem order = null;
		try {
			flavors = invoker.all();
			for (Flavor item : flavors) {
				if ((order = vmOrderCategory.search(item.getVcpus(), 
						item.getRam(), item.getDisk())) != null ) {
					
				};
			}
			invoker.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				invoker.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
