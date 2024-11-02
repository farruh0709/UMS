package com.example.ilhomjon.utils

import com.example.ilhomjon.models.MyInfo

object MyData {

    val tarifList = listOf(
        MyInfo("UMS 10",  "Zo'r", "*102*12#"),
        MyInfo("UMS 20", "Yaxshidek", "1090"),
        MyInfo("UMS 10",  "Zo'r", "*102*121#")
    )
    val daqiqaList = listOf(
        MyInfo("UMS 10 daqia",  "Zo'r", "*102*12#"),
        MyInfo("UMS 20 daqiqa", "Yaxshidek", "1090"),
        MyInfo("UMS 10 daqiqa",  "Zo'r", "*102*121#")
    )

    val smsList = listOf(
        MyInfo("UMS 10 SMS",  "Zo'r", "*102*12#"),
        MyInfo("UMS 20 SMS", "Yaxshidek", "1090"),
        MyInfo("UMS 10 SMS",  "Zo'r", "*102*121#")
    )

    val internetList = listOf(
        MyInfo("UMS 10 MB",  "Zo'r", "*102*12#"),
        MyInfo("UMS 20 MB", "Yaxshidek", "1090"),
        MyInfo("UMS 10 MB",  "Zo'r", "*102*121#")
    )
}