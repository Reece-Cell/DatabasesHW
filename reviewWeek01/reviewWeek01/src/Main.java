public class Main {

    public static void main(String[] args) {
        Table table = new Table();
        //int ID, String name, String dept_name, int salary
        Instructor a1 = new Instructor(12121, "Kim", "Elect. Engr", 65000);
        Instructor a2 = new Instructor(19803, "Wisneski", "Comp. Sci", 46000);
        Instructor a3 = new Instructor(24734, "Bruns", "Comp. Sci", 70000);
        Instructor a4 = new Instructor(55552, "Scott", "Math", 80000);
        Instructor a5 = new Instructor(12321, "Tao", "Comp. Sci", 95000);

        table.insert(a1);
        table.insert(a2);
        table.insert(a3);
        table.insert(a4);
        table.insert(a5);

        System.out.println(table.toString());

        table.delete(12121);

        System.out.println(table.toString());

        table.delete(12121);
        System.out.println(table.lookup(19803));
        System.out.println(table.lookup(12121));
        System.out.println(table.eval("dept_name", "Comp. Sci"));
        System.out.println(table.eval("ID", 19803));
        System.out.println(table.eval("ID",19802));
    }
}
