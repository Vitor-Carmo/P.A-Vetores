<h1>Lista 6</h1>
 

<h3>Etec de Guaianazes</h3>


<b>Nome:</b> ____________________________________   <b>Nº</b> ______      <b>Turma:</b> 1ª⊠   2ª  3ª  <b>Série - Informática</b>

<b>Professora:</b>  Aline Mendonça 	<b>Data:</b> 08/11/2019	

<h4>AVALIAÇÃO DE LÓGICA DE PROGRAMAÇÃO – ESTUDOS DE CASO</h4>

<h4>Critérios de Avaliação:</h4>  Raciocínio lógico, Aplicação de Princípios, Organização, Conhecimento

Observações: Atividade individual, com consulta ao material impresso do próprio aluno.

<h3>Estudos de caso – Vetores</h3>

<b>Criar os programas em Java dos problemas abaixo relacionados. Apresentar os códigos funcionando em 03/12/2019 no repositório do GitHub (Individual)</b>


<b>1)</b>	Criar um vetor A com 10 inteiros. Calcular e apresentar um vetor B onde cada elemento de B será a raiz quadrada do respectivo elemento de A;

<b>2)</b>	Criar um vetor A com 10 inteiros. Calcular e apresentar quais e quantos elementos de A são números primos;

<b>3)</b>	Criar um vetor A com 10 inteiros. Calcular e apresentar um vetor B, onde B terá os mesmos elementos de A em ordem inversa. Ou seja, o 1º elemento de B será o ultimo de A, o segundo elemento de B será o penúltimo de A e assim sucessivamente.

<b>4)</b>	Ler um vetor A de 10 inteiros. Apresentar o maior valor e o menor valor lido.

<b>5)</b>	Ler um vetor A de 10 inteiros. Apresentar o vetor B que será A em ordem crescente. Apresentar um vetor C que será A em ordem decrescente.
<br><br>

<h1>Lista 6 Parte 2</h1>
<h3>Estudos de caso – Vetores</h3>
<br>
<b>Lista complementar  de Lógica de Programação e Técnicas de Programação e Algoritmos
Treinando para trabalhar com vetores.</b><br><br>

<b>1)</b>	Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares.

<b>2)</b>	Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.

<b>3)</b>	Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não.

<b>4)</b>	Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os pares de 0 até o respectivo elemento.

<b>5)</b>	Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os divisores do respectivo elemento.

<b>6)</b>	Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2i. 

<b>7)</b>	Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento correspondente em A.

<b>8)</b>	Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento de B deverá ser o seguinte somatório: Bi = Somatório de Aj, para todo j variando de i até 10.

<b>9)</b>	Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um programa que realize a intersecção  dos vetores A e B para produzir um vetor C. Interseção de conjuntos = todos os elementos que existem em A e também existem em B.

<b>10)</b>	Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um programa que crie um vetor C que é a diferença dos conjuntos formados pelos elementos dos vetores A e B. Diferença de conjuntos = todos os elementos do conjunto A que não existem no conjunto B.

<b>11)</b>	Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, para pesquisar se um dado elemento X está armazenado em A.


<b>12)</b>	Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.

<b>13)</b>	Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 quando Ai for ímpar.

<b>14)</b>	Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Ci deverá receber 1quando Ai for maior que Bi; b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 quando Ai for menor que Bi.

<b>15)</b>	  Ler um vetor A com dez elementos inteiros. Criar um vetor B que tenha os 10 elementos de A em ordem crescente e um vetor C que tenha os 10 elementos de A em ordem descrescente.
<br><br>
<h1>Resoluções lista 6</h1>



  <h3>Resolução do exercício 1</h3>

<p>Precisaremos de dois <em>vetores</em>, o primeiro pode ser um vetor do tipo <strong>Inteiro</strong> que irá servir para armazenar
os números digitados pelo usuário e outro do tipo <strong>Double</strong> para pegarmos a raiz quadrada do primeiro 
 vetor (O segundo vetor tem que ser double, pois, caso a raiz quadrada não for inteira ela irá ser irracional. 
 <em> Ex: √2 = 1.41421356237...</em>).
</p>
<br>
<pre>
int a[] = new int[10];
double b[] = new double[10];
</pre>

<p>
 Importarei a Classe <em>Scanner</em> para pegarmos os dados do teclado <br>
 e também importarei a classe <em>math</em> para podermos utilizar o metódo <code>sqrt();</code>. É ele que vai
 pegar o número e retornar a Raiz Quadrada desse número.
 
<pre>
import java.util.Scanner;
import java.math.*;
</pre>

agora irei Instanciar o objeto da Classe <em>Scanner</em>

<pre>
Scanner in = new Scanner(System.in);
</pre>

<br>


<strong><em>and it's now! </em>Vai começar nossa Lógica de Programação.</strong>
</p>
<br>
<p>
Vamos Utilizar um laço <em>for</em> para pegar os dados digitados pelo usuário.
</p>

<pre>
for(int i = 0 ; i <= a.length - 1 ; i++) {}
</pre>

<p>
Esse laço for vai começar com <code>i = 0;</code>, e esse <em>'i'</em> vai até o 
 tamanho do nosso vetor (<em>que no caso é 10</em>). Porém, tem que ser o tamanho do nosso vetor menos 1,
já que que um vetor de tamanho 10 vai 0 até 9 (<code>i <= a.length - 1;</code>). E a cada volta
 do laço ele vai incrementar de 1 em 1 (<code>i++;</code>).
</p>
<pre>
for(i=0; i<= a.length - 1; i++) {
   System.out.println("Digite o "+(i+1)+" número: ");
   a[i] = in.nextInt();
   b[i] = a[i];
   b[i] = Math.sqrt(b[i]);
}
</pre>
<p>
Primeiro iremos fazer um <code>System.out.println</code> pedindo para o usuário digitar o <em>i-néssino</em> número 
(<em>Lembre-se que o <code>i</code> começa valendo 0, logo <code>"(i+1)°"</code> irá aparecer na tela como <code>1°</code></em>).
<br>
Salvaremos  o número que o usuário digitar no vetor <em>'a'</em> na posição <em>'i'</em> 
(<code>a[i] = in.nextInt();</code>). Colocaremos o valor de <code>a[i]</code> em <code>b[i]</code> 
(<code>b[i] = a[i];</code>)
e com <code> b[i] = Math.sqrt(b[i]); </code>, colocaremos a Raiz quadrada de <code>b[i]</code> nele mesmo.
E pronto! é só apresentar <code>b[i]</code> para o usuário.
</p>
<br>
<p>
Só falta dar o <code>System.out.println</code> do resultado na tela. <br>
E para isso, precisaremos apenas fazer o seguinte código:
<pre>
for(i = 0; i <= a.length - 1; i++) {
     System.out.println("A raiz quadrada de " + a[i] + " = "  +b[i]);
}
</pre>
<em>e voilà!</em>
</p>
<br>
<a href="https://github.com/Vitor-Carmo/P.A-Vetores/blob/master/Vetores/Vetores%20-%20Lista/src/RaizQuadrada.java">
Meu código completo desse exercício
</a>
<br>
<em>Talvez esteja um pouquinho diferente mas a lógica prevalece :)</em>
<br><br><br>

<h3>Resolução do exercício 2</h3>
<br>
<p>
 Primeiramente, iremos pegar os 10 números digitados do usuário com o laço <em>for</em>.
 
<pre>
for(i=0;i<=a.length-1;i++){
            System.out.println("Digite "+(i+1)+"° número: ");
            a[i] = in.nextInt();
}
</pre>

</p>
<br>
<p>
Continuando dentro desse <em>for</em>, iremos utilizar da seguinte lógica:<br>
Iremos declarar um vetor <code>TotalPrimos[i] = 0;</code>. Depois, criaremos outro 
<em>for</em>(<code>for(c=1;c<=a[i];c++){}</code>),
e dentro desse for que acabamos de criar, verificaremos se o numero 'a' na posição 'i' (<code>a[i]</code>) 
dividido pelo contador, deixa resto zero (<code>if(a[i]%c==0)</code>). Se isso for verdade,
<code>TotalPrimos[i]++;</code>.<br>
<pre>
for( c=1;c<=a[i];c++){
   if(a[i] % c == 0){
      TotalPrimos[i]++;
   }  
}
</pre>
</p>
<p>
Vamos, supor que seja a primeira interação do programa com usuário, e no vetor <code>a[0]</code> ele
digite <strong>3</strong> (<code>a[0] = 3</code>). Então, <code>TotalPrimos[0] = 0;</code> e depois vem o 2° laço <em>for</em>
(<code>for(c=1;1<=<strong>3</strong>;c++){}</code>). Logo após, ele vai verificar se <strong>3</strong> / 1 deixa 
 resto 0 (<code>if(3%1==0){}</code>). como isso é <em>true</em>, <code>TotalPrimos[0] = 1;</code>. Após isso, o algoritmo vai voltar para o laço com <code>c=2</code> e irá verificar se <strong>3</strong> / 2 deixa resto 0 (<code>if(3%2==0){}</code>). Isso é <em>false</em>, então o algoritmo não irá fazer nada. E por último, voltará novamente ao laço com <code>c=3</code>
e novamente irá verificar se <strong>3</strong> / 3 deixa resto 0 (<code>if(3%3==0){}</code>). Sendo isso <em>true</em> novamente, o <code>TotalPrimos[0] = 2;</code>. Já que a definição de um número primo é: 
</p>
<blockquote>um número que só pode deixar resto 0 por 1 e por ele mesmo </blockquote>
<p>
Iremos verificar depois se esse número deixa o total de 2 restos, ou seja, <code>TotalPrimos[0] == 2;</code> (<em>no caso, pelo que você viu na explicação anterior, 3 é um número primo, pois, só foi divido por 2 números, 1 e ele mesmo</em>).
</p>
<pre>
for(i=0;i<=a.length-1;i++){
   System.out.println("Digite "+(i+1)+"° número: ");
   a[i] = in.nextInt();
   TotalPrimos[i] = 0;
   for(c=1;c<=a[i];c++){
       if(a[i]%c==0){
          TotalPrimos[i]++;
       }
   }
}
 
</pre>
<br>
<p>
Declararei uma variável do tipo inteiro começando com 0, para guardar quantos números primos foram digitados.
</p>
<pre>int QuantidadePrimos=0;</pre>
<br>
<p>
 Iremos verificar cada posição do <code>TotalPrimos[i];</code>, para ver se esse elemento é 
 igual ou não a 2. Caso seja, vamos printar na tela que esse elemento é um número primo e incrementaremos mais um em 
 <code>QuantidadePrimos</code> (<code>QuantidadePrimos++;</code>). Caso não seja primo, printaremos que tal número não 
 é primo.
</p>
<pre>
for (i=0;i<=a.length-1;i++) {
    if (TotalPrimos[i] == 2) {
       System.out.println(a[i]+" é primo");
       QuantidadePrimos++;
     } else {
       System.out.println(a[i]+" não é primo");
     }
}

</pre>
<p>O último passo e o não menos importante, é o de mostrar para o usuário quantos primos tem no total.</p>

<pre>System.out.print("A quantidade de números primos é: "+QuantidadePrimos);</pre>
<br>
<a href="https://github.com/Vitor-Carmo/P.A-Vetores/blob/master/Vetores/Vetores%20-%20Lista/src/NumeroPrimos.java">
Meu código completo desse exercício
</a>




