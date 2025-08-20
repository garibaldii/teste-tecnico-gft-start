Bom dia chat, tudo bem? 
Preciso que desenvolva um sistema em Java puro de uma biblioteca. 

Neste sistema teremos 3 classes: 
-> Livro (servirá como model, suas propriedades serão: 
private String titulo
private String autor 
private int anoPublicacao 

Metodos: 
- Construtor(todas as propriedades da classe)
- Getters e Setters

-> Biblioteca (servirá como model, suas propriedades serão: 
private String nome, 
private List<Livro> livros 

Métodos:
- Construtor(todas as propriedades da classe)
- Getters e Setters

-> BibliotecaController (servirá como controller, nele deveremos:
- Adicionar novos livros à biblioteca; 
- - Listar todos os livros cadastrados; 
- - Atualizar os dados de um livro(todas as informacoes); 
- - Deletar um livro da biblioteca; 
- - Buscar um livro pelo autor. 

Validações e Notificações:

Evitar livros duplicados: Não pode adicionar um livro que já existe na biblioteca (mesmo título e autor).

Verificar se o livro existe: Antes de atualizar ou excluir, o sistema verifica se o livro está na biblioteca.

Notificações: Sempre que o usuário adicionar, atualizar ou excluir um livro, o sistema deve mostrar uma mensagem confirmando a ação.

Mensagens de erro: Se algo der errado (livro duplicado ou não encontrado), o sistema deve mostrar uma mensagem de erro explicando o motivo.



#Dados
Para o armazenamento dos dados, pode adicionar um arquivo de configuração de banco de dados MySQL rodando local em Docker, com as credenciais: 

spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
spring.datasource.username=root
spring.datasource.password=admin
