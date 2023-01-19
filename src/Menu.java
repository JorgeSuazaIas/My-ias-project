import java.util.List;
import java.util.Scanner;

public class Menu {
    int index = 0;
    Customer[] customersList = new Customer[4];
    public void showMenu() {

        int response = 0;
        do {
            System.out.println("1. Añadir nuevo cliente");
            System.out.println("2. Borrar un cliente");
            System.out.println("3. Buscar un cliente");
            System.out.println("4. Mostrar los clientes");
            System.out.println("5. Salir");
            System.out.println("Escriba una de las opciones");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1, Añadir nuevo cliente");
                    String name;
                    int id;
                    System.out.println("Ingresa el nombre del nuevo cliente");
                    name = sc.nextLine();

                    System.out.println("Ingresa el numero de cedula del nuevo cliente");
                    id = sc.nextInt();

                    Customer customer = new Customer(name, id);
                    addCustomer(customer);


                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2, Borrar un cliente");

                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3, Buscar un cliente");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4, Mostrar los clientes");
                    break;
                case 5:
                    System.out.println("Has salido del menu al seleccionar la opcion 5");
                    break;
                default:
                    System.out.println("Por favor ingresa una opcion valida");
            }
        } while (response != 0);
    }

    public void addCustomer(Customer customer){
        if (index < 10) {
            customersList[index] = customer;
            index++;
        } else {
            System.out.println("Debe borrar un cliente antes de poder ingresar uno nuevo");
            showMenu();
        }
    }

    public void deleteCustomer(int id) {
        Customer[] customersListDelete = new Customer[4];
        for(int i=0; i <= customersList.length -1; i++){
            if (customersList[i].getCustomerId() != id){
                customersListDelete[i] = customersList[i];
            }
        }
        customersList = customersListDelete;
        index--;
    }

    public Customer getCustomer(int id) {
        return null;
    }

    public List<Customer> showAllCustomer() {
        return null;
    }
}
