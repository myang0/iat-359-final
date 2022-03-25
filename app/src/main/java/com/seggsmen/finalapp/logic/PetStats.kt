package com.seggsmen.finalapp.logic

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PetStats(
    var feeling: String = Const.STRING_NO_VALUE,
    var timeLastEaten: Long = -1,
    var timeLastVisited: Long = -1,
    var vegetableServings: Long = -1,
    var fruitServings: Long = -1,
    var grainServings: Long = -1,
    var fishServings: Long = -1,
    var poultryServings: Long = -1,
    var redMeatServings: Long = -1,
    var oilServings: Long = -1,
    var dairyServings: Long = -1,
): Parcelable
