package br.com.conseng.themedesign

import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatEditText
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var editTextEmail: AppCompatEditText
    private lateinit var editTextPassword: AppCompatEditText
    private lateinit var textLayoutEmail: TextInputLayout
    private lateinit var textLayoutPassword: TextInputLayout
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextEmail = et_email
        editTextPassword = et_password
        textLayoutEmail = txtlayout_email
        textLayoutPassword = txtlayout_password
        btnLogin = btn_login
    }

    fun validateForm(view: View) {
        if (editTextEmail.text.toString().isEmpty()) {
            textLayoutEmail.isErrorEnabled = true
            textLayoutEmail.error = "Preencha com seu email"
        } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(editTextEmail.text).matches()) {
            textLayoutEmail.isErrorEnabled = true
            textLayoutEmail.error = "Endereço de email inválido"
        } else {
            textLayoutEmail.isErrorEnabled = false
        }
        if (editTextPassword.text.toString().isEmpty()) {
            textLayoutPassword.isErrorEnabled = true
            textLayoutPassword.error = "Preencha com sua senha"
        } else {
            textLayoutPassword.isErrorEnabled = false
        }
    }
}
