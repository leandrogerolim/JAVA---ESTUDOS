INSERT INTO restaurante (id, cep, complemento, nome) VALUES
(1L, '0000001', 'Complemento Endereço Restaurante 1', 'Casa de Carne'),
(2L, '0000002', 'Complemento Endereço Restaurante 2', 'Conveniencia');

INSERT INTO cliente (id, cep, complemento, nome) VALUES
(1L, '0000001', 'Complemento Endereço Cliente 1', 'Leandro Gerolim');

INSERT INTO produto (id, disponivel, nome, valor_unitario, restaurante_id) VALUES
(1L, true, 'Cerveja', 3.0, 1L),
(2L, true, 'Carvão', 15.0, 1L),
(3L, true, 'Carne 3', 35.0, 2L);

INSERT INTO sacola (id, forma_pagamento, fechada, valor_total, cliente_id) VALUES
(1L, 0, false, 0.0, 1L);