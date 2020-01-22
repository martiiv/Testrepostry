package Tulling.Meg;
import java.util.ArrayList;

public class Main {
    ArrayList<String> arrayList;
    ArrayList<String> safeList;

    public void setArrayList(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    // Safe copy an ArrayList
    public void setMyArrayListSafe(ArrayList arrayList)
    {
        if(this.safeList == null)
        {
            this.safeList
                    = new ArrayList<>(arrayList);
        }
    }

    public static void main(String[] args) {
        Main objectProg2List = new Main();

        //Creating List
        ArrayList<String> List = new ArrayList<String>();

        //We add objects
        List.add("Karl");
        List.add("Morten");
        List.add("Anders");
        List.add("Rigmor");
        System.out.println("Printing List");
        System.out.println(List);

        //We copy the List
        objectProg2List.setArrayList(List);

        //Printing the copied List
        System.out.println("Printing the copied List");
        System.out.println(objectProg2List.arrayList);

        //Adding an element
        List.add("Thomas");

        System.out.println("Printing the og List");
        System.out.println(List);

        System.out.println("Printing the copied list");
        System.out.println(objectProg2List.arrayList);

        // add new element
        List.remove("Thomas");
        Main safeobjectIDATG2001ArrayListDemo = new Main();
        safeobjectIDATG2001ArrayListDemo.setMyArrayListSafe(List);
        System.out.println(safeobjectIDATG2001ArrayListDemo.safeList);
// add new element
        List.add("Nils");
// Check if the other ArrayList object is modified
        System.out.println("Is the other ArrayList Really modifed in Safe version?");
        System.out.println(safeobjectIDATG2001ArrayListDemo.safeList);

    }
}
