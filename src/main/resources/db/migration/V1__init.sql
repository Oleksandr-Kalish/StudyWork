CREATE TABLE Conference(
id LONG  AUTO_INCREMENT  PRIMARY KEY,
nameConf varchar(100) NOT NULL,
memberCount LONG NOT NULL,
theme varchar(100) NOT NULL,
dateConf date  NOT NULL
)