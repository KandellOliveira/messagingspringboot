package br.com.kandelloliveira.message

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class HelloProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun sendMessage(message: String) {
        kafkaTemplate.send("hello-topic", message)
    }
}