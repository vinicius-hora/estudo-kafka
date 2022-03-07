# estudo-kafka
# projeto para estudo e implementação do kafka em java.

Descrição: projeto maven simula venda de ingressos, onde a comunicação é realizada através de mensageria para informar se a venda foi aprovada ou recusada.

Dependências: slf4j-simple, kafka-clients, jackson-databind.

Criar topico no kafka: kafka-topics.sh --bootstrap-server localhost:9092 --create --topic venda-ingressos

Produtor: 
https://github.com/vinicius-hora/estudo-kafka/tree/main/ingressos.

Executar /kafka/servico/GeradorVendas.java

consumidor: https://github.com/vinicius-hora/estudo-kafka/tree/main/processamento-ingressos.

Executar: /kafka/servico/ProcessadorVendas.java

