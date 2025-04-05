plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    // Ksp
    alias(libs.plugins.ksp) apply false
    // Hilt
    alias(libs.plugins.hilt) apply false
}