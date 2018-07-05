/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2015_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.trafficmanager.v2015_11_01.implementation.NetworkManager;
import com.microsoft.azure.management.trafficmanager.v2015_11_01.implementation.TrafficManagerNameAvailabilityInner;

/**
 * Type representing TrafficManagerNameAvailability.
 */
public interface TrafficManagerNameAvailability extends HasInner<TrafficManagerNameAvailabilityInner>, HasManager<NetworkManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    String reason();

    /**
     * @return the type value.
     */
    String type();

}