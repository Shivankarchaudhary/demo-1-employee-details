public class EmployeeImpl {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Address address = new Address();
        address.setHouseNo(11);
        address.setStreetName("Marble drive");
        address.setCity("Eville");
        address.setZipcode(134131);
        employee.setEmployeeCode("101");
        employee.setEmployeeName("Damien");
        employee.setAge(22);
        employee.setDob("22/11/2000");
        employee.setSalary(2000);
        employee.setAddress(address);

        System.out.println("Name of employee - " + employee.getEmployeeName());
        System.out.println("Code of employee - " + employee.getEmployeeCode());
        System.out.println("City of employee - " + employee.getAddress().getCity());
    }

}
