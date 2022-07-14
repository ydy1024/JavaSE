package com.ydy._09图书管理案例;

import java.util.*;

/**
    目标：图书馆里系统的开发。

    业务需求分析：
        （1）查看全部书籍。query
        （2）添加书本信息。add
        （3）删除书本信息。delete
        （4）修改书本信息。update
        （5）退出系统。exit

    书本信息的结构：
        类型             书名                   价格                  作者
    -----------------------------------------------------------------------
        言情小说          《金瓶梅》              99.9                  阿猫
                        《红楼梦》               198.2                 曹雪芹
        武侠小说          《三少爷的剑》           98.2                  古龙
                        《神雕侠侣》             98.2                  金庸
    -----------------------------------------------------------------------

    分析：
        （1）定义一个书本类。
        （2）定义一个集合表示图书馆用于存储书本信息数据：Map<String,List<Book>>
        （3）展示操作界面。
        （4）完成相应功能。
     */
public class BookSystem {
    /**
        1.定义一个集合表示图书馆用于存储书本信息数据：Map<String,List<Book>>>。
        使用Map集合，键是橱柜的栏目类型名称，值是橱柜的List集合对象存储书本信息。
     */
    public static final Map<String, List<Book>> BOOK_STORE=new HashMap<>();
    private static final Scanner SYS_SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        /**
            2.展示操作界面：独立功能建议封装成方法调用 方便互相之间的逻辑调用
         */
        showCommand();
    }
    /**
     * 展示操作界面的命令
     */
    @SuppressWarnings("AlibabaSwitchStatement")
    private static void showCommand(){
        /**
         *         （1）查看全部书籍。query
         *         （2）添加书本信息。add
         *         （3）删除书本信息。delete
         *         （4）修改书本信息。update
         *         （5）退出系统。exit
         */
        System.out.println("=========================欢迎进入系统=========================");
        System.out.println("（1）查看全部书籍:query");
        System.out.println("（2）添加书本信息:add");
        System.out.println("（3）删除书本信息:delete");
        System.out.println("（4）修改书本信息:update");
        System.out.println("（5）退出系统:exit");
        System.out.print("请您输入您的操作命令：");
        String command = SYS_SCANNER.nextLine();
        //判断用户命令是想看啥
        switch (command){
            case "query":
                //查看书籍
                queryBooks();
                break;
            case "add":
                //添加书籍
                addBook();
                break;
            case "delete":
                //删除书籍
                deleteBook();
                break;
            case "update":
                //修改书籍
                updateBook();
                break;
            case "exit":
                //退出系统
                System.out.println("退出成功，期待您下次光临！");
                System.exit(0);
            default:
                System.out.println("您的命令输入错误，请重新输入！");
        }
        showCommand();
    }

    /**
        删除书籍
     */
    private static void deleteBook() {
        if (BOOK_STORE.size()==0){
            System.out.println("图书馆没有书！不能删除！");
        }else {
            queryBooks();
            System.out.println("========================欢迎进入修改书本业务=======================");
            while (true){
                System.out.println("请您输入你要删除书本的类型：");
                String type=SYS_SCANNER.nextLine();
                //1.判断是否存在该类型
                if (BOOK_STORE.containsKey(type)){
                    while (true){
                        //存在该栏目，输入修改书名
                        System.out.println("请您输入删除书本的名称：");
                        String name=SYS_SCANNER.nextLine();
                        //3.判断该栏目下是否存在该书本对象。
                        Book book=getBookByTypeAndName(type,name);
                        if (book==null){
                            System.out.println("您的书名不存在！请重新确认!");
                        }else {
                            //书名正确
                            //取出这个栏目的橱柜集合
                            List<Book> books=BOOK_STORE.get(type);
                            books.remove(book);
                            queryBooks();
                            System.out.println("删除成功！");
                            return;//结束修改的方法！
                        }
                    }
                }else {
                    //不存在该类型
                    System.out.println("您输入的类型不存在，请重新确认！");
                    deleteBook();
                }
            }
        }
    }

    /**
        修改书籍
     */
    private static void updateBook() {
        if (BOOK_STORE.size()==0){
            System.out.println("图书馆没有书！不能修改！");
        }else {
            queryBooks();
            System.out.println("========================欢迎进入修改书本业务=======================");
            while (true){
                System.out.println("请您输入修改书本的类型：");
                String type=SYS_SCANNER.nextLine();
                //1.判断是否存在该类型
                if (BOOK_STORE.containsKey(type)){
                    while (true){
                        //存在该栏目，输入修改书名
                        System.out.println("请您输入添加书本的名称：");
                        String name=SYS_SCANNER.nextLine();
                        //3.判断该栏目下是否存在该书本对象。
                        Book book=getBookByTypeAndName(type,name);
                        if (book==null){
                            System.out.println("您的书名不存在！请重新确认!");
                        }else {
                            //书名正确
                            System.out.println("请您输入书修改本的新名称：");
                            String newName=SYS_SCANNER.nextLine();
                            System.out.println("请您输入修改书本的新价格：");
                            String newPrice=SYS_SCANNER.nextLine();
                            System.out.println("请您输入修改书本的新作者：");
                            String newAuthor=SYS_SCANNER.nextLine();
                            book.setName(newName);
                            book.setPrice(Double.valueOf(newPrice));
                            book.setAuthor(newAuthor);
                            queryBooks();
                            System.out.println("修改成功！");
                            return;//结束修改的方法！
                        }
                    }
                }else {
                    //不存在该类型
                    System.out.println("您输入的类型不存在，请重新确认！");
                    updateBook();
                }
            }
        }
    }

    /**
     * 在某个栏目下，根据书名查询出这本书
     * @param type 栏目名称
     * @param name  书名称
     * @return 书本信息
     */
    public static Book getBookByTypeAndName(String type,String name){
        //1.提取栏目的橱柜,再根据栏目提取它的值
        List<Book> books=BOOK_STORE.get(type);
        for (Book book : books) {
            if (book.getName().equals(name)){
                return book;
            }
        }
        //没有这本书
        return null;
    }

    /**
        查询书籍
     */
    private static void queryBooks() {
        System.out.println("========================欢迎进入查询书本业务=======================");
        if (BOOK_STORE.size()==0){
            System.out.println("您的图书馆一本书都没有，请赶紧买书！");
        }else {
            System.out.println("类型\t\t\t\t书名\t\t\t\t价格\t\t\t\t\t作者");
            BOOK_STORE.forEach((type,books)->{
                System.out.println(type);
                //遍历该类型下的橱柜中的全部书本对象
                for (Book book : books) {
                    System.out.println("\t\t\t\t"+book.getName()+"\t\t\t"+book.getPrice()+"\t\t\t\t"+book.getAuthor());
                }
            });
        }
    }

    /**
        添加书籍
     */
    private static void addBook() {
        System.out.println("===============添加书籍中===============");
        System.out.println("请您输入添加书本的栏目：");
        String type=SYS_SCANNER.nextLine();
        //定义一个List集合用于指向栏目的橱柜
        //这个橱柜是要根据栏目是否存在来确定是用已经存在的橱柜，还是创建一个新橱柜！
        List<Book> books=null;
        //1.判断是否存在该栏目
        if (BOOK_STORE.containsKey(type)){
            //2.存在该栏目
            //直接得到该栏目存在的橱柜对象
            books=BOOK_STORE.get(type);

        }else {
            //3.该栏目是第一次添加。
            //为该栏目添加一个橱柜对象（List<Book>）
            books=new ArrayList<>();
            //新橱柜和新栏目必须手工加入图书馆
            BOOK_STORE.put(type,books);
        }
         System.out.println("请您输入添加书本的名称：");
         String name=SYS_SCANNER.nextLine();
         System.out.println("请您输入添加书本的价格：");
         String price=SYS_SCANNER.nextLine();
         System.out.println("请您输入添加书本的作者：");
         String author=SYS_SCANNER.nextLine();
         //定义一个书本对象封装用户输入的书本信息。
         Book book = new Book(name,Double.valueOf(price),author);
         books.add(book);
        System.out.println("您添加在"+type+"下的书本"+book.getName()+"成功！");
    }
}
