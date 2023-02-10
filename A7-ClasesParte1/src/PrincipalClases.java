import java.util.*;
import java.util.Scanner;//para tomar el valor

public class PrincipalClases {
    private static List<Object> flores = new ArrayList<Object>();
    private static List<Object> clientes = new ArrayList<Object>();
    private static List<Object> vendedores = new ArrayList<Object>();
    private static List<CVenta> ventas = new ArrayList<CVenta>();
    private static List<CDetalleVenta> detalleVenta = new ArrayList<CDetalleVenta>();




    public static void mostrarFlores(List<Object> flores){
        System.out.println("NOMBRE\t\tAROMA\t\t\tCOLOR\t\tPRECIO");
        for (Object flor: flores) {
            CFlor fl = (CFlor) flor;
            System.out.println(fl.getNombre()+"\t\t\ts"+
                               fl.getAroma()+"\t\t\t"+
                               fl.getColor()+"\t\t\t"+
                               fl.getPrecio());
        }


    }
    public static void mostrarClientes(List<Object> clientes){
        System.out.println("NUMDOCUMENTO\t\tNOMBRES\t\tAPELLIDOS\t\t\tTIPODOCUMENTO\t\tCORREO\t\tTIPO\t\tESTADO");
        for (Object cliente: clientes) {
            CCliente cl = (CCliente) cliente;
            System.out.println(cl.getNumDocumento()+"\t\t\t"+
                            cl.getNombres()+"\t\t\t"+
                            cl.getApellidos()+"\t\t\t"+
                            cl.getTipoDocumento()+"\t\t\t"+
                            cl.getCorreo());
                            cl.getTipo();
                            cl.getEstado();


        }


    }
    public static void mostrarVendedores(List<Object> vendedores){
        System.out.println("NOMBRES\t\tAPELLIDOS\t\t\tTIPODOCUMENTO\t\tCORREO\t\tTIPO\t\tESTADO");
        for (Object vendedor: vendedores) {
            CVendedor vd = (CVendedor) vendedor;
            System.out.println(vd.getNombres()+"\t\t\t"+
                    vd.getApellidos()+"\t\t\t"+
                    vd.getTipoDocumento()+"\t\t\t"+
                    vd.getCorreo());

                    vd.getEstado();


        }


    }


    public static void mostrarDetalleVenta(int idVenta){
        System.out.println("ID\tIDV\tIDP\tCant\tDes\tPre");
        for (CDetalleVenta dv: detalleVenta) {
            if(dv.getIdVenta()==idVenta)
                dv.mostrarLista();
        }
    }
    public static void mostrarFlorPos(int posicion, List<Object> flores){
        int pos = 0;
        Boolean flag = true;
        do{
            if(posicion == pos) {
                //flores.get(posicion).mostrar();
                CFlor fl1 = (CFlor) flores.get(posicion);
                fl1.mostrar();
                flag = false;
            }
            pos++;
        }while (flag);
    }
    public static void mostrarClientePos(int posicion, List<Object> cliente){
        int pos = 0;
        Boolean flag = true;
        do{
            if(posicion == pos) {
                //flores.get(posicion).mostrar();
                CCliente fl1 = (CCliente) cliente.get(posicion);
                fl1.mostrar();
                flag = false;
            }
            pos++;
        }while (flag);
    }
    public static void mostrarVendedorPos(int posicion, List<Object> vendedor){
        int pos = 0;
        Boolean flag = true;
        do{
            if(posicion == pos) {
                //flores.get(posicion).mostrar();
                CVendedor fl1 = (CVendedor) vendedor.get(posicion);
                fl1.mostrar();
                flag = false;
            }
            pos++;
        }while (flag);
    }
    public static void mostrarFlor(String nombre, String color, List<Object> objetos){
        Object obj = objetos.get(0);
        if (obj instanceof CFlor)
            for (Object f : objetos) {
                CFlor fl = (CFlor) f; // Casting de datos
                if (fl.getNombre().equals(nombre) && fl.getColor().equals(color)) {
                    fl.mostrar();
                }
            }


    }
    public static void mostrarCliente(String nombre, String apellido, List<Object> objetos){
        Object obj = objetos.get(0);
        if (obj instanceof CCliente)
            for (Object f: objetos) {
                CCliente fl = (CCliente) f;
                if(fl.getNombres().equals(nombre) && fl.getApellidos().equals(apellido)){
                    fl.mostrar();
                }
            }
    }
    public static void mostrarVendedor(String nombre, String apellido, List<Object> objetos){
        Object obj = objetos.get(0);
       if (obj instanceof CVendedor)
            for (Object f: objetos) {
                CVendedor fl = (CVendedor) f;
                if(fl.getNombres().equals(nombre) && fl.getApellidos().equals(apellido)){
                    fl.mostrar();
                }
            }
    }
    public static void menuPrincipal(){
        System.out.println("*********** MENU PRINCIPAL ***********");
        System.out.println("0- Salir");
        System.out.println("1- Gestionar Flores.");
        System.out.println("2- Gestionar Clientes.");
        System.out.println("3- Gestionar Vendedores.");
        System.out.println("4- Gestionar Ventas.");
        System.out.println("   Ingrese una opcion>>  ");
    }
    public static void menuFlores(){
        System.out.println("*********** MENU FLORES ***********");
        System.out.println("0- Salir.");
        System.out.println("1- (C) Crear (Create).");
        System.out.println("2- (R) Mostrar (Read).");
        System.out.println("3- (U) Actualizar (update).");
        System.out.println("4- (D) Eliminar (Delete).");
        System.out.println("   Ingrese una opcion>>  ");
    }
    public static void menuCliente(){
        System.out.println("*********** MENU FLORES ***********");
        System.out.println("0- Salir.");
        System.out.println("1- (C) Crear (Create).");
        System.out.println("2- (R) Mostrar (Read).");
        System.out.println("3- (U) Actualizar (update).");
        System.out.println("4- (D) Eliminar (Delete).");
        System.out.println("   Ingrese una opcion>>  ");
    }
    public static void menuVendedor(){
        System.out.println("*********** MENU FLORES ***********");
        System.out.println("0- Salir.");
        System.out.println("1- (C) Crear (Create).");
        System.out.println("2- (R) Mostrar (Read).");
        System.out.println("3- (U) Actualizar (update).");
        System.out.println("4- (D) Eliminar (Delete).");
        System.out.println("   Ingrese una opcion>>  ");
    }

    public static int menuVentas(){
        System.out.println("0- Regresar al menu anterior.");
        System.out.println("1- Registrar nueva venta.");
        System.out.println("2- Anular venta.");
        System.out.println("3- Reporte de ventas.");
        System.out.print("   >> Ingrese una opción: ");
        return new Scanner(System.in).nextInt();
    }

    public static String ingresarNumDocVenta(){
        System.out.print("Num Documento: ");
        return new Scanner(System.in).nextLine();
    }

    public static double descuetoGlobal(){
        System.out.print("Ingrese el monto de descuento: ");
        return new Scanner(System.in).nextDouble();
    }
    public static Boolean buscarDNI(String dni){
        Boolean flag = false;
        int cont = 0;
        do {
            CCliente c = (CCliente) clientes.get(cont);
            if (c.getNumDocumento().equals(dni))
                flag = true;
            cont++;
        }while (!flag);
        return flag;
    }
    private static void eliminarFlores(String a, String b, List<Object> flores) {
        Object obj = flores.get(0);
        if (obj instanceof CFlor){
            CFlor bf = new CFlor("","","",0);
            for (Object f : flores) {
                CFlor fl = (CFlor) f; // Casting de datos
                if (fl.getNombre().equals(a) && fl.getColor().equals(b)) {
                    bf = fl;
                }
            }
            flores.remove(bf);
        }
    }
    private static void eliminarClientes(String a, String b, List<Object> cliente) {
        Object obj = cliente.get(0);
        if (obj instanceof CCliente){
            CCliente bc = new CCliente("","","","","","","");
            for (Object f : cliente) {
                CCliente fl = (CCliente) f; // Casting de datos
                if (fl.getNombres().equals(a) && fl.getApellidos().equals(b)) {
                    bc = fl;
                }
            }
            cliente.remove(bc);
        }
    }
    private static void eliminarVendedor(String a, String b, List<Object> vendedor) {
        Object obj = vendedor.get(0);
        if (obj instanceof CVendedor){
            CVendedor bv = new CVendedor(0,"","","","","","","");
            for (Object f : vendedor) {
                CVendedor fl = (CVendedor) f; // Casting de datos
                if (fl.getNombres().equals(a) && fl.getApellidos().equals(b)) {
                    bv = fl;
                }
            }
            vendedor.remove(bv);
        }
    }
    public static int validarNumero()
    {
        int a=0;
        boolean flag = true;

        do {
            try {
                Scanner readint= new Scanner(System.in);
                a = readint.nextInt();
                flag = false;
            }catch (Exception e){
                System.out.println("\033[31merror ALERTA-- el dato ingresado no es un número\u001B[0m \n Digile el número nuevamente: ");
                flag = true;
            }
        } while (flag);
        return a;
    }
    public static void main(String[] args) {

        int opcionPrincipal;
        do {
            menuPrincipal();
            opcionPrincipal = validarNumero();
            switch (opcionPrincipal){//MENU PRINCIPAL
                case 0:
                    System.out.println("saliendo del sistema");
                    break;
                case 1:
                    int opcionFlores;
                    do {
                        menuFlores();
                        opcionFlores = validarNumero();
                        switch (opcionFlores){
                            case 0://ESTO ES LA OPCION PARA REGRESAR AL MENU PRINCIPAL
                                System.out.println("retornar al menu principal");
                                break;
                            case 1://AGREGAR DATOS
                                CFlor flor = new CFlor();
                                flores.add(flor);
                                break;
                            case 2://mostrar
                                int opcionMostrarFlores;
                                do {
                                    System.out.println(" -------------- Menu Mostrar Flor ------------------");
                                    System.out.println(" 0- Regresar al menu Flores");
                                    System.out.println(" 1- Mostrar por posicion");
                                    System.out.println(" 2- Mostrar por nombre y color");
                                    System.out.println(" 3- Mostrar todas las flores");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    opcionMostrarFlores = validarNumero();
                                    switch (opcionMostrarFlores){
                                        case 0:
                                            System.out.println(" ... Regresando al Menu Flores");
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la posicion de la flor buscada: ");
                                            int posicion = new Scanner(System.in).nextInt();
                                            mostrarFlorPos(posicion,flores);
                                            break;
                                        case 2:
                                            System.out.println("Nombre: ");
                                            String n = new  Scanner(System.in).nextLine();
                                            System.out.println("Color: ");
                                            String c = new  Scanner(System.in).nextLine();
                                            mostrarFlor(n, c, flores);
                                            break;
                                        case 3:
                                            mostrarFlores(flores);
                                            break;
                                    }

                                }while (opcionMostrarFlores!=0);
                                break;
                            case 3://ACTUALIZAR
                                int opcionActualizarFlores;
                                do {
                                    System.out.println("  -------------------Menu Mostrar Flor------------- ");
                                    System.out.println(" 0- Regresar al menu Flores");
                                    System.out.println(" 1- Actualizar un campo");
                                    System.out.println(" 2- Actualizar todo");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    opcionActualizarFlores = validarNumero();
                                    switch (opcionActualizarFlores){
                                        case 0:
                                            System.out.println(" ... Regresando al menu Flores");
                                            break;
                                        case 1:
                                            int actualizarFlores;
                                            System.out.println("Ingrese la posicion a actualizar: ");
                                            int pos = validarNumero();
                                            do {
                                                System.out.println(" ------------Menu actualizar Campos------------");
                                                System.out.println("salir opcion = 0");
                                                System.out.println(" nombre opcion = 1");
                                                System.out.println(" aroma opcion = 2");
                                                System.out.println("color opcion = 3");
                                                System.out.println(" precio opcion = 4");
                                                System.out.println("ingrese una opcion");

                                                actualizarFlores = validarNumero();
                                                CFlor fl = (CFlor) flores.get(pos);
                                                switch (actualizarFlores){
                                                    case 0:
                                                        System.out.println("regresando al menu actualizar flores");
                                                        break;
                                                    case 1:
                                                        System.out.println("Nuevo nombre: ");
                                                        fl.setNombre(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 2:
                                                        System.out.println("Nuevo aroma: ");
                                                        fl.setAroma(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 3:
                                                        System.out.println("Nuevo color: ");
                                                        fl.setColor(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 4:
                                                        System.out.println("Nuevo precio: ");
                                                        fl.setPrecio(new Scanner(System.in).nextDouble());
                                                        break;
                                                }

                                            }while (actualizarFlores !=0);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la posicion a actualizar: ");
                                            int actualizarTodo = validarNumero();
                                            CFlor fa = (CFlor) flores.get(actualizarTodo);
                                            System.out.println("Nuevo nombre: ");
                                            fa.setNombre(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo aroma: ");
                                            fa.setAroma(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo color: ");
                                            fa.setColor(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo precio: ");
                                            fa.setPrecio(new Scanner(System.in).nextDouble());
                                            break;
                                    }

                                }while (opcionActualizarFlores != 0);
                                break;
                            case 4://eliminar
                                int eliminarFlores;
                                do {
                                    System.out.println("  ---------------Menu Mostrar Flor----------------- ");
                                    System.out.println(" 0- Regresar al menu Flores");
                                    System.out.println(" 1- Eliminar por posicion");
                                    System.out.println(" 2- Eliminar por nombre y color");
                                    System.out.println(" 3- Eliminar todas las flores");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    eliminarFlores = validarNumero();
                                    switch (eliminarFlores){
                                        case 0:
                                            System.out.println(" 0- Regresar al menu Flores");
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la posicion a eliminar: ");
                                            int pos = validarNumero();
                                            flores.remove(pos);
                                            break;
                                        case 2:
                                            System.out.println("Nombre: ");
                                            String a = new  Scanner(System.in).nextLine();
                                            System.out.println("Color: ");
                                            String b = new  Scanner(System.in).nextLine();
                                            eliminarFlores(a, b, flores);
                                            break;
                                        case 3:
                                            System.out.println("se elimino todas las flores");
                                            flores.clear();
                                            break;
                                    }
                                }while (eliminarFlores != 0);
                                break;

                        }
                    }while (opcionFlores !=0);

                    break;
                case 2://CLIENTE
                    int opcionCliente;
                    do {
                        menuCliente();
                        opcionCliente = validarNumero();
                        switch (opcionCliente){
                            case 0://ESTO ES LA OPCION PARA REGRESAR AL MENU PRINCIPAL
                                System.out.println("Retornar al menu principal");
                                break;
                            case 1://AGREGAR DATOS
                                CCliente cliente = new CCliente();
                                clientes.add(cliente);
                                break;
                            case 2://mostrar
                                int opcionMostrarClientes;
                                do {
                                    System.out.println("  ---------------------Menu Mostrar clientes ----------------------");
                                    System.out.println(" 0- Regresar al menu clientes");
                                    System.out.println(" 1- Mostrar por posicion");
                                    System.out.println(" 2- Mostrar por nombre y apellido");
                                    System.out.println(" 3- Mostrar todos los clientes");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    opcionMostrarClientes = validarNumero();
                                    switch (opcionMostrarClientes){
                                        case 0:
                                            System.out.println(" ... Regresando al Menu Clientes");
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la posicion del Cliente buscado: ");
                                            int posicion = new Scanner(System.in).nextInt();
                                            mostrarClientePos(posicion,clientes);
                                            break;
                                        case 2:
                                            System.out.println("Nombre: ");
                                            String j = new  Scanner(System.in).nextLine();
                                            System.out.println("Apellidos: ");
                                            String k = new  Scanner(System.in).nextLine();
                                            mostrarCliente(j, k, clientes);
                                            break;
                                        case 3:
                                            mostrarClientes(clientes);
                                            break;
                                    }

                                }while (opcionMostrarClientes!=0);
                                break;
                            case 3://ACTUALIZAR
                                int opcionActualizarClientes;
                                do {
                                    System.out.println("  -----------Menu Mostrar Clientes ----------------");
                                    System.out.println(" 0- Regresar al menu Clientes");
                                    System.out.println(" 1- Actualizar un campo");
                                    System.out.println(" 2- Actualizar todo");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    opcionActualizarClientes = validarNumero();
                                    switch (opcionActualizarClientes){
                                        case 0:
                                            System.out.println(" ... Regresando al menu Clientes");
                                            break;
                                        case 1:
                                            int actualizarClientes;
                                            System.out.println("Ingrese la posicion a actualizar: ");
                                            int pos = validarNumero();
                                            do {
                                                System.out.println(" ------------Menu actualizar Campos------------");
                                                System.out.println("salir opcion = 0");
                                                System.out.println(" Numero de documento opcion = 1");
                                                System.out.println(" Nombres opcion = 2");
                                                System.out.println(" Apellidos opcion = 3");
                                                System.out.println(" Tipo de Documento opcion = 4");
                                                System.out.println(" Correo opcion = 5");
                                                System.out.println(" Tipo opcion = 6");
                                                System.out.println(" Estado opcion = 7");
                                                System.out.println("ingrese una opcion");

                                                actualizarClientes = validarNumero();
                                                CCliente ac = (CCliente) clientes.get(pos);
                                                switch (actualizarClientes){
                                                    case 0:
                                                        System.out.println("regresando al menu actualizar clientes");
                                                        break;
                                                    case 1:
                                                        System.out.println("Nuevo Numero de documento: ");
                                                        ac.setNumDocumento(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 2:
                                                        System.out.println("Nuevo Nombre: ");
                                                        ac.setNombres(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 3:
                                                        System.out.println("Nuevo Apellido: ");
                                                        ac.setApellidos(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 4:
                                                        System.out.println("Nuevo Tipo de Documento: ");
                                                        ac.setTipoDocumento(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 5:
                                                        System.out.println("Nuevo Correo: ");
                                                        ac.setCorreo(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 6:
                                                        System.out.println("Nuevo Tipo: ");
                                                        ac.setTipo(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 7:
                                                        System.out.println("Nuevo Estado: ");
                                                        ac.setEstado(new Scanner(System.in).nextLine());
                                                        break;
                                                }

                                            }while (actualizarClientes !=0);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la posicion a actualizar: ");
                                            int actualizarTodo = validarNumero();
                                            CCliente ca = (CCliente) clientes.get(actualizarTodo);
                                            System.out.println("Nuevo Numero dew Documento: ");
                                            ca.setNumDocumento(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Nombre: ");
                                            ca.setNombres(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Apellido: ");
                                            ca.setApellidos(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Tipo de Documento: ");
                                            ca.setTipoDocumento(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Correo: ");
                                            ca.setCorreo(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Tipo: ");
                                            ca.setTipo(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Estado: ");
                                            ca.setEstado(new Scanner(System.in).nextLine());
                                            break;
                                    }

                                }while (opcionActualizarClientes != 0);
                                break;
                            case 4://eliminar
                                int eliminarClientes;
                                do {
                                    System.out.println("  Menu Mostrar Clientes ");
                                    System.out.println(" 0- Regresar al menu Clientes");
                                    System.out.println(" 1- Eliminar por posicion");
                                    System.out.println(" 2- Eliminar por nombre y Nombre");
                                    System.out.println(" 3- Eliminar todos los clientes");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    eliminarClientes = validarNumero();
                                    switch (eliminarClientes){
                                        case 0:
                                            System.out.println(" 0- Regresar al menu Clientes");
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la posicion a eliminar: ");
                                            int pos = validarNumero();
                                            clientes.remove(pos);
                                            break;
                                        case 2:
                                            System.out.println("Nombre: ");
                                            String a = new  Scanner(System.in).nextLine();
                                            System.out.println("Apellido: ");
                                            String b = new  Scanner(System.in).nextLine();
                                            eliminarClientes(a, b, clientes);
                                            break;
                                        case 3:
                                            System.out.println("se elimino todos los clientes");
                                            clientes.clear();
                                            break;
                                    }
                                }while (eliminarClientes != 0);
                                break;

                        }
                    }while (opcionCliente !=0);

                    break;
                case 3://VENDEDOR
                    int opcionVendedor;
                    do {
                        menuVendedor();
                        opcionVendedor = validarNumero();
                        switch (opcionVendedor){
                            case 0://ESTO ES LA OPCION PARA REGRESAR AL MENU PRINCIPAL
                                System.out.println("...Retornar al menu principal");
                                break;
                            case 1://AGREGAR DATOS
                                CVendedor vendedor = new CVendedor();
                                vendedores.add(vendedor);
                                break;
                            case 2://mostrar
                                int opcionMostrarVendedores;
                                do {
                                    System.out.println("  ---------------------Menu Mostrar Vendedores ----------------------");
                                    System.out.println(" 0- Regresar al menu vendedores");
                                    System.out.println(" 1- Mostrar por posicion");
                                    System.out.println(" 2- Mostrar por nombre y apellido");
                                    System.out.println(" 3- Mostrar todos los vendedores");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    opcionMostrarVendedores = validarNumero();
                                    switch (opcionMostrarVendedores){
                                        case 0:
                                            System.out.println(" ... Regresando al Menu vendedores");
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la posicion del vendedor buscado: ");
                                            int posicion = new Scanner(System.in).nextInt();
                                            mostrarVendedorPos(posicion,vendedores);
                                            break;
                                        case 2:
                                            System.out.println("Nombre: ");
                                            String a = new  Scanner(System.in).nextLine();
                                            System.out.println("Apellidos: ");
                                            String z = new  Scanner(System.in).nextLine();
                                            mostrarVendedor(a, z, vendedores);
                                            break;
                                        case 3:
                                            mostrarVendedores(vendedores);
                                            break;
                                    }

                                }while (opcionMostrarVendedores!=0);
                                break;
                            case 3://ACTUALIZAR
                                int opcionActualizarVendedores;
                                do {
                                    System.out.println("  -----------Menu Mostrar Vendedores ----------------");
                                    System.out.println(" 0- Regresar al menu Vendedores");
                                    System.out.println(" 1- Actualizar un campo");
                                    System.out.println(" 2- Actualizar todo");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    opcionActualizarVendedores = validarNumero();
                                    switch (opcionActualizarVendedores){
                                        case 0:
                                            System.out.println(" ... Regresando al menu Vendedores");
                                            break;
                                        case 1:
                                            int actualizarVendedores;
                                            System.out.println("Ingrese la posicion a actualizar: ");
                                            int pos = validarNumero();
                                            do {
                                                System.out.println(" ------------Menu actualizar Campos------------");
                                                System.out.println("salir opcion = 0");
                                                System.out.println(" Numero de documento opcion = 1");
                                                System.out.println(" Nombres opcion = 2");
                                                System.out.println(" Apellidos opcion = 3");
                                                System.out.println(" Tipo de Documento opcion = 4");
                                                System.out.println(" Correo opcion = 5");
                                                System.out.println(" Tipo opcion = 6");
                                                System.out.println(" Estado opcion = 7");
                                                System.out.println("ingrese una opcion");

                                                actualizarVendedores = validarNumero();
                                                CCliente ac = (CCliente) clientes.get(pos);
                                                switch (actualizarVendedores){
                                                    case 0:
                                                        System.out.println("regresando al menu actualizar clientes");
                                                        break;
                                                    case 1:
                                                        System.out.println("Nuevo Numero de documento: ");
                                                        ac.setNumDocumento(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 2:
                                                        System.out.println("Nuevo Nombre: ");
                                                        ac.setNombres(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 3:
                                                        System.out.println("Nuevo Apellido: ");
                                                        ac.setApellidos(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 4:
                                                        System.out.println("Nuevo Tipo de Documento: ");
                                                        ac.setTipoDocumento(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 5:
                                                        System.out.println("Nuevo Correo: ");
                                                        ac.setCorreo(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 6:
                                                        System.out.println("Nuevo Tipo: ");
                                                        ac.setTipo(new Scanner(System.in).nextLine());
                                                        break;
                                                    case 7:
                                                        System.out.println("Nuevo Estado: ");
                                                        ac.setEstado(new Scanner(System.in).nextLine());
                                                        break;
                                                }

                                            }while (actualizarVendedores !=0);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la posicion a actualizar: ");
                                            int actualizarTodo = validarNumero();
                                            CCliente ca = (CCliente) clientes.get(actualizarTodo);
                                            System.out.println("Nuevo Numero dew Documento: ");
                                            ca.setNumDocumento(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Nombre: ");
                                            ca.setNombres(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Apellido: ");
                                            ca.setApellidos(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Tipo de Documento: ");
                                            ca.setTipoDocumento(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Correo: ");
                                            ca.setCorreo(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Tipo: ");
                                            ca.setTipo(new Scanner(System.in).nextLine());
                                            System.out.println("Nuevo Estado: ");
                                            ca.setEstado(new Scanner(System.in).nextLine());
                                            break;
                                    }

                                }while (opcionActualizarVendedores != 0);
                                break;
                            case 4://eliminar
                                int eliminarVendedores;
                                do {
                                    System.out.println("  Menu Mostrar Clientes ");
                                    System.out.println(" 0- Regresar al menu Clientes");
                                    System.out.println(" 1- Eliminar por posicion");
                                    System.out.println(" 2- Eliminar por nombre y Nombre");
                                    System.out.println(" 3- Eliminar todos los clientes");
                                    System.out.println("   Ingrese una opcion>>  ");
                                    eliminarVendedores = validarNumero();
                                    switch (eliminarVendedores){
                                        case 0:
                                            System.out.println(" 0- Regresar al menu Clientes");
                                            break;
                                        case 1:
                                            System.out.println("Ingrese la posicion a eliminar: ");
                                            int pos = validarNumero();
                                            clientes.remove(pos);
                                            break;
                                        case 2:
                                            System.out.println("Nombre: ");
                                            String a = new  Scanner(System.in).nextLine();
                                            System.out.println("Apellido: ");
                                            String b = new  Scanner(System.in).nextLine();
                                            eliminarClientes(a, b, clientes);
                                            break;
                                        case 3:
                                            System.out.println("se elimino todos los clientes");
                                            vendedores.clear();
                                            break;
                                    }
                                }while (eliminarVendedores != 0);
                                break;

                        }
                    }while (opcionVendedor !=0);
                    break;
                case 4: // Gestionar ventas
                    int opcionVentas;
                    do{
                        opcionVentas = menuVentas();
                        switch (opcionVentas){
                            case 0:
                                System.out.println("... Regresando al menu principal.");
                                opcionVentas = 0;
                                break;
                            case 1: // Resgistrar una venta
                                String tipoDocumento;
                                do{
                                    System.out.println("Seleccione tipo de documento:");
                                    System.out.println("  (F) Factura        (B) Boleta     (*) para salir");
                                    tipoDocumento = new Scanner(System.in).nextLine(); // Factura | Boleta
                                    if(tipoDocumento.equals("F")){
                                        System.out.println("GENERANDO FACTURA");
                                    }else{
                                        if(tipoDocumento.equals("B"))
                                            System.out.println("GENERANDO BOLETA DE VENTA");
                                        else {
                                            System.out.println("Error ...");
                                            opcionVentas = 0;
                                        }
                                    }
                                } while (!tipoDocumento.equals("B") && !tipoDocumento.equals("F"));
                                System.out.println("Ingrse el DNI del clinete:");
                                String dniCliente = new Scanner(System.in).nextLine(); // 00000006

                                // Funcion existe() en cliente

                                if(buscarDNI(dniCliente))
                                    System.out.println("cliente existe");
                                else{
                                    System.out.println("cliente NO existe");
                                    System.out.println(" (N) Nuevo DNI     (A) Agregar cliente   (*) Para salir");
                                    String accion = new Scanner(System.in).nextLine(); // N | A | fjhdlkjh
                                    switch (accion){
                                        case "N":
                                            System.out.println("Ingrese el DNI del cliente:");
                                            dniCliente = new Scanner(System.in).nextLine();
                                            break;
                                        case "A":
                                            System.out.println("Registrando nuevo cliente");
                                            // Se reutiliza el insertar del CRUD
                                            break;
                                    }
                                }

                                CVenta v = new CVenta(0,
                                        tipoDocumento,
                                        ingresarNumDocVenta(),
                                        new Date(),
                                        "",
                                        dniCliente,
                                        0,
                                        0,
                                        0,
                                        "Proceso"
                                );
                                ventas.add(v);
                                mostrarFlores(flores);
                                System.out.println("Agregar flor a la venta:");
                                String agregarFlores;
//                                List<CFlor> floresVendidas = new ArrayList<CFlor>();
                                double pTotal = 0;

                                do{
                                    System.out.println("(A) Agregar flor    (T) terminar");
                                    agregarFlores = new Scanner(System.in).nextLine();
                                    if(agregarFlores.equals("A")) {
                                        System.out.print("Seleccione flor para vender:");
                                        int posFlorVenta = new Scanner(System.in).nextInt();

                                        // Pregunta cuantas quiere
                                        System.out.println("Cantidad: ");
                                        int cantidad = new Scanner(System.in).nextInt();

                                        CFlor f2 = (CFlor) flores.get(posFlorVenta);
//                                    f2.mostrar();
//                                    floresVendidas.add(f2);

                                        pTotal += f2.getPrecio() * cantidad;

                                        CDetalleVenta dv = new CDetalleVenta(
                                                0,
                                                ventas.size() - 1,
                                                flores.indexOf(f2),
                                                cantidad,
                                                0,
                                                f2.getPrecio()
                                        );
                                        detalleVenta.add(dv);
//                                        detalleVenta.get(detalleVenta.size()-1).setIdDetalleVenta(detalleVenta.indexOf(dv));
//                                        detalleVenta.get(detalleVenta.size()-1).setIdDetalleVenta(detalleVenta.size()-1);
                                        dv.setIdDetalleVenta(detalleVenta.size()-1);
                                    }
                                }while(agregarFlores.equals("A"));

//                                for (CDetalleVenta dv1:detalleVenta) {
//                                    if(dv1.getIdVenta()==ventas.size()-1){
//                                        pTotal+=dv1.getPrecio()* dv1.getCantidad();
//                                    }
//                                }

                                v.setIdVenta(ventas.size()-1);
                                v.setPrecioTotal(pTotal);
                                v.setIgv(pTotal/118);
                                v.setDescuento(descuetoGlobal());

                                v.mostrarLista();
                                mostrarDetalleVenta(v.getIdVenta());
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }
                    } while( opcionVentas != 0 );
                    break;
                default:
                    break;
            }
        }while (opcionPrincipal != 0);

    }


}
