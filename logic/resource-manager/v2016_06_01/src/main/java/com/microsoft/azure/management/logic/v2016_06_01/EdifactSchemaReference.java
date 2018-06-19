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
 * The Edifact schema reference.
 */
public class EdifactSchemaReference {
    /**
     * The message id.
     */
    @JsonProperty(value = "messageId", required = true)
    private String messageId;

    /**
     * The message version.
     */
    @JsonProperty(value = "messageVersion", required = true)
    private String messageVersion;

    /**
     * The message release version.
     */
    @JsonProperty(value = "messageRelease", required = true)
    private String messageRelease;

    /**
     * The sender application id.
     */
    @JsonProperty(value = "senderApplicationId")
    private String senderApplicationId;

    /**
     * The sender application qualifier.
     */
    @JsonProperty(value = "senderApplicationQualifier")
    private String senderApplicationQualifier;

    /**
     * The association assigned code.
     */
    @JsonProperty(value = "associationAssignedCode")
    private String associationAssignedCode;

    /**
     * The schema name.
     */
    @JsonProperty(value = "schemaName", required = true)
    private String schemaName;

    /**
     * Get the message id.
     *
     * @return the messageId value
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the message id.
     *
     * @param messageId the messageId value to set
     * @return the EdifactSchemaReference object itself.
     */
    public EdifactSchemaReference withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the message version.
     *
     * @return the messageVersion value
     */
    public String messageVersion() {
        return this.messageVersion;
    }

    /**
     * Set the message version.
     *
     * @param messageVersion the messageVersion value to set
     * @return the EdifactSchemaReference object itself.
     */
    public EdifactSchemaReference withMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
        return this;
    }

    /**
     * Get the message release version.
     *
     * @return the messageRelease value
     */
    public String messageRelease() {
        return this.messageRelease;
    }

    /**
     * Set the message release version.
     *
     * @param messageRelease the messageRelease value to set
     * @return the EdifactSchemaReference object itself.
     */
    public EdifactSchemaReference withMessageRelease(String messageRelease) {
        this.messageRelease = messageRelease;
        return this;
    }

    /**
     * Get the sender application id.
     *
     * @return the senderApplicationId value
     */
    public String senderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * Set the sender application id.
     *
     * @param senderApplicationId the senderApplicationId value to set
     * @return the EdifactSchemaReference object itself.
     */
    public EdifactSchemaReference withSenderApplicationId(String senderApplicationId) {
        this.senderApplicationId = senderApplicationId;
        return this;
    }

    /**
     * Get the sender application qualifier.
     *
     * @return the senderApplicationQualifier value
     */
    public String senderApplicationQualifier() {
        return this.senderApplicationQualifier;
    }

    /**
     * Set the sender application qualifier.
     *
     * @param senderApplicationQualifier the senderApplicationQualifier value to set
     * @return the EdifactSchemaReference object itself.
     */
    public EdifactSchemaReference withSenderApplicationQualifier(String senderApplicationQualifier) {
        this.senderApplicationQualifier = senderApplicationQualifier;
        return this;
    }

    /**
     * Get the association assigned code.
     *
     * @return the associationAssignedCode value
     */
    public String associationAssignedCode() {
        return this.associationAssignedCode;
    }

    /**
     * Set the association assigned code.
     *
     * @param associationAssignedCode the associationAssignedCode value to set
     * @return the EdifactSchemaReference object itself.
     */
    public EdifactSchemaReference withAssociationAssignedCode(String associationAssignedCode) {
        this.associationAssignedCode = associationAssignedCode;
        return this;
    }

    /**
     * Get the schema name.
     *
     * @return the schemaName value
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the schema name.
     *
     * @param schemaName the schemaName value to set
     * @return the EdifactSchemaReference object itself.
     */
    public EdifactSchemaReference withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

}
