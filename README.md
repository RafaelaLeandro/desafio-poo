
# Desafio POO

## Modelo de diagrama representando a UML dos componentes de um iPhone, com base no vídeo de lançamento do iPhone de 2007 com base no video do [link](https://www.youtube.com/watch?v=9ou608QQRq8) de referencia os minutos 00h15 até 00h55.
[![](https://mermaid.ink/img/pako:eNp9k89uwyAMxl8Fceqk5gWiaVK1XXrYVK3TTrm4wU3QCI4cqLZWffdBknb5s5ZLgv3hD_yDk8xJoUxlbqBpXjQUDFVmRRhtRKw3JVkUJxGD52FGvGPNpLwjfvWNzsGIU5ePI3GUAy8eBpEGDeaaLPT6xdaxtoWo2tlQWYNv4mLxFxtZr2pgNCV9hIp7sjqnkbUQRhdhfV_f-gqZhvUFOLQKx9sTOhTSwM_EjJo-6XhJj7zf4IAFKOK1dcgW3dgav_VO8wYKba8H9GzG7kp3fXijA6x2sJjszYPRR7gUGW6ip5EkT_PuT_LzHk0Es4NkNirmVB-TREzZ3Va23G-nO7Sd1T8Yo6SFdyffw7ujmJHs_OboonhI7LZqyuyOcsxPLmW4fhVoFV5Ze1Uy6UqsMJNp-FXAX5nM7DnoIDRr-2NzmTr2uJRMvihlugfThJmvVTh5_0SvUVQ6drh_xPFz_gWHukWW?type=png)](https://mermaid.live/edit#pako:eNp9k89uwyAMxl8Fceqk5gWiaVK1XXrYVK3TTrm4wU3QCI4cqLZWffdBknb5s5ZLgv3hD_yDk8xJoUxlbqBpXjQUDFVmRRhtRKw3JVkUJxGD52FGvGPNpLwjfvWNzsGIU5ePI3GUAy8eBpEGDeaaLPT6xdaxtoWo2tlQWYNv4mLxFxtZr2pgNCV9hIp7sjqnkbUQRhdhfV_f-gqZhvUFOLQKx9sTOhTSwM_EjJo-6XhJj7zf4IAFKOK1dcgW3dgav_VO8wYKba8H9GzG7kp3fXijA6x2sJjszYPRR7gUGW6ip5EkT_PuT_LzHk0Es4NkNirmVB-TREzZ3Va23G-nO7Sd1T8Yo6SFdyffw7ujmJHs_OboonhI7LZqyuyOcsxPLmW4fhVoFV5Ze1Uy6UqsMJNp-FXAX5nM7DnoIDRr-2NzmTr2uJRMvihlugfThJmvVTh5_0SvUVQ6drh_xPFz_gWHukWW)
--
#### Feito no [Mermaid](https://mermaid.live/)

#### Código base do diagrama
~~~ 
classDiagram
    class IPhone { 
  }
    class  ReprodutorMusical {
        -tocar()
        -selecionarMusica(String musica)
        -pausar() 
        }
    class AparelhoTelefonico {
        -  ligar(String numero)
        - atender()
        - iniciarCorreioVoz()
    }
    class NavegadorInternet {
        - exibirPagina(String url)
        - adicionarNovaAba()
        - atualizarPagina()
    }
  IPhone --> ReprodutorMusical
  IPhone --> AparelhoTelefonico
  IPhone --> NavegadorInternet

  ReprodutorMusical <-- selecionarMusica
  ReprodutorMusical <-- tocar
  ReprodutorMusical <-- pausar

  AparelhoTelefonico <-- ligar
  AparelhoTelefonico <-- atender
  AparelhoTelefonico <-- iniciarCorreioVoz

  NavegadorInternet <-- exibirPagina
  NavegadorInternet <-- adicionarNovaAba
  NavegadorInternet <-- atualizarPagina
~~~
