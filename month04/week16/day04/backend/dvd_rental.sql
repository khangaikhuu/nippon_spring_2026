select * from actor;

-- зөвхөн баганыг сонгох
select first_name from actor;

select first_name, last_name from actor;

-- First Name  | Last name
-- Khangaikhuu | Uvgunkhuu
-- Alias
select first_name as "First Name", last_name "Last Name" from actor;

-- Exercises
-- city хүснэгтээс нэр болон id-гаар бүх утгы харуулна уу
select city_id, city from city;
-- country-гийн зөвхөн нэрээр нь бүх утгыг харуул
select country  from country;
-- film-ийн бүх датаг харуул
select * from film;

-- LIMIT
-- 10-мөрийг нь авах
select * from country limit 10;

-- ORDER BY
-- 
select * from country order by country asc limit 10;

-- эхний 10 хотыг дугаараар нь багаас нь их лүү эрэмбэлж харуулах
select * from city order by city_id asc limit 10;
-- сүүлчийн 20 киног нэрээр нь үсгийн дарааллаар буурахаар харуулна уу
select *  from film order by title desc limit 20;

-- Жүжигчний нэрийг бүтнээр нь нэг баганад харуулъя
select first_name || ' ' || last_name as "Full Name" from actor;

-- DISTINCT
select DISTINCT first_name from actor;

/**
 * SELECT
  		select_list
	FROM
  		table_name
	WHERE
  		condition
	ORDER BY
  		sort_expression;
  */
select * from country;
-- country-гаас Afganistan гэдэг улс байна уу
select * from country where country  = 'Afghanistan';


-- Warren гэдэг нэртэй бүх жүжигчдийг ялгаж харуул
select * from actor where first_name  = 'Warren';
-- Exercises
-- R rating-тэй бүх киноны title, description, rating харуул
select title, description, rating from film where rating = 'R';
-- customer-ийн first name, last name, email ийг харуулахдаа зөвхөн active биш
-- хэрэглэгчийг харуул
select first_name, last_name, email from customer where active  = 0;
-- rental rate нь 3-аас бага кинонуудын title, болон rental rate-ийг сонгож харуулна уу

-- rental хүснэгтээс return date нь NULL байгаа түрээсүүдийн id, өдөр болон
-- хэрэглэгчийн id-гаар нь шүүж харуулна уу
select * from rental where return_date is null;

-- AND operator
-- киноны урт нь  180 минутаас их бас rental rate нь 1-ээс бага бүх кинонуудыг
-- title, length, rental_rate-ээр сонгож харуулна уу.
select title, length, rental_rate  from film where rental_rate  < 1 and length  > 180;

-- 'Allen', 'Chase', 'Davis' гэсэн овогтой бүх жүжигчдийг харуул.
-- IN 
select * from actor where last_name  in ('Allen', 'Chase', 'Davis');
-- '2007-02-15', '2007-02-16' гэсэн өдрүүд нь payment хийгдсэн payment-үүдийг
-- бүгдийг харуул.
select  payment_id , amount, payment_date from payment
where
payment_date::date in ('2007-02-15', '2007-02-16');
-- бүх кинонуудаас дугаараар нь өсөх дарааллаар харуулахдаа 
-- 1,2,3 гэсэн дугаарууд оруулахгүйгээр эхний 20 киног харуул.
select * from film where film_id not in (1, 2, 3) order by film_id asc limit 20;
-- payment-үүд дотроос id нь 17500 болон 17505 хооронд байгаа бүх төлбөрүүдийг
-- буурах дарааллаар эрэмбэлүүлж харуул.
select * from payment where payment_id between 17500 and 17505;


