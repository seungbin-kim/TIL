# 텍스트 관련 태그

- 최근의 웹 트랜드는 텍스를 줄이고 이미지나 동영상 등으로 콘텐츠를 구성하는 것이지만 HTML 콘텐츠의 대부분은 텍스트로 구성된다.
- 제목이나 본문, 글자의 형태와 중요도를 나타내는 텍스트에 관련된 태그들

# 제목 (Headings) 태그

- Heading 태그는 제목을 나타낼 때 사용하며 h1에서 h6까지의 태그가 있다.
  - h1이 가장 중요한 제목을 의미하며 글자의 크기도 가장 크다.
  - 시맨틱 웹의 의미를 살려서 제목 이외에는 사용하지 않는 것이 좋다.
    - 검색 엔진은 제목 태그를 중요한 의미로 받아들이 가능성이 크므로.

```html
<!DOCTYPE html>
<html>
    <body>
        <h1>heading 1</h1>
        <h2>heading 2</h2>
        <h3>heading 3</h3>
        <h4>heading 4</h4>
        <h5>heading 5</h5>
        <h6>heading 6</h6>
    </body>
</html>
```

![](./img/headings.PNG)

# 글자 형태 (Text Formatting) 태그

## b

- bold체를 지정한다.
- 제목 태그와 같이 의미론적(Semantic) 중요성의 의미는 없다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>This text is normal</p>
        <b>This text is bold</b>
        <p style="font-weight: bold;">This text is bold</p>
    </body>
</html>
```

![](./img/bold.PNG)

## strong

- b tag와 동일하게 bold체를 지정한다.
- 하지만 의미론적(Semantic) 중요성의 의미를 갖는다.
- 표현되는 외양은 b tag와 동일하지만 웹표준을 준수하고자 한다면 strong을 사용하는 것이 바람직하다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>This text is normal</p>
        <strong>This text is strong</strong>
    </body>
</html>
```

![](./img/strong.PNG)

## i

- Italic체를 지정한다.
- 의미론적(Semantic) 중요성의 의미는 없다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>This text is normal</p>
        <i>This text is italic.</i>
        <p style="font-style: italic;">This text is italic</p>
    </body>
</html>
```

![](./img/italic.PNG)

## em

- emphasized(강조, 중요한) text를 지정한다.
- i tag와 동일하게 Italic체로 표현된다.
- 의미론적(Semantic) 중요성의 의미를 갖는다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>This text is normal.</p>
        <em>This text is emphasized.</em>
    </body>
</html>
```

![](./img/em.PNG)

## small

- small text를 지정한다.

```html
<!DOCTYPE html>
<html>
    <body>
        <h2>HTML <small>Small</small> Formatting</h2>
    </body>
</html>
```

![](./img/small.PNG)

## mark

- highlighted text를 지정한다.

```html
<!DOCTYPE html>
<html>
    <body>
        <h2>HTML <mark>Marked</mark> Formatting</h2>
    </body>
</html>
```

![](./img/mark.PNG)

## del

- deleted (removed) text를 지정한다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>The del element represents deleted (removed) text.</p>
        <p>My favorite color is <del>blue</del> red.</p>
    </body>
</html>
```

![](./img/del.PNG)

## ins

- inserted (added) text를 지정한다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>The ins element represent inserted (added) text.</p>
        <p>My favorite <ins>color</ins> is red.</p>
    </body>
</html>
```

![](./img/ins.PNG)

## sub / sup

- sub 태그는 subscripted(아래에 쓰인) text를 sup 태그는 superscripted(위에 쓰인) text를 지정한다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>This is <sub>subscripted</sub> text.</p>
        <p>This is <sup>superscripted</sup> text.</p>
    </body>
</html>
```

![](./img/sub_sup.PNG)

# 본문 태그

## p

- 단락 (Paragraphs)을 지정한다.

```html
<!DOCTYPE html>
<html>
    <body>
        <h1>This is a heading</h1>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit.</p>
        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit.?</p>
    </body>
</html>
```

![](./img/p.PNG)

## br

- br tag는 (강제)개행 (line break)을 지정한다.
- br tag는 빈 요소(empty element)로 종료태그가 없다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>This is<br>a para<br>graph with line breaks.</p>
    </body>
</html>
```

![](./img/br.PNG)

- HTML에서는 1개 이상의 연속된 공백(space)을 삽입하여도 1개의 공백으로 표시된다.
- 1개 이상의 연속된 줄바꿈(enter)도 1개의 공백으로 표시된다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>HTML은 1개 이상의 연속된 공백(space)과 1개 이상의 연속된 줄바꿈(enter)을 1개의 공백으로 표시한다.</p>
        <p>
            var myArray = [];
            console.log(myArray.length); // 0

            myArray[1000] = true; // [ , , ... , , true]

            console.log(myArray.length); // 1001
            console.log(myArray[0]);    // undefined
        </p>
    </body>
</html>
```

![](./img/br2.PNG)

- 연속적 공백을 삽입하는 방법

```html
<!DOCTYPE html>
<html>
    <body>
        <p>This is&nbsp; a para&nbsp; &nbsp; graph</p>
    </body>
</html>
```

![](./img/nbsp.PNG)

## pre

- 형식화된(preformatted) text를 지정한다.
- pre 태그 내의 content는 작성된 그대로 브라우저에 표시된다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>HTML은 1개 이상의 연속된 공백(space)과 1개 이상의 연속된 줄바꿈(enter)을 1개의 공백으로 표시한다.</p>
        <pre>
var myArray = [];
console.log(myArray.length); // 0

myArray[1000] = true; // [ , , ... , , true]

console.log(myArray.length); // 1001
console.log(myArray[0]);    // undefined
        </pre>
    </body>
</html>
```

![](./img/pre.PNG)

## hr

- 수평줄을 삽입한다.

```html
<!DOCTYPE html>
<html>
    <body>
        <h1>HTML</h1>
        <p>HTML is a language for describing web pages.</p>
        <hr>
        <h1>CSS</h1>
        <p>CSS defines how to display HTML elements.</p>
    </body>
</html>
```

![](./img/hr.PNG)

## q

- 짧은 인용문(quotation)을 지정한다.
- 브라우저는 인용부호(큰따옴표/quotation marks)로 q 요소를 감싼다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>Browsers usually insert quotation marks around the q element.</p>
        <p>WWF's goal is to: <q>Build a future where people live in harmony with nature.</q></p>
    </body>
</html>
```

![](./img/q.PNG)

## blockquote

- 긴 인용문 블록을 지정한다.
- 브라우저는 blockquote 요소를 들여쓰기 한다.
- css를 이용하여 다양한 style을 적용할 수 있다.

```html
<!DOCTYPE html>
<html>
    <body>
        <p>Browsers usually indent blockquote elements.</p>
        <blockquote>
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Nostrum voluptatem provident similique nisi necessitatibus fuga inventore molestiae libero animi, impedit ex, cum, illum numquam. Molestias quisquam blanditiis ab ut magni?</p>
        </blockquote>
    </body>
</html>
```

![](./img/blockquote.PNG)