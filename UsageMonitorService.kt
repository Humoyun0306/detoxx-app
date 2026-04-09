<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:background="@color/block_bg"
    android:padding="32dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="🛑"
        android:textSize="64sp"
        android:layout_marginBottom="16dp"/>

    <TextView
        android:id="@+id/tvBlockTitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Bugungi limit tugadi!"
        android:textSize="24sp"
        android:textStyle="bold"
        android:textColor="@color/text_primary"
        android:gravity="center"
        android:layout_marginBottom="16dp"/>

    <TextView
        android:id="@+id/tvBlockSubtitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text=""
        android:textSize="15sp"
        android:textColor="@color/text_secondary"
        android:gravity="center"
        android:lineSpacingMultiplier="1.6"
        android:layout_marginBottom="48dp"/>

    <com.google.android.material.button.MaterialButton
        android:id="@+id/btnGoHome"
        android:layout_width="match_parent"
        android:layout_height="52dp"
        android:text="Bosh ekranga"
        android:textSize="16sp"
        android:backgroundTint="@color/accent_purple"
        android:layout_marginBottom="12dp"/>

    <com.google.android.material.button.MaterialButton
        android:id="@+id/btnOpenDetox"
        android:layout_width="match_parent"
        android:layout_height="52dp"
        android:text="DetoxGram sozlamalari"
        android:textSize="16sp"
        style="@style/Widget.MaterialComponents.Button.OutlinedButton"
        app:strokeColor="@color/accent_purple"
        android:textColor="@color/accent_purple"
        xmlns:app="http://schemas.android.com/apk/res-auto"/>

</LinearLayout>
