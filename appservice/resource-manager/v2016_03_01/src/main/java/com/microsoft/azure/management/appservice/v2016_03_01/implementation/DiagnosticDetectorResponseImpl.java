/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticDetectorResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_03_01.DetectorAbnormalTimePeriod;
import com.microsoft.azure.management.appservice.v2016_03_01.NameValuePair;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticMetricSet;
import com.microsoft.azure.management.appservice.v2016_03_01.ResponseMetaData;

class DiagnosticDetectorResponseImpl extends WrapperImpl<DiagnosticDetectorResponseInner> implements DiagnosticDetectorResponse {
    private final AppServiceManager manager;
    DiagnosticDetectorResponseImpl(DiagnosticDetectorResponseInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public List<DetectorAbnormalTimePeriod> abnormalTimePeriods() {
        return this.inner().abnormalTimePeriods();
    }

    @Override
    public List<List<NameValuePair>> data() {
        return this.inner().data();
    }

    @Override
    public DetectorDefinitionInner detectorDefinition() {
        return this.inner().detectorDefinition();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean issueDetected() {
        return this.inner().issueDetected();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public List<DiagnosticMetricSet> metrics() {
        return this.inner().metrics();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ResponseMetaData responseMetaData() {
        return this.inner().responseMetaData();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
