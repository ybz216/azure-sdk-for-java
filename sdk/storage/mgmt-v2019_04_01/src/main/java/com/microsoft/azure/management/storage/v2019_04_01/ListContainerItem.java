/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_04_01.implementation.StorageManager;
import com.microsoft.azure.management.storage.v2019_04_01.implementation.ListContainerItemInner;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing ListContainerItem.
 */
public interface ListContainerItem extends HasInner<ListContainerItemInner>, HasManager<StorageManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the hasImmutabilityPolicy value.
     */
    Boolean hasImmutabilityPolicy();

    /**
     * @return the hasLegalHold value.
     */
    Boolean hasLegalHold();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the immutabilityPolicy value.
     */
    ImmutabilityPolicyProperties immutabilityPolicy();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the leaseDuration value.
     */
    LeaseDuration leaseDuration();

    /**
     * @return the leaseState value.
     */
    LeaseState leaseState();

    /**
     * @return the leaseStatus value.
     */
    LeaseStatus leaseStatus();

    /**
     * @return the legalHold value.
     */
    LegalHoldProperties legalHold();

    /**
     * @return the metadata value.
     */
    Map<String, String> metadata();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the publicAccess value.
     */
    PublicAccess publicAccess();

    /**
     * @return the type value.
     */
    String type();

}
