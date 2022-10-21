package Model;

import java.util.ArrayList;

public class classStudent{
    private ArrayList<Student> listStudent;
    private int numberOfClass;

    public classStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public classStudent(){
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public int getNumberOfClass() {
        return this.numberOfClass;
    }

    private void setNumberOfClass(ArrayList<Student> listStudent) {
        this.numberOfClass = listStudent.size();
    }

    @Override
    public String toString() {
        return "Size: "+getNumberOfClass()+"\n About :"+getListStudent();
    }
    public boolean checkCondition(ArrayList<Student> listStundet,int BirDay, String address){
        for (int i = 0; i <listStundet.size();i++){
            if(BirDay == (listStundet.get(i).getDayBirth().getYear()) && address.equals(listStundet.get(i).getAddress())){
                System.out.println(" Have Student ==> "+listStundet.get(i).getFullName());
                return true;
            }
        }
        return false;
    }

}
