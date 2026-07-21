/*
 * 2. `clubs` нэртэй table үүсгэ. Шаардлагатай баганууд:
    - `id`: Автоматаар өсдөг, Primary Key.
    - `name`: Хамгийн ихдээ 150 тэмдэгт багтах, хоосон байж болохгүй, 
    	систем дээр дахин давтагдахгүй (Unique) байх ёстой.
    - `founded_date`: Огноо хадгална. Утга өгөөгүй үед автоматаар 
    	өнөөдрийн огноог авдаг байх.
    - `is_active`: Тийм/Үгүй гэсэн төрөл. Анхны утга нь заавал TRUE байна.
 * 
 * 
 */

create table clubs (
	id SERIAL primary key,
	name varchar(150) not null unique,
	founded_date date default current_date,
	is_active boolean default true
);

CREATE TABLE members (
    id SERIAL PRIMARY KEY,
    club_id INT REFERENCES clubs(id), -- Foreign Key linking to clubs
    email VARCHAR(200) UNIQUE NOT NULL,
    full_name VARCHAR(100) NOT NULL,
    subscription_fee NUMERIC(10, 2) CHECK (subscription_fee >= 0),
    joined_at TIMESTAMPTZ DEFAULT now()
);
-- Data Definition Language (DDL)

-- 1. members table-д хамгийн ихдээ 20 тэмдэгт багтах phone гэсэн шинэ багана нэм.
ALTER TABLE members ADD COLUMN phone VARCHAR(20);

-- 2.Гадаад хэрэглэгчдийн нэр багтахгүй байгаа тул members table-ийн 
-- full_name баганын уртыг өөрчилж 250 болгож уртасга.
alter table members alter column full_name type varchar(250); 

-- 3. clubs table-д category гэсэн шинэ багана нэм 
-- (дээд тал нь 50 тэмдэгт). Хуучин байсан бүртгэлүүд 
-- алдаа заахгүйн тулд анхны утгыг (default) нь 'General' 
-- гэж өгөөд, цаашид хоосон байж болохгүй (NOT NULL) дүрэмтэй болго.
alter table clubs add column category varchar(50) default 'General' not null;

-- 4. clubs table-ийн category баганад бичигдэх үгийн урт заавал 
-- 2-оос олон тэмдэгтээс бүрдсэн байх ёстой гэсэн нэмэлт дүрэм 
-- (Constraint) шалгадаг болго.
alter table clubs add constraint check_category_length CHECK (LENGTH(category) > 2);

-- Exercise 1 chess club нээгээд түүндээ 2 гишүүн оруулна уу
-- Үр дүнгээ select ашиглан харуулна уу. Зөвхөн members хүснэгтийг ашиглаарай.
-- 1. Эхлээд 'Chess Club'-ийг үүсгэнэ
INSERT INTO clubs (name, category, is_active) 
VALUES ('Chess Club', 'Board Games', TRUE);

select * from clubs;
-- 2. Chess Club нь id = 1 гэж үүссэн гэж үзээд (эсвэл тухайн үүссэн ID-г ашиглаад) 
-- 2 гишүүн нэмнэ
INSERT INTO members (club_id, email, full_name, subscription_fee) 
VALUES 
(1, 'tushig@email.com', 'Tushig', 50000.00),
(1, 'nomin@email.com', 'Nomin', 50000.00);


select * from members;
-- members table-ийн бүх датаг нэг дор, маш хурдан хугацаанд устгаж, 
-- мөн ID-н гүйх дарааллыг буцааж 1-ээс эхэлдэг болгож шинэчил. 
-- (Санамж: DELETE FROM командыг ашиглавал мөр бүрээр нь 
-- устгах тул удаан бөгөөд ID буцаж 1-ээс эхлэхгүй. 
-- Тиймээс өөр DDL команд ашиглах хэрэгтэй).
TRUNCATE TABLE members restart identity;

-- clubs table-ийг устга. (Санамж: members table түүнээс хамааралтай 
-- (Foreign Key-тэй) байгаа тул энгийнээр устгах боломжгүй, алдаа заана. 
-- Хамааралтай бүх зүйлийг давхар хүчээр устгах тусгай түлхүүр үг ашиглаж устгана уу).
drop table clubs cascade;
select * from members;

DROP TABLE members;

DROP DATABASE club_system;

