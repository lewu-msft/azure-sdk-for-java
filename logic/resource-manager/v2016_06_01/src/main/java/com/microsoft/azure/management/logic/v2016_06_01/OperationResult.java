/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The operation result definition.
 */
public class OperationResult extends OperationResultProperties {
    /**
     * Gets the tracking id.
     */
    @JsonProperty(value = "trackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingId;

    /**
     * Gets the inputs.
     */
    @JsonProperty(value = "inputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object inputs;

    /**
     * Gets the link to inputs.
     */
    @JsonProperty(value = "inputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink inputsLink;

    /**
     * Gets the outputs.
     */
    @JsonProperty(value = "outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /**
     * Gets the link to outputs.
     */
    @JsonProperty(value = "outputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink outputsLink;

    /**
     * Gets the tracked properties.
     */
    @JsonProperty(value = "trackedProperties", access = JsonProperty.Access.WRITE_ONLY)
    private Object trackedProperties;

    /**
     * Gets the retry histories.
     */
    @JsonProperty(value = "retryHistory")
    private List<RetryHistory> retryHistory;

    /**
     * The iterationCount property.
     */
    @JsonProperty(value = "iterationCount")
    private Integer iterationCount;

    /**
     * Get gets the tracking id.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Get gets the inputs.
     *
     * @return the inputs value
     */
    public Object inputs() {
        return this.inputs;
    }

    /**
     * Get gets the link to inputs.
     *
     * @return the inputsLink value
     */
    public ContentLink inputsLink() {
        return this.inputsLink;
    }

    /**
     * Get gets the outputs.
     *
     * @return the outputs value
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get gets the link to outputs.
     *
     * @return the outputsLink value
     */
    public ContentLink outputsLink() {
        return this.outputsLink;
    }

    /**
     * Get gets the tracked properties.
     *
     * @return the trackedProperties value
     */
    public Object trackedProperties() {
        return this.trackedProperties;
    }

    /**
     * Get gets the retry histories.
     *
     * @return the retryHistory value
     */
    public List<RetryHistory> retryHistory() {
        return this.retryHistory;
    }

    /**
     * Set gets the retry histories.
     *
     * @param retryHistory the retryHistory value to set
     * @return the OperationResult object itself.
     */
    public OperationResult withRetryHistory(List<RetryHistory> retryHistory) {
        this.retryHistory = retryHistory;
        return this;
    }

    /**
     * Get the iterationCount value.
     *
     * @return the iterationCount value
     */
    public Integer iterationCount() {
        return this.iterationCount;
    }

    /**
     * Set the iterationCount value.
     *
     * @param iterationCount the iterationCount value to set
     * @return the OperationResult object itself.
     */
    public OperationResult withIterationCount(Integer iterationCount) {
        this.iterationCount = iterationCount;
        return this;
    }

}
