## Projeto para criar uma estrutura de microsserviços



Projeto feito na DIO (Digital Innovation One) sobre microsserviços no java usando Spring Cloud,

Docker ( com os bancos Redis e Elastic), Eureka service e gateway



### Tecnologias utilizadas:

- Product catalog : Spring com base de dados no elasticsearch.
- Shopping cart: Spring com base de dados no redis.
- Service discovery: Sprind Cloud Eureka server.
- Config service: Spring Cloud Config.
- Gateway: Spring Cloud Gateway.



### Dowloads necessarios: 

Site para baixar o docker:

```
https://docs.docker.com/desktop/windows/install/
```

Rlasticsearch:

```
docker pull elasticsearch
```

Redis:

```
docker pull redis
```

### Rodando o banco de dados no docker: 

elasticsearch:

```
docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch
```

Redis versão: 

```
docker run --name redis -d -p 6379:6379 redis
```