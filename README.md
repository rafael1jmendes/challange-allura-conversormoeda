Conversor de Moedas

Este é um simples aplicativo de linha de comando em Java para conversão de moedas. Ele permite que os usuários convertam entre diferentes moedas, como Dólar, Real Brasileiro, Peso Argentino e Peso Colombiano.

-Funcionalidades

Conversão entre Dólar e Peso Argentino
Conversão entre Peso Argentino e Dólar
Conversão entre Dólar e Real Brasileiro
Conversão entre Real Brasileiro e Dólar
Conversão entre Dólar e Peso Colombiano
Conversão entre Peso Colombiano e Dólar

Documentação das Classes

Conversao dolar para peso Argentino (DolarParaPesoArg)
Esta classe implementa a interface Conversao e fornece uma implementação para a conversão de Dólar para Peso Argentino.

Conversao peso argentino para dolar (PesoArgParaDolar)
Esta classe implementa a interface Conversao e fornece uma implementação para a conversão de Peso Argentino para Dólar.

Conversao dolar para Real (DolarParaReal)
Esta classe implementa a interface Conversao e fornece uma implementação para a conversão de Dólar para Real Brasileiro.

Conversao Real para dolar (RealParaDolar)
Esta classe implementa a interface Conversao e fornece uma implementação para a conversão de Real Brasileiro para Dólar.

Conversao dolar para peso Colombiano (DolarParaPesoCol)
Esta classe implementa a interface Conversao e fornece uma implementação para a conversão de Dólar para Peso Colombiano.

Conversao peso colombiano para dolar (PesoColParaDolar)
Esta classe implementa a interface Conversao e fornece uma implementação para a conversão de Peso Colombiano para Dólar.

Divisão dos Pacotes
O projeto está dividido em três pacotes principais:

br.com.alura.conversor.principal: Contém a classe principal do programa.
br.com.alura.conversor.moedas: Contém as classes que representam os modelos de conversão de moedas.
br.com.alura.conversor.services: Contém a classe responsável por realizar chamadas à API de taxa de câmbio.

-Técnicas Utilizadas
-Modularidade: O projeto está dividido em pacotes e classes para facilitar a organização e manutenção do código.
Orientação a Objetos: Princípios de OOP são seguidos para criar classes que representam objetos do mundo real e encapsulam comportamentos e dados relacionados.

-Interfaces: O uso de interfaces permite a implementação de contratos comuns, como a interface Conversao, que permite acesso uniforme às diferentes implementações de conversão de moedas.

-Tratamento de Exceções: O projeto trata exceções de forma adequada para lidar com situações inesperadas durante a execução do programa.

-Utilização de API Externa: A integração com a API de taxa de câmbio é feita para obter as taxas de conversão atualizadas entre diferentes moedas.
