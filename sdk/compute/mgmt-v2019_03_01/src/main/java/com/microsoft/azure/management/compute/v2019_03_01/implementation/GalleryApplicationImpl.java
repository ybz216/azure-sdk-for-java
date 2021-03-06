/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.management.compute.v2019_03_01.GalleryApplication;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2019_03_01.OperatingSystemTypes;

class GalleryApplicationImpl extends CreatableUpdatableImpl<GalleryApplication, GalleryApplicationInner, GalleryApplicationImpl> implements GalleryApplication, GalleryApplication.Definition, GalleryApplication.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String galleryName;
    private String galleryApplicationName;

    GalleryApplicationImpl(String name, ComputeManager manager) {
        super(name, new GalleryApplicationInner());
        this.manager = manager;
        // Set resource name
        this.galleryApplicationName = name;
        //
    }

    GalleryApplicationImpl(GalleryApplicationInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.galleryApplicationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.galleryName = IdParsingUtils.getValueFromIdByName(inner.id(), "galleries");
        this.galleryApplicationName = IdParsingUtils.getValueFromIdByName(inner.id(), "applications");
        //
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<GalleryApplication> createResourceAsync() {
        GalleryApplicationsInner client = this.manager().inner().galleryApplications();
        return client.createOrUpdateAsync(this.resourceGroupName, this.galleryName, this.galleryApplicationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<GalleryApplication> updateResourceAsync() {
        GalleryApplicationsInner client = this.manager().inner().galleryApplications();
        return client.createOrUpdateAsync(this.resourceGroupName, this.galleryName, this.galleryApplicationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GalleryApplicationInner> getInnerAsync() {
        GalleryApplicationsInner client = this.manager().inner().galleryApplications();
        return client.getAsync(this.resourceGroupName, this.galleryName, this.galleryApplicationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public DateTime endOfLifeDate() {
        return this.inner().endOfLifeDate();
    }

    @Override
    public String eula() {
        return this.inner().eula();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String privacyStatementUri() {
        return this.inner().privacyStatementUri();
    }

    @Override
    public String releaseNoteUri() {
        return this.inner().releaseNoteUri();
    }

    @Override
    public OperatingSystemTypes supportedOSType() {
        return this.inner().supportedOSType();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public GalleryApplicationImpl withExistingGallery(String resourceGroupName, String galleryName) {
        this.resourceGroupName = resourceGroupName;
        this.galleryName = galleryName;
        return this;
    }

    @Override
    public GalleryApplicationImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public GalleryApplicationImpl withSupportedOSType(OperatingSystemTypes supportedOSType) {
        this.inner().withSupportedOSType(supportedOSType);
        return this;
    }

    @Override
    public GalleryApplicationImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public GalleryApplicationImpl withEndOfLifeDate(DateTime endOfLifeDate) {
        this.inner().withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    @Override
    public GalleryApplicationImpl withEula(String eula) {
        this.inner().withEula(eula);
        return this;
    }

    @Override
    public GalleryApplicationImpl withPrivacyStatementUri(String privacyStatementUri) {
        this.inner().withPrivacyStatementUri(privacyStatementUri);
        return this;
    }

    @Override
    public GalleryApplicationImpl withReleaseNoteUri(String releaseNoteUri) {
        this.inner().withReleaseNoteUri(releaseNoteUri);
        return this;
    }

    @Override
    public GalleryApplicationImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
