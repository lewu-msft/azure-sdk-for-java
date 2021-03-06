/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.resources.v2016_06_01.implementation.SubscriptionsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.resources.v2016_06_01.Location;

/**
 * Type representing Subscriptions.
 */
public interface Subscriptions extends HasInner<SubscriptionsInner> {
    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Subscription> getAsync(String subscriptionId);

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Subscription> listAsync();

    /**
     * Gets all available geo-locations.
     * This operation provides all the locations that are available for resource providers; however, each resource provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Location> listLocationsAsync(String subscriptionId);

}
