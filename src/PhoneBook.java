import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private List <Employe> employeList;

    public PhoneBook(){
        employeList = new ArrayList<>();
    }

    public void addEmploye (String name, int phoneNumber, int id, int workYear){
        employeList.add(new Employe(name, phoneNumber, id, workYear));
    }

    public void printEmploye(){
        for (Employe employe : employeList) {
            System.out.println(employe);
        }
    }
    public List<String> searchByWorkYear(int age){ // метод, который ищет сотрудника по возрасту
        List<String> listAge=new ArrayList<>();
        for (Employe employe : employeList) {
            if (employe.getWorkYear()==age)listAge.add(employe.getName());
        }
        return listAge;
    }
    public List<Integer> searchByNumber(String name){ //метод, который возвращает номер телефона сотрудника по имени (может быть список)
        List<Integer> listPhone=new ArrayList<>();
        for (Employe employee:employeList) {
            if (employee.getName().equals(name))listPhone.add(employee.getPhoneNumber());
        }
        return listPhone;
    }
    public String searchById(int number){ //метод, который ищет сотрудника по табельному номеру
        for (Employe employee:employeList) {
            if (employee.getId()==number)return employee.getName();
        }
        return null;
    }
}
