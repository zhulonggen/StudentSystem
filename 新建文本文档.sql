USE `studnetgrade`;

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `Cno` varchar(20) NOT NULL,
  `Cname` varchar(14) DEFAULT NULL,
  `Cgrade` int(11) DEFAULT NULL,
  `Ctime` int(11) DEFAULT NULL,
  `Ctype` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`Cno`)
) 



insert  into `course`(`Cno`,`Cname`,`Cgrade`,`Ctime`,`Ctype`) values ('C001','数据库原理',4,42,'考试课'),('C002','大学物理',5,64,'考试课'),('C003','java程序设计',4,32,'考试课');



DROP TABLE IF EXISTS `sc`;

CREATE TABLE `sc` (
  `Sno` varchar(20) NOT NULL,
  `Cno` varchar(20) NOT NULL,
  `Scg` int(11) DEFAULT NULL,
  PRIMARY KEY (`Sno`,`Cno`),
  KEY `Cno` (`Cno`),
  CONSTRAINT `sc_ibfk_3` FOREIGN KEY (`Cno`) REFERENCES `course` (`Cno`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sc_ibfk_4` FOREIGN KEY (`Sno`) REFERENCES `student` (`Sno`) ON DELETE CASCADE ON UPDATE CASCADE
) 


insert  into `sc`(`Sno`,`Cno`,`Scg`) values ('00001','c001',87),('00001','C002',70),('00001','C003',70),('00002','C001',70),('00002','C002',60),('00002','C003',90),('00003','c001',70),('00003','C002',80),('00003','C003',84),('00004','C001',80),('00004','C002',78),('00004','C003',69),('00005','C001',98),('00005','C002',84),('00005','C003',80),('00006','C001',78),('00006','C002',87),('00006','C003',98);



DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `Sno` varchar(20) NOT NULL,
  `Sname` varchar(8) NOT NULL,
  `Ssex` varchar(2) DEFAULT NULL,
  `Sage` int(11) DEFAULT NULL,
  `Sdept` varchar(20) DEFAULT NULL,
  `Clno` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Sno`)
) 

insert  into `student`(`Sno`,`Sname`,`Ssex`,`Sage`,`Sdept`,`Clno`) values ('00001','李勇','男',20,'Cs','1'),('00002','李林','女',19,'MI','1'),('00003','王刚','男',21,'DB','2'),('00004','张伟','男',20,'DB','1'),('00005','赵云','男',19,'cs','2'),('00006','王芳','女',20,'DB','2');


DROP TABLE IF EXISTS `tc`;

CREATE TABLE `tc` (
  `Stno` varchar(20) NOT NULL,
  `Cno` varchar(20) NOT NULL,
  `Clno` int(11) NOT NULL,
  PRIMARY KEY (`Stno`,`Cno`),
  KEY `Cno` (`Cno`),
  CONSTRAINT `tc_ibfk_1` FOREIGN KEY (`Stno`) REFERENCES `teacher` (`Stno`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tc_ibfk_2` FOREIGN KEY (`Cno`) REFERENCES `course` (`Cno`) ON DELETE NO ACTION ON UPDATE NO ACTION
)



insert  into `tc`(`Stno`,`Cno`,`Clno`) values ('10001','C001',1),('10002','C002',1),('10003','C003',2);



DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `Stno` varchar(20) NOT NULL,
  `Stname` varchar(8) NOT NULL,
  `Stsex` varchar(2) DEFAULT NULL,
  `Stage` int(11) DEFAULT NULL,
  `Sto` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Stno`)
) 


insert  into `teacher`(`Stno`,`Stname`,`Stsex`,`Stage`,`Sto`) values ('10001','李斯','女',35,'老师'),('10002','李伟','男',40,'副教授'),('10003','张伟','男',30,'老师');


DROP TABLE IF EXISTS `userperson`;

CREATE TABLE `userperson` (
  `Susername` varchar(20) NOT NULL,
  `Spassword` varchar(20) NOT NULL,
  `Sno` varchar(8) NOT NULL,
  `SID` varchar(20) NOT NULL,
  PRIMARY KEY (`Susername`),
  UNIQUE KEY `SID` (`SID`),
  UNIQUE KEY `SID_2` (`SID`)
) 



insert  into `userperson`(`Susername`,`Spassword`,`Sno`,`SID`) values ('00001','a00001','student','00001'),('00002','a00002','student','00002'),('00003','a00003','student','00003'),('00004','a00004','student','00004'),('00005','a00005','student','00005'),('00006','a00006','student','00006'),('10001','b10001','teacher','10001'),('10002','b10002','teacher','10002'),('10003','b10003','teacher','10003'),('c001','c001','manager','001'),('c002','c002','manager','002');


use book;


INSERT into t_book(id,`name`,author,price,sales) VALUES(null,'asd','asd',23.0,23);

select id,`name`,author,price,sales from t_book LIMIT 0,6;
select id,`name`,author,price,sales from t_book LIMIT 5,5;

    select id, name bookName, price bookPrice, author bookAuthor, sales bookSales from t_book where name like '%大%' or author like '%多%';
