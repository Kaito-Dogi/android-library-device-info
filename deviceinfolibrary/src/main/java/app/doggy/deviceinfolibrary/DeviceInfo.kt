package app.doggy.deviceinfolibrary

import android.os.Build

class DeviceInfo {
    companion object {
        // 端末情報を返す．
        fun getAll(): Map<String, String> {
            return mapOf(
                CARRIER to Build.BRAND,
                DEVICE to Build.DEVICE,
                MANUFACTURER to Build.MANUFACTURER,
                MODEL to Build.MODEL,
                VERSION to Build.VERSION.RELEASE,
            )
        }

        const val CARRIER = "BRAND"
        const val DEVICE = "DEVICE"
        const val MANUFACTURER = "MANUFACTURER"
        const val MODEL = "MODEL"
        const val VERSION = "VERSION_RELEASE"
    }
}