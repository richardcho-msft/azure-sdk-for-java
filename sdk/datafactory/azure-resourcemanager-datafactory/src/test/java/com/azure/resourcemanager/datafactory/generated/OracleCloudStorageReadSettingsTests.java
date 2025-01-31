// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OracleCloudStorageReadSettings;

public final class OracleCloudStorageReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleCloudStorageReadSettings model = BinaryData.fromString(
            "{\"type\":\"OracleCloudStorageReadSettings\",\"recursive\":\"dataljcauegymc\",\"wildcardFolderPath\":\"datasmnjitxu\",\"wildcardFileName\":\"datalbibwodayipgsh\",\"prefix\":\"dataoecmbyo\",\"fileListPath\":\"datavbvfchfuxuqp\",\"enablePartitionDiscovery\":\"dataebok\",\"partitionRootPath\":\"datashhhdixnzapz\",\"deleteFilesAfterCompletion\":\"datamstvz\",\"modifiedDatetimeStart\":\"datazvfywspajakj\",\"modifiedDatetimeEnd\":\"datapktbnmhxtmzzpa\",\"maxConcurrentConnections\":\"datasrvsbkn\",\"disableMetricsCollection\":\"datauytsaj\",\"\":{\"j\":\"datausnwic\",\"btegiw\":\"datawctlsohrtgpvv\"}}")
            .toObject(OracleCloudStorageReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleCloudStorageReadSettings model
            = new OracleCloudStorageReadSettings().withMaxConcurrentConnections("datasrvsbkn")
                .withDisableMetricsCollection("datauytsaj").withRecursive("dataljcauegymc")
                .withWildcardFolderPath("datasmnjitxu").withWildcardFileName("datalbibwodayipgsh")
                .withPrefix("dataoecmbyo").withFileListPath("datavbvfchfuxuqp").withEnablePartitionDiscovery("dataebok")
                .withPartitionRootPath("datashhhdixnzapz").withDeleteFilesAfterCompletion("datamstvz")
                .withModifiedDatetimeStart("datazvfywspajakj").withModifiedDatetimeEnd("datapktbnmhxtmzzpa");
        model = BinaryData.fromObject(model).toObject(OracleCloudStorageReadSettings.class);
    }
}
