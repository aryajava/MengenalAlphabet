package com.tgsmoprogubl.mengenalalphabet

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
//    private Button btn_a, btn_b, btn_c, btn_d, btn_e, btn_f, btn_g, btn_h, btn_i, btn_j, btn_k, btn_l, btn_m, btn_n, btn_o, btn_p, btn_q, btn_r, btn_s, btn_t, btn_u, btn_v, btn_w, btn_x, btn_y, btn_z;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnA = findViewById<Button>(R.id.btnA)
        val btnB = findViewById<Button>(R.id.btnB)
        val btnC = findViewById<Button>(R.id.btnC)
        val btnD = findViewById<Button>(R.id.btnD)
        val btnE = findViewById<Button>(R.id.btnE)
        val btnF = findViewById<Button>(R.id.btnF)
        val btnG = findViewById<Button>(R.id.btnG)
        val btnH = findViewById<Button>(R.id.btnH)
        val btnI = findViewById<Button>(R.id.btnI)
        val btnJ = findViewById<Button>(R.id.btnJ)
        val btnK = findViewById<Button>(R.id.btnK)
        val btnL = findViewById<Button>(R.id.btnL)
        val btnM = findViewById<Button>(R.id.btnM)
        val btnN = findViewById<Button>(R.id.btnN)
        val btnO = findViewById<Button>(R.id.btnO)
        val btnP = findViewById<Button>(R.id.btnP)
        val btnQ = findViewById<Button>(R.id.btnQ)
        val btnR = findViewById<Button>(R.id.btnR)
        val btnS = findViewById<Button>(R.id.btnS)
        val btnT = findViewById<Button>(R.id.btnT)
        val btnU = findViewById<Button>(R.id.btnU)
        val btnV = findViewById<Button>(R.id.btnV)
        val btnW = findViewById<Button>(R.id.btnW)
        val btnX = findViewById<Button>(R.id.btnX)
        val btnY = findViewById<Button>(R.id.btnY)
        val btnZ = findViewById<Button>(R.id.btnZ)
        // play note
        btnA.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_a)
            mediaPlayer.start()
        }
        btnB.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_b)
            mediaPlayer.start()
        }
        btnC.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_c)
            mediaPlayer.start()
        }
        btnD.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_d)
            mediaPlayer.start()
        }
        btnE.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_e)
            mediaPlayer.start()
        }
        btnF.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_f)
            mediaPlayer.start()
        }
        btnG.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_g)
            mediaPlayer.start()
        }
        btnH.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_h)
            mediaPlayer.start()
        }
        btnI.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_i)
            mediaPlayer.start()
        }
        btnJ.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_j)
            mediaPlayer.start()
        }
        btnK.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_k)
            mediaPlayer.start()
        }
        btnL.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_l)
            mediaPlayer.start()
        }
        btnM.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_m)
            mediaPlayer.start()
        }
        btnN.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_n)
            mediaPlayer.start()
        }
        btnO.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_o)
            mediaPlayer.start()
        }
        btnP.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_p)
            mediaPlayer.start()
        }
        btnQ.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_q)
            mediaPlayer.start()
        }
        btnR.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_r)
            mediaPlayer.start()
        }
        btnS.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_s)
            mediaPlayer.start()
        }
        btnT.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_t)
            mediaPlayer.start()
        }
        btnU.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_u)
            mediaPlayer.start()
        }
        btnV.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_v)
            mediaPlayer.start()
        }
        btnW.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_w)
            mediaPlayer.start()
        }
        btnX.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_x)
            mediaPlayer.start()
        }
        btnY.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_y)
            mediaPlayer.start()
        }
        btnZ.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.note_z)
            mediaPlayer.start()
        }
    }
}