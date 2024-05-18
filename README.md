1. Introdução
1.1 Objetivo do Documento
Este documento tem como objetivo detalhar as funcionalidades e requisitos do aplicativo de gestão financeira desenvolvido em Android Studio, descrevendo as páginas principais, o público-alvo e os objetivos do aplicativo.

2. Objetivos do Aplicativo
O aplicativo de gestão financeira tem como objetivo principal ajudar os usuários a controlar suas finanças pessoais de maneira eficiente e prática. Os principais objetivos incluem:

Monitoramento de Despesas: Permitir que os usuários registrem e acompanhem suas despesas diárias.
Gerenciamento de Receitas: Facilitar o registro de todas as fontes de renda dos usuários.
Visão Geral Financeira: Fornecer uma visão consolidada da situação financeira do usuário, incluindo gráficos e relatórios.
Planejamento Financeiro: Ajudar os usuários a planejar seus gastos futuros com base em suas receitas e despesas passadas.
3. Tipos de Clientes e Usuários
3.1 Clientes
O aplicativo é voltado para pessoas físicas que desejam melhorar sua organização financeira. Os clientes podem ser divididos em dois principais segmentos:

Usuários Individuais: Pessoas que utilizam o aplicativo para gerenciar suas finanças pessoais.
Pequenos Empreendedores: Donos de pequenos negócios que utilizam o aplicativo para controlar tanto suas finanças pessoais quanto as do negócio.

3.2 Usuários
Os usuários do aplicativo são indivíduos que precisam de uma ferramenta para facilitar a gestão de suas finanças. Eles podem ser categorizados da seguinte maneira:

Iniciantes em Gestão Financeira: Usuários que estão começando a se organizar financeiramente e precisam de uma interface intuitiva.
Usuários Experientes: Pessoas que já têm um bom conhecimento de gestão financeira e buscam funcionalidades mais avançadas.
4. Páginas do Aplicativo
4.1 Cadastro

Descrição: Página onde os usuários se registram no aplicativo.
Funcionalidades:
Formulário de cadastro com campos para nome, e-mail, senha e confirmação de senha.
Validação de e-mail para assegurar que o usuário forneceu um endereço de e-mail válido.
Uso de Firebase Authentication para gerenciar o cadastro e autenticação dos usuários.

4.2 Login

Descrição: Página de autenticação de usuários.
Funcionalidades:
Campos para e-mail e senha.
Opção de recuperação de senha.
Autenticação via Firebase Authentication.
4.3 Despesas

Descrição: Página para registro e visualização de despesas.
Funcionalidades:
Formulário para adicionar novas despesas, incluindo data, categoria, descrição e valor.
Lista de despesas registradas com possibilidade de edição e exclusão.
Armazenamento de dados utilizando Firebase Firestore.

4.4 Principal Atividade

Descrição: Página principal do aplicativo onde são exibidas as principais informações financeiras do usuário.
Funcionalidades: Resumo das receitas e despesas.
Gráficos de acompanhamento de despesas e receitas utilizando 
Notificações de eventos financeiros importantes (ex. vencimento de contas).

4.5 Receita

Descrição: Página para registro e visualização de receitas.
Funcionalidades:
Formulário para adicionar novas receitas, incluindo data, fonte, descrição e valor.
Lista de receitas registradas com possibilidade de edição e exclusão.
Armazenamento de dados utilizando Firebase Firestore.
5. Lista de Requisitos
5.1 Requisitos Funcionais
RF01: O sistema deve permitir o cadastro de novos usuários.
RF02: O sistema deve permitir que os usuários façam login e logout.
RF03: O sistema deve permitir o registro de despesas.
RF04: O sistema deve permitir o registro de receitas.
RF05: O sistema deve exibir um resumo financeiro na página principal.
RF06: O sistema deve permitir a edição e exclusão de despesas e receitas.
RF07: O sistema deve gerar gráficos de despesas e receitas.
5.2 Requisitos Não Funcionais
RNF01: O sistema deve garantir a segurança dos dados dos usuários.
RNF02: O sistema deve ser responsivo e funcionar em diferentes dispositivos Android (smartphones e tablets).
RNF03: O sistema deve ter uma interface intuitiva e fácil de usar.
RNF04: O sistema deve ter alta disponibilidade e performance.
RNF05: O sistema deve ser desenvolvido em Java para melhor performance e manutenção.
RNF06: O sistema deve utilizar Firebase para autenticação e armazenamento de dados.
