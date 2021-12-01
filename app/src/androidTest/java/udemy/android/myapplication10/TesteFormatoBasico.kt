package udemy.android.myapplication10

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

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class TesteFormatoBasico {
    // "@get:Rule" DEFINE O QUE DEVE SER EXECUTADO PRIMEIRO, ANTES QUE OS TESTES SEJAM EXECUTADOS
    @get:Rule
    var mainActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule( MainActivity::class.java)

    @Test
    fun testeLogin() {
        // VALIDAR SE TEXTO ESTÁ VISÍVEL NA TELA
        onView(withText( "Aplicação teste")).check(matches(isDisplayed()))

        // ESCREVE O CONTEÚDO "teste@gmail.com" no campo cujo ID é "editTextEmail"
        onView( withId(R.id.editTextEmail)) .perform(typeText("teste@gmail.com"))

        // ESCREVE O CONTEÚDO "123456" no campo cujo ID é "editTextPassword"
        onView( withId(R.id.editTextPassword)) .perform(typeText("123456"))

        // FECHA O TECLADO DO EMULADOR ( ABERTO DURANTE A OPERAÇÃO DE ESCRITA REALIZADA ACIMA)
        closeSoftKeyboard()

        // CLICA BOTÃO CUJO ID É "button_first"
        onView( withId(R.id.button_first)) .perform(click())

        // --> CLICK DO BOTÃO NOS LEVA PARA A  SEGUNDA TELA, ONDE VALIDAREMOS :
        // VALIDAR SE TEXTO ESTÁ VISÍVEL NA TELA
        onView(withText( "Logado com sucesso")).check(matches(isDisplayed()))

        // CLICA BOTÃO CUJO TEXTO É "Voltar"
        onView( withText( "Voltar")) .perform(click())

        // --> CLICK DO BOTÃO NOS LEVA DE VOLTA PARA A  PRIMEIRA TELA, ONDE VALIDAREMOS :
        // VALIDAR SE TEXTO ESTÁ VISÍVEL NA TELA
        onView(withText( "Aplicação teste")).check(matches(isDisplayed()))

    }
}















