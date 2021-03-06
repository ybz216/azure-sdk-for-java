/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation.ServiceUnitsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServiceUnits.
 */
public interface ServiceUnits extends SupportsCreating<ServiceUnitResource.DefinitionStages.Blank>, HasInner<ServiceUnitsInner> {
    /**
     * Gets the service unit.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceUnitName The name of the service unit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceUnitResource> getAsync(String resourceGroupName, String serviceTopologyName, String serviceName, String serviceUnitName);

    /**
     * Lists the service units under a service in the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceUnitResource> listAsync(String resourceGroupName, String serviceTopologyName, String serviceName);

    /**
     * Deletes the service unit.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceUnitName The name of the service unit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceTopologyName, String serviceName, String serviceUnitName);

}
