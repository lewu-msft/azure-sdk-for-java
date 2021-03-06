/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.EndpointHealthStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The health data for an endpoint.
 */
public class EndpointHealthDataInner {
    /**
     * Id of the endpoint.
     */
    @JsonProperty(value = "endpointId")
    private String endpointId;

    /**
     * Health status. Possible values include: 'unknown', 'healthy',
     * 'unhealthy', 'dead'.
     */
    @JsonProperty(value = "healthStatus")
    private EndpointHealthStatus healthStatus;

    /**
     * Get the endpointId value.
     *
     * @return the endpointId value
     */
    public String endpointId() {
        return this.endpointId;
    }

    /**
     * Set the endpointId value.
     *
     * @param endpointId the endpointId value to set
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * Get the healthStatus value.
     *
     * @return the healthStatus value
     */
    public EndpointHealthStatus healthStatus() {
        return this.healthStatus;
    }

    /**
     * Set the healthStatus value.
     *
     * @param healthStatus the healthStatus value to set
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withHealthStatus(EndpointHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

}
