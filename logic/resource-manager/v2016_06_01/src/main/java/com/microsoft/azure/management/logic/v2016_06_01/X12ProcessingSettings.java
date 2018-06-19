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
 * The X12 processing settings.
 */
public class X12ProcessingSettings {
    /**
     * The value indicating whether to mask security information.
     */
    @JsonProperty(value = "maskSecurityInfo", required = true)
    private boolean maskSecurityInfo;

    /**
     * The value indicating whether to convert numerical type to implied
     * decimal.
     */
    @JsonProperty(value = "convertImpliedDecimal", required = true)
    private boolean convertImpliedDecimal;

    /**
     * The value indicating whether to preserve interchange.
     */
    @JsonProperty(value = "preserveInterchange", required = true)
    private boolean preserveInterchange;

    /**
     * The value indicating whether to suspend interchange on error.
     */
    @JsonProperty(value = "suspendInterchangeOnError", required = true)
    private boolean suspendInterchangeOnError;

    /**
     * The value indicating whether to create empty xml tags for trailing
     * separators.
     */
    @JsonProperty(value = "createEmptyXmlTagsForTrailingSeparators", required = true)
    private boolean createEmptyXmlTagsForTrailingSeparators;

    /**
     * The value indicating whether to use dot as decimal separator.
     */
    @JsonProperty(value = "useDotAsDecimalSeparator", required = true)
    private boolean useDotAsDecimalSeparator;

    /**
     * Get the value indicating whether to mask security information.
     *
     * @return the maskSecurityInfo value
     */
    public boolean maskSecurityInfo() {
        return this.maskSecurityInfo;
    }

    /**
     * Set the value indicating whether to mask security information.
     *
     * @param maskSecurityInfo the maskSecurityInfo value to set
     * @return the X12ProcessingSettings object itself.
     */
    public X12ProcessingSettings withMaskSecurityInfo(boolean maskSecurityInfo) {
        this.maskSecurityInfo = maskSecurityInfo;
        return this;
    }

    /**
     * Get the value indicating whether to convert numerical type to implied decimal.
     *
     * @return the convertImpliedDecimal value
     */
    public boolean convertImpliedDecimal() {
        return this.convertImpliedDecimal;
    }

    /**
     * Set the value indicating whether to convert numerical type to implied decimal.
     *
     * @param convertImpliedDecimal the convertImpliedDecimal value to set
     * @return the X12ProcessingSettings object itself.
     */
    public X12ProcessingSettings withConvertImpliedDecimal(boolean convertImpliedDecimal) {
        this.convertImpliedDecimal = convertImpliedDecimal;
        return this;
    }

    /**
     * Get the value indicating whether to preserve interchange.
     *
     * @return the preserveInterchange value
     */
    public boolean preserveInterchange() {
        return this.preserveInterchange;
    }

    /**
     * Set the value indicating whether to preserve interchange.
     *
     * @param preserveInterchange the preserveInterchange value to set
     * @return the X12ProcessingSettings object itself.
     */
    public X12ProcessingSettings withPreserveInterchange(boolean preserveInterchange) {
        this.preserveInterchange = preserveInterchange;
        return this;
    }

    /**
     * Get the value indicating whether to suspend interchange on error.
     *
     * @return the suspendInterchangeOnError value
     */
    public boolean suspendInterchangeOnError() {
        return this.suspendInterchangeOnError;
    }

    /**
     * Set the value indicating whether to suspend interchange on error.
     *
     * @param suspendInterchangeOnError the suspendInterchangeOnError value to set
     * @return the X12ProcessingSettings object itself.
     */
    public X12ProcessingSettings withSuspendInterchangeOnError(boolean suspendInterchangeOnError) {
        this.suspendInterchangeOnError = suspendInterchangeOnError;
        return this;
    }

    /**
     * Get the value indicating whether to create empty xml tags for trailing separators.
     *
     * @return the createEmptyXmlTagsForTrailingSeparators value
     */
    public boolean createEmptyXmlTagsForTrailingSeparators() {
        return this.createEmptyXmlTagsForTrailingSeparators;
    }

    /**
     * Set the value indicating whether to create empty xml tags for trailing separators.
     *
     * @param createEmptyXmlTagsForTrailingSeparators the createEmptyXmlTagsForTrailingSeparators value to set
     * @return the X12ProcessingSettings object itself.
     */
    public X12ProcessingSettings withCreateEmptyXmlTagsForTrailingSeparators(boolean createEmptyXmlTagsForTrailingSeparators) {
        this.createEmptyXmlTagsForTrailingSeparators = createEmptyXmlTagsForTrailingSeparators;
        return this;
    }

    /**
     * Get the value indicating whether to use dot as decimal separator.
     *
     * @return the useDotAsDecimalSeparator value
     */
    public boolean useDotAsDecimalSeparator() {
        return this.useDotAsDecimalSeparator;
    }

    /**
     * Set the value indicating whether to use dot as decimal separator.
     *
     * @param useDotAsDecimalSeparator the useDotAsDecimalSeparator value to set
     * @return the X12ProcessingSettings object itself.
     */
    public X12ProcessingSettings withUseDotAsDecimalSeparator(boolean useDotAsDecimalSeparator) {
        this.useDotAsDecimalSeparator = useDotAsDecimalSeparator;
        return this;
    }

}
