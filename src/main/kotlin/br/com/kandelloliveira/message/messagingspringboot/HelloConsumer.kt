package br.com.kandelloliveira.message

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class HelloConsumer {
    @KafkaListener(topics = ["hello-topic"], groupId = "group-1")
    fun receiveMessage(message: String) {
        // Process the received message
        println("Consumer Message: $message")
    }
}