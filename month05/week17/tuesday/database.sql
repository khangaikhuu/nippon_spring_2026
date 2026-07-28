CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(100),
    price NUMERIC(10, 2),
    published_year INT
);

INSERT INTO books (title, author, price, published_year) VALUES
    ('Clean Code', 'Robert Martin', 45000, 2008),
    ('The Pragmatic Programmer', 'Andy Hunt', 52000, 1999),
    ('Design Patterns', 'Gang of Four', 61000, 1994),
    ('Refactoring', 'Martin Fowler', 48000, 2018),
    ('Head First Java', 'Kathy Sierra', 39000, 2022);


select * from books;

-- Design Patterns ном дээр хямдрал зарлагдаа 55,000 болсон байна
-- үнийг нь өөрчилье

update books set price = 55000 where id = 3;

-- Andy Hunt-ийн ном нь 55000 болж өөрчлөгдсөн байна. 
update books set price = 55000 where id = 3;
-- Kathy Sierra-гийн ном нь 2023 онд гарсан байна. Алдааг засна уу
update books set published_year = 2023 where id = 5;
-- Gang of Four-ийн дараагийн  Edition гарсан байна. Тэрнийг 4th Edition нэмж
-- өөрчлөх. 
update books set title = 'Design Patterns 4th Edition' where id = 3;
-- Шинээр Spring Boot up & running гэдэг ном номын сангийн өгөгдөл дээр нэмье
-- Mark Heckler 2021 оны 2 сарын 5нд гарсан байна. Үнэ нь 50000 байна.
insert into books  (title, author, price , published_year)
values 
('Spring Boot up & running', 'Mark Heckler', 50000, 2021);
-- Дараа нь бид нар буруу нэрээр оруулснаа мэдсэн байна. Үнийг нь бас өөрчлөх 
-- ёстой болсон. Шинэ үнэ нь 60000. Spring Boot Up & Running гэж нэрлэх хэрэгтэй
-- байсан байна.

update books set title = 'Spring Boot Up & Running', price = 60000 where 
id = 6;

-- DELETE data

delete from books where id = 5;

select * from books;

-- 4, 2-ийг устгана уу.
delete from books where id = 4;
delete from books where id = 2;