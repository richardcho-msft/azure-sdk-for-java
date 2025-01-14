// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PossibleOperationsDirections;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanPlannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanPlannedFailoverInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanProviderSpecificFailoverInput;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanPlannedFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanPlannedFailoverInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"failoverDirection\":\"PrimaryToRecovery\",\"providerSpecificDetails\":[{\"instanceType\":\"RecoveryPlanProviderSpecificFailoverInput\"}]}}")
                .toObject(RecoveryPlanPlannedFailoverInput.class);
        Assertions
            .assertEquals(PossibleOperationsDirections.PRIMARY_TO_RECOVERY, model.properties().failoverDirection());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanPlannedFailoverInput model =
            new RecoveryPlanPlannedFailoverInput()
                .withProperties(
                    new RecoveryPlanPlannedFailoverInputProperties()
                        .withFailoverDirection(PossibleOperationsDirections.PRIMARY_TO_RECOVERY)
                        .withProviderSpecificDetails(Arrays.asList(new RecoveryPlanProviderSpecificFailoverInput())));
        model = BinaryData.fromObject(model).toObject(RecoveryPlanPlannedFailoverInput.class);
        Assertions
            .assertEquals(PossibleOperationsDirections.PRIMARY_TO_RECOVERY, model.properties().failoverDirection());
    }
}
