INSERT INTO board(seq, title, CONTENT, CREATE_DATE, READ_COUNT)
VALUES(seq_board_no.NEXTVAL, '제목입니다1', '내용입니다1', sysdate, 0);
INSERT INTO board(seq, title, CONTENT, READ_COUNT)
VALUES(seq_board_no.NEXTVAL, '제목입니다2', '내용입니다2', 0);
INSERT INTO board(seq, title, CONTENT)		--readcount를 뺴도 낫널이기 떄문에 가능.
VALUES(seq_board_no.NEXTVAL, '제목입니다3', '내용입니다3');


SELECT * FROM board;