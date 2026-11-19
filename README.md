# Revisitando Conceitos Básicos de Java

Projeto de estudos para revisão dos conceitos fundamentais da linguagem Java. Cada pasta em `src/` corresponde a uma aula/tópico (`a1` a `a17`), com exemplos executáveis e comentários explicativos em português. Há também uma pasta de exercícios práticos.

## Tecnologias

- **Java 21** (JDK 21)
- **IntelliJ IDEA** (projeto `RevisitandoConceitosBasicosJava.iml`)
- Apenas a biblioteca padrão (Java SE), sem dependências externas ou ferramenta de build

## Estrutura do projeto

```
estudosJava/
├── src/
│   ├── a1  expressoesBasicas/        Expressões e saída básica (println, printf)
│   ├── a2  utilizandoArrays/         Array, ArrayList e Collections
│   ├── a3  diferenciandoVariaveis/   Tipos primitivos x wrappers
│   ├── a4  UsandoDatas/              Trabalhando com datas
│   ├── a5  UsandoJavaTime/           java.time: horas e transformação de datas
│   ├── a6  BigDecimalExample/        Precisão decimal com BigDecimal e RoundingMode
│   ├── a7  orientacaoObjetos/        Orientação a objetos (veja detalhes abaixo)
│   ├── a8  controleDeFluxoSimples/   if / else
│   ├── a9  ControleDeFluxoComposta/  Condições compostas (boletim escolar)
│   ├── a10 utilizandoMap/            Map, HashMap e listas
│   ├── a11 condicaocomswitchcase/    switch / case
│   ├── a12 utilizandoDoWhile/        do / while
│   ├── a13 utilizandoWhile/          while
│   ├── a14 utilizandoFor/            for, for-each, break e listas
│   ├── a15 utilizandoExceptions/     try / catch / finally e exceções customizadas
│   ├── a16 condicaoTernaria/         Operador ternário
│   ├── a17 expressoesAvancadas/      String.format e formatação de datas
│   └── exercicios/                   Exercícios de lógica de programação
├── out/                              Classes compiladas (geradas pelo IDE)
└── README.md
```

## Conteúdo por tópico

### Fundamentos (a1 a a5)
- **a1** – Expressões básicas e diferentes formatos de saída.
- **a2** – Diferença entre arrays, `ArrayList` e métodos utilitários de `Collections`.
- **a3** – Declaração e diferenças entre tipos de variáveis.
- **a4 / a5** – Manipulação de datas e horas com `java.time` (`LocalDate`, `LocalTime`, conversões e formatação).

### a6 – BigDecimal
Utiliza `BigDecimal` (`java.math`) para operações aritméticas com precisão decimal. O código exemplifica a divisão de um valor por outro, especificando a escala e o modo de arredondamento (`RoundingMode`).

### a7 – Orientação a Objetos
- **Client / Transation**: classes e objetos básicos.
- **Istanciacao2** e **InstanciandoMelhor**: formas de instanciar objetos (`Cliente`, `Transacao`, `SistemaDeCompras`), incluindo o uso de `this` para retornar o próprio objeto.
- **enums**: `EstadosBrasileiros`, enum com atributos (sigla e nome do estado), e `EstadosMain`.
- **herancaEPolimorfismo**: `Pessoa` (superclasse) com as subclasses `Medico` e `Paciente`, demonstrando `extends`, `super`, sobrescrita de `toString()` e a execução em `Sistema`.
- **OutrosExemplos**: exemplos adicionais (`Sistem`).

### Controle de fluxo (a8 a a14, a16)
- **a8 / a9** – `if/else` simples e composto (`BoletimEscolar`).
- **a10** – Uso de `Map<String, String>`, `Map<Integer, List<String>>`, `List` e `Collections.reverse`.
- **a11** – `switch` com base no valor de uma variável (`sigla`). O `break` em cada caso evita a execução dos casos seguintes.
- **a12 / a13 / a14** – Laços `do-while`, `while` e `for` (incluindo `for-each`, `break` e iteração sobre arrays e listas).
- **a16** – Operador ternário para decidir se o aluno está "Aprovado", "Reprovado" ou em "Recuperação", considerando três cenários:
  1. `notaBaixa` comparada com a `media`;
  2. `notaAlta` comparada com a `media`;
  3. `notaBaixa` comparada com a `media` e uma condição adicional para definir "Recuperação" ou "Reprovado direto".

### a15 – Exceções
Tratamento com `try/catch/finally`, conversão de dados (`ParseException`) e criação de exceções customizadas (`EstadoValidateException`, que estende `RuntimeException`).

### a17 – Expressões avançadas
Formatação de texto com `String.format`: preenchimento com zeros (`%05d`), alinhamento à esquerda (`%-30s`), casas decimais (`%.2f`) e datas (`%td/%<tm/%<ty`).

### exercicios
Exercícios de lógica de programação que utilizam `Scanner` para entrada de dados, como:
- comparar um número com zero e encontrar o maior entre dois números;
- verificar idade para votar e dirigir;
- verificar se três segmentos formam um triângulo e classificá-lo (equilátero, isósceles, escaleno);
- calcular média de notas;
- converter valores entre dólar e real;
- calcular preço de venda com percentual de lucro.

## Como executar

### Pelo IntelliJ IDEA
1. Abra a pasta do projeto no IntelliJ.
2. Configure o SDK para o JDK 21.
3. Abra a classe desejada e execute o método `main` (ícone de play ao lado da classe).

### Pelo terminal
A partir da raiz do projeto:

```bash
# Compilar todas as classes para a pasta out/
javac -d out $(find src -name "*.java")

# Executar uma classe (exemplo)
java -cp out a7.orientacaoObjetos.herancaEPolimorfismo.Sistema
```

> Os exercícios da pasta `exercicios` usam `Scanner`, então aguardam entrada pelo teclado.

## Autora

Vitória Jaco – projeto de estudos pessoal.
