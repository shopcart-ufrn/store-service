# Shopcart - Store Service

Universidade Federal do Rio Grande do Norte
Departamento de Informática e Matemática Aplicada
Bacharelado em Tecnologia da Informação
Tópicos Especiais em Engenharia de Software IV *(Tolerância a Falhas)*

## Projeto de Tolerância a Falhas

## Participantes

Docente:

- Prof. Dr. Gibeon Soares

Discentes:

- [Joarêmio Neto](https://github.com/Joaremio)
- [Rary Coringa](https://github.com/rarycoringa)
- [Vanessa Maria](https://github.com/Vanessa-Maria2)

## Tecnologias Utilizadas

| Tecnologia    | Versão    |
|              -|          -|
| Java          | 21.0.4    |
| Gradle        | 8.10.2    |
| Spring        | 3.4.0     |

## Instalação e Uso

1. Garantir que possui instalado em sua máquina as versões corretas do Gradle e Java:

    ```shell
    $ java --version
    openjdk 21.0.4 2024-07-16 LTS
    [...]
    ```

    ```shell
    $ gradle --version
    ----------------------------------------------
    Gradle 8.10.2
    ----------------------------------------------
    [...]
    ```

    > O uso da ferramenta **SDKMAN** pode ser útil para gerenciar versões do Java e do Gradle.

2. Garantir que possui instalado em sua máquina também a ferramenta Docker Compose:

    ```shell
    $ docker compose version
    Docker Compose version v2.20.3
    ```

3. Inicializar o banco de dados postgres com o docker compose:

    ```shell
    $ docker compose up --build
    ```

4. Realizar o build do ambiente e instalação de pacotes através do gradle:

    ```shell
    $ gradle build
    ```

5. Inicializar a aplicação Spring Boot através do gradle:

    ```shell
    $ gradle bootRun
    ```

## Exemplo de Requisição

Para realizar requisições no serviço de **store**:

```shell
$ curl -X GET http://localhost:8081/product/{id} \
    --header 'Accept: application/json' \
    --verbose
```

```shell
$ curl -X POST http://localhost:8081/product/sell \
    --header 'Content-Type: application/json' \
    --data '{"id": 1, "name": "Smartphone", "value": 59.99}' \
    --verbose
```

## Produtos Disponíveis

Os seguintes produtos já estão salvos em banco e disponíveis para serem utilizados pelo serviço:

| id  | name           | value    |
|    -|               -|         -|
| `1` | `"Smartphone"` | `59.99`  |
| `2` | `"TV"`         | `155.34` |
| `3` | `"Notebook"`   | `876.40` |

---
