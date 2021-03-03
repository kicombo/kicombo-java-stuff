System.out.println()을 반복적으로 사용하게 되면
성능이 매우 떨어진다.

그래서 보통 StringBuilder를 사용한다. StringBuilder는 java.lang에 있으므로 따로 import를 하지 않아도 된다.

```java
public static StringBuilder sb = new StringBuilder()
sb.append((int)(Math.pow(2, N)-1)).append('\n');
System.out.print(sb)
```