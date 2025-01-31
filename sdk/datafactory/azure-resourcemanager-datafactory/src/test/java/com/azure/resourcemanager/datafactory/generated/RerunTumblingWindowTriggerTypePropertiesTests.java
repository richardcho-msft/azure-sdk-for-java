// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.RerunTumblingWindowTriggerTypeProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class RerunTumblingWindowTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RerunTumblingWindowTriggerTypeProperties model = BinaryData.fromString(
            "{\"parentTrigger\":\"datafjwajsbqytfv\",\"requestedStartTime\":\"2021-04-12T06:16:03Z\",\"requestedEndTime\":\"2021-01-30T03:23:45Z\",\"rerunConcurrency\":1573229736}")
            .toObject(RerunTumblingWindowTriggerTypeProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-12T06:16:03Z"), model.requestedStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-30T03:23:45Z"), model.requestedEndTime());
        Assertions.assertEquals(1573229736, model.rerunConcurrency());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RerunTumblingWindowTriggerTypeProperties model = new RerunTumblingWindowTriggerTypeProperties()
            .withParentTrigger("datafjwajsbqytfv").withRequestedStartTime(OffsetDateTime.parse("2021-04-12T06:16:03Z"))
            .withRequestedEndTime(OffsetDateTime.parse("2021-01-30T03:23:45Z")).withRerunConcurrency(1573229736);
        model = BinaryData.fromObject(model).toObject(RerunTumblingWindowTriggerTypeProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-12T06:16:03Z"), model.requestedStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-30T03:23:45Z"), model.requestedEndTime());
        Assertions.assertEquals(1573229736, model.rerunConcurrency());
    }
}
