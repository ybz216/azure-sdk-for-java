/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.implementation;

import com.microsoft.azure.applicationinsights.query.ApplicationInsightsDataClient;
import com.microsoft.azure.applicationinsights.query.Events;
import com.microsoft.azure.applicationinsights.query.Metrics;
import com.microsoft.azure.applicationinsights.query.Querys;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ApplicationInsightsDataClientImpl class.
 */
public class ApplicationInsightsDataClientImpl extends AzureServiceClient implements ApplicationInsightsDataClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public ApplicationInsightsDataClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public ApplicationInsightsDataClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public ApplicationInsightsDataClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The Metrics object to access its operations.
     */
    private Metrics metrics;

    /**
     * Gets the Metrics object to access its operations.
     * @return the Metrics object.
     */
    public Metrics metrics() {
        return this.metrics;
    }

    /**
     * The Events object to access its operations.
     */
    private Events events;

    /**
     * Gets the Events object to access its operations.
     * @return the Events object.
     */
    public Events events() {
        return this.events;
    }

    /**
     * The Querys object to access its operations.
     */
    private Querys querys;

    /**
     * Gets the Querys object to access its operations.
     * @return the Querys object.
     */
    public Querys querys() {
        return this.querys;
    }

    /**
     * Initializes an instance of ApplicationInsightsDataClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ApplicationInsightsDataClientImpl(ServiceClientCredentials credentials) {
        this("https://api.applicationinsights.io/v1", credentials);
    }

    /**
     * Initializes an instance of ApplicationInsightsDataClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ApplicationInsightsDataClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ApplicationInsightsDataClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ApplicationInsightsDataClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.metrics = new MetricsImpl(restClient().retrofit(), this);
        this.events = new EventsImpl(restClient().retrofit(), this);
        this.querys = new QuerysImpl(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "ApplicationInsightsDataClient", "v1");
    }
}
