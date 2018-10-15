package ui.anwesome.com.linkedcircletorrview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ui.anwesome.com.circletorrview.LinkedCircleToRRView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LinkedCircleToRRView.create(this)
    }
}
