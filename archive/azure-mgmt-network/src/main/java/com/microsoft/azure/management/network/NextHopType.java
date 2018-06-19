/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for NextHopType.
 */
public final class NextHopType {
    /** Static value Internet for NextHopType. */
    public static final NextHopType INTERNET = new NextHopType("Internet");

    /** Static value VirtualAppliance for NextHopType. */
    public static final NextHopType VIRTUAL_APPLIANCE = new NextHopType("VirtualAppliance");

    /** Static value VirtualNetworkGateway for NextHopType. */
    public static final NextHopType VIRTUAL_NETWORK_GATEWAY = new NextHopType("VirtualNetworkGateway");

    /** Static value VnetLocal for NextHopType. */
    public static final NextHopType VNET_LOCAL = new NextHopType("VnetLocal");

    /** Static value HyperNetGateway for NextHopType. */
    public static final NextHopType HYPER_NET_GATEWAY = new NextHopType("HyperNetGateway");

    /** Static value None for NextHopType. */
    public static final NextHopType NONE = new NextHopType("None");

    private String value;

    /**
     * Creates a custom value for NextHopType.
     * @param value the custom value
     */
    public NextHopType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof NextHopType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        NextHopType rhs = (NextHopType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}