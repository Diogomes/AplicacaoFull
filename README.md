# AplicacaoFull
Aplicacao React usando api rest, springboot e postgree

Parte 1: Configurando o Front-end com React
Passo 1: Instalando Node.js e npm

Primeiro, certifique-se de que você tem o Node.js e o npm instalados. Você pode baixá-los aqui.
Passo 2: Criando o Projeto React

    Abra um terminal e crie uma nova aplicação React usando create-react-app

bash

npx create-react-app meu-projeto-frontend

Navegue até o diretório do projeto:

bash

cd loja-frontend

Instale as dependências adicionais que você possa precisar. Por exemplo, você pode querer usar axios para fazer requisições HTTP:

bash

    npm install axios

Passo 3: Estrutura do Projeto React

Sua estrutura de pastas deve se parecer com esta:

java

meu-projeto-frontend/
├── public/
├── src/
│   ├── components/
│   ├── pages/
│   ├── App.js
│   ├── index.js
│   └── services/
└── package.json

    components/: Componentes reutilizáveis do React.
    pages/: Páginas da aplicação.
    services/: Serviços para comunicação com o back-end (por exemplo, usando axios).

Passo 4: Criando um Serviço para Comunicação com o Back-end

Crie um arquivo api.js dentro da pasta services:

javascript



export default api;

Parte 2: Configurando o Back-end com Spring Boot
Passo 1: Criando o Projeto Spring Boot



Passo 2: Configurando o Banco de Dados PostgreSQL



Passo 3: Criando Endpoints REST



Passo 4: Configurando CORS



Parte 3: Integrando o Front-end com o Back-end

    No React, use o serviço api criado para fazer chamadas ao back-end. Por exemplo, em um componente:


