# 📺 Projeto: Simulador de Smart TV

Este projeto é uma simulação de uma Smart TV implementada em Java. Ele permite ligar e desligar a TV, alterar canais e ajustar o volume.

## 📌 Descrição
Este projeto simula o funcionamento básico de uma Smart TV, permitindo ligar e desligar o dispositivo, ajustar o volume e mudar de canal.

## 📜 Funcionalidades
- Ligar e desligar a TV
- Aumentar e diminuir o volume
- Trocar canais para frente e para trás
- Configurar diretamente um canal específico

## 📂 Estrutura do Projeto
O projeto contém dois arquivos principais:

### 1. `SmartTv.java`
```java
public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void aumentarCanal() {
        if (ligada) {
            volume++;
            System.out.println("Mudando para o canal: " + volume);
        }
    }
}

## 🚀 Como executar o projeto

1. Clone este repositório em sua máquina local:
   ```sh
   git clone https://github.com/JeanAlencar/SmartTv
   ```
2. Navegue até a pasta do projeto:
   ```sh
   cd SmartTv
   ```
3. Compile os arquivos Java:
   ```sh
   javac SmartTv.java Usuario.java
   ```
4. Execute o programa principal:
   ```sh
   java Usuario
   ```

## 💻 Tecnologias Utilizadas
- Java

## 📧 Contato

Se tiver dúvidas ou sugestões, entre em contato:
- 📩 **E-mail**: j.alencar1995@gmail.com  
- 🔗 **LinkedIn**: [Jean Alencar](https://www.linkedin.com/in/jeanalencar/)  
- 💻 **GitHub**: [JeanAlencar](https://github.com/JeanAlencar)
