# msEmail

<!---Esses são exemplos. Veja https://shields.io para outras pessoas ou para personalizar este conjunto de escudos. Você pode querer incluir dependências, status do projeto e informações de licença aqui--->


<center>
<img src="https://emanuelzaveruka.github.io/portfolio/assets/img/msEmail.svg" widht="90%" height="300px">
</center>
<br>
> Micro Serviço de envio de email onde recebe um parâmetro POST. Faz o envio do email e armazena no banco de dados local.



## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:
* Necessário SDK `Java 17`
* Necessário IDE que suporte projetos java em framework Spring Boot.
* Necessário POSTMAN ou qualquer outra ferramenta para testes de API.
* Necessário local host configurado em sua máquina..


## 🚀 Instalando

Para instalar o **msEmail**, siga estas etapas:

Rode no bash ou no seu terminal em um diretório de sua preferência:
```
git clone https://github.com/emanuelzaveruka/msEmail.git
```
Ou faça o download e extraia o arquivo no diretório de sua preferência [download do arquivo](https://github.com/emanuelzaveruka/msEmail/archive/refs/heads/main.zip)

Abra o projeto em sua IDE e configure para suportar SDK java 17

Em seguida navegue até /email/src/main/resources abra o arquivo application.properties

No spring.datasource.url sete sua configurações de local host e a porta de seu SQL se você já utiliza o pacote XAMPP não é necessário reconfigurar.

Em spring.datasource.username sete seu usuário de acesso ao banco de dados.

E por último spring.datasource.password sete sua senha de acesso ao banco de dados.
```
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/ms-email
spring.datasource.username=root
spring.datasource.password=
```
Para utilizar o envio de email é necessário um email com autenticação de dois fatores e uma senha de acesso de 16 caracteres gerada pelo google. [Link para gerar senha](https://support.google.com/accounts/answer/185833)

Após gerar sua senha deve retornar ao arquivo application.properties e alterar:
```
spring.mail.username=youremailhere@gmail.com
spring.mail.password=yourpassword16caractershere
```
## ☕ Usando msEmail

Para usar o msEmail, siga estas etapas:

- Dentro de sua ferramenta de teste de api importe o arquivo **msEmail.postman_collection.json** disponível no diretório /postman.

caso queira configurar manualmente sua requisição no **endpoint**:

método POST:
```
http://localhost:8080/sending-email
```
Corpo da requisição em JSON:
```
{
    "ownerRef" : "emanuel",
    "emailFrom" : "youremailhere@gmail.com",
    "emailTo" : "sendemailto@gmail.com",
    "subject" : "Enviando email",
    "text" : "Testando minha microservice de email : ) "
}
```



[⬆ Voltar ao topo](#msEmail)<br>

