/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.StorageAccountInfoInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.DataLakeAnalyticsManager;

/**
 * Type representing StorageAccountInfo.
 */
public interface StorageAccountInfo extends HasInner<StorageAccountInfoInner>, HasManager<DataLakeAnalyticsManager> {
    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    StorageAccountProperties properties();

}