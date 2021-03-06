/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2018_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2018_04_01.Disk;
import rx.Observable;
import com.microsoft.azure.management.compute.v2018_04_01.DiskUpdate;
import com.microsoft.azure.management.compute.v2018_04_01.DiskSku;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2018_04_01.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2018_04_01.CreationData;
import com.microsoft.azure.management.compute.v2018_04_01.EncryptionSettings;
import rx.functions.Func1;

class DiskImpl extends GroupableResourceCoreImpl<Disk, DiskInner, DiskImpl, ComputeManager> implements Disk, Disk.Definition, Disk.Update {
    private DiskUpdate updateParameter;
    DiskImpl(String name, DiskInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new DiskUpdate();
    }

    @Override
    public Observable<Disk> createResourceAsync() {
        DisksInner client = this.manager().inner().disks();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<DiskInner, DiskInner>() {
               @Override
               public DiskInner call(DiskInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Disk> updateResourceAsync() {
        DisksInner client = this.manager().inner().disks();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DiskInner, DiskInner>() {
               @Override
               public DiskInner call(DiskInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DiskInner> getInnerAsync() {
        DisksInner client = this.manager().inner().disks();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DiskUpdate();
    }

    @Override
    public CreationData creationData() {
        return this.inner().creationData();
    }

    @Override
    public Integer diskSizeGB() {
        return this.inner().diskSizeGB();
    }

    @Override
    public EncryptionSettings encryptionSettings() {
        return this.inner().encryptionSettings();
    }

    @Override
    public String managedBy() {
        return this.inner().managedBy();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DiskSku sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime timeCreated() {
        return this.inner().timeCreated();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public DiskImpl withCreationData(CreationData creationData) {
        this.inner().withCreationData(creationData);
        return this;
    }

    @Override
    public DiskImpl withZones(List<String> zones) {
        this.inner().withZones(zones);
        return this;
    }

    @Override
    public DiskImpl withDiskSizeGB(Integer diskSizeGB) {
        if (isInCreateMode()) {
            this.inner().withDiskSizeGB(diskSizeGB);
        } else {
            this.updateParameter.withDiskSizeGB(diskSizeGB);
        }
        return this;
    }

    @Override
    public DiskImpl withEncryptionSettings(EncryptionSettings encryptionSettings) {
        if (isInCreateMode()) {
            this.inner().withEncryptionSettings(encryptionSettings);
        } else {
            this.updateParameter.withEncryptionSettings(encryptionSettings);
        }
        return this;
    }

    @Override
    public DiskImpl withOsType(OperatingSystemTypes osType) {
        if (isInCreateMode()) {
            this.inner().withOsType(osType);
        } else {
            this.updateParameter.withOsType(osType);
        }
        return this;
    }

    @Override
    public DiskImpl withSku(DiskSku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}
