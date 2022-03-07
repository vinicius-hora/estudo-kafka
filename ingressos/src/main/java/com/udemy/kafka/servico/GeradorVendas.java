package com.udemy.kafka.servico;

import java.math.BigDecimal;
import java.util.Properties;
import java.util.Random;

import com.udemy.kafka.model.Venda;
import com.udemy.kafka.serializer.VendaSerializer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class GeradorVendas {

    private static Random rand = new Random();
    private static long operacao = 0;
    private static BigDecimal valorIngresso = BigDecimal.valueOf(500);
    public static void main(String[] args) {
        //producao do kafka
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, VendaSerializer.class.getName());
        try {
            KafkaProducer<String, Venda> producer = new KafkaProducer<String, Venda>(properties);

            while(true){
                Venda venda = gerarVenda();
                ProducerRecord<String, Venda> record = new ProducerRecord<String,Venda>("venda-ingressos",venda);
                producer.send(record);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }           
    }
    private static Venda gerarVenda() {
        long cliente = rand.nextLong();
        int qtdIngressos = rand.nextInt(10);
        BigDecimal valorTotal = new BigDecimal(qtdIngressos * valorIngresso.doubleValue());
        return new Venda(operacao++, cliente, qtdIngressos, valorTotal);
    }
    
}
