package com.annotation.excercise.usedeprecated;

import org.junit.jupiter.api.Test;


class LegacyAPITest {

    @Test
    void testOldFeatureIsDeprecated() {
        // Create an instance of LegacyAPI
        LegacyAPI obj = new LegacyAPI();

        // Call the deprecated method and verify behavior
        obj.oldFeature(); // THis should show warning
    }

    @Test
    void testNewFeature() {
        // Create an instance of LegacyAPI
        LegacyAPI obj = new LegacyAPI();

        // Call the new method
        obj.newFeature();  // This should not show any warnings
    }

}
