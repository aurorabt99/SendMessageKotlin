package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import com.example.sendmessage.model.Message
import com.example.sendmessage.model.Person
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * Actividad principal que permite al usuario redactar y enviar un mensaje a [ViewMessageActivity].
 * Esta es la primera Actividad de la aplicación que realiza las siguientes operaciones
 * <ol>
 *  *     <li>Crear un componente <code>EditText</code> y <code>Button</code> en XML</li>
 *  *     <li>Lanzar un evento en un componente Visual</li>
 *  *     <li>Crea el <code>Intent</code> junto con el <code>Bundle</code> para pasar a otra actividad</li>
 *  *     <li>El ciclo de vida de la <code>Activity</code></li>
 *  *     <li>Ver la pila de Actividades</li>
 *  * </ol>
 *  *
 *  * @author Aurora Becerra Tejada
 *  * @version 1.0
 *  * @see android.widget.Button
 *  * @see android.widget.EditText
 *  * @see android.content.Intent
 *  * @see android.os.Bundle
 */
class SendMessageActivity : AppCompatActivity() {
    //Inicialización posterior para que no sea null
    lateinit var etSendMessage: EditText
    lateinit var btSendMessage : Button //profe: FloatingActionButton

    //El TAG de LogCat
    companion object{
        const val TAG: String ="LogSendMessageActivity"
    }
    /**
     * Inicializa la actividad y configura el evento de clic en el botón para enviar el mensaje.
     *
     * Método de creación de una Actividad
     */
    /**
     * Método llamado al crear la actividad. Se encarga de inicializar la interfaz de usuario,
     * enlazar los componentes visuales y configurar los eventos de clic.
     *
     * Como medida de aprendizaje, aquí se muestra cómo pasar datos dato a dato utilizando un [Bundle]:
     * ```kotlin
     * val intent = Intent(this, ViewMessageActivity::class.java)
     * val bundle = Bundle()
     * bundle.putString("KEY_MESSAGE", etMessageText.text.toString())
     * intent.putExtras(bundle)
     * startActivity(intent)
     * ```
     *
     * @param savedInstanceState Estado guardado previamente de la actividad, si lo hubiera.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_message)

        //Se obtiene el objeto view de la vista que se ha inflado
        etSendMessage = findViewById(R.id.etSendMessage)
        btSendMessage = findViewById(R.id.btSendMessage)

        btSendMessage.setOnClickListener{
            /*1. pasar dato a dato en un Bundle
            val intent = Intent(this, ViewMessageActivity::class.java)
            val bundle = Bundle()
            bundle.putString("KEY_MESSAGE",etSendMessage.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
             */
            sendMessage()
        }
        //Se escriben mensajes de depuración en la consola LogCat
        //Depuración y ejecución
        Log.d(TAG, "SendMessageActivity -> onCreate()")
    }

    /**
     * Función que crea un mensaje con la informaciñon de la persona que envia y de la persona
     * que recoge el mensaje
     */
    private fun sendMessage(){
        //1. crear el Intent
        val intent = Intent(this, ViewMessageActivity::class.java)
        //2. crear Bundle
        val bundle = Bundle()
        //3. La información del mensaje
        val sender = Person("123456789", "Maria", "Cortes Martin")
        val receiver = Person("987654321", "Lourdes", "Rodriguez")

        val message = Message(1, etSendMessage.text.toString(), sender, receiver)
        bundle.putSerializable("KEY_MESSAGE", message)
        intent.putExtras(bundle)
        startActivity(intent)
    }

//region Ciclo de Vida de una Actividad
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "SendMessageActivity -> onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "SendMessageActivity -> onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "SendMessageActivity -> onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "SendMessageActivity -> onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "SendMessageActivity -> onDestroy()")
    }
//endregion
}