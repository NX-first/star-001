public class contrast {
    /**
     * 对于String和StringBuffer的速度比较
     * 使用System.currentTimeMillis()来记录时间
     *LTC-2019-9-18
     */
    public static void main(String[] args) {

        long t1 =System.currentTimeMillis();//记录起始时间
        String str="1";
        for (int i = 2; i <100000 ; i++) {//拼接字符串10000次
            str+=String.valueOf(i);
        }
        long t2=System.currentTimeMillis();//记录结束时间
        System.out.println("使用字符串拼接的方式，连接10000次，耗时："+(t2-t1)/1000+"秒");//两值做差计算消耗时间
        System.out.println("================");

        long t3=System.currentTimeMillis();
        StringBuffer sb=new StringBuffer(1);
        for (int i = 2; i <100000 ; i++) {
            sb.append(i);
        }
        long t4=System.currentTimeMillis();
        System.out.println("使用字符串拼接的方式，连接10000次，耗时："+(t4-t3)/1000+"秒");


        System.out.println(str);//测试是否拼接成功字符串
        System.out.println(sb);
    }
}