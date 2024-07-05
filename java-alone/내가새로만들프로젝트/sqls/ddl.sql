-- 게시판 테이블

DROP TABLE webtoon;

CREATE TABLE webtoon(
	seq			NUMBER				PRIMARY KEY,		--웹툰번호
	genre		varchar2(10)		NOT NULL,			--웹툰분류
	title		varchar2(50)		NOT NULL,			--웹툰이름
	content		CLOB				NOT NULL,			--줄거리
	create_date	DATE				DEFAULT sysdate, 	--등록일자
	update_date DATE				DEFAULT sysdate,	--수정일자
	read_count	NUMBER									--조회수
);

-- 등록 SQL
COMMENT ON COLUMN webtoon.seq 			IS '웹툰 번호';
COMMENT ON COLUMN webtoon."genre" 		IS '웹툰 장르';
COMMENT ON COLUMN webtoon.title 		IS '웹툰 제목';
COMMENT ON COLUMN webtoon.content 		IS '웹툰 줄거리';
COMMENT ON COLUMN webtoon.create_date 	IS '웹툰 등록일자';
COMMENT ON COLUMN webtoon.update_date	IS '웹툰 수정일자';
COMMENT ON COLUMN webtoon.read_count 	IS '웹툰 조회수';

-- sequence 생성	: 일련번호.
CREATE SEQUENCE seq_table_no 
	   INCREMENT BY 1 -- 다음에 넣을땐 2 라는 뜻.
	   START WITH 1