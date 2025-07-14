package InterfaceAndAbstract;

public class CrudMain {
    public static void main(String[] args) {
        // Crud 부모가 Interface 임
        Crud crud = new CrudImpl();
        crud.create();
        crud.read();
        boolean delete = crud.delete(3);
        // ctrl + ait + V
        crud.update(7);

    }
}
