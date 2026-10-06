package com.example.sendmessage.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Representa a un mensaje dentro de la aplicación.
 *
 * Sus datos identifican la información del **mensaje**.
 *  - Contiene un objeto ``` Persona ´´´ llamado *sender*
 *
 *  @property id Número **identificador** del mensaje.
 *  @property content **Contenido** del mensaje.
 *  @property sender [Person] que **envía** el mensaje.
 *  @property receiver [Person] que **recibe** el mensaje.
 */

@Parcelize
data class Message(val id:Int, val content:String, val sender: Person, val receiver: Person):
    Parcelable
