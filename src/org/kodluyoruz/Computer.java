package org.kodluyoruz;

/**
 * Bu sınıf bir bilgisayarı temsil eder.
 * Bilgisayarın beş adet donamımı vardır:
 *      - Anakart
 *      - CPU
 *      - RAM
 *      - SSD
 *      - Ekran kartı
 *
 * TODO Bu alanların getter ve setter metotlarını oluşturun.
 */
public class Computer
{
    public Computer() {
    }

    public Computer(Hardware motherboard) {
        this.motherboard = motherboard;
    }

    /**
     * anakart
     */
    private Hardware motherboard;


    public Hardware getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        this.motherboard = motherboard;
    }

    /**
     * işlemci
     */
    private Hardware cpu;

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }

    /**
     * RAM
     */
    private Hardware ram;

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    /**
     * SSD
     * İsteğe bağlı: Her bilgisayarda SSD olmayabilir
     */
    private Hardware ssd;

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    /**
     * ekran kartı
     * İsteğe bağlı: Her bilgisayarda ekran kartı olmayabilir
     */
    private Hardware gpu;

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }

    public double getTotalPrice()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplam fiyatını hesaplar.
        double totalprice=cpu.calculatePrice()+gpu.calculatePrice()+motherboard.calculatePrice()+ram.calculatePrice()+ssd.calculatePrice();
        System.out.println(totalprice);
        // TODO metodu doldurun
        return totalprice;

    }

    public int getTotalPower()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplamda ne kadar güç tüketeceğini hesaplar.
        int totalpower=cpu.power+gpu.power+motherboard.power+ram.power+ssd.power;
        System.out.println(totalpower);
        // TODO metodu doldurun
        return totalpower;
    }

}
