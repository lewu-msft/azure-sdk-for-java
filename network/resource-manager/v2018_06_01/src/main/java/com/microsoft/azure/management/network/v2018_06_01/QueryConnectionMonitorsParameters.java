/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to query connection monitors.
 */
public class QueryConnectionMonitorsParameters {
    /**
     * List of connection monitors ID.
     */
    @JsonProperty(value = "connectionMonitorIds")
    private List<String> connectionMonitorIds;

    /**
     * Get list of connection monitors ID.
     *
     * @return the connectionMonitorIds value
     */
    public List<String> connectionMonitorIds() {
        return this.connectionMonitorIds;
    }

    /**
     * Set list of connection monitors ID.
     *
     * @param connectionMonitorIds the connectionMonitorIds value to set
     * @return the QueryConnectionMonitorsParameters object itself.
     */
    public QueryConnectionMonitorsParameters withConnectionMonitorIds(List<String> connectionMonitorIds) {
        this.connectionMonitorIds = connectionMonitorIds;
        return this;
    }

}