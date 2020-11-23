DROP DATABASE IF EXISTS hr_data;
CREATE DATABASE hr_data;
USE hr_data;

#建立部门表
DROP TABLE IF EXISTS department;
CREATE TABLE  department(
id INT PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
bmNo VARCHAR(100) NOT NULL UNIQUE KEY COMMENT'部门编码',
bmName VARCHAR(100) NOT NULL COMMENT'部门全名称',
bmforshort  VARCHAR(100)  COMMENT'部门简称',
bmRank INT NOT NULL COMMENT'部门级别(0：总裁办、1：父级部门，2：子部门)',
address VARCHAR(100) NOT NULL COMMENT'地址',
synopsis VARCHAR(2000)  COMMENT'部门简介',
remark VARCHAR(1000) COMMENT'备注',
startUsing INT NOT NULL COMMENT'是否启用(1：启用，2：不启用)'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'部门表'; 

#建立职位类别表
DROP TABLE IF EXISTS Job_category;
CREATE TABLE  Job_category(
id INT PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
typeName CHAR(10) NOT NULL COMMENT'类型名称'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'职位类别表'; 

#职位表
DROP TABLE IF EXISTS `zhiwei`;
CREATE TABLE  `zhiwei`(
id   INT PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
zwNo  VARCHAR(100) NOT NULL UNIQUE KEY COMMENT'职位编码',
zwName  VARCHAR(100)  NOT NULL  COMMENT'职位名称',
zwbm    INT  NOT NULL  COMMENT'所属部门(外键)',
zwtype   INT  NOT NULL  COMMENT'职位类型(外键)',
DESCRIBEs  VARCHAR(1000) COMMENT'职位描述',
remark VARCHAR(1000) COMMENT'备注',
startUsing INT NOT NULL COMMENT'是否启用(1：启用，2：不启用)',
FOREIGN KEY (`zwbm`) REFERENCES `department` (`id`),
FOREIGN KEY (`zwtype`) REFERENCES `Job_category` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'职位表'; 

#职称表
DROP TABLE IF EXISTS The_title;
CREATE TABLE The_title(
id INT PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
zcNo  VARCHAR(100)  NOT NULL  UNIQUE KEY COMMENT'职称编码',
zcName VARCHAR(100)  NOT NULL COMMENT'职称名称',
zcbm   INT NOT NULL COMMENT'所属部门(外键)',
DESCRIBEs VARCHAR(1000) COMMENT '职称描述',
remark VARCHAR(1000) COMMENT'备注',
startUsing INT NOT NULL COMMENT'是否启用(1：启用，2：不启用)',
FOREIGN KEY (`zcbm`) REFERENCES `department` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'职称表'; 


#待办类型表
DROP TABLE IF EXISTS to_do;
CREATE TABLE to_do(
id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
backlogTypeName  VARCHAR(100)  NOT NULL COMMENT'待办类型名称'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'待办类型表';

#代办列表
DROP TABLE IF EXISTS daibanliebiao;
CREATE TABLE `daibanliebiao`(
 id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
  backlogTypeId     INT    NOT NULL COMMENT'待办类型(外键)',
  backlogName    VARCHAR(100)    NOT NULL COMMENT'待办任务名称',
FOREIGN KEY (`backlogTypeId`) REFERENCES `to_do` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'代办列表';



#薪酬项目表
DROP TABLE IF EXISTS compensationDemo;
CREATE TABLE compensationDemo(
 id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
   rewardNo  VARCHAR(100)  NOT NULL UNIQUE KEY COMMENT'薪酬项目代码',
   rewardName  VARCHAR(100)  NOT NULL COMMENT'薪酬项目名称',
   reward      DOUBLE(10,2)   NOT NULL COMMENT'单个项目的薪酬',
DESCRIBEs VARCHAR(3000) COMMENT'职位描述',
   startUsing     INT NOT NULL COMMENT'是否启用(1：启用，2：不启用)'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'薪酬项目表';

#薪酬标准表
DROP TABLE IF EXISTS compensationBiaozhun;
CREATE TABLE compensationBiaozhun(
 id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
  emolumentNo   VARCHAR(100)  NOT NULL   UNIQUE KEY COMMENT'薪酬标准编码',
  emolumentName    VARCHAR(100)   NOT NULL COMMENT'薪酬标准名称',
  rewardId      INT  NOT NULL COMMENT'薪酬项目(外键)',
  designer     VARCHAR(50) NOT NULL COMMENT'制定人',
  registrant    VARCHAR(50)NOT NULL COMMENT'登记人',
  creationTime  DATE       NOT NULL COMMENT'登记时间',
  esum DOUBLE(10,2) NOT NULL COMMENT'薪酬总额',
  backlogTypeId INT  NOT  NULL COMMENT'待办类型(外键)',
  auditStatus    INT    NOT NULL COMMENT'审核状态(1：起草，2：审核中，3：审核通过，4：驳回)',
FOREIGN KEY (`rewardId`) REFERENCES `compensationDemo` (`id`),
FOREIGN KEY (`backlogTypeId`) REFERENCES `to_do` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'薪酬标准表';

#人事档案库表
DROP TABLE IF EXISTS Personnel_archive;
CREATE TABLE Personnel_archive(
Id  INT PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
recordNo  VARCHAR(50)   NOT NULL  UNIQUE KEY COMMENT'档案编码',
username VARCHAR (100) NOT NULL COMMENT '用户编码',
PASSWORD VARCHAR (100) NOT NULL COMMENT '密码',
customerName VARCHAR (100) NOT NULL COMMENT '姓名',
age INT NOT NULL COMMENT '年龄',
sex VARCHAR (100) NOT NULL COMMENT '性别',
idNo VARCHAR (20) NOT NULL COMMENT '身份证号',

bmId INT NOT NULL COMMENT '部门(外键)',
zwId INT NOT NULL COMMENT '职位(用户角色)(外键)',
zcId INT  COMMENT '职称(外键)',
xueli CHAR(10) NOT NULL COMMENT '学历',
zhuanye VARCHAR(100) NOT NULL COMMENT '专业',
phone VARCHAR(100) NOT NULL COMMENT '电话',
address VARCHAR(100) NOT NULL COMMENT '地址',
eMail VARCHAR(100)  COMMENT '邮箱',
politicsStatus CHAR(10)  COMMENT '政治面貌',
usertype INT NOT NULL COMMENT '类型(1：管理员，2：非管理员)',

shStatus INT NOT NULL COMMENT'审核状态(1：起草、2：审核中、3：审核通过、4：驳回、5：变更、6：变更审核中)',
backlogTypeId INT  COMMENT'待办类型(外键)',
recordStatus INT NOT NULL COMMENT'档案状态(1：试用期，2：正式员工，3：已删除，4：离职，5：实习员工)',
remStandard   INT NOT NULL COMMENT'薪酬标准(外键)',
khBank VARCHAR(100) NOT NULL COMMENT'开户银行',
bankNo VARCHAR(100) NOT NULL COMMENT'银行卡号',
sbNo VARCHAR(100) NOT NULL COMMENT'社保卡号',
registrant VARCHAR(50)NOT NULL COMMENT'登记人(。。。面事人员？)',
creationTime  DATE  NOT NULL COMMENT'建档日期',
grlv VARCHAR(1000) COMMENT'个人履历',
family VARCHAR(1000) COMMENT'家庭关系',
remark VARCHAR(500) COMMENT'备注',

FOREIGN KEY (`backlogTypeId`) REFERENCES `to_do` (`id`),
FOREIGN KEY (`remStandard`) REFERENCES `compensationBiaozhun` (`Id`),
FOREIGN KEY (`bmId`) REFERENCES `department` (`id`),
FOREIGN KEY (`zwId`) REFERENCES `zhiwei` (`id`),
FOREIGN KEY (`zcId`) REFERENCES `The_title` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'人事档案库表'; 

#试题类型表
DROP TABLE IF EXISTS Testing_types;
CREATE TABLE Testing_types(
Id  INT PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
topic VARCHAR(100) NOT NULL COMMENT'题目类型'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'试题类型表'; 

#题库表
DROP TABLE IF EXISTS The_question_bank;
CREATE TABLE The_question_bank(
Id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
 topicName  VARCHAR(100)  NOT NULL COMMENT'题目标题',
 topicId INT NOT NULL COMMENT'题目类型(外键)',
 bmId  INT NOT NULL COMMENT'所属部门(外键)',
 topicgrade  CHAR(10)  NOT NULL COMMENT'试题级别',
topicPeople  VARCHAR(50)  NOT NULL  COMMENT'出题人',
content VARCHAR(5000)  NOT NULL  COMMENT'试题内容',
 creationTime   DATE NOT NULL COMMENT'出题时间',
 topicFile VARCHAR(100) COMMENT'试题附件',
 remark VARCHAR(500) COMMENT'备注',
 startUsing INT NOT NULL COMMENT'是否启用(1：启用，2：不启用)',
FOREIGN KEY (`topicId`) REFERENCES `Testing_types` (`Id`),
FOREIGN KEY (`bmId`) REFERENCES `department` (`Id`)
 
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'题库表'; 

#职位发布表
DROP TABLE IF EXISTS POSITION_release;
CREATE TABLE POSITION_release(
 id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
  bmId   INT  NOT NULL COMMENT'部门名称(外键)',
  zwId   INT  NOT NULL COMMENT'职位(外键)',
  zptype  INT  NOT NULL COMMENT'招聘类型(1：社会招聘，2：校园招聘)',
  zpCount  INT NOT NULL COMMENT'招聘人数',
  creator   VARCHAR(50)   NOT NULL COMMENT'发布人',
  creationTimeStart  DATE NOT NULL COMMENT'发布时间',
  creationTimeOver  DATE COMMENT'截止时间',
  DESCRIBEs    VARCHAR(3000) COMMENT'职位描述',
  CONDITIONs    VARCHAR(3000) COMMENT'招聘条件',
 FOREIGN KEY (`bmId`) REFERENCES `department` (`id`),
 FOREIGN KEY (`zwId`) REFERENCES `zhiwei` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'职位发布表'; 

#简历表
DROP TABLE IF EXISTS resumes;
CREATE TABLE resumes(
id INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
zpId   INT  NOT NULL COMMENT'职位发布表(外键)',
  acceptName  VARCHAR(50)  NOT NULL  COMMENT'应聘人姓名',
  sex  INT  NOT NULL COMMENT'性别(1:男，2:女)',
  xueli CHAR(10) NOT NULL COMMENT'学历',
school VARCHAR(100)NOT NULL COMMENT'毕业院校',
zhuanye VARCHAR(100)NOT NULL COMMENT'专业',
phone VARCHAR(100)  NOT NULL COMMENT'电话',
address VARCHAR(100) NOT NULL COMMENT'地址',
eMail VARCHAR(100) COMMENT'邮箱',
politicsStatus CHAR(10) COMMENT'政治面貌',
idNo VARCHAR(20)NOT NULL COMMENT'身份证号',
experience CHAR(10) COMMENT'工作经验(几年)',
pay INT  COMMENT'薪资要求',
onJob INT COMMENT'是否在职(1：在职，2：已离职)',
freshGraduate INT NOT NULL COMMENT'是否应届生(1：是，2：否)',
checkTime DATE COMMENT'登记时间',
grlv VARCHAR(1000) COMMENT'个人履历',
jlFile VARCHAR(100) COMMENT'简历附件',
referrer VARCHAR(50) COMMENT'推荐人',
reTime DATE COMMENT'推荐时间',
reIdea VARCHAR(500) COMMENT'推荐意见',
reStatus INT NOT NULL COMMENT'简历状态(1：存档，2：推荐面试，3：推荐二面，4：推荐三面，5：建议录用，6：录用，7：删除)',
 FOREIGN KEY (`zpId`) REFERENCES `POSITION_release` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'简历表'; 

#面试结果表
DROP TABLE IF EXISTS `The_interview_results`;
CREATE TABLE `The_interview_results`(
	id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
	reStatus  INT NOT NULL COMMENT'简历状态(外键)',
	oneInterviewer VARCHAR(100)  COMMENT'一面面试人',
	oneTime DATE COMMENT'一面时间',
	oneEvaluate VARCHAR(1000) COMMENT'一面评价',
	twoInterviewer VARCHAR(100)   COMMENT'二面面试人',
	twoTime DATE COMMENT'二面时间',
	twoEvaluate VARCHAR(1000) COMMENT'二面评价',
	threeInterviewer VARCHAR(100)  COMMENT'三面面试人',
	threeTime DATE COMMENT'三面时间',
	threeEvaluate VARCHAR(1000) COMMENT'三面评价',
	FOREIGN KEY (`reStatus`) REFERENCES `resumes` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'面试结果表'; 


#薪酬单表
DROP TABLE IF EXISTS compensationDan;
CREATE TABLE compensationDan(
  id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
  payment   VARCHAR(100)  NOT NULL   UNIQUE KEY COMMENT'薪酬单编码',
  times     INT      NOT NULL COMMENT'发放次数',
  headcount  INT     NOT NULL COMMENT'人数',
  basic       DOUBLE(7,2) COMMENT'基本薪酬总额',
  practical   DOUBLE(7,2) COMMENT'实发金额',
  grantTime  DATE COMMENT'发放时间'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'薪酬单表';


#薪酬单明细表
DROP TABLE IF EXISTS compensationMingXi;
CREATE TABLE compensationMingXi(
 id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
 recordId    INT NOT NULL COMMENT'档案编码(外键)',
 emolumentId   INT NOT NULL COMMENT'薪酬标准(外键)',
 travellingFee DOUBLE(5,2) COMMENT'出差费',
 overtimeFee    DOUBLE(5,2) COMMENT'加班费',
 deductMoney    DOUBLE(5,2) COMMENT'应扣金额',
 FOREIGN KEY (`recordId`) REFERENCES `Personnel_archive` (`id`),
 FOREIGN KEY (`emolumentId`) REFERENCES `compensationBiaozhun` (`id`)
 )ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'薪酬单明细表';
 
#薪酬单详情表
DROP TABLE IF EXISTS compensationXiangQing;
CREATE TABLE compensationXiangQing(
  id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
 branchRank INT NOT NULL COMMENT'部门（外键）',
nop INT NOT NULL COMMENT'人数',
basic DOUBLE(7,2) NOT NULL COMMENT'基本薪酬',
FOREIGN KEY (`branchRank`) REFERENCES `department` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'薪酬单详情表';


 
#培训表 
DROP TABLE IF EXISTS training;
CREATE TABLE training(
  id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
  trainName  VARCHAR(100)  NOT NULL COMMENT'培训名称',
  trainer      VARCHAR(50) NOT NULL COMMENT'培训讲师',
  trainTimeStart   DATE NOT NULL COMMENT'培训开始时间',
  trainTimeOver   DATE NOT  NULL COMMENT'培训结束时间',
  goal          VARCHAR(1000) COMMENT'培训目的',
  archiveId     INT            COMMENT '人事档案（外键）',
  participant     VARCHAR(100) COMMENT'参训人员',
  synopsis      VARCHAR(2000) COMMENT'培训简介',
  trainFile       VARCHAR(100) COMMENT'培训附件',
  trainStatus     INT COMMENT'培训状态(1：起草，2：审核中，3：审核通过，4：驳回)',
 backlogTypeId     INT    NOT  NULL COMMENT'待办类型(外键)',
  opinion        VARCHAR(2000) COMMENT'审核意见',
   feedback      INT COMMENT'培训反馈(1：优，2：良，3：差)',
  summarize      VARCHAR(2000) COMMENT'培训总结',
  result          VARCHAR(2000) COMMENT'考核结果 ',
FOREIGN KEY (`backlogTypeId`) REFERENCES `to_do` (`id`),
FOREIGN KEY (`archiveId`) REFERENCES `Personnel_archive` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'培训表';

#储备人才表
DROP TABLE IF EXISTS talent;
CREATE TABLE talent(
   id  INT  PRIMARY KEY AUTO_INCREMENT COMMENT'主键',
  fpsgName VARCHAR(100) COMMENT'储备人才姓名',
  fpsgSex CHAR(10) COMMENT'性别',
  phone VARCHAR(100) COMMENT'电话 ',
xueli CHAR(10) COMMENT'学历',
zhuanye VARCHAR(100) COMMENT'专业',
  experience CHAR(20) COMMENT'工作经验',
  whether INT COMMENT'是否应聘过本公司（1：是，2：否）'
  )ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'储备人才表';
  
  
  
 INSERT INTO department(bmNo,bmName,bmRank,address,startUsing) 
VALUES('BDQN-BM001','总裁办',0,'山东济南',1),('BDQN-BM002','市场发展部',1,'山东济南',1),
('BDQN-BM003','市场发展一部',2,'山东济南',1),('BDQN-BM004','技术研究部',1,'山东济南',1),
('BDQN-BM005','产品管理部',2,'山东济南',1),('BDQN-BM006','产品设计中心',2,'山东济南',1);


INSERT INTO Job_category(typeName) VALUES('管理'),('技术'),('实施'),('测试'),('售前'),('财务'),
('行政');

INSERT INTO zhiwei(zwNo,zwName,zwbm,zwtype,startUsing) VALUES('BDQN-ZW001','技术总监',6,2,1),
('BDQN-ZW002','技术培训师',6,2,1);

INSERT INTO The_title(zcNo,zcName,zcbm,startUsing)VALUES('BDQN-ZC001','高级技术顾问',6,1),
('BDQN-ZC002','中级技术顾问',6,1);

INSERT INTO to_do(backlogTypeName) VALUES('人事档案录入审核'),('人事档案变更'),('职位审核'),
('招聘录用审核'),('培训计划审核'),('资薪标准审核'),('资薪标准变更'),('资薪发放审核');

INSERT INTO daibanliebiao(backlogTypeId,backlogName) VALUES(1,'人事档案录入审核');

INSERT INTO compensationDemo(rewardNo,rewardName,reward,startUsing) 
VALUES('SALARY_01','基本工资',100.00,1);

INSERT INTO compensationBiaozhun(emolumentNo,emolumentName,rewardId,designer,registrant,
creationTime,esum,backlogTypeId,auditStatus) VALUES('100001','高级软件工程师',1,'tom','lilei','2020-11-23',
1000.00,6,2);

INSERT  INTO `personnel_archive`(`Id`,`recordNo`,`username`,`PASSWORD`,`customerName`,`age`,`sex`,`idNo`,`bmId`,`zwId`,`zcId`,`xueli`,`zhuanye`,`phone`,`address`,`eMail`,`politicsStatus`,`usertype`,`shStatus`,`backlogTypeId`,`recordStatus`,`remStandard`,`khBank`,`bankNo`,`sbNo`,`registrant`,`creationTime`,`grlv`,`family`,`remark`)
 VALUES (1,'BDQB-00001','admin','admin','赵高',25,'男','372819199905200829',4,2,NULL,'本科','计算机','15123432234','山东济南',NULL,NULL,1,3,NULL,2,1,'中国银行','6223626372818273984','43242543','tom','2020-11-23',NULL,NULL,NULL),(2,'BDQN-00002','zh678','zhanghua','张华',23,'男','349993435436546456',4,2,NULL,'本科','计算机','12312432432','山东济南',NULL,NULL,2,3,NULL,2,1,'工商银行','6342343242545543643','32453253','yom','2020-11-23',NULL,NULL,NULL);

INSERT  INTO `testing_types`(`Id`,`topic`) VALUES (1,'JAVA开发'),(2,'C++开发'),(3,'C#开发'),(4,'软件测试');

INSERT  INTO `the_question_bank`(`Id`,`topicName`,`topicId`,`bmId`,`topicgrade`,`topicPeople`,`content`,`creationTime`,`topicFile`,`remark`,`startUsing`) VALUES (1,'JAVA开发测试试题',1,6,'A','tom','JAVA','2020-11-23',NULL,NULL,1);

INSERT  INTO `position_release`(`id`,`bmId`,`zwId`,`zptype`,`zpCount`,`creator`,`creationTimeStart`,`creationTimeOver`,`DESCRIBEs`,`CONDITIONs`) VALUES (1,6,2,1,12,'tom','2020-11-23',NULL,NULL,NULL);

INSERT  INTO `resumes`(`id`,`zpId`,`acceptName`,`sex`,`xueli`,`school`,`zhuanye`,`phone`,`address`,`eMail`,`politicsStatus`,`idNo`,`experience`,`pay`,`onJob`,`freshGraduate`,`checkTime`,`grlv`,`jlFile`,`referrer`,`reTime`,`reIdea`,`reStatus`) VALUES (1,1,'韩寒',1,'本科','清华','商贸','15123456547','北京朝阳区',NULL,'党员','372381882348399820','2年',20000,2,2,'2020-11-23',NULL,NULL,NULL,NULL,NULL,2);

INSERT  INTO `the_interview_results`(`id`,`reStatus`,`oneInterviewer`,`oneTime`,`oneEvaluate`,`twoInterviewer`,`twoTime`,`twoEvaluate`,`threeInterviewer`,`threeTime`,`threeEvaluate`) VALUES (1,1,'tom','2020-11-23','可以录用',NULL,NULL,NULL,NULL,NULL,NULL);

INSERT  INTO `compensationdan`(`id`,`payment`,`times`,`headcount`,`basic`,`practical`,`grantTime`) VALUES (1,'HS12321',2,2,12321.00,12321.00,NULL);

INSERT  INTO `compensationxiangqing`(`id`,`branchRank`,`nop`,`basic`) VALUES (1,6,2,23333.00);

INSERT  INTO `training`(`id`,`trainName`,`trainer`,`trainTimeStart`,`trainTimeOver`,`goal`,`archiveId`,`participant`,`synopsis`,`trainFile`,`trainStatus`,`backlogTypeId`,`opinion`,`feedback`,`summarize`,`result`) VALUES (1,'人人都要会JAVA','tom','2020-11-23','2020-11-24',NULL,NULL,NULL,NULL,NULL,2,4,NULL,NULL,NULL,NULL);

INSERT  INTO `talent`(`id`,`fpsgName`,`fpsgSex`,`phone`,`xueli`,`zhuanye`,`experience`,`whether`) VALUES (1,'李胜','男','15172634372','大专','计算机','无',2);


