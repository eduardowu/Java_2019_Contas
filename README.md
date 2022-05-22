# Java_2019_Contas
Aplicativo desenvolvido em Java. Unicesumar - 2019/02

---

## Exercício proposto:
[...]
Para isso você vai precisar criar:

• Um novo projeto no NetBeans, do tipo "Aplicativo Java"

• Uma classe "Conta" que será uma superclasse.

• As classes "ContaCorrente" e "ContaPoupanca", que herdam as características da classe "Conta".

• As contas possuem, em comum, informações de agência, número, dígito e saldo.

• Você deve implementar os métodos: saque, deposito, saldo e transferência.

• O método saldo deve exibir na tela as informações da conta e o saldo.

• O método saque deve registrar um saque, ou seja, retirar da conta um valor.

• O método depósito registra um valor a mais na conta.

• O método transferência retira um valor da conta atual e o coloca em uma outra conta informada.

• Note que as operações de saque e transferência devem verificar se há saldo disponível. No caso da conta corrente, considerar o limite.

• Para definir as informações da conta, utilize os métodos acessores (getters e setters).

• As contas poupança possuem um método rendimento, que deve aumentar o saldo de acordo com a porcentagem informada.

• Exemplo: Rendimento de 2% em uma conta com saldo de 500 reais

• rendimento(0.02) → o saldo deve ficar em 510 reais

No método main da classe principal do sistema, deixe os seguintes comandos:

• Crie duas contas correntes e duas poupanças (pode definir os números das contas como quiser)

• Inicie as contas com saldos e limites diferentes de zero.

• Realize dois saques em quaisquer contas e exiba o saldo a seguir.

• Realize duas transferências e exiba os saldos das contas envolvidas.

• Realize tentativas de um saque e uma transferência para uma conta corrente que não tenha saldo suficiente mesmo com o limite.

• Realize tentativas de um saque e uma transferência para uma conta poupança que não tenha saldo suficiente.

---

## Resultados obtidos:

*** 01 - Inicialização das contas com saldo e limite difernte de zero ***

Conta Corrente [ Conta Bancária [ Agencia nº: 1111; Conta nº: 55555; Conta digito: 1; Saldo: 1000.0 ] Limite: 200.0 ]

Conta Corrente [ Conta Bancária [ Agencia nº: 2222; Conta nº: 66666; Conta digito: 2; Saldo: 2000.0 ] Limite: 500.0 ]

Conta Poupança [ Conta Bancária [ Agencia nº: 3333; Conta nº: 77777; Conta digito: 3; Saldo: 1500.0 ] Rendimento: 0.0 ]

Conta Poupança [ Conta Bancária [ Agencia nº: 4444; Conta nº: 88888; Conta digito: 4; Saldo: 2500.0 ] Rendimento: 0.0 ]

***     ***

*** 02 - Saques, nos valores de 200 e 700, realizados na conta corrente 55555 ***

*** Saldo antes do saque: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 1111; Conta nº: 55555; Conta digito: 1; Saldo: 1000.0 ] Limite: 200.0 ]

*** Saldo após o saque: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 1111; Conta nº: 55555; Conta digito: 1; Saldo: 100.0 ] Limite: 200.0 ]

***     ***

*** 03 - Saques, nos valores de 300 e 850 realizados na conta corrente 66666 ***

*** Saldo antes do saque: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 2222; Conta nº: 66666; Conta digito: 2; Saldo: 2000.0 ] Limite: 500.0 ]

*** Saldo após o saque: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 2222; Conta nº: 66666; Conta digito: 2; Saldo: 850.0 ] Limite: 500.0 ]

***     ***

*** 04 - Transferência, no valor de 500, da conta 66666, para a poupança 77777 ***

*** Saldo antes da transferência: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 2222; Conta nº: 66666; Conta digito: 2; Saldo: 850.0 ] Limite: 500.0 ]

Conta Poupança [ Conta Bancária [ Agencia nº: 3333; Conta nº: 77777; Conta digito: 3; Saldo: 1500.0 ] Rendimento: 0.0 ]

*** Saldo após a transferência: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 2222; Conta nº: 66666; Conta digito: 2; Saldo: 350.0 ] Limite: 500.0 ]

Conta Poupança [ Conta Bancária [ Agencia nº: 3333; Conta nº: 77777; Conta digito: 3; Saldo: 2000.0 ] Rendimento: 0.0 ]

***

*** 05 - Transferência, no valor de 1000, da conta 88888, para a conta 55555 ***

*** Saldo antes da transferência: ***

Conta Poupança [ Conta Bancária [ Agencia nº: 4444; Conta nº: 88888; Conta digito: 4; Saldo: 2500.0 ] Rendimento: 0.0 ]

Conta Corrente [ Conta Bancária [ Agencia nº: 1111; Conta nº: 55555; Conta digito: 1; Saldo: 100.0 ] Limite: 200.0 ]

*** Saldo após a transferência: ***

Conta Poupança [ Conta Bancária [ Agencia nº: 4444; Conta nº: 88888; Conta digito: 4; Saldo: 1500.0 ] Rendimento: 0.0 ]

Conta Corrente [ Conta Bancária [ Agencia nº: 1111; Conta nº: 55555; Conta digito: 1; Saldo: 1100.0 ] Limite: 200.0 ]

***     ***

*** 06 - Tentativa de saque, no valor de 1500, da conta 55555 ***

*** Saldo antes do saque: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 1111; Conta nº: 55555; Conta digito: 1; Saldo: 1100.0 ] Limite: 200.0 ]

Saldo insuficiente para o saque de: 1500.0; Saldo de = 1100.0

*** Saldo após a tentativa de saque: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 1111; Conta nº: 55555; Conta digito: 1; Saldo: 1100.0 ] Limite: 200.0 ]

***     ***

*** 07 - Tentativa de transferência, no valor de 2100, da conta 66666, para a conta 55555 ***

*** Saldo antes da transferência: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 2222; Conta nº: 66666; Conta digito: 2; Saldo: 350.0 ] Limite: 500.0 ]

Saldo insuficiente para a transferência de : 2100.0; Saldo de = 350.0

*** Saldo após a transferência: ***

Conta Corrente [ Conta Bancária [ Agencia nº: 2222; Conta nº: 66666; Conta digito: 2; Saldo: 350.0 ] Limite: 500.0 ]

***     ***

*** 08 - Tentativa de saque, no valor de 2050, da conta 77777 ***

Saldo antes do saque: 

Conta Poupança [ Conta Bancária [ Agencia nº: 3333; Conta nº: 77777; Conta digito: 3; Saldo: 2000.0 ] Rendimento: 0.0 ]

Saldo insuficiente para o saque de: 2050.0; Saldo de = 2000.0

Saldo após a tentativa de saque: 

Conta Poupança [ Conta Bancária [ Agencia nº: 3333; Conta nº: 77777; Conta digito: 3; Saldo: 2000.0 ] Rendimento: 0.0 ]

***     ***

*** 09 - Tentativa de transferência, no valor de 2100, da conta 88888, para a conta 77777 ***

Saldo antes da transferência: 

Conta Poupança [ Conta Bancária [ Agencia nº: 4444; Conta nº: 88888; Conta digito: 4; Saldo: 1500.0 ] Rendimento: 0.0 ]

Saldo insuficiente para a transferência de : 2100.0; Saldo de = 1500.0

Saldo após a transferência: 

Conta Poupança [ Conta Bancária [ Agencia nº: 4444; Conta nº: 88888; Conta digito: 4; Saldo: 1500.0 ] Rendimento: 0.0 ]

***     ***

*** 10 - Conta Poupança 88888, recebendo rendimento de 2% ***

Saldo antes do rendimento: 

Conta Poupança [ Conta Bancária [ Agencia nº: 4444; Conta nº: 88888; Conta digito: 4; Saldo: 1500.0 ] Rendimento: 0.0 ]

Saldo após a transferência: 

Conta Poupança [ Conta Bancária [ Agencia nº: 4444; Conta nº: 88888; Conta digito: 4; Saldo: 1530.0 ] Rendimento: 30.0 ]

***     ***

---

## Connect With Me

[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https:https://www.linkedin.com/in/eduardo-w-ungefehr-838226101/)](https://www.linkedin.com/in/eduardo-w-ungefehr-838226101/)

[![Gmail Badge](https://img.shields.io/badge/-Gmail-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:eduardowubr@gmail.com)](mailto:eduardowubr@gmail.com)
