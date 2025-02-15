#language: pt
#encoding: utf-8

@test
Funcionalidade: Realizar Compra no E-commerce

	Como um comprador
	Quero ver a lista de produtos disponiveis
	Para que eu possa escolher qual devo comprar
	
  Cenario: Adicionar produto ao carrinho
  	Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Blouse"
  	Quando adiciona o produto "Blouse" ao carrinho
  	Entao o produto "Blouse" deve estar presente no carrinho
  
  Cenario: Realizar Compra
  	Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Blouse"
  	E adiciona o produto "Blouse" ao carrinho
  	E acessa o checkout
  	E realiza o login
  	E confirma o endereco de entrega
  	E escolhe a forma de transporte
  	Quando o pagamento for confirmado
  	Entao deve ser apresentado a mensagem "Your order on My Store is complete."
  	