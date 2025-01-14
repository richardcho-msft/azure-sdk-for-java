// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.OperationDetailInner;
import com.azure.resourcemanager.appcontainers.models.AvailableOperations;
import com.azure.resourcemanager.appcontainers.models.OperationDisplay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AvailableOperationsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableOperations model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"pfhoqcaaewdao\",\"isDataAction\":true,\"display\":{\"provider\":\"pjxxkzb\",\"resource\":\"sgeivsiy\",\"operation\":\"kdncj\",\"description\":\"onbzoggculapzwy\"},\"origin\":\"gogtqxepnylbf\"}],\"nextLink\":\"jlyjtlvofq\"}")
                .toObject(AvailableOperations.class);
        Assertions.assertEquals("pfhoqcaaewdao", model.value().get(0).name());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("pjxxkzb", model.value().get(0).display().provider());
        Assertions.assertEquals("sgeivsiy", model.value().get(0).display().resource());
        Assertions.assertEquals("kdncj", model.value().get(0).display().operation());
        Assertions.assertEquals("onbzoggculapzwy", model.value().get(0).display().description());
        Assertions.assertEquals("gogtqxepnylbf", model.value().get(0).origin());
        Assertions.assertEquals("jlyjtlvofq", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableOperations model =
            new AvailableOperations()
                .withValue(
                    Arrays
                        .asList(
                            new OperationDetailInner()
                                .withName("pfhoqcaaewdao")
                                .withIsDataAction(true)
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("pjxxkzb")
                                        .withResource("sgeivsiy")
                                        .withOperation("kdncj")
                                        .withDescription("onbzoggculapzwy"))
                                .withOrigin("gogtqxepnylbf")))
                .withNextLink("jlyjtlvofq");
        model = BinaryData.fromObject(model).toObject(AvailableOperations.class);
        Assertions.assertEquals("pfhoqcaaewdao", model.value().get(0).name());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("pjxxkzb", model.value().get(0).display().provider());
        Assertions.assertEquals("sgeivsiy", model.value().get(0).display().resource());
        Assertions.assertEquals("kdncj", model.value().get(0).display().operation());
        Assertions.assertEquals("onbzoggculapzwy", model.value().get(0).display().description());
        Assertions.assertEquals("gogtqxepnylbf", model.value().get(0).origin());
        Assertions.assertEquals("jlyjtlvofq", model.nextLink());
    }
}
