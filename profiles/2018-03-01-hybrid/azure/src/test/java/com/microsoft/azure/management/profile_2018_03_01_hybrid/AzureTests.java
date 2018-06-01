/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.profile_2018_03_01_hybrid;

import com.microsoft.azure.arm.core.TestBase;
import com.microsoft.azure.arm.resources.Region;
import com.microsoft.azure.arm.utils.SdkContext;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.azure.management.resources.v2018_02_01.ResourceGroup;
import com.microsoft.azure.management.storage.v2016_01_01.Kind;
import com.microsoft.azure.management.storage.v2016_01_01.Sku;
import com.microsoft.azure.management.storage.v2016_01_01.SkuName;
import com.microsoft.azure.management.storage.v2016_01_01.StorageAccount;
import com.microsoft.rest.RestClient;
import org.junit.Assert;
import org.junit.Test;

public class AzureTests extends TestBase {
    protected static Azure azure;
    private static String rgName;

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        azure = Azure.authenticate(restClient, defaultSubscription);
    }

    @Override
    protected void cleanUpResources() {
        azure.resourceGroups().deleteAsync(rgName).await();
    }

    @Test
    public void firstTest() {
        rgName = SdkContext.randomResourceName("rg", 20);
        String saName = SdkContext.randomResourceName("sa", 20);
        ResourceGroup group = azure.resourceGroups()
                .define(rgName)
                .withExistingSubscription()
                .withLocation(Region.US_WEST.toString())
                .create();
        Assert.assertNotNull(group);

        StorageAccount storageAccount = azure.storageAccounts()
                .define(saName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .withKind(Kind.STORAGE)
                .withSku(new Sku().withName(SkuName.STANDARD_LRS))
                .create();

        Assert.assertNotNull(storageAccount);
        Assert.assertNotNull(storageAccount.id());
    }
}
