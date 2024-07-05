-- 게시판 테이블

DROP TABLE board;

CREATE TABLE board(
	seq				NUMBER			PRIMARY KEY, 	-- 게시판 번호
	title			VARCHAR2(300)	NOT NULL,		-- 게시판 제목
	content 		CLOB			NOT NULL,		-- 게시판 내용
	create_date		DATE			DEFAULT sysdate,-- 게시판 등록일자(값이 없으면 현재 날짜로 등록이 됨.)
	read_count		NUMBER							-- 게시판 조회수				
);

-- comment 등록 sql
COMMENT ON COLUMN board.seq IS '게시판 번호';
COMMENT ON COLUMN board.TITLE IS '게시판 제목';
COMMENT ON COLUMN board.CONTENT IS '게시판 내용';
COMMENT ON COLUMN board.CREATE_DATE IS '게시판 등록일자';
COMMENT ON COLUMN board.READ_COUNT IS '게시판 조회수';

-- sequence 생성	: 일련번호.
CREATE SEQUENCE seq_board_no 
	   INCREMENT BY 1 -- 다음에 넣을땐 2 라는 뜻.
	   START WITH 1
;

CREATE TABLE member(
	seq				NUMBER			PRIMARY KEY,
	name			VARCHAR2(300)	NOT NULL,
	create_DATE		DATE			DEFAULT sysdate
);

--수정일자 컬럼 추가
ALTER TABLE board ADD update_date DATE; -- 추가적으로 저 위에 테이블에 넣을 순 없고 새로 만들어야 함.

--board와 member 테이블간의 fk 설정
ALTER TABLE board ADD CONSTRAINT fk_board_member
FOREIGN KEY(member_seq) REFERENCES member(seq)
;