/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;


/**
 * Describes Protocol and thumbprint of Windows Remote Management listener.
 */
public class WinRMListener {
    /**
     * Gets or sets the Protocol used by WinRM listener. Currently only Http
     * and Https are supported. Possible values include: 'Http', 'Https'.
     */
    private ProtocolTypes protocol;

    /**
     * Gets or sets the Certificate URL in KMS for Https listeners. Should be
     * null for Http listeners.
     */
    private String certificateUrl;

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public ProtocolTypes getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     */
    public void setProtocol(ProtocolTypes protocol) {
        this.protocol = protocol;
    }

    /**
     * Get the certificateUrl value.
     *
     * @return the certificateUrl value
     */
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl value.
     *
     * @param certificateUrl the certificateUrl value to set
     */
    public void setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
    }

}
