package com.shazan.a30daysofsuccess.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quote(
    val dayNumber: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val quoteRes: Int
)
