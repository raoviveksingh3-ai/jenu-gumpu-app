# Firebase
-keep class com.google.firebase.** { *; }
-keep class com.google.android.gms.** { *; }

# Retrofit
-keepattributes Signature
-keepattributes *Annotation*
-keep class retrofit2.** { *; }
-keep interface retrofit2.** { *; }

# Room Database
-keep class androidx.room.** { *; }
-keep interface androidx.room.** { *; }

# Jetpack
-keep class androidx.compose.** { *; }
-keep class androidx.lifecycle.** { *; }

# ML Kit
-keep class com.google.mlkit.** { *; }