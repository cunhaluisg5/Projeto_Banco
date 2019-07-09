# Projeto Banco

Aplicação em *JAVA* desenvolvida utilizando o *NetBeans*.

## Sobre

A idéia da aplicação é fazer um controle de banco, seguindo as especificações abaixo:

*Um banco necessita de uma aplicação visual para as contas abertas pelos seus clientes. Para isto, você deverá trabalhar com os seguintes requisitos:*
 
1. Classe Cliente: todo cliente do banco possui os dados (privados): CPF, nome, endereço, renda. 

Para cada cliente é necessário criar suas instâncias (com construtores), além das seguintes operações: 
 
1.1. Método construtor: no formato que permita a entrada dos dados que serão capturados na interface gráfica. 
 
1.2. Métodos GET/SET dos atributos privativos. 
 
2. Toda conta bancária possui os dados: numero, agencia, saldo, senha, Cliente (objeto da classe acima). Para cada conta é necessário criar suas instâncias (com construtores), além das seguintes operações: 
 
2.1. Método construtor: no formato que permita a entrada dos dados que serão capturados na interface gráfica. 
 
2.2. Capturar suas informações: monta uma saída com todos os seus dados, menos a senha e somente com o CPF e o nome do cliente. Importante saber que essa saída será utilizada dentro de um JTable. 
 
2.3. setSaldo: não terá nenhum parâmetro e a atribuição do saldo será de acordo com a renda do cliente.  

* Caso a renda seja inferior a 800,00 inclusive, o saldo será de 25% da renda 
* Caso seja entre 800,00 e 1700,00 inclusive, o saldo será de 53% da renda 
* Caso a renda seja superior a 1700,00, o saldo será de 1000,00 
 
3. Classe ContaEspecial: é uma conta Corrente porém, possui o atributo a mais limite de cheque. O método setSaldo( ) será sobrescrito, somando o limite do cheque ao valor do saldo, após seu cálculo feito segundo a renda do cliente. 
  
4. Interface Principal: Menu com duas opções: Operações (com os sub-menus CLIENTES, CONTAS, LISTAGEM, SAIR) e Ajuda (com o sub-menu SOBRE): a opção SAIR sai da aplicação, e SOBRE aparece uma JOptionPane com o seu nome completo e a data atual. 
 
5. Interface de Clientes: Campos para cadastrar um cliente e um botão para CADASTRAR, que deve incluir o cliente num arquivo específico para clientes. Utilize, nesta interface, um JTextArea para visualizar todos os clientes cadastrados. O campo CPF deverá ser um JFormattedFileld, seguido a máscara: xxx.xxx.xxx-xx, onde x corresponde a um dígito numérico. 
 
6. Interface de Conta: 
 
6.1. Possui um campo para se digitar o CPF de um cliente e busca na base de dados de clientes, amostrando uma mensagem se por acaso não acha-lo. Ao encontrar o cliente, mostre seu nome em um outro campo DESABILITADO PARA EDIÇÃO. Nesta mesma interface, o usuário preenche o numero da conta, a agência (JFormattedFileld, seguindo a máscara: xxxx-xx, onde x corresponde a um dígito numérico), e a senha do usuário. 
 
6.2. Botão ABRIR CONTA: captura os valores dos campos para se efetuar a abertura de conta, sendo que o usuário deverá escolher que tipo de conta deseja abrir (JRadioButton) e armazena-la como instância específica de cada uma das classes da herança sobre Contas feita. Observe que a conta possui um atributo que é um objeto Cliente, o qual será atribuído o objeto cliente pesquisado pelo CPF na opção anterior. Após a criação da conta, calcula-se o saldo para esta conta e armazena num arquivo para contas. 
 
6.3. Na opção LISTAGEM do Menu Operações, aparecerá um outro formulário com um JTable para visualização das contas cadastradas. Haverá um campo para pesquisa das contas através do CPF do correntista, filtrando os resultados exibidos na JTable de acordo com o CPF digitado no campo.

### Requisitos

Ter instalado o JDK, para execução da aplicação via terminal ou IDE.

### Projeto

A aplicação foi desenvolvida na disciplina **Laboratório de Programação de Interface com Usuário** no *CES/JF*.