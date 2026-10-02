# Registro de Cambios (CHANGELOG) - SendMessage

Todos los cambios del proyecto **SendMessage** están documentados en este archivo.

---

## v1.0

### Añadido / Implementado
* **Paso de datos entre actividades**: Implementación del envío del mensaje redactado desde `SendMessageActivity` hacia `ViewMessageActivity` utilizando `Intent` explícito y empaquetado mediante `Bundle` con la clave `"KEY_MESSAGE"`.
* **Recepción y muestra de datos**: Extracción del mensaje desde el `Bundle` en `ViewMessageActivity` y asignación al `TextView` (`tvSecondTitle`).
* **Depuración en Logcat**: Inclusión de traza de depuración con `Log.d("SendMessage", ...)` al pulsar el botón de envío.
* **Documentación de código**: Comentarios estructurados KDoc en las actividades principales del proyecto.
* **Documentación del proyecto**: Creación del archivo `README.md` con la estructura, decisiones de diseño, guía de depuración, enlaces a la documentación oficial de Android Developers y espacio para capturas de pantalla.

---

## v0.1

### Añadido / Implementado
* **Configuración inicial**: Estructura inicial del proyecto Android nativo en Kotlin y configuración del archivo `AndroidManifest.xml` con `SendMessageApplication`.
* **Diseño de la pantalla inicial (`activity_send_message.xml`)**: Interfaz con `LinearLayout`, título principal, campo de texto `EditText` y botón de envío.
* **Diseño de la pantalla secundaria (`activity_view_message.xml`)**: Interfaz con `TextView` para la visualización del texto e `ImageView` para el icono.
* **Recursos de la aplicación**: Definición de dimensiones en `dimens.xml` (`dp` y `sp`), cadenas de texto en `strings.xml`, paleta de colores en `colors.xml` e integración de fuentes tipográficas personalizadas (`barber_chop` y `roboto_mono`).
