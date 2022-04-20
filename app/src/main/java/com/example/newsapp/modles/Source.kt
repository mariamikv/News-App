package com.example.newsapp.modles

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Source(
    @SerializedName("id")
    val id: @RawValue Any?,
    @SerializedName("name")
    val name: String?
): Parcelable