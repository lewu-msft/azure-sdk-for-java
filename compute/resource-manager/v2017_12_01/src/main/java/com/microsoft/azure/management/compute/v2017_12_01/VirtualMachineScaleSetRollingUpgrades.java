/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import rx.Observable;

/**
 * Type representing VirtualMachineScaleSetRollingUpgrades.
 */
public interface VirtualMachineScaleSetRollingUpgrades {
    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> cancelAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RollingUpgradeStatusInfo> getLatestAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> startOSUpgradeAsync(String resourceGroupName, String vmScaleSetName);

}
