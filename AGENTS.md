# AGENTS.md

## Project Overview
- Android app (Kotlin) for sending messages between activities using Intents & Bundles
- Package: `com.example.sendmessage`
- Min SDK: 24, Target SDK: 37
- Language: Spanish (code comments, KDoc, and UI strings)

## Build & Run
- Build: `./gradlew assembleDebug`
- Run tests: `./gradlew test`
- Run instrumented tests: `./gradlew connectedAndroidTest`
- Generate docs: `./gradlew dokkaHtml`

## Architecture
- Two activities: `SendMessageActivity` (sender) → `ViewMessageActivity` (receiver)
- Data passed via `Bundle` with `Parcelable` objects (`Message`, `Person`)
- ViewBinding enabled
- Custom `SendMessageApplication` class

## Conventions
- Logcat tags: `LogSendMessageActivity`, `LogViewMessageActivity`
- KDoc in Spanish
- ViewBinding used instead of findViewById (though some findViewById still present)

## Key Files
- `app/src/main/java/com/example/sendmessage/SendMessageActivity.kt` — Main activity
- `app/src/main/java/com/example/sendmessage/ViewMessageActivity.kt` — Receiver activity
- `app/src/main/java/com/example/sendmessage/model/Message.kt` — Parcelable message model
- `app/src/main/java/com/example/sendmessage/model/Person.kt` — Parcelable person model
