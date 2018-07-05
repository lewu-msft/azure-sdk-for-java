/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.trafficmanager.v2017_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.trafficmanager.v2017_05_01.GeographicHierarchies;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.trafficmanager.v2017_05_01.TrafficManagerGeographicHierarchy;

class GeographicHierarchiesImpl extends WrapperImpl<GeographicHierarchiesInner> implements GeographicHierarchies {
    private final NetworkManager manager;

    GeographicHierarchiesImpl(NetworkManager manager) {
        super(manager.inner().geographicHierarchies());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TrafficManagerGeographicHierarchy> getDefaultAsync() {
        GeographicHierarchiesInner client = this.inner();
        return client.getDefaultAsync()
        .map(new Func1<TrafficManagerGeographicHierarchyInner, TrafficManagerGeographicHierarchy>() {
            @Override
            public TrafficManagerGeographicHierarchy call(TrafficManagerGeographicHierarchyInner inner) {
                return new TrafficManagerGeographicHierarchyImpl(inner, manager());
            }
        });
    }

}