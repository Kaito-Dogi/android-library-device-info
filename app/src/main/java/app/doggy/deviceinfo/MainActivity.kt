package app.doggy.deviceinfo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import app.doggy.deviceinfosdk.DeviceInfo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val deviceInfo = DeviceInfo.getAll()

        // 端末情報をログに書き出す．
        Log.d(DEVICE_INFO, "キャリア：${deviceInfo[DeviceInfo.CARRIER]}")
        Log.d(DEVICE_INFO, "デバイス：${deviceInfo[DeviceInfo.DEVICE]}")
        Log.d(DEVICE_INFO, "製造会社：${deviceInfo[DeviceInfo.MANUFACTURER]}")
        Log.d(DEVICE_INFO, "モデル：${deviceInfo[DeviceInfo.MODEL]}")
        Log.d(DEVICE_INFO, "OSバージョン：${deviceInfo[DeviceInfo.VERSION]}")
    }

    companion object {
        private const val DEVICE_INFO = "DEVICE_INFO"
    }
}