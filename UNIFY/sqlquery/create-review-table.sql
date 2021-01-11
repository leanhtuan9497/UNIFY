use UNIFY

create table [Review](
	review_id bigint not null,
	username varchar(50),
	email varchar(50),
	product_id int references Product(id),
	stars int,
	review_message varchar(max),
	primary key(review_id)
)