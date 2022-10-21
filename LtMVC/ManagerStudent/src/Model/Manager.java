package Model;

public class Manager{
    private classStudent class10A1;
    private  String kyhoc;
    private String khoaHoc;

    public String getKyhoc() {
        return kyhoc;
    }

    public void setKyhoc(String kyhoc) {
        this.kyhoc = kyhoc;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public classStudent getClass10A1() {
        return class10A1;
    }

    public void setClass10A1(classStudent class10A1) {
        this.class10A1 = class10A1;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    @Override
    public String toString() {
        return "Information that We have About Class : \n 1.Course: "+getKhoaHoc()+"\nYear:"+getKyhoc()+"with"+getClass10A1();
    }
}
