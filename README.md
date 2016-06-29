# repo-pousada

Sistema para Pousada em Java e MySQL  
Descrição do Projeto:

O sistema é um grande painel administrativo, não se preocupe com o layout, pois irei comprar um template pronto e montar cada tela .html conforme eu desejo, porém será bom ter noção de css.

Também será bom ter bastante noção de Javascript e Jquery, já que não quero um sistema funcionando via submit.

#O Sistema
O sistema terá a função de gerenciar 2 pousada do mesmo dono.

#Funcionalidades do Sistemas
- Cadastro de Clientes e Fornecedores
- Cadastro de Filiais/Pousadas (Cada pousada tem um nome, endereço e fotos próprias)
- Gerenciamento de Usuários e Privilégios (Cada usuário só ver a informação de uma determinada pousada)
- Cadastro de tipos de Acomodações (Cada acomodação tem seu título, fotos e quantidade)
- Cadastro de Atributos (O Atributo poderá ser da acomodação ou da Pousada, exemplo: Piscina é um atributo da Pousada, Ar Condicionado já é um atribudo da acomodação)
- Cadastro de Canais de Vendas (TElefone, E-mail, Site, etc)
- Cadastro de Produtos e Seus Valores (Produtos adicionais, como cama para bebe)
- Cadastro de Valores de Diárias
- Função para Calcular Valores de Diárias e Produtos para aquela determinada acomodação em Aquele determinado período, levando em consideração a data da reserva, checkin e quantidade de diárias.
- Função de calculo de disponibilidade (Com base na quantidade de Reservas e acomodações, o mesmo calcular a disponibilidade para reserva)
- Sistema Geração de Reservas
- Sistema Geração de Contrato de Hospedagem
- Calculo de Upgrade, Upsell e Downgrade
- Relatório de Reservas Detalhado
- Relatório de Contratos
- Relatório de Clientes
- Dashboard de controle de reservas
- Log de todos os update, insert e delete

Após o desenvolvimento do core do projeto em java: 
- WebService para sistema terceiro fazer reserva na pousada
- Site para o cliente poder fazer a reserva
- app mobile integrado ao sistema com funcionalidades a avaliar num segundo momento (fazer em cordova e nativo para avaliar as dificuldades de cada um). 
