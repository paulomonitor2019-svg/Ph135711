# 🔬 Sistema de Cadastro de Animais - Laboratório de Biologia

Um sistema robusto desenvolvido em **Java com Programação Orientada a Objetos** para gerenciar o registro de espécies animais em laboratórios de pesquisa biológica.

---

## 📋 Descrição do Projeto

Este sistema foi desenvolvido para **laboratórios de biologia** permitir que biólogos registrem e gerenciem informações sobre animais e suas características de forma organizada e persistente no computador do laboratório.

**Objetivo Principal:** Centralizar o cadastro de espécies, facilitando a busca, consulta e manutenção de dados zoológicos.

---

## ✨ Funcionalidades

### 🐾 Cadastro de Animais
- Registrar nome científico e nome popular
- Armazenar características físicas e comportamentais
- Adicionar informações sobre habitat e alimentação
- Persistência de dados local

### 🔍 Sistema de Busca Avançado
- Buscar por nome científico
- Buscar por nome popular
- Buscar por características
- Filtrar por tipo/espécie

### 📊 Gerenciamento de Dados
- Listar todos os animais cadastrados
- Atualizar informações de um animal
- Remover registros
- Exportar dados

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 8+
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Estruturas de Dados:** ArrayList, HashMap
- **Padrão:** MVC (Model-View-Controller)
- **IDE Recomendada:** Eclipse, IntelliJ IDEA ou VS Code

---

## 📁 Estrutura do Projeto

```
SistemaCadastroAnimais/
│
├── src/
│   ├── model/
│   │   ├── Animal.java          # Classe modelo da entidade Animal
│   │   └── Caracteristica.java  # Classe para características
│   │
│   ├── service/
│   │   ├── EncontrarAnimal.java # Serviço de busca
│   │   ├── GerenciadorAnimal.java # Gerenciador principal
│   │   └── ValidadorDados.java  # Validações
│   │
│   ├── view/
│   │   └── MenuPrincipal.java   # Interface com usuário
│   │
│   └── Main.java                # Ponto de entrada
│
├── data/
│   └── animais.dat              # Arquivo de persistência (gerado)
│
└── README.md
```

---

## 🚀 Como Usar

### 1️⃣ Compilar
```bash
javac -d bin src/**/*.java
```

### 2️⃣ Executar
```bash
java -cp bin Main
```

### 3️⃣ Usar o Sistema
```
┌─────────────────────────────────────┐
│   SISTEMA DE CADASTRO DE ANIMAIS   │
├─────────────────────────────────────┤
│  1. Cadastrar novo animal           │
│  2. Buscar animal                   │
│  3. Listar todos os animais         │
│  4. Atualizar informações           │
│  5. Remover animal                  │
│  6. Sair                            │
└─────────────────────────────────────┘
```

---

## 💾 Estrutura da Classe Animal

```java
public class Animal {
    private String nomeCientifico;
    private String nomePopular;
    private String habitat;
    private String alimentacao;
    private String tamanho;
    private String peso;
    private String condicaoConservacao;
    // ... getters e setters
}
```

---

## 🔍 Exemplo de Busca

```java
EncontrarAnimal busca = new EncontrarAnimal();
Animal encontrado = busca.buscarPorNome(listaAnimais, "Leão");

if (encontrado != null) {
    System.out.println("Encontrado: " + encontrado.getNomeCientifico());
} else {
    System.out.println("Animal não encontrado.");
}
```

---

## 👥 Público-Alvo

- 🔬 Biólogos e pesquisadores
- 📚 Laboratórios de pesquisa
- 🏫 Instituições de ensino
- 🦁 Zoológicos e centros de conservação

---

## 🎓 Conceitos de POO Utilizados

- ✅ **Encapsulamento** - Atributos privados com getters/setters
- ✅ **Herança** - Possível extensão para AnimalDoméstico, AnimalSelvagem
- ✅ **Polimorfismo** - Implementação de interfaces para diferentes tipos de busca
- ✅ **Abstração** - Classes abstratas para estrutura comum

---

## 📝 Requisitos Funcionais

- [x] Adicionar novo animal com características
- [x] Buscar animal por nome científico
- [x] Buscar animal por nome popular
- [x] Buscar animal por múltiplas características
- [x] Listar todos os animais cadastrados
- [x] Atualizar dados de um animal
- [x] Remover animal do sistema
- [x] Persistência de dados em arquivo

---

## 🐛 Suporte e Contribuições

Encontrou um bug? Tem uma ideia para melhorar? Abra uma **Issue** ou envie um **Pull Request**!

---

## 📅 Versão

**Versão:** 1.0.0  
**Último Update:** Maio de 2026  
**Status:** Em Desenvolvimento ✨

---

## 📜 Licença

Este projeto é de uso educacional e laboratorial. Livre para uso em pesquisa.

---

**Desenvolvido com ❤️ por [Paulo Monitor](https://github.com/paulomonitor2019-svg)**  
*Contribuindo para a ciência através da programação!* 🧬💻
