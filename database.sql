/*
Navicat PGSQL Data Transfer

Source Server         : Localpostgres
Source Server Version : 90303
Source Host           : localhost:5432
Source Database       : hrdcontactlist
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90303
File Encoding         : 65001

Date: 2016-07-12 06:37:54
*/


-- ----------------------------
-- Sequence structure for sq_email
-- ----------------------------
CREATE SEQUENCE "sq_email"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 99999999999999
 START 1
 CACHE 1
 CYCLE;

-- ----------------------------
-- Sequence structure for sq_institue
-- ----------------------------
CREATE SEQUENCE "sq_institue"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 999999999999999
 START 1
 CACHE 1
 CYCLE;

-- ----------------------------
-- Sequence structure for sq_person
-- ----------------------------

CREATE SEQUENCE "sq_person"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 99999999999999999
 START 1
 CACHE 1
 CYCLE;

-- ----------------------------
-- Sequence structure for sq_phone
-- ----------------------------

CREATE SEQUENCE "sq_phone"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9999999999999999
 START 1
 CACHE 1
 CYCLE;

-- ----------------------------
-- Table structure for tbemail
-- ----------------------------
DROP TABLE IF EXISTS "tbemail";
CREATE TABLE "tbemail" (
"email_id" int4 NOT NULL,
"email_address" varchar COLLATE "default",
"email_description" varchar COLLATE "default",
"ps_id" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of tbemail
-- ----------------------------
BEGIN;
INSERT INTO "tbemail" VALUES ('1', 'kepisal@gmail.com', 'Google', '1');
INSERT INTO "tbemail" VALUES ('2', 'pisal_sal@yahoo.com', 'Yahoo', '1');
INSERT INTO "tbemail" VALUES ('3', 'sovichea.chet@gmail.com', 'Google', '2');
COMMIT;

-- ----------------------------
-- Table structure for tbhandphone
-- ----------------------------
DROP TABLE IF EXISTS "tbhandphone";
CREATE TABLE "tbhandphone" (
"ph_id" int4 NOT NULL,
"ph_number" varchar COLLATE "default",
"ph_description" int4,
"ps_id" int4 NOT NULL,
"ph_status" int2
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of tbhandphone
-- ----------------------------
BEGIN;
INSERT INTO "tbhandphone" VALUES ('1', '017 868 908', null, '1', '1');
INSERT INTO "tbhandphone" VALUES ('2', '069 272 102', null, '1', '0');
COMMIT;

-- ----------------------------
-- Table structure for tbinstitue
-- ----------------------------
DROP TABLE IF EXISTS "tbinstitue";
CREATE TABLE "tbinstitue" (
"institue_id" int4 NOT NULL,
"institue_title" varchar COLLATE "default",
"institue_address" varchar COLLATE "default",
"institue_phone" varchar COLLATE "default",
"institue_website" varchar COLLATE "default",
"institue_email" varchar COLLATE "default",
"ps_id" int4 NOT NULL,
"institue_position" varchar COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of tbinstitue
-- ----------------------------
BEGIN;
INSERT INTO "tbinstitue" VALUES ('1', 'Korea Software HRD', 'No. 12, St. 323, Boeung Kak II, Toul Kok, Phnom Penh, Cambodia', '023 991 313', 'www.kshrd.com.kh', null, '1', 'IT Instructor');
COMMIT;

-- ----------------------------
-- Table structure for tbperson
-- ----------------------------
DROP TABLE IF EXISTS "tbperson";
CREATE TABLE "tbperson" (
"ps_id" int4 NOT NULL,
"ps_lastname" varchar COLLATE "default",
"ps_firstname" varchar COLLATE "default",
"ps_gender" int2
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of tbperson
-- ----------------------------
BEGIN;
INSERT INTO "tbperson" VALUES ('1', 'Pisal', 'Ke', '1');
INSERT INTO "tbperson" VALUES ('2', 'Vichea', 'Chet', '1');
COMMIT;

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
ALTER SEQUENCE "sq_email" OWNED BY "tbemail"."email_id";
ALTER SEQUENCE "sq_institue" OWNED BY "tbinstitue"."institue_id";
ALTER SEQUENCE "sq_person" OWNED BY "tbperson"."ps_id";
ALTER SEQUENCE "sq_phone" OWNED BY "tbhandphone"."ph_id";

-- ----------------------------
-- Primary Key structure for table tbemail
-- ----------------------------
ALTER TABLE "tbemail" ADD PRIMARY KEY ("email_id");

-- ----------------------------
-- Primary Key structure for table tbhandphone
-- ----------------------------
ALTER TABLE "tbhandphone" ADD PRIMARY KEY ("ph_id");

-- ----------------------------
-- Primary Key structure for table tbinstitue
-- ----------------------------
ALTER TABLE "tbinstitue" ADD PRIMARY KEY ("institue_id");

-- ----------------------------
-- Primary Key structure for table tbperson
-- ----------------------------
ALTER TABLE "tbperson" ADD PRIMARY KEY ("ps_id");

-- ----------------------------
-- Foreign Key structure for table "tbemail"
-- ----------------------------
ALTER TABLE "tbemail" ADD FOREIGN KEY ("ps_id") REFERENCES "tbperson" ("ps_id") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "tbhandphone"
-- ----------------------------
ALTER TABLE "tbhandphone" ADD FOREIGN KEY ("ps_id") REFERENCES "tbperson" ("ps_id") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "tbinstitue"
-- ----------------------------
ALTER TABLE "tbinstitue" ADD FOREIGN KEY ("ps_id") REFERENCES "tbperson" ("ps_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
