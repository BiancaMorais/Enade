create database enade;

use enade;

create table usuario(
	idUsuario bigint not null auto_increment primary key,
    nomeUsuario varchar(45) default null,
    emailUsuario varchar(255) default null,
    tipoUsuario varchar(9) default null comment 'Só aceitar valores de aluno e professor',
    senhaUsuario varchar(30) default null
);

create table prova(
	idProva bigint not null auto_increment primary key,
    dataProva int default null comment 'Ano da prova'
);

create table questao(
	idQuestao bigint not null auto_increment primary key,
    tipoQuestao enum('Discursiva Geral', 'Objetiva Geral', 'Discursiva Especifica', 'Objetiva Especifica') default null,
    descricaoQuestao varchar(45) default null,
    alternativaA varchar(45) default null,
    alternativaB varchar(45) default null,
    alternativaC varchar(45) default null,
    alternativaD varchar(45) default null,
    alternativaE varchar(45) default null,
    questaoCorreta enum('A', 'B', 'C', 'D', 'E', 'Discursiva') default null,
    estadoQuestao enum('Anulado', 'Validado', 'Analise') default null
);

create table provaQuestao(
	idProvaQuestao bigint not null auto_increment primary key comment 'Selecionar quais questões vão entrar em quais provas',
    idProva bigint default null,
    idQuestao bigint default null,
    constraint fk_pq_prova foreign key(idProva) references prova(idProva)
    on delete cascade on update cascade,
    constraint fk_pq_questao foreign key(idQuestao) references questao(idQuestao)
    on delete cascade on update cascade
);

create table resultado(
	idResultado bigint not null auto_increment primary key,
    valorObtido double default null,
    idProva bigint default null,
    idUsuario bigint default null,
    constraint fk_resultado_prova foreign key(idProva) references prova(idProva)
    on delete cascade on update cascade,
    constraint fk_resultado_usuario foreign key(idUsuario) references usuario(idUsuario)
    on delete cascade on update cascade
);

insert into usuario (nomeUsuario, emailUsuario, tipoUsuario, senhaUsuario) 
values ('Professor', 'prof@gmail.com', 'Professor', 'prof123');

