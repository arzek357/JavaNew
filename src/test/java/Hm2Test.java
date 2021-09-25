import com.zolotarev.gbhm.hm2.Employee;
import com.zolotarev.gbhm.hm2.WorkGroup;
import org.junit.Test;

public class Hm2Test {
    private final Employee[] testEmployees = new Employee[15];

    @Test
    public void addNewEmployeeTest(){
        Employee employee1 =new Employee("Иванов Иван Ивановоич",25,"example@mail.ru","Бригадир");
        Employee employee2 =new Employee("Иванов Семен Ивановоич",25,"example@mail.ru","Бригадир");
        Employee employee3 =new Employee("Иванов Валерий Ивановоич",25,"example@mail.ru","Бригадир");
        WorkGroup workGroup = new WorkGroup(employee1,employee2,employee3,employee1,employee2,employee3,employee1,employee2,employee3,employee1);
        workGroup.deleteEmployeeByIndex(0);
        workGroup.printInfoAboutEmployees();
    }
}
