/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SslState.
 */
public enum SslState {
    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value SniEnabled. */
    SNIENABLED("SniEnabled"),

    /** Enum value IpBasedEnabled. */
    IPBASEDENABLED("IpBasedEnabled");

    /** The actual serialized value for a SslState instance. */
    private String value;

    SslState(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a SslState instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a SslState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SslState object, or null if unable to parse.
     */
    @JsonCreator
    public static SslState fromValue(String value) {
        SslState[] items = SslState.values();
        for (SslState item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
