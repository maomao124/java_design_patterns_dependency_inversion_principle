package mao.before;

/**
 * Project name(项目名称)：java设计模式_依赖倒转原则
 * Package(包名): mao.before
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/9
 * Time(创建时间)： 21:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        IntelCpu intelCpu = new IntelCpu();
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        KingstonMemory kingstonMemory = new KingstonMemory();

        Computer computer = new Computer();
        computer.setIntelCpu(intelCpu);
        computer.setKingstonMemory(kingstonMemory);
        computer.setXiJieHardDisk(xiJieHardDisk);

        computer.run();
    }
}
