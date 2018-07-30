create table newsartcile_data (
	articleId LONG not null primary key,
	author VARCHAR(75) null,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	status INTEGER,
	createDate DATE null,
	editorComment VARCHAR(75) null,
	updateDate DATE null,
	authorId LONG
);

create table usercomment_data (
	commentId LONG not null primary key,
	articleId LONG,
	author VARCHAR(75) null,
	commentContent VARCHAR(75) null,
	createDate DATE null,
	authorImageId LONG,
	commentTitle VARCHAR(75) null,
	imageUrl VARCHAR(75) null
);