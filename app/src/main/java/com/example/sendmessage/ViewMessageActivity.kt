package com.example.sendmessage

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sendmessage.model.Message

//tengo que importar message para usarla
/**
 * Actividad encargada de recibir y mostrar el mensaje enviado desde [SendMessageActivity].
 *
 * @author Aurora Becerra Tejada
 * @version 1.0
 */
class ViewMessageActivity : AppCompatActivity() {

    companion object{
        const val TAG: String ="LogViewMessageActivity"
    }

    /**
     * Método de creación de una Actividad
     * Inicializa la actividad y recupera el mensaje recibido a través del Intent.
     *
     * @param savedInstanceState Estado guardado de la actividad, si existe.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

        //Busco TextView donde muestro mensaje
        val tvSecondTitle = findViewById<TextView>(R.id.tvSecondTitle)
        val tvSender = findViewById<TextView>(R.id.tvSender)

        //Obtengo el paquete entero (BUNDLE) que venía dentro del Intent
        val bundle = intent.extras

        /*
        //Le pido al paquete su contenido con .getString
        //Dentro del Bundle, buscamos el dato con clave Key_Message y dame su String
        val message = bundle?.getString("KEY_MESSAGE")*/

        //Pasar datos con serializable sobre los objetos
        //Recibo el objeto Message que viene dentro del bundle
        val message = bundle?.getParcelable("KEY_MESSAGE") as? Message
        //API33: val message = bundle?.getSerializable("KEY_MESSAGE", Message::class.java)

        //Muestro el contenido del mensaje
        tvSecondTitle.text = message?.content
        //Muestra quién ha enviado el mensaje
        tvSender.text = "De: ${message?.sender?.name} ${message?.sender?.surname}"

        Log.d(TAG, "LogViewMessageActivity -> onCreate()")
    }

    //region Ciclo de Vida de una Actividad
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "LogViewMessageActivity -> onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "LogViewMessageActivity -> onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "LogViewMessageActivity -> onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "LogViewMessageActivity -> onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "LogViewMessageActivity -> onDestroy()")
    }
//endregion
}
