package mao.after;

/**
 * Project name(项目名称)：java设计模式_依赖倒转原则
 * Package(包名): mao.after
 * Class(类名): AMDCpu
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/9
 * Time(创建时间)： 22:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class AMDCpu implements Cpu
{

    @Override
    public void run()
    {
        System.out.println("使用AMD处理器");
    }
}
