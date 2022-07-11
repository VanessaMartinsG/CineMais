insert into cinema (id,nomeCinema,nomeShopping) values (1,"CineMais","Shopping Salvador");
insert into cinema (id,nomeCinema,nomeShopping) values (2,"CineMais","Shopping Barra");
insert into cinema (id,nomeCinema,nomeShopping) values (3,"CineMais","Shopping Paralela");
insert into cinema (id,nomeCinema,nomeShopping) values (4,"CineMais","Shopping da Bahia");

insert into filme (idfilme,titulo,diretor,atorPrincipal,duracao,faixaEtaria,Categoria) 
values (1,"Vingadores Ultimato","Stan lee","Aron Man","3h10m",16,"Ação");
insert into filme (idfilme,titulo,diretor,atorPrincipal,duracao,faixaEtaria,Categoria) 
values (2,"Piratas do Caribe","Ronaldo","Johnny Depp","2h10m",16,"Ação");
insert into filme (idfilme,titulo,diretor,atorPrincipal,duracao,faixaEtaria,Categoria) 
values (3,"Velozes e Furiosos","Arnaldo","Braya","2h50m",14,"Ação");
insert into filme (idfilme,titulo,diretor,atorPrincipal,duracao,faixaEtaria,Categoria) 
values (4,"Star Wars","George","Hayden","2h30m",14,"Ação");
insert into filme (idfilme,titulo,diretor,atorPrincipal,duracao,faixaEtaria,Categoria) 
values (5,"Lalaland","Junin","Emma Stone","2h",14,"Musical");
insert into filme (idfilme,titulo,diretor,atorPrincipal,duracao,faixaEtaria,Categoria) 
values (6,"Sonic","Cleiton","Jim Carry","2h20m",12,"Infantil");

insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (1,50,false,"Sala 2d padrao",1,1);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (2,50,true,"Sala 3d c oclin",1,2);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (3,50,true,"Sala 3d c oclin",1,3);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (1,50,false,"Sala 2d padrao",2,4);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (2,50,true,"Sala 3d c oclin",2,5);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (3,50,true,"Sala 3d c oclin",2,6);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (1,50,false,"Sala 2d padrao",3,7);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (2,50,true,"Sala 3d c oclin",3,8);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (3,50,true,"Sala 3d c oclin",3,9);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (1,50,false,"Sala 2d padrao",4,10);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (2,50,true,"Sala 3d c oclin",4,11);
insert into sala (numero,capacidade,sala3d,descricao,cinemaId,salaId) 
values (3,50,true,"Sala 3d c oclin",4,12);

/* Aqui sao sessoes para o shopping salvador - salas c id 1 2 3*/
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (1,"14:30",1,1,"2022-07-08",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (2,"16:30",1,2,"2022-07-08",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (3,"15:00",2,3,"2022-07-08",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (4,"19:30",2,3,"2022-07-08",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (5,"19:30",3,1,"2022-07-08",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (6,"19:30",3,2,"2022-07-08",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (7,"14:30",1,1,"2022-07-09",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (8,"16:30",1,2,"2022-07-09",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (9,"15:00",2,3,"2022-07-09",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (10,"19:30",2,3,"2022-07-09",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (11,"19:30",3,1,"2022-07-09",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (12,"19:30",3,2,"2022-07-09",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (13,"14:30",1,1,"2022-07-10",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (14,"16:30",1,2,"2022-07-10",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (15,"15:00",2,3,"2022-07-10",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (16,"19:30",2,3,"2022-07-10",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (17,"19:30",3,1,"2022-07-10",1);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (18,"19:30",3,2,"2022-07-10",1);


/* Aqui sao sessoes para o shopping barra - salas c id 4 5 6*/
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (19,"15:30",4,4,"2022-07-08",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (20,"17:30",4,5,"2022-07-08",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (21,"16:00",5,6,"2022-07-08",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (22,"20:30",5,6,"2022-07-08",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (23,"22:30",6,4,"2022-07-08",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (24,"18:30",6,5,"2022-07-08",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (25,"15:30",4,4,"2022-07-09",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (26,"17:30",4,5,"2022-07-09",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (27,"16:00",5,6,"2022-07-09",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (28,"20:30",5,6,"2022-07-09",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (29,"22:30",6,4,"2022-07-09",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (30,"18:30",6,5,"2022-07-09",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (31,"15:30",4,4,"2022-07-10",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (32,"17:30",4,5,"2022-07-10",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (33,"16:00",5,6,"2022-07-10",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (34,"20:30",5,6,"2022-07-10",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (35,"22:30",6,4,"2022-07-10",2);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (36,"18:30",6,5,"2022-07-10",2);

/* Aqui sao sessoes para o shopping paralela - salas c id 7 8 9*/
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (37,"14:30",1,7,"2022-07-08",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (38,"16:30",1,8,"2022-07-08",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (39,"15:00",4,9,"2022-07-08",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (40,"19:30",4,9,"2022-07-08",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (41,"19:30",5,7,"2022-07-08",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (42,"19:30",5,8,"2022-07-08",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (43,"14:30",1,7,"2022-07-09",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (44,"16:30",1,8,"2022-07-09",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (45,"15:00",4,9,"2022-07-09",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (46,"19:30",4,9,"2022-07-09",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (47,"19:30",5,7,"2022-07-09",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (48,"19:30",5,8,"2022-07-09",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (49,"14:30",1,7,"2022-07-10",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (50,"16:30",1,8,"2022-07-10",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (51,"15:00",4,9,"2022-07-10",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (52,"19:30",4,9,"2022-07-10",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (53,"19:30",5,7,"2022-07-10",3);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (54,"19:30",5,8,"2022-07-10",3);

/* Aqui sao sessoes para o shopping da bahia - salas c id 10 11 12*/
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (55,"14:30",1,1,"2022-07-08",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (56,"16:30",1,2,"2022-07-08",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (57,"15:00",2,3,"2022-07-08",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (58,"19:30",2,3,"2022-07-08",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (59,"19:30",3,1,"2022-07-08",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (60,"19:30",3,2,"2022-07-08",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (61,"14:30",1,7,"2022-07-09",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (62,"16:30",1,8,"2022-07-09",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (63,"15:00",4,9,"2022-07-09",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (64,"19:30",4,9,"2022-07-09",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (65,"19:30",5,7,"2022-07-09",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (66,"19:30",5,8,"2022-07-09",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (67,"14:30",1,7,"2022-07-10",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (68,"16:30",1,8,"2022-07-10",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (69,"15:00",4,9,"2022-07-10",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (70,"19:30",4,9,"2022-07-10",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (71,"19:30",5,7,"2022-07-10",4);
insert into sessao (numero,horario,filmeId,salaId,data,cinemaId) values (72,"19:30",5,8,"2022-07-10",4);
