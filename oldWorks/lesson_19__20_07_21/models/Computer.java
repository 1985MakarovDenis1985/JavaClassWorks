package lesson_19__20_07_21.models;

public class Computer {

    protected String cpu;
    protected int ram;
    protected int hdd;
    protected String brand;


    public Computer(String cpu, int ram, int hdd, String brand) {
        super();
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.brand = brand;
    }

    public Computer() {

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

    // переопределили toString
    public String toString() {
        return "Brand: " + getBrand() + " | CPU: " + cpu + " | RAM: " + ram + " | HDD: " + hdd;
    }

//    public boolean equals(Object obj){
//        Computer other = (Computer) obj;
//        return this.cpu == other.cpu && this.ram == other.ram && hdd == other.hdd && this.brand == other.brand;
//    }

    public boolean equals(Object obj){
        Computer other = (Computer) obj;
        return this.cpu.equals(other.cpu) && this.ram == other.ram && hdd == other.hdd && this.brand.equals(other.brand);
    }

}
