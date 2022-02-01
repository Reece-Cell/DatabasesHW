
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a table contains rows of Instructor
 *
 */
public class Table implements Iterable<Instructor> {

    private ArrayList<Instructor> instructors = new ArrayList<>();

    /**
     * Add an instructor object to the table.
     * If the ID of the instructor already exists in the table, then
     * do not add and return false.  Otherwise add the instructor object
     * and return true.
     * @param  //Instructor object to be added to table
     * @return
     */
    public boolean insert(Instructor inst) {
        // TO DO complete this method
        if (instructors.add(inst) == true) {
            return (true);
        }
        throw new UnsupportedOperationException();
    }

    /**
     * Remove the instructor object with ID value
     * from the table.  Return false if no such object
     * exists, other return true.
     * @param //ID
     */
    public boolean delete(int ID) {
        // TO DO complete this method
        System.out.print("delete " + ID + ": ");
        Instructor current = new Instructor();
        current.setID(ID);
        for(int i = 0; i < instructors.size();i++) {
            if (ID == instructors.get(i).getID()) {
                instructors.remove(i);
                System.out.print("True \n");
                return (true);
            }
        }
        System.out.print("False \n");
        return(false);
    }

    /**
     * Return the Instructor object with the value ID,
     * Return null if no such object exists in the table
     * @param ID
     */
    public Instructor lookup(int ID) {
        // TO DO complete this method
        System.out.print("lookup " + ID + ": ");
        Instructor current = new Instructor();
        current.setID(ID);
        for(int i = 0; i < instructors.size();i++){
            if(current.getID() == instructors.get(i).getID()) {

                return (instructors.get(i));
            }
        }
        return(null);
    }

    /**
     * Return a Table of Instructor objects filtered by the
     * predicate  attrName = value
     * @param //attrName can be ID, name, dept_name or salary
     * @param //search value of data type int or String.
     */

    public Table eval(String attrName, Object value) {
        Table filtered = new Table();

        // TO DO complete this method
        System.out.println("eval " + attrName +"= " + value);
        if (attrName.equals("ID")){
            for(int i = 0; i < instructors.size();i++){
                if((int)value == instructors.get(i).getID()) {
                    filtered.insert(instructors.get(i));
                }
            }
            return (filtered);
        }if (attrName.equals("name")){
            for(int i = 0; i < instructors.size();i++) {
                if ((String) value == instructors.get(i).getName()) {
                    filtered.insert(instructors.get(i));
                }
            }
            return (filtered);
        }if (attrName.equals("dept_name")){
                for(int i = 0; i < instructors.size();i++) {
                    if ((String) value == instructors.get(i).getDept_name()) {
                        filtered.insert(instructors.get(i));
                    }
                }
            return (filtered);
        }if (attrName.equals("salary")){
                    for(int i = 0; i < instructors.size();i++){
                        if((int)value == instructors.get(i).getSalary()) {
                            filtered.insert(instructors.get(i));
                        }
                }
            return (filtered);
        }
        return (filtered);
    }

    public Iterator<Instructor> iterator() {
        return instructors.iterator();
    }

    public String toString() {
        if (instructors.isEmpty()) {
            return "Empty Table";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Instructor t : this) {
                sb.append(t.toString());
                sb.append("\n");
            }
            return sb.toString();
        }
    }

}
