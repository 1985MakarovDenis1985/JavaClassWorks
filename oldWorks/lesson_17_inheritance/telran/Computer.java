package lesson_17_inheritance.telran;

public class Computer {
//    если не указываем модификатор по дефолту также протек но поля видны только если классы наследуются и находятся только в одном пакете
//    поле с мод протектор виден и у наследников
    protected String cpu;
    protected int ram;
    protected int hdd;
    protected String brand;

    public Computer() {

    }

    public Computer(String cpu, int ram, int hdd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getHdd() {
        return hdd;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void display(){ // унаслед от протекторного модификатора
        System.out.print("Brand: " + getBrand() + " | CPU: " + cpu + " | RAM: " + ram + " | HDD: " + hdd);
    }

    // переопределили toString
    public String toString(){
        return "Brand: " + getBrand() + " | CPU: " + cpu + " | RAM: " + ram + " | HDD: " + hdd;
    }
}
