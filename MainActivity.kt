<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/bg_primary"
    android:fillViewport="true">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="28dp"
        android:gravity="center_horizontal">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="🔒"
            android:textSize="56sp"
            android:layout_marginTop="48dp"
            android:layout_marginBottom="16dp"/>

        <TextView
            android:id="@+id/tvTitle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Sinov muddati tugadi"
            android:textSize="24sp"
            android:textStyle="bold"
            android:textColor="@color/text_primary"
            android:gravity="center"
            android:layout_marginBottom="12dp"/>

        <TextView
            android:id="@+id/tvSubtitle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text=""
            android:textSize="15sp"
            android:textColor="@color/text_secondary"
            android:gravity="center"
            android:lineSpacingMultiplier="1.5"
            android:layout_marginBottom="32dp"/>

        <!-- Price Card -->
        <androidx.cardview.widget.CardView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginBottom="24dp"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            app:cardCornerRadius="16dp"
            app:cardElevation="0dp"
            app:cardBackgroundColor="@color/accent_purple_light">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="20dp"
                android:gravity="center">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Pro versiya"
                    android:textSize="14sp"
                    android:textColor="@color/accent_purple"
                    android:textStyle="bold"/>

                <TextView
                    android:id="@+id/tvPrice"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="29 000 UZS / oyiga"
                    android:textSize="28sp"
                    android:textStyle="bold"
                    android:textColor="@color/text_primary"
                    android:layout_marginTop="4dp"/>

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="✓ Cheksiz foydalanish\n✓ Kunlik limit sozlash\n✓ Oflayn ishlaydi"
                    android:textSize="13sp"
                    android:textColor="@color/text_secondary"
                    android:gravity="center"
                    android:layout_marginTop="8dp"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Telegram Button -->
        <com.google.android.material.button.MaterialButton
            android:id="@+id/btnOpenTelegram"
            android:layout_width="match_parent"
            android:layout_height="52dp"
            android:text="📱 Telegram orqali to'lash"
            android:textSize="16sp"
            android:backgroundTint="@color/accent_telegram"
            android:layout_marginBottom="24dp"/>

        <!-- Divider -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:gravity="center_vertical"
            android:layout_marginBottom="16dp">

            <View
                android:layout_width="0dp"
                android:layout_height="1dp"
                android:layout_weight="1"
                android:background="@color/divider"/>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="  Aktivatsiya kodi bor bo'lsa  "
                android:textSize="12sp"
                android:textColor="@color/text_secondary"/>

            <View
                android:layout_width="0dp"
                android:layout_height="1dp"
                android:layout_weight="1"
                android:background="@color/divider"/>
        </LinearLayout>

        <!-- Code input -->
        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginBottom="12dp"
            style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
            android:hint="Aktivatsiya kodini kiriting">

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/etActivationCode"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:inputType="textCapCharacters"
                android:imeOptions="actionDone"/>
        </com.google.android.material.textfield.TextInputLayout>

        <com.google.android.material.button.MaterialButton
            android:id="@+id/btnActivate"
            android:layout_width="match_parent"
            android:layout_height="52dp"
            android:text="Faollashtirish"
            android:textSize="16sp"
            android:backgroundTint="@color/accent_purple"
            android:layout_marginBottom="40dp"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="To'lovdan so'ng Telegram bot sizga aktivatsiya kodini yuboradi. Kodni bu yerga kiriting va ilovani cheksiz ishlating."
            android:textSize="12sp"
            android:textColor="@color/text_secondary"
            android:gravity="center"
            android:layout_marginBottom="32dp"
            android:lineSpacingMultiplier="1.4"/>

    </LinearLayout>
</ScrollView>
