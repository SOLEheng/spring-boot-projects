# 博客园Thymeleaf

## 基础语法

### **1.文本标签 th:text/th:utext**

------

用于文本内容的显示操作。

1. **th:text** 进行文本替换 不会解析html
2. **th:utext** 进行文本替换 会解析html

代码演示:

```java
    @GetMapping("/th")
    public String thTest(ModelMap modelMap) {
        String msg = "<i style=\"color: red;\">我是后端传的i标签</i>";
        modelMap.put("msg",msg);
        return "th_text";
    }
```

th_text.html页面:

```html
  <h1>
        <p th:text="'th:text标签:'+${msg}">
            p标签: th:text
        </p>
        <p th:utext="'th:utext标签:'+${msg}">
            p标签: th:utext
        </p>
    </h1>
```

结果看运行效果

```html
th:text标签:<i style="color: red;">我是后端传的i标签</i>
th:utext标签:我是后端传的i标签
```

总结: 

th:text不会解析html标签属性

th:utext会解析HTML标签属性

### 2.字符串拼接

------

拼接字符串通过 + 或者 | 进行拼接

使用 + 和 | | 效果是一样的，如下代码所示：

```html
        <p th:text="'th:text标签:'+${msg}">
            p标签: th:text
        </p>
        <p th:text="|th:text标签: ${msg}|">
            p标签: th:text
        </p>
```

### 3. *{...}和 ${...}表达式

正常情况下 *{...} 和 ${...}是一样的，但是 *{...} 一般和 **th:object** 进行一起使用来完成对象属性的简写。

代码演示:

```java

```



