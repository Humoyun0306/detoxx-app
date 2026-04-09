<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/bg_primary"
    android:fillViewport="true">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="20dp">

        <!-- Header -->
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="DetoxGram"
            android:textSize="28sp"
            android:textStyle="bold"
            android:textColor="@color/text_primary"
            android:layout_marginTop="16dp"/>

        <TextView
            android:id="@+id/tvLicenseStatus"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textSize="13sp"
            android:textColor="@color/accent_green"
            android:layout_marginBottom="4dp"
            android:visibility="gone"/>

        <!-- Trial Banner -->
        <androidx.cardview.widget.CardView
            android:id="@+id/bannerTrial"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="12dp"
            app:cardCornerRadius="12dp"
            app:cardBackgroundColor="@color/accent_orange_light">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="14dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="⏱ Sinov davri"
                    android:textStyle="bold"
                    android:textColor="@color/accent_orange"
                    android:textSize="14sp"/>

                <TextView
                    android:id="@+id/tvTrialCountdown"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Hisob-kitob qilinmoqda..."
                    android:textColor="@color/text_secondary"
                    android:textSize="13sp"
                    android:layout_marginTop="2dp"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Activate Button -->
        <com.google.android.material.button.MaterialButton
            android:id="@+id/btnActivate"
            android:layout_width="match_parent"
            android:layout_height="48dp"
            android:layout_marginTop="8dp"
            android:text="Pro versiyani faollashtirish"
            android:textSize="14sp"
            style="@style/Widget.MaterialComponents.Button.OutlinedButton"
            app:strokeColor="@color/accent_purple"
            android:textColor="@color/accent_purple"/>

        <!-- Status Card -->
        <androidx.cardview.widget.CardView
            android:id="@+id/cardStatus"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            app:cardCornerRadius="16dp"
            app:cardElevation="0dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="16dp">

                <TextView
                    android:id="@+id/tvStatus"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="✅ Instagram faol"
                    android:textSize="16sp"
                    android:textStyle="bold"
                    android:textColor="@color/accent_green"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Usage Card -->
        <androidx.cardview.widget.CardView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            app:cardCornerRadius="16dp"
            app:cardElevation="0dp"
            app:cardBackgroundColor="@color/card_bg">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="20dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Bugungi foydalanish"
                    android:textSize="13sp"
                    android:textColor="@color/text_secondary"/>

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="horizontal"
                    android:layout_marginTop="8dp">

                    <TextView
                        android:id="@+id/tvUsedTime"
                        android:layout_width="0dp"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:text="0d"
                        android:textSize="32sp"
                        android:textStyle="bold"
                        android:textColor="@color/text_primary"/>

                    <TextView
                        android:id="@+id/tvLimitTime"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_gravity="bottom"
                        android:text="/ 60d"
                        android:textSize="16sp"
                        android:textColor="@color/text_secondary"
                        android:layout_marginBottom="6dp"/>
                </LinearLayout>

                <ProgressBar
                    android:id="@+id/usageProgressBar"
                    style="@style/Widget.AppCompat.ProgressBar.Horizontal"
                    android:layout_width="match_parent"
                    android:layout_height="12dp"
                    android:layout_marginTop="12dp"
                    android:progress="0"
                    android:max="100"
                    android:progressDrawable="@drawable/progress_bar_drawable"/>

                <TextView
                    android:id="@+id/tvRemainingTime"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Qoldi: 60d"
                    android:textSize="13sp"
                    android:textColor="@color/text_secondary"
                    android:layout_marginTop="8dp"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Daily Limit Card -->
        <androidx.cardview.widget.CardView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            app:cardCornerRadius="16dp"
            app:cardElevation="0dp"
            app:cardBackgroundColor="@color/card_bg">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="20dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Kunlik limit"
                    android:textSize="13sp"
                    android:textColor="@color/text_secondary"
                    android:layout_marginBottom="12dp"/>

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="horizontal">

                    <com.google.android.material.button.MaterialButton
                        android:id="@+id/btn30min"
                        android:layout_width="0dp"
                        android:layout_height="44dp"
                        android:layout_weight="1"
                        android:text="30 daqiqa"
                        android:textSize="12sp"
                        android:layout_marginEnd="6dp"
                        style="@style/LimitButton"/>

                    <com.google.android.material.button.MaterialButton
                        android:id="@+id/btn1hour"
                        android:layout_width="0dp"
                        android:layout_height="44dp"
                        android:layout_weight="1"
                        android:text="1 soat"
                        android:textSize="12sp"
                        android:layout_marginEnd="6dp"
                        style="@style/LimitButton"/>

                    <com.google.android.material.button.MaterialButton
                        android:id="@+id/btn2hour"
                        android:layout_width="0dp"
                        android:layout_height="44dp"
                        android:layout_weight="1"
                        android:text="2 soat"
                        android:textSize="12sp"
                        style="@style/LimitButton"/>
                </LinearLayout>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Tips Card -->
        <androidx.cardview.widget.CardView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:layout_marginBottom="32dp"
            app:cardCornerRadius="16dp"
            app:cardElevation="0dp"
            app:cardBackgroundColor="@color/card_bg">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="20dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="💡 Maslahat"
                    android:textSize="13sp"
                    android:textStyle="bold"
                    android:textColor="@color/text_primary"
                    android:layout_marginBottom="8dp"/>

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Tadqiqotlarga ko'ra, Instagram foydalanishni kuniga 30 daqiqaga cheklash stress darajasini 40% ga kamaytiradi."
                    android:textSize="13sp"
                    android:textColor="@color/text_secondary"
                    android:lineSpacingMultiplier="1.5"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

    </LinearLayout>
</ScrollView>
