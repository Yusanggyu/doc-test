Markdown prac
===============

Text Format
-----------
```
1. _italics_
2. **bold**
3. **_bold and italics_**
```
_italics_  
**bold**  
**_bold and italics_**  

Header
------
```
### Header three
#### Header four
##### Header five
###### Header six
```
### Header three
#### Header four
##### Header five
###### Header six  

Links
-----
```
[**Tutorial**(markdown)](markdowntutorial.com)
Email: <os22_10517@g.cnees.kr>
```
[**Tutorial**(markdown)](markdowntutorial.com)  
Email: <os22_10517@g.cnees.kr>  

Images
------
```
<img src="/path/to/image.png" width="40%" height="30%" title="px size" alt="Github"></img>
```
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Font_Awesome_5_brands_github.svg/1200px-Font_Awesome_5_brands_github.svg.png" width="40%" height="30%" title="px size" alt="Github"></img>  

Blockquotes
-----------
```
> That's the standard for those who have experienced the original work.
```
> That's the standard for those who have experienced the original work.

Lists
-----
```
* Programing Language
  * _Can Use_
    * Python
    * C
    * Java
  * _Want To Learn_
    * TypeScript
    * HTML / CSS
    * Etc..
```
* Programing Language
  * _Can Use_
    * Python
    * C
    * Java
  * _Want To Learn_
    * TypeScript
    * HTML / CSS
    * Etc..

Break
-----
### _Hard Break_
```
Hard
Break

Test
```
Hard
Break

Test
### _Soft Break_
( 0 = " " )
```
Soft00
break00
test
```
Soft  
break  
test

Use special
-----------
### "\\"
```
* None backslash

\* Backslash
### None backslash
\### Backslash
```
* None backslash

\* Backslash
### None backslash
\### Backslash


# API 문서
## 전체 루트 구조
```md
* 사용자에게 보여지는 영역
* 이 루트는 사용자에게 보여주기만 해야 함
  데이터를 쓰는 것과 같은 작업은 API에서만 수행하도록 작성할 것.
/board/
  /<board_id>/
    /.
    /<post_id>
    /popular
    /recent
    /write
/chat/
  /user/<user_id>
  /group/<group_id>
/user/
  /register
  /login
  /logout
  /profile
  /settings
/util/
  /timetable/
    /create
    /get
  /grade_calculator

---
* 사용자에게 보여지지 않는 영역
* API 문서 작성 시 이 루트 기준으로 작성
/API
  /board
    /<board_id>
    /<post_id>
      /popular
      /recent
    /write
  /chat
    /user/<user_id>    (ws)
    /group/<group_id>  (ws)
  /user
    /register
    /login
    /logout
    /profile
  /util
    /timetable
    /grade_calculator
```


## API 루트
### board

- `write | POST` : 새로운 게시글 작성
    **성공 시**
    `200` 반환
    
    **실패 시**
    `400` : 게시판 분류가 잘못되었을 경우
    `403` : 게시글을 쓸 권한이 없을 경우
    
- `<board_id> | GET` : 최근 올라온 게시글 목록을 가져옴
    **성공 시**
    `200` 반환
    
    **실패 시** 
    `404` : 게시판이 존재하지 않을 경우
    
    **가능한 쿼리**
    `amount (int)` : 가져올 글의 개수, 기본값: 25
    `posted_by (int)` : 작성자 필터, 작성자 ID로 검색
    ---
    
    **하위 루트**
    - `<post_id>`
        - `GET` : 게시글 가져오기
            **성공 시**
            `200` 반환
            
            **실패 시**
            `404` : 게시글이 존재하지 않을 경우
            
        - `PATCH` : 게시글 수정
            **성공 시**
            `200` 반환
            
            **실패 시**
            `403` : 작성자가 아닐 경우
            `404` : 게시글이 존재하지 않을 경우
            
        - `DELETE` : 게시글 삭제
            **성공 시**
            `200` 반환
            
            **실패 시**
            `403` : 작성자 / 관리자가 아닐 경우
            `404` : 게시글이 존재하지 않을 경우
            
        
    - `popular | GET` : 인기순으로 게시글 목록 가져오기
        **성공 시**
        `200` 반환
        
        **실패 시**
        `404` : 게시판이 존재하지 않을 경우
### chat
### user
### util


## 기타 참고 자료

- [테이블 스키마](https://github.com/oshs-17th-sc-dep-of-ai/Ohsung-ETA-Server/wiki/%EA%B8%B0%ED%83%80:-%ED%85%8C%EC%9D%B4%EB%B8%94-%EC%8A%A4%ED%82%A4%EB%A7%88)
