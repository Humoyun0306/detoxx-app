<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="Theme.DetoxApp" parent="Theme.MaterialComponents.Light.NoActionBar">
        <item name="colorPrimary">@color/accent_purple</item>
        <item name="colorPrimaryVariant">@color/accent_purple</item>
        <item name="colorOnPrimary">@color/white</item>
        <item name="colorSurface">@color/card_bg</item>
        <item name="android:windowBackground">@color/bg_primary</item>
        <item name="android:statusBarColor">@color/bg_primary</item>
        <item name="android:windowLightStatusBar">true</item>
    </style>

    <style name="Theme.DetoxApp.Overlay" parent="Theme.DetoxApp">
        <item name="android:windowBackground">@color/block_bg</item>
    </style>

    <!-- Limit selector buttons -->
    <style name="LimitButton" parent="Widget.MaterialComponents.Button.OutlinedButton">
        <item name="strokeColor">@color/limit_button_stroke</item>
        <item name="android:textColor">@color/limit_button_text</item>
        <item name="backgroundTint">@color/limit_button_bg</item>
    </style>
</resources>
