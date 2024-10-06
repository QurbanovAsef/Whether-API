

plugins {


    // Android tətbiqetməsi üçün əsas pluginlər.
    alias(libs.plugins.androidApplication) apply false

    // Kotlin Android pluginini əlavə edin.
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false

    alias(libs.plugins.safe.args) apply false
    alias(libs.plugins.hilt) apply false


}