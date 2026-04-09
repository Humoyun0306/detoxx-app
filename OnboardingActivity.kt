<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="@color/bg_primary"
    android:padding="28dp">

    <TextView
        android:id="@+id/tvStepNumber"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="1 / 3"
        android:textSize="13sp"
        android:textColor="@color/text_secondary"
        android:layout_marginTop="24dp"/>

    <ImageView
        android:id="@+id/ivStepIcon"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_marginTop="40dp"
        android:layout_gravity="center_horizontal"
        android:src="@android:drawable/ic_menu_compass"/>

    <TextView
        android:id="@+id/tvStepTitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="Xush kelibsiz!"
        android:textSize="24sp"
        android:textStyle="bold"
        android:textColor="@color/text_primary"/>

    <TextView
        android:id="@+id/tvStepDesc"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:layout_marginTop="16dp"
        android:text=""
        android:textSize="15sp"
        android:textColor="@color/text_secondary"
        android:lineSpacingMultiplier="1.6"/>

    <com.google.android.material.button.MaterialButton
        android:id="@+id/btnNext"
        android:layout_width="match_parent"
        android:layout_height="52dp"
        android:layout_marginBottom="24dp"
        android:text="Davom etish"
        android:textSize="16sp"
        android:backgroundTint="@color/accent_purple"/>

</LinearLayout>
