CREATE TABLE public.student
(
    id integer NOT NULL,
    firstname character varying(50) NOT NULL,
    surname character varying(50) NOT NULL,
    age integer NOT NULL,
    sex character(1) NOT NULL,
 CONSTRAINT student_pkey PRIMARY KEY (id)

);


INSERT INTO public.student
 VALUES (1,'Vasyl','Marvin',20,'M')
 ,(2,'Petro','Barabash',60,'M')
 ,(3,'Oleg','Lesiv',19,'M')
 ,(4,'Bodya','Pavuk',40,'M')
 ,(5,'Olya','Stakhiv',20,'F');



CREATE TABLE public.address
(
    id integer NOT NULL,
    student_id integer NOT NULL,
    home_addr character varying(50) NOT NULL,
 university_addr character varying(50) NOT NULL,
 CONSTRAINT address_pkey PRIMARY KEY (id),
 CONSTRAINT address_student_id_fkey FOREIGN KEY (student_id)
         REFERENCES public.student (id) MATCH FULL
);



INSERT INTO public.address
 VALUES (1,1,'Rubchaka St., 21 , Lviv , Ukraine','Universytetska St., 1 , Lviv , Ukraine'),
 (2,3,'Chornovola St., 22 , Lviv , Ukraine','Universytetska St., 1 , Lviv , Ukraine'),
 (3,5,'Antonycha St., 37 , Lviv , Ukraine','Universytetska St., 1 , Lviv , Ukraine');
