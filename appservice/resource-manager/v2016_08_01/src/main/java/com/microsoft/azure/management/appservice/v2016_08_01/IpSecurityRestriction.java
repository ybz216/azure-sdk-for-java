/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP security restriction on an app.
 */
public class IpSecurityRestriction {
    /**
     * IP address the security restriction is valid for.
     */
    @JsonProperty(value = "ipAddress", required = true)
    private String ipAddress;

    /**
     * Subnet mask for the range of IP addresses the restriction is valid for.
     */
    @JsonProperty(value = "subnetMask")
    private String subnetMask;

    /**
     * Get iP address the security restriction is valid for.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set iP address the security restriction is valid for.
     *
     * @param ipAddress the ipAddress value to set
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get subnet mask for the range of IP addresses the restriction is valid for.
     *
     * @return the subnetMask value
     */
    public String subnetMask() {
        return this.subnetMask;
    }

    /**
     * Set subnet mask for the range of IP addresses the restriction is valid for.
     *
     * @param subnetMask the subnetMask value to set
     * @return the IpSecurityRestriction object itself.
     */
    public IpSecurityRestriction withSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
        return this;
    }

}
