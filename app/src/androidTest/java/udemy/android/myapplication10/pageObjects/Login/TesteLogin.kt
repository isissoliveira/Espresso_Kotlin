package udemy.android.myapplication10.pageObjects.Login

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import udemy.android.myapplication10.MainActivity
import udemy.android.myapplication10.R
import udemy.android.myapplication10.pageObjects.Login.robot.RobotLogin


@RunWith(AndroidJUnit4::class)
class TesteLogin{

    private val robotLogin = RobotLogin()
    // "@get:Rule" PREPARAÇÃO ANTES QUE OS TESTES SEJAM EXECUTADOS
    @get:Rule
    var mainActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule( MainActivity::class.java)

    @Test
    fun testeLoginModeloPage() {
        // 1ª TELA
        robotLogin.validaTituloTela()
        robotLogin.preencheEmailLogin()
        robotLogin.fechaTeclado()
        robotLogin.preencheSenhaLogin()
        robotLogin.fechaTeclado()
        robotLogin.clicaBotaoLogin()

        // 2ª TELA
        robotLogin.validaTituloLogadoSucesso()
        robotLogin.clicaBotaoVoltar()

        // DE VOLTA À 1ª TELA
        robotLogin.validaTituloTela()

    }
}










