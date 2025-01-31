// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quantum.models.TargetDescription;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TargetDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TargetDescription model =
            BinaryData
                .fromString(
                    "{\"id\":\"glzpswiydm\",\"name\":\"yhz\",\"description\":\"ss\",\"acceptedDataFormats\":[\"zmnvdfznudaod\",\"xzb\",\"cblylpstdbhhxsr\"],\"acceptedContentEncodings\":[\"ucerscdntnevfi\",\"jmygtdsslswtmwer\",\"ofz\",\"yqsemwa\"]}")
                .toObject(TargetDescription.class);
        Assertions.assertEquals("glzpswiydm", model.id());
        Assertions.assertEquals("yhz", model.name());
        Assertions.assertEquals("ss", model.description());
        Assertions.assertEquals("zmnvdfznudaod", model.acceptedDataFormats().get(0));
        Assertions.assertEquals("ucerscdntnevfi", model.acceptedContentEncodings().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TargetDescription model =
            new TargetDescription()
                .withId("glzpswiydm")
                .withName("yhz")
                .withDescription("ss")
                .withAcceptedDataFormats(Arrays.asList("zmnvdfznudaod", "xzb", "cblylpstdbhhxsr"))
                .withAcceptedContentEncodings(Arrays.asList("ucerscdntnevfi", "jmygtdsslswtmwer", "ofz", "yqsemwa"));
        model = BinaryData.fromObject(model).toObject(TargetDescription.class);
        Assertions.assertEquals("glzpswiydm", model.id());
        Assertions.assertEquals("yhz", model.name());
        Assertions.assertEquals("ss", model.description());
        Assertions.assertEquals("zmnvdfznudaod", model.acceptedDataFormats().get(0));
        Assertions.assertEquals("ucerscdntnevfi", model.acceptedContentEncodings().get(0));
    }
}
