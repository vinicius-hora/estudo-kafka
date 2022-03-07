package com.udemy.kafka.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.udemy.kafka.model.Venda;

import org.apache.kafka.common.serialization.Deserializer;

public class VendaDeserializer implements Deserializer<Venda>{

    @Override
    public Venda deserialize(String topic, byte[] venda) {
        try {
            return new ObjectMapper().readValue(venda, Venda.class);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
}
