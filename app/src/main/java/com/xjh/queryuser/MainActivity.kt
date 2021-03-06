package com.xjh.queryuser

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.xjh.queryuser.mvc.MVCActivity
import com.xjh.queryuser.mvp.MVPActivity
import com.xjh.queryuser.mvvm.MVVMActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        noModel.setOnClickListener(this)
        mvc.setOnClickListener(this)
        mvp.setOnClickListener(this)
        mvvm.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        v?.let {
            when (it.id) {
                R.id.noModel -> {
                    val intent = Intent(this, NormalActivity::class.java)
                    startActivity(intent)
                }
                R.id.mvc -> {
                    val intent = Intent(this, MVCActivity::class.java)
                    startActivity(intent)
                }
                R.id.mvp -> {
                    val intent = Intent(this, MVPActivity::class.java)
                    startActivity(intent)
                }
                R.id.mvvm -> {
                    val intent = Intent(this, MVVMActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
