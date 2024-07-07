Catálogo de Livros
Descrição do Projeto

O Catálogo de Livros é uma aplicação desenvolvida em Spring Boot que permite buscar livros e autores utilizando a API Gutendex. Além disso, a aplicação também persiste os dados em um banco de dados PostgreSQL utilizando Spring Data JPA.
Funcionalidades

    Buscar livros por título
    Listar todos os livros
    Listar autores
    Persistir dados em um banco de dados PostgreSQL

Tecnologias Utilizadas

    Spring Boot
    Spring Data JPA
    PostgreSQL
    API Gutendex
    Java 11

Como Executar o Projeto

    Clone o repositório: git clone https://github.com/seu-usuario/catálogo-de-livros.git
    Acesse o diretório do projeto: cd catálogo-de-livros
    Execute o comando: mvn spring-boot:run
    A aplicação estará disponível em http://localhost:8080

Como Utilizar o Projeto

    Abra o console e execute o comando: java -jar target/catálogo-de-livros.jar
    Selecione uma opção:
            Buscar livro por título
            Listar todos os livros
            Listar autores
            Listar livros por idioma (ainda não implementado)
            Sair

Configuração do Banco de Dados

O arquivo application.properties contém as configurações do banco de dados. Você pode alterar as configurações para se conectar a um banco de dados diferente.
Limitações

    A API Gutendex tem limitações e pode não ser adequada para uso em produção.
    A aplicação não implementa autenticação ou autorização.
    A aplicação não é escalável para grandes volumes de dados.

Contribuição

Se você deseja contribuir para o projeto, por favor, faça um fork do repositório e envie um pull request com suas alterações.
Licença

Contato

Se você tiver alguma dúvida ou precisar de ajuda, por favor, entre em contato comigo em orlandovfo@gmail.com.
