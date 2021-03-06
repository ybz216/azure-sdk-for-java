/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input required to update vCenter.
 */
public class UpdateVCenterRequest {
    /**
     * The update VCenter Request Properties.
     */
    @JsonProperty(value = "properties")
    private UpdateVCenterRequestProperties properties;

    /**
     * Get the update VCenter Request Properties.
     *
     * @return the properties value
     */
    public UpdateVCenterRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the update VCenter Request Properties.
     *
     * @param properties the properties value to set
     * @return the UpdateVCenterRequest object itself.
     */
    public UpdateVCenterRequest withProperties(UpdateVCenterRequestProperties properties) {
        this.properties = properties;
        return this;
    }

}
