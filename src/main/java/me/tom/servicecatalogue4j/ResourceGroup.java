package com.powerstack.jopenstack.service_catalogue;

import java.util.Set;

public interface ResourceGroup {
    String getId();
    Set<ResourceGroup> getChildren();
}
