/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters schema of integration account map.
 */
public class IntegrationAccountMapPropertiesParametersSchema {
    /**
     * The reference name.
     */
    @JsonProperty(value = "ref")
    private String ref;

    /**
     * Get the reference name.
     *
     * @return the ref value
     */
    public String ref() {
        return this.ref;
    }

    /**
     * Set the reference name.
     *
     * @param ref the ref value to set
     * @return the IntegrationAccountMapPropertiesParametersSchema object itself.
     */
    public IntegrationAccountMapPropertiesParametersSchema withRef(String ref) {
        this.ref = ref;
        return this;
    }

}
