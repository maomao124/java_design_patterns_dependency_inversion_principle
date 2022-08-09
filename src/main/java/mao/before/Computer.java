package mao.before;

/**
 * Project name(项目名称)：java设计模式_依赖倒转原则
 * Package(包名): mao.before
 * Class(类名): Computer
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/9
 * Time(创建时间)： 21:46
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Computer
{
    private IntelCpu intelCpu;
    private KingstonMemory kingstonMemory;
    private XiJieHardDisk xiJieHardDisk;

    public Computer()
    {

    }

    public Computer(IntelCpu intelCpu, KingstonMemory kingstonMemory, XiJieHardDisk xiJieHardDisk)
    {
        this.intelCpu = intelCpu;
        this.kingstonMemory = kingstonMemory;
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public IntelCpu getIntelCpu()
    {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu)
    {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory()
    {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory)
    {
        this.kingstonMemory = kingstonMemory;
    }

    public XiJieHardDisk getXiJieHardDisk()
    {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk)
    {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public void run()
    {
        System.out.println("计算机工作");
        intelCpu.run();
        kingstonMemory.save();
        String data = xiJieHardDisk.get();
        System.out.println("从硬盘中获取的数据为：" + data);
    }
}
