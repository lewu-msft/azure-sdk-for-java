/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ServiceFabricMeshManagementClientImpl class.
 */
public class ServiceFabricMeshManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The version of the API. This parameter is required and its value must be `2018-07-01-preview`. */
    private String apiVersion;

    /**
     * Gets The version of the API. This parameter is required and its value must be `2018-07-01-preview`.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The customer subscription identifier. */
    private String subscriptionId;

    /**
     * Gets The customer subscription identifier.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The customer subscription identifier.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ServiceFabricMeshManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public ServiceFabricMeshManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public ServiceFabricMeshManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public ServiceFabricMeshManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ApplicationsInner object to access its operations.
     */
    private ApplicationsInner applications;

    /**
     * Gets the ApplicationsInner object to access its operations.
     * @return the ApplicationsInner object.
     */
    public ApplicationsInner applications() {
        return this.applications;
    }

    /**
     * The ServicesInner object to access its operations.
     */
    private ServicesInner services;

    /**
     * Gets the ServicesInner object to access its operations.
     * @return the ServicesInner object.
     */
    public ServicesInner services() {
        return this.services;
    }

    /**
     * The ReplicasInner object to access its operations.
     */
    private ReplicasInner replicas;

    /**
     * Gets the ReplicasInner object to access its operations.
     * @return the ReplicasInner object.
     */
    public ReplicasInner replicas() {
        return this.replicas;
    }

    /**
     * The CodePackagesInner object to access its operations.
     */
    private CodePackagesInner codePackages;

    /**
     * Gets the CodePackagesInner object to access its operations.
     * @return the CodePackagesInner object.
     */
    public CodePackagesInner codePackages() {
        return this.codePackages;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The NetworksInner object to access its operations.
     */
    private NetworksInner networks;

    /**
     * Gets the NetworksInner object to access its operations.
     * @return the NetworksInner object.
     */
    public NetworksInner networks() {
        return this.networks;
    }

    /**
     * The VolumesInner object to access its operations.
     */
    private VolumesInner volumes;

    /**
     * Gets the VolumesInner object to access its operations.
     * @return the VolumesInner object.
     */
    public VolumesInner volumes() {
        return this.volumes;
    }

    /**
     * Initializes an instance of ServiceFabricMeshManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ServiceFabricMeshManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ServiceFabricMeshManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ServiceFabricMeshManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ServiceFabricMeshManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ServiceFabricMeshManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-07-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.applications = new ApplicationsInner(restClient().retrofit(), this);
        this.services = new ServicesInner(restClient().retrofit(), this);
        this.replicas = new ReplicasInner(restClient().retrofit(), this);
        this.codePackages = new CodePackagesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.networks = new NetworksInner(restClient().retrofit(), this);
        this.volumes = new VolumesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "ServiceFabricMeshManagementClient", "2018-07-01-preview");
    }
}