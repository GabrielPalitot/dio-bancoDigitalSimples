# Banco Digital Simples Com Orientação a Objetos

O projeto é simples e consiste na criação de um banco digital simplificado para exercitar os conceitos de Programação Orientada a Objetos em Java para o bootcamp Santander da plataforma de ensinos DIO.

# Conceitos Utilizados

Como dito anteriormente, foram utilizados os 4 pilares da programação orientada a objetos (Herança, abstração, polimorfismo e encapsulamento) além do uso de uma interface.

# Como Executar

Para executar o projeto basta ir na pasta `src` e depois no arquivo `Main.java`.  Depois rode os seguintes comandos no seu terminal ou IDE (tenha em mente que você deve estar no diretório do arquivo Main.java). Você também poderá apenas executar o botão de `run` na IDE que está utilizando.
```bash
    # Comando responsável por compilar
    javac Main.java
    # Executa
    java Main
```

# Principais Classes

`Banco`: Classe que representa um banco, contendo informações como nome e uma lista de contas associadas. Permite a criação de contas correntes e poupanças para clientes específicos e a impressão das informações de todas as contas.

`Cliente`: Representa um cliente do banco com um atributo para o nome. Permite a obtenção e atualização do nome do cliente.

`Conta`: Classe abstrata que define a estrutura básica de uma conta bancária, incluindo agência, número da conta, saldo, cliente e banco associados. Implementa operações comuns como saque, depósito e transferência.

`ContaCorrente`: Subclasse de Conta que representa uma conta corrente. Inclui métodos específicos para imprimir o extrato da conta corrente.

`ContaPoupanca`: Subclasse de Conta que representa uma conta poupança. Similar à ContaCorrente, mas com métodos adaptados para o extrato da conta poupança.

`IConta`: Interface que define as operações básicas que uma conta deve suportar, como sacar, depositar, transferir e imprimir extrato.

`Main`: Classe principal que executa o programa. Cria bancos e clientes, realiza operações em contas correntes e poupanças, e imprime resultados de teste.