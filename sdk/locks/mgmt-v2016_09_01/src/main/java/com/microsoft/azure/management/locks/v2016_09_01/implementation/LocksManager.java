/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.locks.v2016_09_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.locks.v2016_09_01.AuthorizationOperations;
import com.microsoft.azure.management.locks.v2016_09_01.ManagementLocks;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Authorization resource management.
 */
public final class LocksManager extends ManagerCore<LocksManager, ManagementLockClientImpl> {
    private AuthorizationOperations authorizationOperations;
    private ManagementLocks managementLocks;
    /**
    * Get a Configurable instance that can be used to create LocksManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new LocksManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of LocksManager that exposes Authorization resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the LocksManager
    */
    public static LocksManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new LocksManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of LocksManager that exposes Authorization resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the LocksManager
    */
    public static LocksManager authenticate(RestClient restClient, String subscriptionId) {
        return new LocksManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of LocksManager that exposes Authorization management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Authorization management API entry points that work across subscriptions
        */
        LocksManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage AuthorizationOperations.
     */
    public AuthorizationOperations authorizationOperations() {
        if (this.authorizationOperations == null) {
            this.authorizationOperations = new AuthorizationOperationsImpl(this);
        }
        return this.authorizationOperations;
    }

    /**
     * @return Entry point to manage ManagementLocks.
     */
    public ManagementLocks managementLocks() {
        if (this.managementLocks == null) {
            this.managementLocks = new ManagementLocksImpl(this);
        }
        return this.managementLocks;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public LocksManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return LocksManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private LocksManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ManagementLockClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
