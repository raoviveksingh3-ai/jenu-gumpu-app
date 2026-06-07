package com.jenugumpu.app.service

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import timber.log.Timber

class JenuGumpuMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        Timber.d("Message received from: ${remoteMessage.from}")

        remoteMessage.notification?.let {
            Timber.d("Notification Title: ${it.title}")
            Timber.d("Notification Body: ${it.body}")
        }

        remoteMessage.data.let {
            Timber.d("Data: $it")
        }
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Timber.d("Refreshed token: $token")
        // Send this token to your backend for user identification
    }
}