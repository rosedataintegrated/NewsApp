package com.example.newsapp.data.news.remote

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class NewResponse(
    @SerializedNameName
    val articles: List<Article>,

    val status: String?,

    val totalResults: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        TODO("articles"),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    annotation class SerializeName

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(status)
        parcel.writeInt(totalResults)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NewResponse> {
        override fun createFromParcel(parcel: Parcel): NewResponse {
            return NewResponse(parcel)
        }

        override fun newArray(size: Int): Array<NewResponse?> {
            return arrayOfNulls(size)
        }
    }
}

annotation class SerializedNameName
