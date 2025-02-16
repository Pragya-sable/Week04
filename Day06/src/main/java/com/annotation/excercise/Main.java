package com.annotation.excercise;

import com.annotation.excercise.usedeprecated.LegacyAPI;

public class Main {
    public static void main(String[] args) {
        LegacyAPI obj = new LegacyAPI();
        obj.oldFeature(); // Should show a warning during compilation
        obj.newFeature();
    }
}
