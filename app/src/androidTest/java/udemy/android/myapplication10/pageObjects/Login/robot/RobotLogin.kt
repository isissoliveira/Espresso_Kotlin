package udemy.android.myapplication10.pageObjects.Login.robot

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import udemy.android.myapplication10.R
import udemy.android.myapplication10.pageObjects.Login.constants.*

class RobotLogin {

    fun validaTituloTela(){
        // VALIDAR SE TEXTO ESTÁ VISÍVEL NA TELA
        onView(withText(TITULO_APP)).check(matches(isDisplayed()))
    }
    fun preencheEmailLogin() {
        // ESCREVE O CONTEÚDO "teste@gmail.com" no campo cujo ID é "editTextEmail"

        //"ID_CAMPO_EMAIL_LOGIN" é um Companion Object criado no final deste arquivo
        //"EMAIL_LOGIN" é uma constante definda no arquivo "ConstantsLogin.kt"
        onView(withId( ID_CAMPO_EMAIL_LOGIN)).perform(typeText(EMAIL_LOGIN))
    }
    fun preencheSenhaLogin() {
        // ESCREVE O CONTEÚDO "123456" no campo cujo ID é "editTextPassword"
        onView(withId( ID_CAMPO_SENHA_LOGIN)).perform(typeText(SENHA_LOGIN))
    }
    fun fechaTeclado() {
        // FECHA O TECLADO DO EMULADOR
        closeSoftKeyboard()
    }
    fun clicaBotaoLogin() {
        // CLICA BOTÃO CUJO ID É "button_first"
        onView(withId(ID_BOTAO_LOGAR)).perform(click())
    }

    fun validaTituloLogadoSucesso() {
        // VALIDAR SE TEXTO ESTÁ VISÍVEL NA TELA
        onView(withText(LOGADO_SUCESSO)).check(matches(isDisplayed()))
    }
    fun clicaBotaoVoltar() {
        // CLICA BOTÃO CUJO TEXTO É "Voltar"
        onView(withText(VOLTAR)).perform(click())
    }

    /*Kotlin não possui o recursos static do Java para atributos ou métodos de classes.
    O que existe é uma forma de você declarar um singleton da classe através do
    companion object e criar essa estrutura dentro da classe */
    companion object Ids{
        val ID_CAMPO_EMAIL_LOGIN = R.id.editTextEmail
        val ID_CAMPO_SENHA_LOGIN = R.id.editTextPassword
        val ID_BOTAO_LOGAR = R.id.button_first

    }


}