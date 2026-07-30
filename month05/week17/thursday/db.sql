drop table if exists books;
drop table if exists customers;


create table authors (
	id serial primary key,
	name varchar(255)
);


create table books(
	id serial primary key,
	title text,
	author_id int
);

alter table
books
add constraint fk_books_author
foreign key(author_id)
references authors(id)
	--on delete cascade
	on delete set null;
	--on delete restrict

INSERT INTO authors VALUES
(1, 'Tolstoy'), (2, 'Orwell'), (3, 'Austen');

INSERT INTO books VALUES
(101, 'War and Peace', 1),
(102, '1984', 2),
(103, 'Animal Farm', 2),
(104, 'Mystery Book', NULL);

select * from authors;
select * from books;

-- LEFT JOIN books to authors
select * from books b
left join authors a
on a.id = b.author_id ;

-- left join authors to books
select * from authors a
left join books b
on a.id = b.author_id ;

-- right join
select * from books b
right join authors a
on a.id = b.author_id ;

-- right join authors to books
select * from authors a
right join books b
on a.id = b.author_id ;

-- inner JOIN
select * from books b
inner join authors a
on b.author_id = a.id;


-- FULL JOIN / FULL OUTER JOIN
select * from books b
full outer join authors a
on a.id = b.author_id ;


-- select * from books, authors;
-- books x authors
-- CROSS JOIN
select * from books b
cross join authors a;



-- Exercises

-- Ex01
-- Country-гаас хотгүй улс байна уу харуулна уу
-- is null
select * from country c
left join city c2
on c2.country_id = c.country_id
where c2.city_id  is null;
-- Ex02
-- ямар хэрэглэгчид түрээсэлсэн бэ?
-- JOIN ашиглах
select c.first_name, r.rental_date
from rental r
join customer c
on c.customer_id  = r.customer_id
limit 10;
-- Ex03
-- Хэзээ ч түрээслэгдэж байгаагүй кинонуудын title-ийг
-- харуулна уу (LEFT JOIN)

SELECT f.title
FROM film f
LEFT JOIN inventory i ON i.film_id = f.film_id
LEFT JOIN rental r    ON r.inventory_id = i.inventory_id
WHERE r.rental_id IS NULL;

-- Ex04
-- Ажилтангүй store-уудыг оруулж харуулна уу (RIGHT JOIN)
-- staff_id, name, store_id харуулах
select * from staff st
right join store so
on st.store_id = so.store_id;

-- Ex05
-- кинонуудын категоруудыг киноны нэр болон киноныг хэдэн
-- удаа түрээсэлсэнтэй нь харуулна уу
-- ACTION   | Rugrats Shakespeare  | 30 гэсэн үр дүн жишээ
-- нь гарна.

select
c."name" as category,
f.title,
count(r.rental_id) as rental_count

from category c
join film_category fc
on c.category_id  = fc.category_id
join film f
on f.film_id  = fc.film_id
left join inventory i
on i.film_id = f.film_id
left join rental r
on r.inventory_id  = i.inventory_id

group by  c."name", f.film_id
order by  c."name", rental_count desc;

-- aggregation function COUNT
select count(*) from country;

-- хэдэн хот байгаа вэ
select count(*) from city;








