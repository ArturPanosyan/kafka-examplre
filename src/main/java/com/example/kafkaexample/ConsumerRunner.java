package com.example.kafkaexample;

public class ConsumerRunner {
    public static void main(String[] args) {

        Consumer consumer = new Consumer("test");
        consumer.pollMessages();
    }
}