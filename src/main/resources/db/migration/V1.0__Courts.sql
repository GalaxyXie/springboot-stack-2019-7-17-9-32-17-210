
create table criminal_case (id integer not null, criminal_date bigint not null, criminal_name varchar(255) not null, criminal_case_info_id integer, procuratorate_id integer, primary key (id));
create table criminal_case_info (id integer not null, objective_elements varchar(255) not null, subjective_elements varchar(255) not null, primary key (id));
create table procurator (id integer not null, birthday bigint not null, procuratorate_name varchar(255) not null, sex varchar(255), primary key (id));
create table procuratorate (id integer not null, procuratorate_name varchar(255) not null, primary key (id));
