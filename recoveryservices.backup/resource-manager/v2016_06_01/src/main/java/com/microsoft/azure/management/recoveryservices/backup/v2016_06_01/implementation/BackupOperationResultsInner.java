/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BackupOperationResults.
 */
public class BackupOperationResultsInner {
    /** The Retrofit service to perform REST calls. */
    private BackupOperationResultsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupOperationResultsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupOperationResultsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupOperationResultsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupOperationResults to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupOperationResultsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupOperationResults get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupOperationResults/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("operationId") String operationId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides the status of the delete operations, for example, deleting a backup item. Once the operation starts, the response status code is Accepted. The response status code remains in this state until the operation reaches completion. On successful completion, the status code changes to OK. This method expects OperationID as an argument. OperationID is part of the Location header of the operation response.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void get(String vaultName, String resourceGroupName, String operationId) {
        getWithServiceResponseAsync(vaultName, resourceGroupName, operationId).toBlocking().single().body();
    }

    /**
     * Provides the status of the delete operations, for example, deleting a backup item. Once the operation starts, the response status code is Accepted. The response status code remains in this state until the operation reaches completion. On successful completion, the status code changes to OK. This method expects OperationID as an argument. OperationID is part of the Location header of the operation response.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getAsync(String vaultName, String resourceGroupName, String operationId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, operationId), serviceCallback);
    }

    /**
     * Provides the status of the delete operations, for example, deleting a backup item. Once the operation starts, the response status code is Accepted. The response status code remains in this state until the operation reaches completion. On successful completion, the status code changes to OK. This method expects OperationID as an argument. OperationID is part of the Location header of the operation response.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getAsync(String vaultName, String resourceGroupName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, operationId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Provides the status of the delete operations, for example, deleting a backup item. Once the operation starts, the response status code is Accepted. The response status code remains in this state until the operation reaches completion. On successful completion, the status code changes to OK. This method expects OperationID as an argument. OperationID is part of the Location header of the operation response.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String operationId) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), operationId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
