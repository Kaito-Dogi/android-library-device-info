package app.doggy.deviceinfo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 端末情報をログに書き出す．
        Log.d(DEVICE_INFO, "キャリア：${Build.BRAND}")
        Log.d(DEVICE_INFO, "デバイス：${Build.DEVICE}")
        Log.d(DEVICE_INFO, "製造会社：${Build.MANUFACTURER}")
        Log.d(DEVICE_INFO, "モデル：${Build.MODEL}")
        Log.d(DEVICE_INFO, "OSバージョン：${Build.VERSION.RELEASE}")
    }

    companion object {
        private const val DEVICE_INFO = "DEVICE_INFO"
    }
}