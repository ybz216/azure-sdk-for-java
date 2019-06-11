/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VpnClientProtocol.
 */
public final class VpnClientProtocol extends ExpandableStringEnum<VpnClientProtocol> {
    /** Static value IkeV2 for VpnClientProtocol. */
    public static final VpnClientProtocol IKE_V2 = fromString("IkeV2");

    /** Static value SSTP for VpnClientProtocol. */
    public static final VpnClientProtocol SSTP = fromString("SSTP");

    /** Static value OpenVPN for VpnClientProtocol. */
    public static final VpnClientProtocol OPEN_VPN = fromString("OpenVPN");

    /**
     * Creates or finds a VpnClientProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding VpnClientProtocol
     */
    @JsonCreator
    public static VpnClientProtocol fromString(String name) {
        return fromString(name, VpnClientProtocol.class);
    }

    /**
     * @return known VpnClientProtocol values
     */
    public static Collection<VpnClientProtocol> values() {
        return values(VpnClientProtocol.class);
    }
}
