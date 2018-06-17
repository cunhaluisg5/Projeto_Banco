EXERC�CIO
 
Um banco necessita de uma aplica��o visual para as contas abertas pelos seus clientes. Para isto, voc� dever� trabalhar com os seguintes requisitos: 
 
1. Classe Cliente: todo cliente do banco possui os dados (privados): CPF, nome, endere�o, renda. 
Para cada cliente � necess�rio criar suas inst�ncias (com construtores), al�m das seguintes opera��es: 
 
I. m�todo construtor: no formato que permita a entrada dos dados que ser�o capturados na interface gr�fica. 
 
II. M�todos GET/SET dos atributos privativos. 
 
2. toda conta banc�ria possui os dados: numero, agencia, saldo, senha, Cliente (objeto da classe acima). Para cada conta � necess�rio criar suas inst�ncias (com construtores), al�m das seguintes opera��es: 
 
III. m�todo construtor: no formato que permita a entrada dos dados que ser�o capturados na interface gr�fica. 
 
IV. Capturar suas informa��es: monta uma sa�da com todos os seus dados, menos a senha e somente com o CPF e o nome do cliente. Importante saber que essa sa�da ser� utilizada dentro de um JTable. 
 
V. setSaldo: n�o ter� nenhum par�metro e a atribui��o do saldo ser� de acordo com a renda do cliente.  
* Caso a renda for inferior a 800,00 inclusive, o saldo ser� de 25% da renda 
* Caso seja entre 800,00 e 1700,00 inclusive, o saldo ser� de 53% da renda 
* Caso a renda seja superior a 1700,00, o saldo ser� de 1000,00 
 
3. Classe ContaEspecial: � uma conta Corrente por�m, possui o atributo a mais limite de cheque. O m�todo setSaldo( ) ser� sobrescrito, somando o limite do cheque ao valor do saldo, ap�s seu c�lculo feito segundo a renda do cliente. 
 
 
4. Interface Principal: Menu com duas op��es: Opera��es (com os sub-menus CLIENTES, CONTAS, LISTAGEM, SAIR) e Ajuda (com o sub-menu SOBRE): a op��o SAIR sai da aplica��o, e SOBRE aparece uma JOptionPane com o seu nome completo e a data atual. 
 
5. Interface de Clientes: Campos para cadastrar um cliente e um bot�o para CADASTRAR, que deve incluir o cliente num arquivo espec�fico para clientes. Utilize, nesta interface, um JTextArea para visualizar todos os clientes cadastrados. O campo CPF dever� ser um JFormattedFileld, seguido a m�scara: xxx.xxx.xxx-xx, onde x corresponde a um d�gito num�rico. 
 
6. Interface de Conta: 
 
VIII. Possui um campo para se digitar o CPF de um cliente e busca na base de dados de clientes, amostrando uma mensagem se por acaso n�o acha-lo. Ao encontrar o cliente, mostre seu nome em um outro campo DESABILITADO PARA EDI��O. Nesta mesma interface, o usu�rio preenche o numero da conta, a ag�ncia (JFormattedFileld, seguindo a m�scara: xxxx-xx, onde x corresponde a um d�gito num�rico), e a senha do usu�rio. 
 
IX. Bot�o ABRIR CONTA: captura os valores dos campos para se efetuar a abertura de conta, sendo que o usu�rio dever� escolher que tipo de conta deseja abrir (JRadioButton) e armazena-la como inst�ncia espec�fica de cada uma das classes da heran�a sobre Contas feita. Observe que a conta possui um atributo que � um objeto Cliente, o qual ser� atribu�do o objeto cliente pesquisado pelo CPF na op��o anterior. Ap�s a cria��o da conta, calcula-se o saldo para esta conta e armazena num arquivo para contas. 
 
X. Na op��o LISTAGEM do Menu Opera��es, aparecer� um outro formul�rio com um JTable para visualiza��o das contas cadastradas. Haver� um campo para pesquisa das contas atrav�s do CPF do correntista, filtrando os resultados exibidos na JTable de acordo com o CPF digitado no campo. 
 
