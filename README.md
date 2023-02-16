# ItillicionMechanism
        //Objeto de la clase a usar para cifrar
        llicion a=new llicion();
        //Si el destructor es true entonces despues de invocar el metodo preItillar la informacion se perdera
        a.setDestructor(false);
        //Es para roconocer el archivo
        a.setKey("belson");
        //Ruta del archivo
        a.setRute("C:\\Users\\HP\\Documents");
        //Es el texto que se desea cifrar
        a.setText("pass");
        //Es para aumentar el numero difrado(es diferente al nivel de cifrado)
        a.setN(5);
        //Para cifrar(level es el nivel de cifrado, es decir la complejidad)
        a.preItillar(3);
        //Para descifrar
        System.out.println(a.Itillar(3));
