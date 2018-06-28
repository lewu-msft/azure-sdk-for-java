/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.WorkItemConfigurationInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.InsightsManager;

/**
 * Type representing WorkItemConfiguration.
 */
public interface WorkItemConfiguration extends HasInner<WorkItemConfigurationInner>, HasManager<InsightsManager> {
    /**
     * @return the configDisplayName value.
     */
    String configDisplayName();

    /**
     * @return the configProperties value.
     */
    String configProperties();

    /**
     * @return the connectorId value.
     */
    String connectorId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isDefault value.
     */
    Boolean isDefault();

}
