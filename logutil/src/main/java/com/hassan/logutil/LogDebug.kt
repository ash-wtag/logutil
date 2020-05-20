package com.hassan.logutil

import android.util.Log

class LogDebug {
    companion object {
        fun debugText(message: String) {
            Log.d("DEBUG_TAG", message)
        }
    }
}