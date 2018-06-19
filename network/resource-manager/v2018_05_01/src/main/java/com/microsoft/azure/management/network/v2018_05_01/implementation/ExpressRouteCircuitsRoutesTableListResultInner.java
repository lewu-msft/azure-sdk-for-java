/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitRoutesTable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for ListRoutesTable associated with the Express Route Circuits API.
 */
public class ExpressRouteCircuitsRoutesTableListResultInner {
    /**
     * The list of routes table.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitRoutesTable> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the list of routes table.
     *
     * @return the value value
     */
    public List<ExpressRouteCircuitRoutesTable> value() {
        return this.value;
    }

    /**
     * Set the list of routes table.
     *
     * @param value the value value to set
     * @return the ExpressRouteCircuitsRoutesTableListResultInner object itself.
     */
    public ExpressRouteCircuitsRoutesTableListResultInner withValue(List<ExpressRouteCircuitRoutesTable> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the URL to get the next set of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set
     * @return the ExpressRouteCircuitsRoutesTableListResultInner object itself.
     */
    public ExpressRouteCircuitsRoutesTableListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
