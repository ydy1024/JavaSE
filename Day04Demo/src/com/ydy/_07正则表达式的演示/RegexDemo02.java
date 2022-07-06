package com.ydy._07正则表达式的演示;

/**
    目标：深入学习正则表达式的写法

    字符类
        [abc] a、b或c（简单类）
        [^abc] 任何字符，除了a、b或c（否定）
        [a-zA-Z]a到z或A到Z，两头的字母包括在内(范围)
        [a-d[m-p]]a到d或m到p：[a-dm-p]（并集）
        [a-z&&[def23]]d、e或f（交集）
        [a-z&&[^bc]]a到z，除了b和c：[ad-z](减去)
        [a-z&&[^m-p]]a到z,而非m到p：[a-lq-z](减去)
    预定义字符类
    . 任何字符
    \d 数字：[0-9]
    \D 非数字：[^0-9]
    \s空白字符：[\t\n\x0B\f\r]
    \S非空白字符：[^\s]
    \w单词字符：[a-zA-Z_0-9]
    \W非单词字符：[^\w]
 以上正则表达式只能校验单个字符

 Greedy 数量词
    x?x,一次或一次也没有
    x*x，零次或多次
    x+x，一次或多次
    x{n}x,恰好n次
    x{n，}x，至少n次
    x{n,m}x，至少n次，但是不超过m次

 */
public class RegexDemo02 {
    public static void main(String[] args) {
        // public boolean matches:判断是否与正则表达式匹配，匹配返回true
        System.out.println("a".matches("[abc]"));
        System.out.println("a".matches("[^abc]"));

        System.out.println("a".matches("\\d"));
        System.out.println("3".matches("\\d"));
        System.out.println("b".matches("\\w"));
        System.out.println("2".matches("\\w"));

        //校验密码
        //必须是数字字母下划线，至少6位

        System.out.println("ssds3c".matches("\\w{6,}"));
        //验证。必须是数字和字符 必须是四位
        System.out.println("ds4w".matches("[a-zA-Z0-9]{4}"));
    }
}
