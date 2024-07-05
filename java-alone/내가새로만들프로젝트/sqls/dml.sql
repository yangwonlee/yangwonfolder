INSERT INTO webtoon(seq, "genre", title, CONTENT, CREATE_DATE, UPDATE_DATE, READ_COUNT)
VALUES(seq_webtoon_no.NEXTVAL, '웹툰장르1', '웹툰제목1', '웹툰내용1', sysdate, sysdate, 0); --NEXTVAL=시퀀스에서 다음 값을 가져오고 시퀀스의 현재값증가.
INSERT INTO webtoon(seq, "genre", title, CONTENT,   READ_COUNT)
VALUES(seq_webtoon_no.NEXTVAL, '웹툰장르2', '웹툰제목2', '웹툰내용2', 0);
INSERT INTO webtoon(seq, "genre", title, CONTENT)
VALUES(seq_webtoon_no.NEXTVAL, '웹툰장르3', '웹툰제목3', '웹툰내용3');

SELECT * FROM webtoon;