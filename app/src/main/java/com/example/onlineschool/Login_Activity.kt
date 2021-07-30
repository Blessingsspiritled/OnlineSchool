package com.example.onlineschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import org.w3c.dom.Text

class Login_Activity : AppCompatActivity() {


    var user_email:EditText?=null
    var user_password:EditText?=null
    var login_btn:Button?=null
    var firebaseAuth:FirebaseAuth? =null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_)

        user_email = findViewById(R.id.user_loginEmail)
        user_password = findViewById(R.id.user_loginPassword)
        login_btn = findViewById(R.id.login)
        firebaseAuth = FirebaseAuth.getInstance()

        login_btn?.setOnClickListener {

            LoginUser()
        }
    }
  private fun LoginUser()
  {
      var email:String = user_email?.text.toString().trim()
      var password:String = user_password?.text.toString().trim()


         if (TextUtils.isEmpty(email)) && TextUtils.isEmpty(password)) {
             Toast.makeText(applicationContext,text: "This field cannot be empty",Toast.LENGTH_SHORT).show()
  }
    else {

        firebaseAuth?.signInWithEmailAndPassword(email,password)?.addOnCompleteListener(object:OnCompleteListener<AuthResult>{
            override fun onComplete(p0: Task<AuthResult>) {

                if(auth.isSuccessful){

                    Toast.makeText(applicationContext,text: "You are logged in successfuly",Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@Login_Activity,Dashboard_Activity::class.java)


                }else{

                    var error:String? = auth.exception?.message
                    Toast.makeText(applicationContext,text: "Error"+ error,Toast.LENGTH_SHORT).show()

                }

                }


















}