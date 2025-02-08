package com.shazan.a30daysofsuccess.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.shazan.a30daysofsuccess.R

val Display = FontFamily(
    Font(R.font.piazzolla_18pt_medium, FontWeight.Medium),
    Font(R.font.cabin_semibold, FontWeight.SemiBold)
)
val Body = FontFamily(
    Font(R.font.pavanam_regular, FontWeight.Normal),
    Font(R.font.cabin_semibold, FontWeight.SemiBold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
        lineHeight = 20.sp,
        letterSpacing = 2.5.sp
    ),
    displayLarge = TextStyle(
        fontFamily = Display,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp,
        lineHeight = 20.sp,
        letterSpacing = 1.sp
    ),
    displaySmall = TextStyle(
        fontFamily = Display,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 5.sp
    )

)