package com.example.meow

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Kucing(
    val name: String,
    val description: String,
    val photo: Int,
    val usia: String,
    val detail: String
) : Parcelable