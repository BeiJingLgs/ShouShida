package com.hanvon.shoushida.ui.activity

import android.os.Bundle
import android.widget.Button
import com.hanvon.shoushida.R
import com.hanvon.shoushida.ui.base.MvpBaseActivity
import com.hanvon.shoushida.ui.presenter.LoginPersenter
import com.hanvon.shoushida.ui.view.ILoginView

class LoginActivity : MvpBaseActivity<ILoginView,LoginPersenter>(),ILoginView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutid(): Int {
        return  R.layout.user_message
    }

    override fun createPresenter(): LoginPersenter {
        return  LoginPersenter()
    }

    override fun canBack(): Boolean {
        return  false
    }

//    override fun getLoginButton(): Button {
//    }
}